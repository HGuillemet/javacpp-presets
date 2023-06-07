// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ BCEWithLogitsLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** This loss combines a {@code Sigmoid} layer and the {@code BCELoss} in one single
 *  class. This version is more numerically stable than using a plain {@code Sigmoid}
 *  followed by a {@code BCELoss} as, by combining the operations into one layer,
 *  we take advantage of the log-sum-exp trick for numerical stability.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.BCEWithLogitsLoss to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::BCEWithLogitsLossOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  BCEWithLogitsLoss
 *  model(BCEWithLogitsLossOptions().reduction(torch::kNone).weight(weight));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BCEWithLogitsLossImpl extends BCEWithLogitsLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BCEWithLogitsLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BCEWithLogitsLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BCEWithLogitsLossImpl position(long position) {
        return (BCEWithLogitsLossImpl)super.position(position);
    }
    @Override public BCEWithLogitsLossImpl getPointer(long i) {
        return new BCEWithLogitsLossImpl((Pointer)this).offsetAddress(i);
    }

  public BCEWithLogitsLossImpl(@ByVal(nullValue = "torch::nn::BCEWithLogitsLossOptions{}") BCEWithLogitsLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@ByVal(nullValue = "torch::nn::BCEWithLogitsLossOptions{}") BCEWithLogitsLossOptions options_);
  public BCEWithLogitsLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr private native void allocate();

  public native void reset();

  /** Pretty prints the {@code BCEWithLogitsLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef BCEWithLogitsLossOptions options(); public native BCEWithLogitsLossImpl options(BCEWithLogitsLossOptions setter);

  /** A manual rescaling weight given to the loss of each batch element. */
  public native @ByRef Tensor weight(); public native BCEWithLogitsLossImpl weight(Tensor setter);

  /** A weight of positive examples. */
  public native @ByRef Tensor pos_weight(); public native BCEWithLogitsLossImpl pos_weight(Tensor setter);
}
