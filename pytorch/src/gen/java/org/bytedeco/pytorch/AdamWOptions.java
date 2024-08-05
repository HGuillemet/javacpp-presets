// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace torch

@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdamWOptions extends OptimizerCloneableAdamWOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdamWOptions(Pointer p) { super(p); }

  public AdamWOptions(double lr/*=1e-3*/) { super((Pointer)null); allocate(lr); }
  @UniquePtr @Name("std::make_unique<torch::optim::AdamWOptions>") private native void allocate(double lr/*=1e-3*/);
  public AdamWOptions() { super((Pointer)null); allocate(); }
  @UniquePtr @Name("std::make_unique<torch::optim::AdamWOptions>") private native void allocate();
  public native @ByRef @NoException(true) DoublePointer lr();
  public native @Cast("std::tuple<double,double>*") @ByRef @NoException DoublePointer betas();
  public native @ByRef @NoException(true) DoublePointer eps();
  public native @ByRef @NoException(true) DoublePointer weight_decay();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer amsgrad();
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef AdamWOptions lhs,
        @Const @ByRef AdamWOptions rhs);
  public boolean equals(AdamWOptions rhs) { return equals(this, rhs); }
  public native double get_lr();
  public native void set_lr(double lr);
}
