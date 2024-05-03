// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("torch::nn::LPPoolImpl<3,torch::nn::LPPool3dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LPPool3dImplBase extends LPPool3dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LPPool3dImplBase(Pointer p) { super(p); }

  public LPPool3dImplBase(double norm_type, @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(norm_type, kernel_size); }
  private native void allocate(double norm_type, @ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
  public LPPool3dImplBase(@Const @ByRef LPPool3dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@Const @ByRef LPPool3dOptions options_);

  public native void reset();

  /** Pretty prints the {@code LPPool{1,2}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByRef LPPool3dOptions options(); public native LPPool3dImplBase options(LPPool3dOptions setter);
}
