// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PythonTorchFunctionTLS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PythonTorchFunctionTLS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PythonTorchFunctionTLS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PythonTorchFunctionTLS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PythonTorchFunctionTLS position(long position) {
        return (PythonTorchFunctionTLS)super.position(position);
    }
    @Override public PythonTorchFunctionTLS getPointer(long i) {
        return new PythonTorchFunctionTLS((Pointer)this).offsetAddress(i);
    }

  public static native void set_disabled_state(TorchFunctionDisabledState disabled_state_);
  public static native void set_disabled_state(@Cast("at::impl::TorchFunctionDisabledState") int disabled_state_);
  public static native TorchFunctionDisabledState get_disabled_state();

  public static native void push_onto_stack(@SharedPtr SafePyObject mode);
  public static native @SharedPtr SafePyObject pop_stack();
  public static native @SharedPtr SafePyObject get_stack_at(@Cast("int64_t") long idx);
  public static native @Cast("int64_t") long stack_len();

  public static native @Const @ByRef PythonTorchFunctionTLS get_state();
  public static native void set_state(@Const @ByRef PythonTorchFunctionTLS state);
}
