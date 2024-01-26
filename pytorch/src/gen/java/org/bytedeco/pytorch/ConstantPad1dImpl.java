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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ConstantPad1d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies ConstantPad over a 1-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.ConstantPad1d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ConstantPad1dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ConstantPad1d model(ConstantPad1dOptions({3, 1}, 3.5));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad1dImpl extends ConstantPad1dImplBase {
    static { Loader.load(); }

  
    public ConstantPad1dImpl(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding, double value) { super((Pointer)null); allocate(padding, value); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding, double value);
    public ConstantPad1dImpl(@Const @ByRef ConstantPad1dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef ConstantPad1dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad1dImpl(Pointer p) { super(p); }
    /** Downcast constructor. */
    public ConstantPad1dImpl(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::ConstantPad1dImpl, torch::nn::Module>") void allocate(@SharedPtr Module pointer);

}
