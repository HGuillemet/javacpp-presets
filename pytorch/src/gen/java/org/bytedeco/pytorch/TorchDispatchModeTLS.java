// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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


@Namespace("c10::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TorchDispatchModeTLS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TorchDispatchModeTLS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TorchDispatchModeTLS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TorchDispatchModeTLS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TorchDispatchModeTLS position(long position) {
        return (TorchDispatchModeTLS)super.position(position);
    }
    @Override public TorchDispatchModeTLS getPointer(long i) {
        return new TorchDispatchModeTLS((Pointer)this).offsetAddress(i);
    }

  // This API is NOT invariant safe.
  // It must not take in an infra mode that uses TorchDispatchModeKey
  // If you're pushing an infra mode onto the stack, we expect
  // you to use set_mode
  public static native void push_non_infra_mode_onto_stack(
        @SharedPtr("c10::SafePyObject") @ByVal SafePyObject mode);
  // Pops the top mode of the stack,
  // giving precedence to user modes before attempting to pop
  // any infra modes
  public static native @Const @SharedPtr("c10::SafePyObject") @ByVal SafePyObject pop_stack();
  // Returns the highest-priority infra mode on the stack,
  // along with its mode key.
  public static native @Const @ByVal T_SafePyObjectTorchDispatchModeKey_T pop_highest_infra_mode();

  public static native @Const @SharedPtr("c10::SafePyObject") @ByRef SafePyObject get_stack_at(@Cast("int64_t") long idx);
  public static native @Cast("int64_t") long stack_len();

  public static native @Const @ByVal SafePyObjectOptional get_mode(
        TorchDispatchModeKey mode_key);
  public static native @Const @ByVal SafePyObjectOptional get_mode(
        @Cast("c10::impl::TorchDispatchModeKey") byte mode_key);
  public static native @Const @ByVal SafePyObjectOptional unset_mode(
        TorchDispatchModeKey mode_key);
  public static native @Const @ByVal SafePyObjectOptional unset_mode(
        @Cast("c10::impl::TorchDispatchModeKey") byte mode_key);
  public static native void set_mode(
        @Const @SharedPtr("c10::SafePyObject") @ByRef SafePyObject mode,
        TorchDispatchModeKey mode_key);
  public static native void set_mode(
        @Const @SharedPtr("c10::SafePyObject") @ByRef SafePyObject mode,
        @Cast("c10::impl::TorchDispatchModeKey") byte mode_key);

  public static native @Const @ByRef TorchDispatchModeTLS get_state();
  public static native void set_state(@ByVal TorchDispatchModeTLS state);

  public static native @Cast("bool") boolean any_modes_set(@Cast("bool") boolean skip_infra_modes/*=false*/);
  public static native @Cast("bool") boolean any_modes_set();
}
