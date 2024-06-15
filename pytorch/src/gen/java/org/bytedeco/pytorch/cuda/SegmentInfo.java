// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
import org.bytedeco.cuda.cudart.*;
import org.bytedeco.cuda.cusparse.*;
import org.bytedeco.cuda.cublas.*;
import org.bytedeco.cuda.cusolver.*;
import org.bytedeco.cuda.cudnn.*;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.cuda.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


// Struct containing info of a memory segment (i.e. one contiguous cudaMalloc).
@Namespace("c10::cuda::CUDACachingAllocator") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class SegmentInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SegmentInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SegmentInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SegmentInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SegmentInfo position(long position) {
        return (SegmentInfo)super.position(position);
    }
    @Override public SegmentInfo getPointer(long i) {
        return new SegmentInfo((Pointer)this).offsetAddress(i);
    }

  public native byte device(); public native SegmentInfo device(byte setter);
  public native @Cast("int64_t") @Name("address") long _address(); public native SegmentInfo _address(long setter);
  public native @Cast("int64_t") long total_size(); public native SegmentInfo total_size(long setter);
  public native @Cast("int64_t") long requested_size(); public native SegmentInfo requested_size(long setter); // unrounded, actually requested size
  public native @Cast("int64_t") long allocated_size(); public native SegmentInfo allocated_size(long setter);
  public native @Cast("int64_t") long active_size(); public native SegmentInfo active_size(long setter);
  public native CUstream_st stream(); public native SegmentInfo stream(CUstream_st setter);
  public native @Cast("bool") boolean is_large(); public native SegmentInfo is_large(boolean setter);
  public native @Cast("bool") boolean is_expandable(); public native SegmentInfo is_expandable(boolean setter);
  public native @ByRef @Cast("c10::cuda::MempoolId_t*") DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair owner_private_pool_id(); public native SegmentInfo owner_private_pool_id(DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair setter);
  public native @StdVector BlockInfo blocks(); public native SegmentInfo blocks(BlockInfo setter);
  public native @SharedPtr GatheredContext context_when_allocated(); public native SegmentInfo context_when_allocated(GatheredContext setter);
}
