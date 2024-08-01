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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ RReLU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the RReLU function element-wise.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.RReLU to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::RReLUOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  RReLU model(RReLUOptions().lower(0.24).upper(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RReLUImpl extends RReLUImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RReLUImpl(Pointer p) { super(p); }

  public RReLUImpl(@Const @ByRef(nullValue = "torch::nn::RReLUOptions{}") RReLUOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::RReLUImpl>") private native void allocate(@Const @ByRef(nullValue = "torch::nn::RReLUOptions{}") RReLUOptions options_);
  public RReLUImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::RReLUImpl>") private native void allocate();

  public native @ByVal Tensor forward(@ByVal Tensor input);

  public native void reset();

  /** Pretty prints the {@code RReLU} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef RReLUOptions options(); public native RReLUImpl options(RReLUOptions setter);
}
