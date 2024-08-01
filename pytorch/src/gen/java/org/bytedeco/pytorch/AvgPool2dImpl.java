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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AvgPool2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies avgpool over a 2-D input.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.AvgPool2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AvgPool2dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AvgPool2d model(AvgPool2dOptions({3, 2}).stride({2, 2}));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AvgPool2dImpl extends AvgPool2dImplBase {
    static { Loader.load(); }

  
    public AvgPool2dImpl(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
    public AvgPool2dImpl(@Const @ByRef AvgPool2dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef AvgPool2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AvgPool2dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
