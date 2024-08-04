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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ============================================================================

/** Base class for all (dimension-specialized) ReplicationPad modules. */
@Name("torch::nn::ReplicationPadImpl<1,torch::nn::ReplicationPad1dImpl>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReplicationPad1dImplBase extends ReplicationPad1dImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReplicationPad1dImplBase(Pointer p) { super(p); }

  public ReplicationPad1dImplBase(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding) { super((Pointer)null); allocate(padding); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding);
  public ReplicationPad1dImplBase(@Const @ByRef ReplicationPad1dOptions options_) { super((Pointer)null); allocate(options_); }
  private native void allocate(@Const @ByRef ReplicationPad1dOptions options_);

  public native void reset();

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code ReplicationPad{1,2}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** The options with which this {@code Module} was constructed. */
  public native @ByRef ReplicationPad1dOptions options(); public native ReplicationPad1dImplBase options(ReplicationPad1dOptions setter);
}
