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


// ProcessGroupGloo implements Gloo bindings for c10d.
//
// All functions on this class are expected to be called in the same
// order across processes in the group. This is the only way that we
// can guarantee to match up the same calls across processes. For
// multi-threaded usage of process groups, you can use consider using
// multiple process group instances.
//
// The Gloo algorithms that this class calls into are cached by their
// signature (see description of AlgorithmKey above). This cache works
// as follows: every function call instantiates an AlgorithmKey and
// looks in the cache for existing entries. If there is one, it is
// removed from the cache and returned to the caller. If there are
// none, a new entry is created and returned. If an entry was created
// before, but is still in use, the call will block and wait until the
// entry is returned to the cache.
//
// In the future, we hope to extend this to allow multiple entries per
// key, to enable parallelism for a single key. The number of entries
// per key must always be identical for all processes. This maximum
// number can be automatically tuned, but only if we let a single
// process take charge, and have it broadcast the limits.
//
@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ProcessGroupGloo extends DistributedBackend {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProcessGroupGloo(Pointer p) { super(p); }

  // AsyncWork is the Gloo specific superclass for asynchronous work items.
  // We can split asynchronous work into 3 phases:
  // 1) Sanity checks and prepare input (e.g. memcpy)
  // 2) Run operation on background thread
  // 3) Synchronize with completion on foreground thread
  //
  // There is state to be shared between these 3 phases and all of this state
  // is captured in the AsyncWork class and its derivatives.
  //
  // Note: while we are porting operations to use new style collectives, there
  // is a split between operations using the existing caching approach and
  // operations using the new AsyncWork base class. Over time we will port
  // all operations and perform needed cleanup.
  //
  // FIXME: This probably should be called WorkGloo since the work is executed
  // in sync mode by a background thread.
  @NoOffset public static class AsyncWork extends Work {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public AsyncWork(Pointer p) { super(p); }
  

    public static native void execute(@IntrusivePtr("c10d::ProcessGroupGloo::AsyncWork") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroupGloo::AsyncWork>&"}) AsyncWork work);

    public native void run();

    public native @ByVal TensorVector result();

    public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future getFuture();
    public native @Cast("uint64_t") long getSequencenumber();
  }

  // Wrap c10d store as Gloo store
  @NoOffset public static class GlooStore extends Store {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public GlooStore(Pointer p) { super(p); }
  
    public GlooStore(@IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store) { super((Pointer)null); allocate(store); }
    private native void allocate(@IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store);

    public native void setUint(@StdString BytePointer key, @Cast("const std::vector<uint8_t>*") @ByRef ByteVector value);
    public native void setUint(@StdString String key, @Cast("const std::vector<uint8_t>*") @ByRef ByteVector value);

    public native void set(@StdString BytePointer key, @Cast("const std::vector<char>*") @ByRef ByteVector value);
    public native void set(@StdString String key, @Cast("const std::vector<char>*") @ByRef ByteVector value);

    public native @ByVal @Cast("std::vector<uint8_t>*") ByteVector getUint(@StdString BytePointer key);
    public native @ByVal @Cast("std::vector<uint8_t>*") ByteVector getUint(@StdString String key);

    public native @ByVal @Cast("std::vector<char>*") ByteVector get(@StdString BytePointer key);
    public native @ByVal @Cast("std::vector<char>*") ByteVector get(@StdString String key);

    public native @Name("wait") void _wait(@Const @ByRef StringVector keys);

    public native @Name("wait") void _wait(
            @Const @ByRef StringVector keys,
            @Const @ByRef Milliseconds timeout);

// #ifdef GLOO_STORE_HAS_STORE_V2
    public native @Cast("bool") boolean has_v2_support();

    public native @Cast("std::vector<char>*") @StdVector ByteVector multi_get(
            @Const @ByRef StringVector keys);

    public native void multi_set(
            @Const @ByRef StringVector keys,
            @Cast("std::vector<char>*") @StdVector ByteVector values);

    public native void append(@StdString BytePointer key, @Cast("const std::vector<char>*") @ByRef ByteVector value);
    public native void append(@StdString String key, @Cast("const std::vector<char>*") @ByRef ByteVector value);

    public native @Cast("int64_t") long add(@StdString BytePointer key, @Cast("int64_t") long value);
    public native @Cast("int64_t") long add(@StdString String key, @Cast("int64_t") long value);
  }

  // For send and recv operations there is no need to pass them to the
  // thread pool as they are entirely completed by the device thread.
  // This work object is used to synchronize completion of the send or
  // recv operation. It keeps a reference to the tensor it is
  // operating on to prevent it from being deallocated while the
  // operation is still in flight.
  @NoOffset public static class SendWork extends Work {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public SendWork(Pointer p) { super(p); }
  
    public SendWork(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            @Cast("uint64_t") long seq) { super((Pointer)null); allocate(tensor, buffer, seq); }
    private native void allocate(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            @Cast("uint64_t") long seq);

    public native @Cast("bool") @Name("wait") boolean _wait(@ByVal(nullValue = "std::chrono::milliseconds(kNoTimeout)") Milliseconds timeout);
    public native @Cast("bool") @Name("wait") boolean _wait();

    public native void abort();

    public native @Cast("uint64_t") long getSequencenumber();
  }

  @NoOffset public static class RecvWork extends Work {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public RecvWork(Pointer p) { super(p); }
  
    public RecvWork(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            OpType opType,
            @Cast("uint64_t") long seq,
            @Cast("const char*") BytePointer profilingTitle/*=nullptr*/) { super((Pointer)null); allocate(tensor, buffer, opType, seq, profilingTitle); }
    private native void allocate(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            OpType opType,
            @Cast("uint64_t") long seq,
            @Cast("const char*") BytePointer profilingTitle/*=nullptr*/);
    public RecvWork(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            OpType opType,
            @Cast("uint64_t") long seq) { super((Pointer)null); allocate(tensor, buffer, opType, seq); }
    private native void allocate(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            OpType opType,
            @Cast("uint64_t") long seq);
    public RecvWork(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            @Cast("c10d::OpType") byte opType,
            @Cast("uint64_t") long seq,
            String profilingTitle/*=nullptr*/) { super((Pointer)null); allocate(tensor, buffer, opType, seq, profilingTitle); }
    private native void allocate(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            @Cast("c10d::OpType") byte opType,
            @Cast("uint64_t") long seq,
            String profilingTitle/*=nullptr*/);
    public RecvWork(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            @Cast("c10d::OpType") byte opType,
            @Cast("uint64_t") long seq) { super((Pointer)null); allocate(tensor, buffer, opType, seq); }
    private native void allocate(
            @ByRef Tensor tensor,
            @UniquePtr org.bytedeco.pytorch.gloo.UnboundBuffer buffer,
            @Cast("c10d::OpType") byte opType,
            @Cast("uint64_t") long seq);

    public native int sourceRank();

    public native @Cast("bool") @Name("wait") boolean _wait(@ByVal(nullValue = "std::chrono::milliseconds(kNoTimeout)") Milliseconds timeout);
    public native @Cast("bool") @Name("wait") boolean _wait();

    public native void abort();

    public native @Cast("uint64_t") long getSequencenumber();
  }

  @NoOffset public static class Options extends DistributedBackend.Options {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Options(Pointer p) { super(p); }
  
    public Options(
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout) { super((Pointer)null); allocate(timeout); }
    @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroupGloo::Options>") private native void allocate(
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout);
    public Options() { super((Pointer)null); allocate(); }
    @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroupGloo::Options>") private native void allocate();

    // return intrusive_ptr of the object
    public static native @IntrusivePtr("c10d::ProcessGroupGloo::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroupGloo::Options>&"}) Options create(
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout);
    public static native @IntrusivePtr("c10d::ProcessGroupGloo::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroupGloo::Options>&"}) Options create();

    public native @ByRef GlooDeviceVector devices(); public native Options devices(GlooDeviceVector setter);
    public native int threads(); public native Options threads(int setter);
  }

  public native @StdString BytePointer getBackendName();

  // Helper functions to create a new device object.
  // They are static functions on this class to keep them logically
  // separate from the rest of the code base (e.g. torch/csrc/distributed).

  // Create new device instance for specific interface.
  public static native @SharedPtr @ByVal org.bytedeco.pytorch.gloo.Device createDeviceForInterface(
        @StdString BytePointer interface_name);
  public static native @SharedPtr @ByVal org.bytedeco.pytorch.gloo.Device createDeviceForInterface(
        @StdString String interface_name);

  // Create new device instance for specific hostname or address.
  public static native @SharedPtr @ByVal org.bytedeco.pytorch.gloo.Device createDeviceForHostname(
        @StdString BytePointer hostname);
  public static native @SharedPtr @ByVal org.bytedeco.pytorch.gloo.Device createDeviceForHostname(
        @StdString String hostname);

  // Create new device instance.
  // It tries to resolve this machine's hostname and bind to that address.
  // If that fails (i.e. the hostname doesn't resolve to an address), it
  // falls back to binding to the loopback address.
  public static native @SharedPtr @ByVal org.bytedeco.pytorch.gloo.Device createDefaultDevice();

  // Create ProcessGroupGloo instance.
  

  public ProcessGroupGloo(
        @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store,
        int rank,
        int size,
        @IntrusivePtr("c10d::ProcessGroupGloo::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroupGloo::Options>&"}) Options options/*=c10d::ProcessGroupGloo::Options::create()*/) { super((Pointer)null); allocate(store, rank, size, options); }
  @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroupGloo>") private native void allocate(
        @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store,
        int rank,
        int size,
        @IntrusivePtr("c10d::ProcessGroupGloo::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroupGloo::Options>&"}) Options options/*=c10d::ProcessGroupGloo::Options::create()*/);
  public ProcessGroupGloo(
        @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store,
        int rank,
        int size) { super((Pointer)null); allocate(store, rank, size); }
  @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroupGloo>") private native void allocate(
        @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store,
        int rank,
        int size);

  public native @IntrusivePtr("c10d::ProcessGroupGloo::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroupGloo::Options>&"}) Options getOptions();

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work broadcast(
        @ByRef TensorVector tensors,
        @Const @ByRef(nullValue = "c10d::BroadcastOptions()") BroadcastOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work broadcast(
        @ByRef TensorVector tensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce(
        @ByRef TensorVector tensors,
        @Const @ByRef(nullValue = "c10d::AllreduceOptions()") AllreduceOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce(
        @ByRef TensorVector tensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_sparse(
        @ByRef TensorVector tensors,
        @Const @ByRef(nullValue = "c10d::AllreduceOptions()") AllreduceOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_sparse(
        @ByRef TensorVector tensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_coalesced(
        @ByRef TensorVector tensors,
        @Const @ByRef(nullValue = "c10d::AllreduceCoalescedOptions()") AllreduceCoalescedOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_coalesced(
        @ByRef TensorVector tensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce(
        @ByRef TensorVector tensors,
        @Const @ByRef(nullValue = "c10d::ReduceOptions()") ReduceOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce(
        @ByRef TensorVector tensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _reduce_scatter_base(
        @ByRef Tensor outputTensor,
        @ByRef Tensor inputTensor,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _reduce_scatter_base(
        @ByRef Tensor outputTensor,
        @ByRef Tensor inputTensor);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _allgather_base(
        @ByRef Tensor output_tensor,
        @ByRef Tensor input_tensor,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _allgather_base(
        @ByRef Tensor output_tensor,
        @ByRef Tensor input_tensor);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather(
        @StdVector TensorVector outputs,
        @ByRef TensorVector inputs,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather(
        @StdVector TensorVector outputs,
        @ByRef TensorVector inputs);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_coalesced(
        @StdVector TensorVector output_lists,
        @ByRef TensorVector input_list,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_coalesced(
        @StdVector TensorVector output_lists,
        @ByRef TensorVector input_list);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_into_tensor_coalesced(
        @ByRef TensorVector outputs,
        @ByRef TensorVector inputs,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_into_tensor_coalesced(
        @ByRef TensorVector outputs,
        @ByRef TensorVector inputs);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work gather(
        @StdVector TensorVector outputs,
        @ByRef TensorVector inputs,
        @Const @ByRef(nullValue = "c10d::GatherOptions()") GatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work gather(
        @StdVector TensorVector outputs,
        @ByRef TensorVector inputs);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work scatter(
        @ByRef TensorVector outputs,
        @StdVector TensorVector inputs,
        @Const @ByRef(nullValue = "c10d::ScatterOptions()") ScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work scatter(
        @ByRef TensorVector outputs,
        @StdVector TensorVector inputs);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter(
        @ByRef TensorVector outputs,
        @StdVector TensorVector inputs,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter(
        @ByRef TensorVector outputs,
        @StdVector TensorVector inputs);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter_tensor_coalesced(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter_tensor_coalesced(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall_base(
        @ByRef Tensor outputTensor,
        @ByRef Tensor inputTensor,
        @Cast("std::vector<int64_t>*") @ByRef LongVector outputCounts,
        @Cast("std::vector<int64_t>*") @ByRef LongVector inputCounts,
        @Const @ByRef(nullValue = "c10d::AllToAllOptions()") AllToAllOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall_base(
        @ByRef Tensor outputTensor,
        @ByRef Tensor inputTensor,
        @Cast("std::vector<int64_t>*") @ByRef LongVector outputCounts,
        @Cast("std::vector<int64_t>*") @ByRef LongVector inputCounts);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work send(
        @ByRef TensorVector tensors,
        int dstRank,
        int tag);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work recv(
        @ByRef TensorVector tensors,
        int srcRank,
        int tag);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work recvAnysource(
        @ByRef TensorVector tensors,
        int tag);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work barrier(
        @Const @ByRef(nullValue = "c10d::BarrierOptions()") BarrierOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work barrier();

  public native void enableCollectivesTiming();

  public native @UniquePtr org.bytedeco.pytorch.gloo.Store _getStore();

  // Similar to barrier(), but blocks rank 0 until all other ranks have
  // acknowledged that they are alive (through send/recv from rank 0). Rank 0
  // is able to report all failed ranks if waitAllRanks = true, otherwise
  // reports the first rank it detected as failed.
  public native void monitoredBarrier(
        @Const @ByRef(nullValue = "c10d::BarrierOptions()") BarrierOptions opts,
        @Cast("bool") boolean waitAllRanks/*=false*/);
  public native void monitoredBarrier();

  // Agrees on an initial sequence number for the whole group by having rank 0
  // create it and broadcast it to other ranks using the store.
  public native void setSequenceNumberForGroup();

  // Retrieves the current sequence number for the whole group, which should be
  // in sync. If the returned number is not consistent across the group, it
  // may indicate that there is some sort of collective desynchronization.
  public native @Cast("uint64_t") long getSequenceNumberForGroup();

  public native int getNumThreads();
}
