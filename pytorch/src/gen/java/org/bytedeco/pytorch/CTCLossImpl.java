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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ CTCLoss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** The Connectionist Temporal Classification loss.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.CTCLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::CTCLossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  CTCLoss
 *  model(CTCLossOptions().blank(42).zero_infinity(false).reduction(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CTCLossImpl extends CTCLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CTCLossImpl(Pointer p) { super(p); }

  public CTCLossImpl(@ByVal(nullValue = "torch::nn::CTCLossOptions{}") CTCLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::CTCLossImpl>") private native void allocate(@ByVal(nullValue = "torch::nn::CTCLossOptions{}") CTCLossOptions options_);
  public CTCLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::CTCLossImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code CTCLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(
        @Const @ByRef Tensor log_probs,
        @Const @ByRef Tensor targets,
        @Const @ByRef Tensor input_lengths,
        @Const @ByRef Tensor target_lengths);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef CTCLossOptions options(); public native CTCLossImpl options(CTCLossOptions setter);
}
