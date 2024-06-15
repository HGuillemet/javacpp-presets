// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * Top-level dispatch interface for dispatching via the dynamic dispatcher.
 * Most end users shouldn't use this directly; if you're trying to register
 * ops look in op_registration
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Dispatcher extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dispatcher(Pointer p) { super(p); }


  // Implementation note: this class abstracts over the fact that we have per-operator
  // dispatch tables.  This could be easily adjusted to have a single global hash
  // table.
  public static native @ByRef Dispatcher realSingleton();

  public static native @ByRef Dispatcher singleton();

  // ------------------------------------------------------------------------
  //
  // Accessing operators by schema
  //
  // ------------------------------------------------------------------------

  /**
   * Looks for an operator schema with the given name and overload name
   * and returns it if it is registered WITH A SCHEMA.
   * Returns nullopt otherwise.
   */
  public native @ByVal OperatorHandleOptional findSchema(@Const @ByRef OperatorName operator_name);

  /**
   * Variant of findSchema that results in less code generated at the call site.
   * It (1) takes const char* pointer rather than OperatorName (so we skip
   * generating std::string constructor calls at the call site), and (2)
   * it raises an exception if the operator is not found (so we skip
   * generating exception raising code at the call site)
   *
   * Irritatingly, we still have to generate the handful of instructions
   * for dealing with an exception being thrown during static initialization
   * (e.g. __cxa_guard_abort).  If we could annotate this method noexcept we
   * could avoid this code too, but as the name of the function suggests,
   * it does throw exceptions.
   */
  public native @ByVal OperatorHandle findSchemaOrThrow(@Cast("const char*") BytePointer name, @Cast("const char*") BytePointer overload_name);
  public native @ByVal OperatorHandle findSchemaOrThrow(String name, String overload_name);

  // Like findSchema, but also returns OperatorHandle even if there is no schema
  public native @ByVal OperatorHandleOptional findOp(@Const @ByRef OperatorName operator_name);

  // Returns a list of all operator names present in the operatorLookupTable_
  public native @StdVector OperatorName getAllOpNames();

  // ------------------------------------------------------------------------
  //
  // Invoking operators
  //
  // ------------------------------------------------------------------------

  // Like call, but intended for use in a redispatch in kernels that have explicitly performed the DispatchKey update calculatulation.
  // This will take the DispatchKeySet completely as is and dispatch to the kernel of the corresponding highest priority key in the set.
  // Note that this version of redispatch treats the inputted DispatchKeySet *as is*, and does NOT mask out the highest priority key.
  // See Note [Plumbing Keys Through The Dispatcher]

  // Invoke an operator via the boxed calling convention using an IValue stack
  public native void callBoxed(@Const @ByRef OperatorHandle op, @Cast("c10::Stack*") IValueVector stack);
  public native void callBoxedForDispatchKey(@Const @ByRef OperatorHandle op, DispatchKey dk, @Cast("c10::Stack*") IValueVector stack);
  public native void callBoxedForDispatchKey(@Const @ByRef OperatorHandle op, @Cast("c10::DispatchKey") short dk, @Cast("c10::Stack*") IValueVector stack);

  // TODO: This will only be useful if we write a backend fallback that plumbs dispatch keys (currently there are none)
  // See Note [Plumbing Keys Through The Dispatcher]
  public native void redispatchBoxed(@Const @ByRef OperatorHandle op, @ByVal DispatchKeySet dispatchKeySet, @Cast("c10::Stack*") IValueVector stack);

  public native @Cast("bool") boolean hasBackendFallbackForDispatchKey(DispatchKey dk);
  public native @Cast("bool") boolean hasBackendFallbackForDispatchKey(@Cast("c10::DispatchKey") short dk);

  // Used by torchdeploy/multipy for multiple interpreters racing.
  public native void waitForDef(@Const @ByRef FunctionSchema schema);
  public native void waitForImpl(@Const @ByRef OperatorName op_name, @ByVal DispatchKeyOptional dispatch_key);

  // ------------------------------------------------------------------------
  //
  // Performing registrations (NON user public; use op_registration)
  //
  // ------------------------------------------------------------------------

  /**
   * Register a new operator schema.
   *
   * If a schema with the same operator name and overload name already exists,
   * this function will check that both schemas are exactly identical.
   */
  public native @ByVal RegistrationHandleRAII registerDef(@ByVal FunctionSchema schema, @StdString BytePointer debug, @ByVal(nullValue = "std::vector<at::Tag>{}") TagVector tags);
  public native @ByVal RegistrationHandleRAII registerDef(@ByVal FunctionSchema schema, @StdString BytePointer debug);
  public native @ByVal RegistrationHandleRAII registerDef(@ByVal FunctionSchema schema, @StdString String debug, @ByVal(nullValue = "std::vector<at::Tag>{}") TagVector tags);
  public native @ByVal RegistrationHandleRAII registerDef(@ByVal FunctionSchema schema, @StdString String debug);

  /**
   * Register a kernel to the dispatch table for an operator.
   * If dispatch_key is nullopt, then this registers a fallback kernel.
   *
   * @return A RAII object that manages the lifetime of the registration.
   *         Once that object is destructed, the kernel will be deregistered.
   */
  // NB: steals the inferred function schema, as we may need to hold on to
  // it for a bit until the real schema turns up
  public native @ByVal RegistrationHandleRAII registerImpl(@ByVal OperatorName op_name, @ByVal DispatchKeyOptional dispatch_key, @ByVal KernelFunction kernel, @ByVal CppSignatureOptional cpp_signature, @UniquePtr @ByVal FunctionSchema inferred_function_schema, @StdString BytePointer debug);
  public native @ByVal RegistrationHandleRAII registerImpl(@ByVal OperatorName op_name, @ByVal DispatchKeyOptional dispatch_key, @ByVal KernelFunction kernel, @ByVal CppSignatureOptional cpp_signature, @UniquePtr @ByVal FunctionSchema inferred_function_schema, @StdString String debug);

  /**
   * Given an operator, tells the Dispatcher that we have implemented an abstract impl
   * for this op in the given Python module. Call this a "pystub".
   */
  public native @ByVal RegistrationHandleRAII registerAbstractImplPyStub(@Const @ByRef OperatorName op_name, @Cast("const char*") BytePointer pymodule, @Cast("const char*") BytePointer context);
  public native @ByVal RegistrationHandleRAII registerAbstractImplPyStub(@Const @ByRef OperatorName op_name, String pymodule, String context);

  /**
   * Given an operator, throws if we have an abstract impl pystub.
   */
  public native void throwIfHasAbstractImplPyStub(@ByVal OperatorName op_name);

  public native @ByVal BytePointerPairOptional getAbstractImplPyStub(@ByVal OperatorName op_name);

  /**
   * Register a new operator by name.
   */
  public native @ByVal RegistrationHandleRAII registerName(@ByVal OperatorName op_name);

  /**
   * Register a fallback kernel for a backend.
   * If an operator is called but there is no concrete kernel for the dispatch
   * key of the given operator arguments, it will check if there is such a
   * fallback kernel for the given dispatch key and, if yes, call that one.
   */
  public native @ByVal RegistrationHandleRAII registerFallback(DispatchKey dispatch_key, @ByVal KernelFunction kernel, @StdString BytePointer debug);
  public native @ByVal RegistrationHandleRAII registerFallback(@Cast("c10::DispatchKey") short dispatch_key, @ByVal KernelFunction kernel, @StdString String debug);

  /**
   * Use to register whenever we had a TORCH_LIBRARY declaration in the frontend
   * API.  These invocations are only permitted once per program, so we raise
   * an error if this is called again for the same namespace.
   */
  public native @ByVal RegistrationHandleRAII registerLibrary(@StdString BytePointer ns, @StdString BytePointer debug);
  public native @ByVal RegistrationHandleRAII registerLibrary(@StdString String ns, @StdString String debug);

  // ------------------------------------------------------------------------
  //
  // Listeners on registrations
  //
  // ------------------------------------------------------------------------

  /**
   * Add a listener that gets called whenever a new op is registered or an existing
   * op is deregistered. Immediately after registering, this listener gets called
   * for all previously registered ops, so it can be used to keep track of ops
   * registered with this dispatcher.
   */
  public native @ByVal RegistrationHandleRAII addRegistrationListener(@UniquePtr OpRegistrationListener listener);

  public native void checkInvariants();

  //
  // ------------------------------------------------------------------------
  //
  // Assertions
  //
  // ------------------------------------------------------------------------

  /**
   * For testing purposes.
   * Returns a list of all operators that were created through calls to registerImpl(),
   * without any corresponding calls to registerDef(). After static initialization
   * is done this is almost certainly a bug, as the created OperatorHandle won't have
   * any schema associated with it and users calling the op through the dispatcher
   * won't be able to access it
   *
   * Note that we cannot enforce this invariant "as we go" during static initialization,
   * due to undefined static initialization order- we have no guarantees over the order
   * in which .def() and .impl() calls are registered in the dispatcher at static
   * initialization time. So this function should only be called after static initialization.
   */
  public native @StdVector OperatorHandle findDanglingImpls();

  /**
   * Useful for inspecting global Dispatcher registration state.
   * Returns the names of all operators with a kernel registered for the specified DispatchKey.
   * If no DispatchKey is specified, it returns all registered operators.
   */
  public native @StdVector OperatorName getRegistrationsForDispatchKey(@ByVal DispatchKeyOptional k);
}
