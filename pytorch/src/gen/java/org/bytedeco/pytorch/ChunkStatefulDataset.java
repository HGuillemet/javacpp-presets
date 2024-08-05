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


/** A stateful dataset is a dataset that maintains some internal state, which
 *  will be {@code reset()} at the beginning of each epoch. Subclasses can override
 *  the {@code reset()} method to configure this behavior. Further, the return type of
 *  a stateful dataset's {@code get_batch()} method is always an {@code optional}. When the
 *  stateful dataset wants to indicate to the dataloader that its epoch has
 *  ended, it should return an empty optional. The dataloader knows to modify
 *  its implementation based on whether the dataset is stateless or stateful.
 * 
 *  Note that when subclassing a from {@code StatefulDataset<Self, T>}, the return
 *  type of {@code get_batch()}, which the subclass must override, will be
 *  {@code optional<T>} (i.e. the type specified in the {@code StatefulDataset}
 *  specialization is automatically boxed into an {@code optional} for the dataset's
 *  {@code BatchType}). */
@Name("torch::data::datasets::StatefulDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler>,JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003ctorch_0003a_0003aTensor_0002ctorch_0003a_0003aTensor_0003e_00020_0003e_00020_0003e::BatchType,size_t>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkStatefulDataset extends ChunkBatchDataset {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkStatefulDataset(Pointer p) { super(p); }

  /** Resets internal state of the dataset. */
  public native void reset();

  /** Saves the statefulDataset's state to OutputArchive. */
  public native void save(@ByRef OutputArchive archive);

  /** Deserializes the statefulDataset's state from the {@code archive}. */
  public native void load(@ByRef InputArchive archive);
}
