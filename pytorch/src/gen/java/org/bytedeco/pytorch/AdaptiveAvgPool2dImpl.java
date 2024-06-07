// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~ AdaptiveAvgPool2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies adaptive avgpool over a 2-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.AdaptiveAvgPool2d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AdaptiveAvgPool2dOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AdaptiveAvgPool2d model(AdaptiveAvgPool2dOptions({3, 2}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveAvgPool2dImpl extends AdaptiveAvgPool2dImplBase {
    static { Loader.load(); }

  
    public AdaptiveAvgPool2dImpl(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongOptional output_size) { super((Pointer)null); allocate(output_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongOptional output_size);
    public AdaptiveAvgPool2dImpl(
          @Const @ByRef AdaptiveAvgPool2dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(
          @Const @ByRef AdaptiveAvgPool2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveAvgPool2dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
