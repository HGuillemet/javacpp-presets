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


@Namespace("torch::jit::detail") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ParameterPolicy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ParameterPolicy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ParameterPolicy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ParameterPolicy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ParameterPolicy position(long position) {
        return (ParameterPolicy)super.position(position);
    }
    @Override public ParameterPolicy getPointer(long i) {
        return new ParameterPolicy((Pointer)this).offsetAddress(i);
    }

  public static native @ByVal @Cast("torch::jit::detail::ParameterPolicy::value_type*") Tensor create(
        @StdVector SlotCursor cursors,
        @ByVal IValue v);
  public static native @Cast("bool") boolean valid(@Const @SharedPtr("c10::ClassType") @ByRef ClassType typ, @Cast("size_t") long i, @Const @ByRef IValue v);
  @MemberGetter public static native @Cast("const bool") boolean all_slots();
  public static final boolean all_slots = all_slots();
}
