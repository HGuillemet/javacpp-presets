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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Softmax2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the Softmax2d function element-wise.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.Softmax2d to learn
 *  about the exact behavior of this module. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Softmax2dImpl extends Softmax2dImplCloneable {
    static { Loader.load(); }
    /** Default native constructor. */
    public Softmax2dImpl() { super((Pointer)null); allocate(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Softmax2dImpl(Pointer p) { super(p); }
    @SharedPtr @Name("std::make_shared<torch::nn::Softmax2dImpl>") private native void allocate();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native void reset();

  /** Pretty prints the {@code Softmax2d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
