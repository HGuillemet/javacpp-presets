// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ PoissonNLLLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Negative log likelihood loss with Poisson distribution of target.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.PoissonNLLLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::PoissonNLLLossOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  PoissonNLLLoss
 *  model(PoissonNLLLossOptions().log_input(false).full(true).eps(0.42).reduction(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PoissonNLLLossImpl extends PoissonNLLLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PoissonNLLLossImpl(Pointer p) { super(p); }

  public PoissonNLLLossImpl(@ByVal(nullValue = "torch::nn::PoissonNLLLossOptions{}") PoissonNLLLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::PoissonNLLLossImpl>") private native void allocate(@ByVal(nullValue = "torch::nn::PoissonNLLLossOptions{}") PoissonNLLLossOptions options_);
  public PoissonNLLLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::PoissonNLLLossImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code PoissonNLLLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor log_input, @Const @ByRef Tensor targets);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef PoissonNLLLossOptions options(); public native PoissonNLLLossImpl options(PoissonNLLLossOptions setter);
}
