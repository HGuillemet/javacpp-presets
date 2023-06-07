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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ BCELoss ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that measures the Binary Cross Entropy
 *  between the target and the output.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.BCELoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::BCELossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  BCELoss model(BCELossOptions().reduction(torch::kNone).weight(weight));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BCELossImpl extends BCELossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BCELossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BCELossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BCELossImpl position(long position) {
        return (BCELossImpl)super.position(position);
    }
    @Override public BCELossImpl getPointer(long i) {
        return new BCELossImpl((Pointer)this).offsetAddress(i);
    }

  public BCELossImpl(@ByVal(nullValue = "torch::nn::BCELossOptions{}") BCELossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@ByVal(nullValue = "torch::nn::BCELossOptions{}") BCELossOptions options_);
  public BCELossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr private native void allocate();

  public native void reset();

  /** Pretty prints the {@code BCELoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef BCELossOptions options(); public native BCELossImpl options(BCELossOptions setter);
}
