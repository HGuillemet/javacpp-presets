// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ PixelShuffle
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Rearranges elements in a tensor of shape :math:{@code (*, C \times r^2, H, W)}
 *  to a tensor of shape :math:{@code (*, C, H \times r, W \times r)}, where r is an
 *  upscale factor. See
 *  https://pytorch.org/docs/master/nn.html#torch.nn.PixelShuffle to learn about
 *  the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::PixelShuffleOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  PixelShuffle model(PixelShuffleOptions(5));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PixelShuffleImpl extends PixelShuffleImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PixelShuffleImpl(Pointer p) { super(p); }

  public PixelShuffleImpl(@Const @ByRef PixelShuffleOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@Const @ByRef PixelShuffleOptions options_);

  /** Pretty prints the {@code PixelShuffle} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef PixelShuffleOptions options(); public native PixelShuffleImpl options(PixelShuffleOptions setter);
}
