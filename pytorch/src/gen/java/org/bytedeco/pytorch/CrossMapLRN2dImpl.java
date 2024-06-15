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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ CrossMapLRN2d ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** See the documentation for {@code torch::nn::CrossMapLRN2dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  CrossMapLRN2d model(CrossMapLRN2dOptions(3).alpha(1e-5).beta(0.1).k(10));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CrossMapLRN2dImpl extends CrossMapLRN2dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CrossMapLRN2dImpl(Pointer p) { super(p); }

  public CrossMapLRN2dImpl(@Cast("int64_t") long size) { super((Pointer)null); allocate(size); }
  @SharedPtr @Name("std::make_shared<torch::nn::CrossMapLRN2dImpl>") private native void allocate(@Cast("int64_t") long size);
  public CrossMapLRN2dImpl(@Const @ByRef CrossMapLRN2dOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::CrossMapLRN2dImpl>") private native void allocate(@Const @ByRef CrossMapLRN2dOptions options_);

  public native void reset();

  /** Pretty prints the {@code CrossMapLRN2d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  public native @ByRef CrossMapLRN2dOptions options(); public native CrossMapLRN2dImpl options(CrossMapLRN2dOptions setter);
}
