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


/** A {@code Sampler} that returns indices sequentially. */
@Namespace("torch::data::samplers") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SequentialSampler extends Sampler {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SequentialSampler(Pointer p) { super(p); }

  /** Creates a {@code SequentialSampler} that will return indices in the range
   *  {@code 0...size - 1}. */
  public SequentialSampler(@Cast("size_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(@Cast("size_t") long size);

  /** Resets the {@code SequentialSampler} to zero. */
  public native void reset(@ByVal(nullValue = "std::optional<size_t>(c10::nullopt)") SizeTOptional new_size);
  public native void reset();

  /** Returns the next batch of indices. */
  public native @ByVal SizeTVectorOptional next(@Cast("size_t") long batch_size);

  /** Serializes the {@code SequentialSampler} to the {@code archive}. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the {@code SequentialSampler} from the {@code archive}. */
  public native void load(@ByRef InputArchive archive);

  /** Returns the current index of the {@code SequentialSampler}. */
  public native @Cast("size_t") @NoException(true) long index();
}
