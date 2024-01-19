// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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


@Namespace("torch::optim") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptimizerOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public OptimizerOptions() { super((Pointer)null); allocate(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptimizerOptions(Pointer p) { super(p); }
    @UniquePtr @Name("std::make_unique<torch::optim::OptimizerOptions>") private native void allocate();

  public native @UniquePtr @ByVal OptimizerOptions clone();
  
  
  public native double get_lr();
  public native void set_lr(double lr);
}
