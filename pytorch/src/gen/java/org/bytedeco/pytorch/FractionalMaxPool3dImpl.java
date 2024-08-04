// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ FractionalMaxPool3d
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies fractional maxpool over a 3-D input.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.FractionalMaxPool3d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::FractionalMaxPool3dOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  FractionalMaxPool3d model(FractionalMaxPool3dOptions(5).output_size(1));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FractionalMaxPool3dImpl extends FractionalMaxPool3dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FractionalMaxPool3dImpl(Pointer p) { super(p); }

  public FractionalMaxPool3dImpl(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
  @SharedPtr @Name("std::make_shared<torch::nn::FractionalMaxPool3dImpl>") private native void allocate(@ByVal @Cast("torch::ExpandingArray<3>*") LongPointer kernel_size);
  public FractionalMaxPool3dImpl(@ByVal FractionalMaxPool3dOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::FractionalMaxPool3dImpl>") private native void allocate(@ByVal FractionalMaxPool3dOptions options_);

  public native void reset();

  /** Pretty prints the {@code FractionalMaxPool3d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the outputs and the indices of the max values.
   *  Useful for {@code torch::nn::MaxUnpool3d} later. */
  public native @ByVal T_TensorTensor_T forward_with_indices(@Const @ByRef Tensor input);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef FractionalMaxPool3dOptions options(); public native FractionalMaxPool3dImpl options(FractionalMaxPool3dOptions setter);

  public native @ByRef Tensor _random_samples(); public native FractionalMaxPool3dImpl _random_samples(Tensor setter);
}
