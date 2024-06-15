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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ AvgPool1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies avgpool over a 1-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.AvgPool1d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AvgPool1dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AvgPool1d model(AvgPool1dOptions(3).stride(2));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AvgPool1dImpl extends AvgPool1dImplBase {
    static { Loader.load(); }

  
    public AvgPool1dImpl(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
    public AvgPool1dImpl(@Const @ByRef AvgPool1dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef AvgPool1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AvgPool1dImpl(Pointer p) { super(p); }

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
