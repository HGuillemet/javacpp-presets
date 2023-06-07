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


/** A sampler for (potentially infinite) streams of data.
 * 
 *  The major feature of the {@code StreamSampler} is that it does not return
 *  particular indices, but instead only the number of elements to fetch from
 *  the dataset. The dataset has to decide how to produce those elements. */
@Namespace("torch::data::samplers") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StreamSampler extends BatchSizeSampler {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StreamSampler(Pointer p) { super(p); }

  /** Constructs the {@code StreamSampler} with the number of individual examples that
   *  should be fetched until the sampler is exhausted. */
  public StreamSampler(@Cast("size_t") long epoch_size) { super((Pointer)null); allocate(epoch_size); }
  private native void allocate(@Cast("size_t") long epoch_size);

  /** Resets the internal state of the sampler. */
  public native void reset(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional new_size);
  public native void reset();

  /** Returns a {@code BatchSize} object with the number of elements to fetch in the
   *  next batch. This number is the minimum of the supplied {@code batch_size} and
   *  the difference between the {@code epoch_size} and the current index. If the
   *  {@code epoch_size} has been reached, returns an empty optional. */
  public native @ByVal BatchSizeOptional next(@Cast("size_t") long batch_size);

  /** Serializes the {@code StreamSampler} to the {@code archive}. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the {@code StreamSampler} from the {@code archive}. */
  public native void load(@ByRef InputArchive archive);
}
