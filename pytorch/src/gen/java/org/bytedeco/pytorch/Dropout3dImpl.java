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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Dropout3d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies dropout over a 3-D input.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Dropout3d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::Dropout3dOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Dropout3d model(Dropout3dOptions().p(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Dropout3dImpl extends Dropout3dImplBase {
    static { Loader.load(); }

  
    public Dropout3dImpl(double p) { super((Pointer)null); allocate(p); }
    private native void allocate(double p);
  
    public Dropout3dImpl(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@Const @ByRef(nullValue = "torch::nn::DropoutOptions{}") DropoutOptions options_);
    public Dropout3dImpl() { super((Pointer)null); allocate(); }
    private native void allocate();
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dropout3dImpl(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@ByVal Tensor input);

  /** Pretty prints the {@code Dropout3d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
