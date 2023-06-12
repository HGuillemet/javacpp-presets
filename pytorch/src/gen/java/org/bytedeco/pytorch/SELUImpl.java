// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SELU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the selu function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.SELU to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::SELUOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  SELU model(SELUOptions().inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SELUImpl extends SELUImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SELUImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SELUImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SELUImpl position(long position) {
        return (SELUImpl)super.position(position);
    }
    @Override public SELUImpl getPointer(long i) {
        return new SELUImpl((Pointer)this).offsetAddress(i);
    }

  public SELUImpl(@Const @ByRef(nullValue = "torch::nn::SELUOptions{}") SELUOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@Const @ByRef(nullValue = "torch::nn::SELUOptions{}") SELUOptions options_);
  public SELUImpl() { super((Pointer)null); allocate(); }
  @SharedPtr private native void allocate();

  public native @ByVal Tensor forward(@ByVal Tensor input);

  public native void reset();

  /** Pretty prints the {@code SELU} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef SELUOptions options(); public native SELUImpl options(SELUOptions setter);
}
