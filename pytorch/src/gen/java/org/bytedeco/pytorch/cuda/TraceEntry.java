// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
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
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;
import org.bytedeco.cuda.cusolver.*;
import static org.bytedeco.cuda.global.cusolver.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


@Namespace("c10::cuda::CUDACachingAllocator") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class TraceEntry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TraceEntry(Pointer p) { super(p); }

  public enum Action {
    ALLOC(0), // API made to the caching allocator for new memory
    FREE_REQUESTED(1), // API call made to the caching allocator to free memory
    FREE_COMPLETED(2), // The allocator might have to delay a free because
                    // it is still in use on another stream via record_stream
                    // This event is generated when a free actually completes.
    SEGMENT_ALLOC(3), // a call to cudaMalloc to get more memory from the OS
    SEGMENT_FREE(4), // a call to cudaFree to return memory to the OS (e.g. to
                  // defragment or empty_caches)
    SEGMENT_MAP(5), // a call to cuMemMap (used with expandable_segments)
    SEGMENT_UNMAP(6), // unmap part of a segment (used with expandable segments)
    SNAPSHOT(7), // a call to snapshot, used to correlate memory snapshots to trace
              // events
    OOM(8);// the allocator threw an OutOfMemoryError (addr_ is the amount of free
        // bytes reported by cuda)

      public final int value;
      private Action(int v) { this.value = v; }
      private Action(Action e) { this.value = e.value; }
      public Action intern() { for (Action e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  public TraceEntry(
        Action action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time,
        @SharedPtr GatheredContext context/*=nullptr*/) { super((Pointer)null); allocate(action, device, addr, size, stream, time, context); }
  private native void allocate(
        Action action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time,
        @SharedPtr GatheredContext context/*=nullptr*/);
  public TraceEntry(
        Action action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time) { super((Pointer)null); allocate(action, device, addr, size, stream, time); }
  private native void allocate(
        Action action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time);
  public TraceEntry(
        @Cast("c10::cuda::CUDACachingAllocator::TraceEntry::Action") int action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time,
        @SharedPtr GatheredContext context/*=nullptr*/) { super((Pointer)null); allocate(action, device, addr, size, stream, time, context); }
  private native void allocate(
        @Cast("c10::cuda::CUDACachingAllocator::TraceEntry::Action") int action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time,
        @SharedPtr GatheredContext context/*=nullptr*/);
  public TraceEntry(
        @Cast("c10::cuda::CUDACachingAllocator::TraceEntry::Action") int action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time) { super((Pointer)null); allocate(action, device, addr, size, stream, time); }
  private native void allocate(
        @Cast("c10::cuda::CUDACachingAllocator::TraceEntry::Action") int action,
        byte device,
        @Cast("size_t") long addr,
        @Cast("size_t") long size,
        CUstream_st stream,
        @Cast("c10::approx_time_t") long time);
  public native Action action_(); public native TraceEntry action_(Action setter);
  public native byte device_(); public native TraceEntry device_(byte setter);
  public native @Cast("size_t") long addr_(); public native TraceEntry addr_(long setter); // for OOM, this is the amount of free bytes reported by cuda
  public native @SharedPtr GatheredContext context_(); public native TraceEntry context_(GatheredContext setter);
  public native CUstream_st stream_(); public native TraceEntry stream_(CUstream_st setter);
  public native @Cast("size_t") long size_(); public native TraceEntry size_(long setter);
  public native @ByRef trace_time_ time_(); public native TraceEntry time_(trace_time_ setter);
}
