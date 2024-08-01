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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LocalResponseNorm
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies local response normalization over an input signal composed
 *  of several input planes, where channels occupy the second dimension.
 *  Applies normalization across channels.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.LocalResponseNorm to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LocalResponseNormOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LocalResponseNorm
 *  model(LocalResponseNormOptions(2).alpha(0.0002).beta(0.85).k(2.));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LocalResponseNormImpl extends LocalResponseNormImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LocalResponseNormImpl(Pointer p) { super(p); }

  public LocalResponseNormImpl(@Cast("int64_t") long size) { super((Pointer)null); allocate(size); }
  @SharedPtr @Name("std::make_shared<torch::nn::LocalResponseNormImpl>") private native void allocate(@Cast("int64_t") long size);
  public LocalResponseNormImpl(@Const @ByRef LocalResponseNormOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::LocalResponseNormImpl>") private native void allocate(@Const @ByRef LocalResponseNormOptions options_);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code LocalResponseNormImpl} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef LocalResponseNormOptions options(); public native LocalResponseNormImpl options(LocalResponseNormOptions setter);
}
