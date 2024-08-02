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

@Name("torch::nn::ConvNdImpl<2,torch::nn::Conv2dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv2dImplBase extends Conv2dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv2dImplBase(Pointer p) { super(p); }

  public Conv2dImplBase(@ByVal DetailConv2dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@ByVal DetailConv2dOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code Conv{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef DetailConv2dOptions options(); public native Conv2dImplBase options(DetailConv2dOptions setter);

  /** The learned kernel (or "weight"). */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef Tensor weight(); public native Conv2dImplBase weight(Tensor setter);

  /** The learned bias. Only defined if the {@code bias} option was true. */
  // NOLINTNEXTLINE(cppcoreguidelines-non-private-member-variables-in-classes)
  public native @ByRef Tensor bias(); public native Conv2dImplBase bias(Tensor setter);
}
