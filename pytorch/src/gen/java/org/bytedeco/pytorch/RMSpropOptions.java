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
 // namespace torch

@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RMSpropOptions extends OptimizerCloneableRMSpropOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RMSpropOptions(Pointer p) { super(p); }

  public RMSpropOptions(double lr/*=1e-2*/) { super((Pointer)null); allocate(lr); }
  private native void allocate(double lr/*=1e-2*/);
  public RMSpropOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @ByRef @NoException(true) DoublePointer lr();
  public native @ByRef @NoException(true) DoublePointer alpha();
  public native @ByRef @NoException(true) DoublePointer eps();
  public native @ByRef @NoException(true) DoublePointer weight_decay();
  public native @ByRef @NoException(true) DoublePointer momentum();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer centered();
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef RMSpropOptions lhs,
        @Const @ByRef RMSpropOptions rhs);
  public boolean equals(RMSpropOptions rhs) { return equals(this, rhs); }
  public native double get_lr();
  public native void set_lr(double lr);
}
