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


/** Select samples sequentially. */
@Namespace("torch::data::samplers") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DistributedSequentialSampler extends DistributedSampler {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DistributedSequentialSampler(Pointer p) { super(p); }

  public DistributedSequentialSampler(
        @Cast("size_t") long size,
        @Cast("size_t") long num_replicas/*=1*/,
        @Cast("size_t") long rank/*=0*/,
        @Cast("bool") boolean allow_duplicates/*=true*/) { super((Pointer)null); allocate(size, num_replicas, rank, allow_duplicates); }
  private native void allocate(
        @Cast("size_t") long size,
        @Cast("size_t") long num_replicas/*=1*/,
        @Cast("size_t") long rank/*=0*/,
        @Cast("bool") boolean allow_duplicates/*=true*/);
  public DistributedSequentialSampler(
        @Cast("size_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(
        @Cast("size_t") long size);

  /** Resets the {@code DistributedSequentialSampler} to a new set of indices. */
  public native void reset(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional new_size);
  public native void reset();

  /** Returns the next batch of indices. */
  public native @ByVal SizeTVectorOptional next(@Cast("size_t") long batch_size);

  /** Serializes the {@code DistributedSequentialSampler} to the {@code archive}. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the {@code DistributedSequentialSampler} from the {@code archive}. */
  public native void load(@ByRef InputArchive archive);

  /** Returns the current index of the {@code DistributedSequentialSampler}. */
  public native @Cast("size_t") @NoException(true) long index();
}
