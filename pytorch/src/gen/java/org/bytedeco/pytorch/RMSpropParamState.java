// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RMSpropParamState extends OptimizerCloneableRMSpropParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public RMSpropParamState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RMSpropParamState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RMSpropParamState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RMSpropParamState position(long position) {
        return (RMSpropParamState)super.position(position);
    }
    @Override public RMSpropParamState getPointer(long i) {
        return new RMSpropParamState((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer step();
  public native @ByRef @NoException(true) Tensor square_avg();
  public native @ByRef @NoException(true) Tensor momentum_buffer();
  public native @ByRef @NoException(true) Tensor grad_avg();
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef RMSpropParamState lhs,
        @Const @ByRef RMSpropParamState rhs);
  public boolean equals(RMSpropParamState rhs) { return equals(this, rhs); }
}
