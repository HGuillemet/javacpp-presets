// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * This is a handle to an operator schema registered with the dispatcher.
 * This handle can be used to register kernels with the dispatcher or
 * to lookup a kernel for a certain set of arguments.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OperatorHandle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OperatorHandle(Pointer p) { super(p); }

  public OperatorHandle(@ByRef(true) OperatorHandle arg0) { super((Pointer)null); allocate(arg0); }
  @NoException(true) private native void allocate(@ByRef(true) OperatorHandle arg0);
  public native @ByRef @Name("operator =") @NoException(true) OperatorHandle put(@ByRef(true) OperatorHandle arg0);
  // NOLINTNEXTLINE(performance-trivially-destructible)

  public native @Const @ByRef OperatorName operator_name();

  public native @Cast("bool") boolean hasSchema();

  public native @Const @ByRef FunctionSchema schema();

  public native @StdString BytePointer debug();

  public native @StdString BytePointer dumpState();

  public native @Cast("bool") boolean hasKernelForDispatchKey(DispatchKey k);
  public native @Cast("bool") boolean hasKernelForDispatchKey(@Cast("c10::DispatchKey") short k);

  public native @Cast("bool") boolean hasKernelForAnyDispatchKey(@ByVal DispatchKeySet k);

  public native @Cast("bool") boolean hasComputedKernelForDispatchKey(DispatchKey k);
  public native @Cast("bool") boolean hasComputedKernelForDispatchKey(@Cast("c10::DispatchKey") short k);

  public native @StdString BytePointer dumpComputedTable();

  public native void checkInvariants();

  public native @ByVal TagArrayRef getTags();

  public native @Cast("bool") boolean hasTag(@Const @ByRef Tag tag);

  public native void callBoxed(@Cast("c10::Stack*") IValueVector stack);

  public native void callBoxedForDispatchKey(DispatchKey dk, @Cast("c10::Stack*") @ByRef IValueVector stack);
  public native void callBoxedForDispatchKey(@Cast("c10::DispatchKey") short dk, @Cast("c10::Stack*") @ByRef IValueVector stack);

  public native void redispatchBoxed(@ByVal DispatchKeySet ks, @Cast("c10::Stack*") IValueVector stack);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef OperatorHandle other);

  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef OperatorHandle other);
}
