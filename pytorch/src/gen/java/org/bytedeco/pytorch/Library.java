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
 // namespace detail

/** This object provides the API for defining operators and providing
 *  implementations at dispatch keys.  Typically, a torch::Library
 *  is not allocated directly; instead it is created by the
 *  TORCH_LIBRARY() or TORCH_LIBRARY_IMPL() macros.
 * 
 *  Most methods on torch::Library return a reference to itself,
 *  supporting method chaining.
 * 
 *  <pre>{@code
 *  // Examples:
 * 
 *  TORCH_LIBRARY(torchvision, m) {
 *     // m is a torch::Library
 *     m.def("roi_align", ...);
 *     ...
 *  }
 * 
 *  TORCH_LIBRARY_IMPL(aten, XLA, m) {
 *     // m is a torch::Library
 *     m.impl("add", ...);
 *     ...
 *  }
 *  }</pre>
 *  */
@Namespace("torch") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Library extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Library(Pointer p) { super(p); }

  /** \private
   * 
   *  Which type of macro produced this Library */
  public enum Kind {
    DEF(0), // from TORCH_LIBRARY (no qualifier)
    IMPL(1),
    FRAGMENT(2);

      public final int value;
      private Kind(int v) { this.value = v; }
      private Kind(Kind e) { this.value = e.value; }
      public Kind intern() { for (Kind e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  /** \private
   * 
   *  Use TORCH_LIBRARY() or TORCH_LIBRARY_IMPL() instead of using these
   *  constructors directly */
  public Library(
        Kind kind,
        @StdString BytePointer ns,
        @ByVal DispatchKeyOptional k,
        @Cast("const char*") BytePointer file,
        @Cast("uint32_t") int line) { super((Pointer)null); allocate(kind, ns, k, file, line); }
  private native void allocate(
        Kind kind,
        @StdString BytePointer ns,
        @ByVal DispatchKeyOptional k,
        @Cast("const char*") BytePointer file,
        @Cast("uint32_t") int line);
  public Library(
        @Cast("torch::Library::Kind") int kind,
        @StdString String ns,
        @ByVal DispatchKeyOptional k,
        String file,
        @Cast("uint32_t") int line) { super((Pointer)null); allocate(kind, ns, k, file, line); }
  private native void allocate(
        @Cast("torch::Library::Kind") int kind,
        @StdString String ns,
        @ByVal DispatchKeyOptional k,
        String file,
        @Cast("uint32_t") int line);

  
  
  public Library(@ByRef(true) Library arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@ByRef(true) Library arg0);
  
  ///
  ///
  public native @ByRef @Name("operator =") Library put(@ByRef(true) Library arg0);

  // Some notes about the API design here.  We had the following constraints:
  //
  //  - We need to support multiple "types" of arguments for schema and
  //    functions (e.g., unnamed lambda types, regular functions, const char*,
  //    fully instantiated schemas)
  //  - We don't want to write exponentially many overloads
  //  - We don't want to rely on implicit conversion to a common type,
  //    because the C++ compiler will only be willing to do a single
  //    implicit conversion (reducing the set of valid types which you
  //    can invoke with); also error messages are worse when an implicit
  //    conversion is not selected (as the compiler will not explain
  //    why it didn't select an implicit conversion; this is different
  //    from overloads where it will explain each candidate overload and
  //    why it didn't apply)
  //
  // To solve all of these constraints at the same time, we use a trick taken
  // from the pybind11 library: template over the argument in the user visible
  // API, and inside of the templated function explicitly call an overloaded
  // function to resolve the argument to a real type.  You get the good error
  // messages from overloads, but at the same time you only need to write the
  // overload for any given argument type once.

  /** Declare an operator with a schema, but don't provide any implementations
   *  for it.  You're expected to then provide implementations using the
   *  impl() method.  All template arguments are inferred.
   * 
   *  @param raw_schema The schema of the operator to be defined.
   *      Typically, this is a {@code const char*} string literal, but any type
   *      accepted by torch::schema() is accepted here.
   * 
   *  <pre>{@code
   *  // Example:
   *  TORCH_LIBRARY(myops, m) {
   *    m.def("add(Tensor self, Tensor other) -> Tensor");
   *  }
   *  }</pre> */

  

  /** Declares that for all operators that are subsequently def'ed, their
   *  fake impls may be found in the given Python module (pymodule).
   *  This registers some help text that is used if the fake impl
   *  cannot be found.
   * 
   *  Args:
   *  - pymodule: the python module
   *  - context: We may include this in the error message. */
  public native @ByRef Library set_python_module(@Cast("const char*") BytePointer pymodule, @Cast("const char*") BytePointer context/*=""*/);
  public native @ByRef Library set_python_module(@Cast("const char*") BytePointer pymodule);
  public native @ByRef Library set_python_module(String pymodule, String context/*=""*/);
  public native @ByRef Library set_python_module(String pymodule);

  /** Deprecated; use set_python_module instead */
  
  ///
  ///
  public native @ByRef Library impl_abstract_pystub(@Cast("const char*") BytePointer pymodule, @Cast("const char*") BytePointer context/*=""*/);
  public native @ByRef Library impl_abstract_pystub(@Cast("const char*") BytePointer pymodule);
  public native @ByRef Library impl_abstract_pystub(String pymodule, String context/*=""*/);
  public native @ByRef Library impl_abstract_pystub(String pymodule);

  /** Define an operator for a schema and then register an implementation for
   *  it.  This is typically what you would use if you aren't planning
   *  on making use of the dispatcher to structure your operator
   *  implementation.  It's roughly equivalent to calling def() and
   *  then impl(), but if you omit the schema of the operator, we will
   *  infer it from the type of your C++ function.  All template
   *  arguments are inferred.
   * 
   *  @param raw_name_or_schema The schema of the operator to be
   *    defined, or just the name of the operator if the schema is to be
   *    inferred from {@code raw_f}.  Typically a {@code const char*} literal.
   *  @param raw_f The C++ function that implements this operator.
   *    Any valid constructor of torch::CppFunction is accepted here;
   *    typically you provide a function pointer or lambda.
   * 
   *  <pre>{@code
   *  // Example:
   *  TORCH_LIBRARY(myops, m) {
   *    m.def("add", add_fn);
   *  }
   *  }</pre> */
  

  /** Register an implementation for an operator.  You may register multiple
   *  implementations for a single operator at different dispatch keys
   *  (see torch::dispatch()).  Implementations must have a corresponding
   *  declaration (from def()), otherwise they are invalid.  If you plan
   *  to register multiple implementations, DO NOT provide a function
   *  implementation when you def() the operator.
   * 
   *  @param name The name of the operator to implement.  Do NOT provide
   *    schema here.
   *  @param raw_f The C++ function that implements this operator.  Any
   *    valid constructor of torch::CppFunction is accepted here;
   *    typically you provide a function pointer or lambda.
   * 
   *  <pre>{@code
   *  // Example:
   *  TORCH_LIBRARY_IMPL(myops, CUDA, m) {
   *    m.impl("add", add_cuda);
   *  }
   *  }</pre> */

// #if defined C10_MOBILE
  // Note: This overload is needed only for C10_MOBILE, since the automatically
  // defined copy constructor for the CppFunction doesn't have the additional
  // NoInferSchemaTag argument. We define the overload for the impl() function
  // to accept a CppFunction&& argument. The already constructed CppFunction
  // object may or may not have the inferred schema, but it doesn't matter
  // for our purposes since if it already has the inferred schema, then we
  // might as well just pass it through directly.
  //
// #endif

  // Helper for getting an OperatorName for a const char*.  You probably
  // don't need this.
  
  ///
  public native @ByVal OperatorName _resolve(@Cast("const char*") BytePointer name);
  public native @ByVal OperatorName _resolve(String name);

  /** \private
   * 
   *  Convenience overload for directly specifying the dispatch key when
   *  impl().  You probably don't need this; instead, prefer specifying
   *  the dispatch key for the entire block in TORCH_LIBRARY_IMPL() */

  // These overloads cover cases when a SelectiveStr (see Note [Selective
  // build]) has been disabled at compile time.  In that case, don't generate
  // any code referencing the passed in functions at all.
  
  
  
  

  /** Register a fallback implementation for all operators which will be used
   *  if there is not a specific implementation for an operator available.
   *  There MUST be a DispatchKey associated with a fallback; e.g.,
   *  only call this from TORCH_LIBRARY_IMPL() with namespace {@code _}.
   * 
   *  @param raw_f The function that implements the fallback.  Unboxed
   *    functions typically do not work as fallback functions, as
   *    fallback functions must work for every operator (even though
   *    they have varying type signatures).  Typical arguments are
   *    CppFunction::makeFallthrough() or
   *    CppFunction::makeFromBoxedFunction()
   * 
   *  <pre>{@code
   *  // Example:
   * 
   *  TORCH_LIBRARY_IMPL(_, AutogradXLA, m) {
   *    // If there is not a kernel explicitly registered
   *    // for AutogradXLA, fallthrough to the next
   *    // available kernel
   *    m.fallback(torch::CppFunction::makeFallthrough());
   *  }
   * 
   *  // See aten/src/ATen/core/dispatch/backend_fallback_test.cpp
   *  // for a full example of boxed fallback
   *  }</pre> */

  // These overloads enable the use of selective build on classes registered
  // within a library. The API is the same as before with 1 minor change.
  // Instead of m.class_<foo>("foo") you instead do
  // m.class_<foo>(TORCH_SELECTIVE_CLASS("foo"))

  // De-registers all registrations created with this Library
  public native void reset();
}
