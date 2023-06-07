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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ MultiMarginLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that optimizes a multi-class classification hinge
 *  loss (margin-based loss) between input :math:{@code x} (a 2D mini-batch {@code Tensor})
 *  and output :math:{@code y} (which is a 1D tensor of target class indices, :math:{@code 0
 *  \leq y \leq \text{x.size}(1)-1}). See
 *  https://pytorch.org/docs/master/nn.html#torch.nn.MultiMarginLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::MultiMarginLossOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiMarginLoss model(MultiMarginLossOptions().margin(2).weight(weight));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiMarginLossImpl extends MultiMarginLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiMarginLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiMarginLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MultiMarginLossImpl position(long position) {
        return (MultiMarginLossImpl)super.position(position);
    }
    @Override public MultiMarginLossImpl getPointer(long i) {
        return new MultiMarginLossImpl((Pointer)this).offsetAddress(i);
    }

  public MultiMarginLossImpl(@ByVal(nullValue = "torch::nn::MultiMarginLossOptions{}") MultiMarginLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@ByVal(nullValue = "torch::nn::MultiMarginLossOptions{}") MultiMarginLossOptions options_);
  public MultiMarginLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr private native void allocate();

  public native void reset();

  /** Pretty prints the {@code MultiMarginLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef MultiMarginLossOptions options(); public native MultiMarginLossImpl options(MultiMarginLossOptions setter);
}
