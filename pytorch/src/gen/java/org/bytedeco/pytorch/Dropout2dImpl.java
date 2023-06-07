// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Dropout2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies dropout over a 2-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Dropout2d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::Dropout2dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Dropout2d model(Dropout2dOptions().p(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Dropout2dImpl extends Dropout2dImplBase {
    static { Loader.load(); }

  
    public Dropout2dImpl(double p) { super((Pointer)null); allocate(p); }
    private native void allocate(double p);
  
    public Dropout2dImpl(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_);
    public Dropout2dImpl() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dropout2dImpl(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dropout2dImpl(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Dropout2dImpl position(long position) {
        return (Dropout2dImpl)super.position(position);
    }
    @Override public Dropout2dImpl getPointer(long i) {
        return new Dropout2dImpl((Pointer)this).offsetAddress(i);
    }


  public native @ByVal Tensor forward(@ByVal Tensor input);

  /** Pretty prints the {@code Dropout2d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
