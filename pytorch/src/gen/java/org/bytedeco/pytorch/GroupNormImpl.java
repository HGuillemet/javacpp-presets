// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GroupNorm ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies Group Normalization over a mini-batch of inputs as described in
 *  the paper {@code Group Normalization}_ .
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.GroupNorm to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::GroupNormOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  GroupNorm model(GroupNormOptions(2, 2).eps(2e-5).affine(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GroupNormImpl extends GroupNormImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GroupNormImpl(Pointer p) { super(p); }

  public GroupNormImpl(@Cast("int64_t") long num_groups, @Cast("int64_t") long num_channels) { super((Pointer)null); allocate(num_groups, num_channels); }
  @SharedPtr @Name("std::make_shared<torch::nn::GroupNormImpl>") private native void allocate(@Cast("int64_t") long num_groups, @Cast("int64_t") long num_channels);
  public GroupNormImpl(@Const @ByRef GroupNormOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::GroupNormImpl>") private native void allocate(@Const @ByRef GroupNormOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code GroupNorm} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options with which this module was constructed. */
  public native @ByRef GroupNormOptions options(); public native GroupNormImpl options(GroupNormOptions setter);

  /** The learned weight. */
  public native @ByRef Tensor weight(); public native GroupNormImpl weight(Tensor setter);

  /** The learned bias. */
  public native @ByRef Tensor bias(); public native GroupNormImpl bias(Tensor setter);
}
