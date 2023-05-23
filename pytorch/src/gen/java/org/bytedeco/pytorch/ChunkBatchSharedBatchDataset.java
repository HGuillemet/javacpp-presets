// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("torch::data::datasets::BatchDataset<torch::data::datasets::SharedBatchDataset<torch::data::datasets::ChunkDataset<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003c_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003c_0003e_00020_0003e_00020_0003e,torch::data::samplers::RandomSampler,torch::data::samplers::RandomSampler> >,c10::optional<JavaCPP_torch_0003a_0003adata_0003a_0003adatasets_0003a_0003aChunkDataReader_0003ctorch_0003a_0003adata_0003a_0003aExample_0003c_0003e_0002cstd_0003a_0003avector_0003ctorch_0003a_0003adata_0003a_0003aExample_0003c_0003e_00020_0003e_00020_0003e::BatchType>,size_t>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ChunkBatchSharedBatchDataset extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ChunkBatchSharedBatchDataset(Pointer p) { super(p); }

  @MemberGetter public static native @Cast("const bool") boolean is_stateful();
  public static final boolean is_stateful = is_stateful();

  /** Returns a batch of data given an index. */
  public native @ByVal ExampleVectorOptional get_batch(@Cast("size_t") long request);

  /** Returns the size of the dataset, or an empty optional if it is unsized. */
  public native @ByVal SizeTOptional size();

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  public native @ByVal ChunkMapDataset map(@ByVal ExampleStack transform);

  /** Creates a {@code MapDataset} that applies the given {@code transform} to this dataset. */
  
}
