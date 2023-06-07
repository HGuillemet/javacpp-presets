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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ HuberLoss
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Creates a criterion that uses a squared term if the absolute
 *  element-wise error falls below delta and a delta-scaled L1 term otherwise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.HuberLoss to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::HuberLossOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  HuberLoss model(HuberLossOptions().reduction(torch::kNone).delta(0.5));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HuberLossImpl extends HuberLossImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HuberLossImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HuberLossImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public HuberLossImpl position(long position) {
        return (HuberLossImpl)super.position(position);
    }
    @Override public HuberLossImpl getPointer(long i) {
        return new HuberLossImpl((Pointer)this).offsetAddress(i);
    }

  public HuberLossImpl(@ByVal(nullValue = "torch::nn::HuberLossOptions{}") HuberLossOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@ByVal(nullValue = "torch::nn::HuberLossOptions{}") HuberLossOptions options_);
  public HuberLossImpl() { super((Pointer)null); allocate(); }
  @SharedPtr private native void allocate();

  public native void reset();

  /** Pretty prints the {@code HuberLoss} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input, @Const @ByRef Tensor target);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef HuberLossOptions options(); public native HuberLossImpl options(HuberLossOptions setter);
}
