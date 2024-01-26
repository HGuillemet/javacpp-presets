// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~ AdaptiveMaxPool1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies adaptive maxpool over a 1-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.AdaptiveMaxPool1d to
 *  learn about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::AdaptiveMaxPool1dOptions} class to
 *  learn what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  AdaptiveMaxPool1d model(AdaptiveMaxPool1dOptions(3));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveMaxPool1dImpl extends AdaptiveMaxPool1dImplBase {
    static { Loader.load(); }

  
    public AdaptiveMaxPool1dImpl(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer output_size) { super((Pointer)null); allocate(output_size); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer output_size);
    public AdaptiveMaxPool1dImpl(
          @Const @ByRef AdaptiveMaxPool1dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(
          @Const @ByRef AdaptiveMaxPool1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveMaxPool1dImpl(Pointer p) { super(p); }
    /** Downcast constructor. */
    public AdaptiveMaxPool1dImpl(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::AdaptiveMaxPool1dImpl, torch::nn::Module>") void allocate(@SharedPtr Module pointer);


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Returns the indices along with the outputs.
   *  Useful to pass to nn.MaxUnpool1d. */
  public native @ByVal T_TensorTensor_T forward_with_indices(@Const @ByRef Tensor input);
}
