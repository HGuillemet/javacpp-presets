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


/** Base class for all (dimension-specialized) convolution modules. */
@Name("torch::nn::ConvNdImpl<1,torch::nn::Conv1dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv1dImplBase extends Conv1dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv1dImplBase(Pointer p) { super(p); }

  public Conv1dImplBase(@ByVal DetailConv1dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@ByVal DetailConv1dOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code Conv{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef DetailConv1dOptions options(); public native Conv1dImplBase options(DetailConv1dOptions setter);

  /** The learned kernel (or "weight"). */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef Tensor weight(); public native Conv1dImplBase weight(Tensor setter);

  /** The learned bias. Only defined if the {@code bias} option was true. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef Tensor bias(); public native Conv1dImplBase bias(Tensor setter);
}
