// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Flatten ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A placeholder for Flatten operator
 *  See https://pytorch.org/docs/main/generated/torch.nn.Flatten.html to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::FlattenOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Flatten model(FlattenOptions().start_dim(2).end_dim(4));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FlattenImpl extends FlattenImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FlattenImpl(Pointer p) { super(p); }

  public FlattenImpl(@Const @ByRef(nullValue = "torch::nn::FlattenOptions{}") FlattenOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::FlattenImpl>") private native void allocate(@Const @ByRef(nullValue = "torch::nn::FlattenOptions{}") FlattenOptions options_);
  public FlattenImpl() { super((Pointer)null); allocate(); }
  @SharedPtr @Name("std::make_shared<torch::nn::FlattenImpl>") private native void allocate();

  public native void reset();

  /** Pretty prints the {@code Flatten} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Applies a flatten transform on the {@code input}. */
  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** The options used to configure this module. */
  public native @ByRef FlattenOptions options(); public native FlattenImpl options(FlattenOptions setter);
}
