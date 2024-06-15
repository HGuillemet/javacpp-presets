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


// ============================================================================

/** Base class for all (dimension-specialized) adaptive maxpool modules. */
@Name("torch::nn::AdaptiveMaxPoolImpl<1,torch::ExpandingArray<1>,torch::nn::AdaptiveMaxPool1dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveMaxPool1dImplBase extends AdaptiveMaxPool1dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveMaxPool1dImplBase(Pointer p) { super(p); }

  public AdaptiveMaxPool1dImplBase(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer output_size) { super((Pointer)null); allocate(output_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<1>*") LongPointer output_size);
  public AdaptiveMaxPool1dImplBase(
        @Const @ByRef AdaptiveMaxPool1dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(
        @Const @ByRef AdaptiveMaxPool1dOptions options_);

  public native void reset();

  /** Pretty prints the {@code AdaptiveMaxPool{1,2,3}d} module into the given
   *  {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef AdaptiveMaxPool1dOptions options(); public native AdaptiveMaxPool1dImplBase options(AdaptiveMaxPool1dOptions setter);
}
