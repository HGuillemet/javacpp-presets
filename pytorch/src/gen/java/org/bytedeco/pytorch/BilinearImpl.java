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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Bilinear ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies a billinear transformation with optional bias.
 *  See https://pytorch.org/docs/main/generated/torch.nn.Bilinear.html to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::BilinearOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Bilinear model(BilinearOptions(3, 2, 4).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BilinearImpl extends BilinearImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BilinearImpl(Pointer p) { super(p); }

  public BilinearImpl(@Cast("int64_t") long in1_features, @Cast("int64_t") long in2_features, @Cast("int64_t") long out_features) { super((Pointer)null); allocate(in1_features, in2_features, out_features); }
  @SharedPtr @Name("std::make_shared<torch::nn::BilinearImpl>") private native void allocate(@Cast("int64_t") long in1_features, @Cast("int64_t") long in2_features, @Cast("int64_t") long out_features);
  public BilinearImpl(@Const @ByRef BilinearOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::BilinearImpl>") private native void allocate(@Const @ByRef BilinearOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code Bilinear} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Applies a bilinear transform on the {@code input1} and {@code input2} tensor by
   *  multiplying with the {@code weight} and optionally adding the {@code bias}, if
   *  {@code with_bias} is true in the options. */
  public native @ByVal Tensor forward(@Const @ByRef Tensor input1, @Const @ByRef Tensor input2);

  /** The options used to configure this module. */
  public native @ByRef BilinearOptions options(); public native BilinearImpl options(BilinearOptions setter);

  /** The learned weight. */
  public native @ByRef Tensor weight(); public native BilinearImpl weight(Tensor setter);

  /** The learned bias. If {@code with_bias} is false in the {@code options}, this tensor is
   *  undefined. */
  public native @ByRef Tensor bias(); public native BilinearImpl bias(Tensor setter);
}
