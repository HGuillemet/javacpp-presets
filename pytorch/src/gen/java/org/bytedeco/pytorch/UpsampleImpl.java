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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Upsample ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Upsamples a given multi-channel 1D (temporal), 2D (spatial) or 3D
 *  (volumetric) data.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Upsample to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::UpsampleOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Upsample
 *  model(UpsampleOptions().scale_factor({3}).mode(torch::kLinear).align_corners(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UpsampleImpl extends UpsampleImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UpsampleImpl(Pointer p) { super(p); }

  public UpsampleImpl(@Const @ByRef(nullValue = "torch::nn::UpsampleOptions{}") UpsampleOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::UpsampleImpl>") private native void allocate(@Const @ByRef(nullValue = "torch::nn::UpsampleOptions{}") UpsampleOptions options_);
  public UpsampleImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::UpsampleImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code Upsample} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef UpsampleOptions options(); public native UpsampleImpl options(UpsampleOptions setter);
}
