// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ConstantPad2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies ConstantPad over a 2-D input.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.ConstantPad2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::ConstantPad2dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  ConstantPad2d model(ConstantPad2dOptions({3, 0, 2, 1}, 3.5));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad2dImpl extends ConstantPad2dImplBase {
    static { Loader.load(); }

  
    public ConstantPad2dImpl(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding, double value) { super((Pointer)null); allocate(padding, value); }
    private native void allocate(@ByVal @Cast("torch::ExpandingArray<2*2>*") LongPointer padding, double value);
    public ConstantPad2dImpl(@Const @ByRef ConstantPad2dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef ConstantPad2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad2dImpl(Pointer p) { super(p); }

}
