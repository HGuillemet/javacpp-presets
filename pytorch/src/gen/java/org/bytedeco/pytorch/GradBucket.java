// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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


// This class passes bucket contents tensor to DDP communication hook.
@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GradBucket extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GradBucket(Pointer p) { super(p); }

  public GradBucket(
        @Cast("size_t") long index,
        @Cast("size_t") long bucket_count,
        @ByVal Tensor tensor,
        @ByVal @Cast("std::vector<size_t>*") SizeTVector offsets,
        @ByVal @Cast("std::vector<size_t>*") SizeTVector lengths,
        @ByVal LongArrayRefVector sizes_vec,
        @ByVal TensorVector parameters,
        @ByVal TensorOptional sparse_grad_indices) { super((Pointer)null); allocate(index, bucket_count, tensor, offsets, lengths, sizes_vec, parameters, sparse_grad_indices); }
  private native void allocate(
        @Cast("size_t") long index,
        @Cast("size_t") long bucket_count,
        @ByVal Tensor tensor,
        @ByVal @Cast("std::vector<size_t>*") SizeTVector offsets,
        @ByVal @Cast("std::vector<size_t>*") SizeTVector lengths,
        @ByVal LongArrayRefVector sizes_vec,
        @ByVal TensorVector parameters,
        @ByVal TensorOptional sparse_grad_indices);

  // Returns the index of the bucket, which is unique across all the buckets.
  public native @Cast("size_t") long getIndex();

  public native @Const @ByRef Tensor getBuffer();

  // Returns a mutable buffer compared with the above method.
  public native @ByRef Tensor getBufferRef();

  // Overwrites the buffer at a specific index.
  public native void setBuffer(@ByRef Tensor buffer);

  // Each tensor in the list that getGradients corresponds to a
  // parameter.
  public native @ByVal TensorVector getGradients();

  // Returns model parameters belonging to this bucket. They are returned in the
  // same order as gradient tensors via getGradients(). For example,
  // getParameters[i] will have its gradient stored in
  // getGradients[i]
  public native @Const @ByVal TensorVector getParameters();

  // Returns whther this bucket is the last bucket to allreduce in an iteration.
  public native @Cast("bool") boolean isLast();

  public native @ByRef TensorOptional getSparseGradIndices();
}
