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


// ProcessGroup is a base class that captures collective and point to
// point communication in a fixed set of processes.
//
// The functions specified in the class below describe the API alone;
// implementations are provided in subclasses.
//
// Every function that performs I/O is executed asynchronously by a
// thread pool owned by the ProcessGroup (by default). They return an
// object that can be used to wait for completion or error.
//
// The ProcessGroup can instantiate subgroups with fewer or an equal
// number of members. Implementations must take care that multiple
// process groups can be used in parallel and synchronize accordingly.
//
// The ProcessGroup assumes a fixed set of processes. If the set
// changes, existing instances must be destructed and instantiation
// and initialization must start from scratch. For members of the
// process group to find each other (referred to as rendezvous from
// hereon)
//
@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ProcessGroup extends CustomClassHolder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProcessGroup(Pointer p) { super(p); }

  // ProcessGroup Options is a base struct that defines the basic options
  // when constructing a ProcessGroup. Each ProcessGroup subclass should
  // extend this struct and define its options if it wants to provide more
  // config options (beyond basic ones defined here) to end user.
  @NoOffset public static class Options extends CustomClassHolder {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Options(Pointer p) { super(p); }
  
    public Options(
            @StdString BytePointer backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kProcessGroupDefaultTimeout)") Milliseconds timeout) { super((Pointer)null); allocate(backend, timeout); }
    @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroup::Options>") private native void allocate(
            @StdString BytePointer backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kProcessGroupDefaultTimeout)") Milliseconds timeout);
    public Options(
            @StdString BytePointer backend) { super((Pointer)null); allocate(backend); }
    @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroup::Options>") private native void allocate(
            @StdString BytePointer backend);
    public Options(
            @StdString String backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kProcessGroupDefaultTimeout)") Milliseconds timeout) { super((Pointer)null); allocate(backend, timeout); }
    @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroup::Options>") private native void allocate(
            @StdString String backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kProcessGroupDefaultTimeout)") Milliseconds timeout);
    public Options(
            @StdString String backend) { super((Pointer)null); allocate(backend); }
    @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroup::Options>") private native void allocate(
            @StdString String backend);

    public native @ByRef Milliseconds timeout(); public native Options timeout(Milliseconds setter);

    // backend name
    @MemberGetter public native @StdString BytePointer backend();
  }

  public enum BackendType {
    UNDEFINED(0),
    GLOO(1),
    NCCL(2),
    UCC(3),
    MPI(4),
    CUSTOM(5);

      public final int value;
      private BackendType(int v) { this.value = v; }
      private BackendType(BackendType e) { this.value = e.value; }
      public BackendType intern() { for (BackendType e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  // Not used, set for backwards compatibility and only used for TypeDef in
  // Ops.cpp
  public ProcessGroup(int rank, int size) { super((Pointer)null); allocate(rank, size); }
  @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroup>") private native void allocate(int rank, int size);

  public ProcessGroup(
        @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store,
        int rank,
        int size,
        @IntrusivePtr("c10d::ProcessGroup::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroup::Options>&"}) Options options) { super((Pointer)null); allocate(store, rank, size, options); }
  @IntrusivePtr @Name("c10::make_intrusive<c10d::ProcessGroup>") private native void allocate(
        @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store,
        int rank,
        int size,
        @IntrusivePtr("c10d::ProcessGroup::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroup::Options>&"}) Options options);

  public native int getRank();

  public native int getSize();

  // Returns an unique opaque ID of this process group object.
  public native @Cast("int64_t") long getID();

  // Returns an unique opaque ID of a backend for the specific backend type
  // that can correlate with this process group's collectives.
  public native @Cast("int64_t") long getBackendID(BackendType backend_type);
  public native @Cast("int64_t") long getBackendID(@Cast("c10d::ProcessGroup::BackendType") int backend_type);

  public native @StdString BytePointer getBackendName();

  public native BackendType getBackendType();

  public native void startCoalescing(DeviceType deviceType);
  public native void startCoalescing(@Cast("c10::DeviceType") byte deviceType);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work endCoalescing(DeviceType deviceType);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work endCoalescing(@Cast("c10::DeviceType") byte deviceType);

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

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather(
        @StdVector TensorVector outputTensors,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather(
        @StdVector TensorVector outputTensors,
        @ByRef TensorVector inputTensors);

  // Gathers a single tensor inputBuffer into a single buffer outputBuffer that
  // is interpreted as a contiguous collection of size inputBuffer * WORLD_SIZE.
  // For implementers of ProcessGroup API and advanced users only.
  // Note: this function will be deprecated in near future.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _allgather_base(
        @ByRef Tensor outputBuffer,
        @ByRef Tensor inputBuffer,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _allgather_base(
        @ByRef Tensor outputBuffer,
        @ByRef Tensor inputBuffer);

  // This function is deprecated and will be moved out of ProcessGroup to comms:
  // * do not add dependencies on this function,
  // * do not implement it in your ProcessGroup, implement _allgather_base
  //   instead.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_coalesced(
        @StdVector TensorVector outputTensorLists,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_coalesced(
        @StdVector TensorVector outputTensorLists,
        @ByRef TensorVector inputTensors);

  // This function is a coalesced version of `allgather_into_tensor` (currently
  // still named as `_allgather_base`). Each tensor in the vector corresponds to
  // an input/output of one `allgather_into_tensor` operation.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_into_tensor_coalesced(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_into_tensor_coalesced(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work gather(
        @StdVector TensorVector outputTensors,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::GatherOptions()") GatherOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work gather(
        @StdVector TensorVector outputTensors,
        @ByRef TensorVector inputTensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work scatter(
        @ByRef TensorVector outputTensors,
        @StdVector TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::ScatterOptions()") ScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work scatter(
        @ByRef TensorVector outputTensors,
        @StdVector TensorVector inputTensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter(
        @ByRef TensorVector outputTensors,
        @StdVector TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter(
        @ByRef TensorVector outputTensors,
        @StdVector TensorVector inputTensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _reduce_scatter_base(
        @ByRef Tensor outputBuffer,
        @ByRef Tensor inputBuffer,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _reduce_scatter_base(
        @ByRef Tensor outputBuffer,
        @ByRef Tensor inputBuffer);

  // This function is a coalesced version of `reduce_scatter_tensor` (currently
  // still named as `_reduce_scatter_base`). Each tensor in the vector
  // corresponds to an input/output of one `reduce_scatter_tensor` operation.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter_tensor_coalesced(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter_tensor_coalesced(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall_base(
        @ByRef Tensor outputBuffer,
        @ByRef Tensor inputBuffer,
        @Cast("std::vector<int64_t>*") @ByRef LongVector outputSplitSizes,
        @Cast("std::vector<int64_t>*") @ByRef LongVector inputSplitSizes,
        @Const @ByRef(nullValue = "c10d::AllToAllOptions()") AllToAllOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall_base(
        @ByRef Tensor outputBuffer,
        @ByRef Tensor inputBuffer,
        @Cast("std::vector<int64_t>*") @ByRef LongVector outputSplitSizes,
        @Cast("std::vector<int64_t>*") @ByRef LongVector inputSplitSizes);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors,
        @Const @ByRef(nullValue = "c10d::AllToAllOptions()") AllToAllOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall(
        @ByRef TensorVector outputTensors,
        @ByRef TensorVector inputTensors);

  public native void monitoredBarrier(
        @Const @ByRef BarrierOptions opts,
        @Cast("bool") boolean wait_all_ranks/*=false*/);
  public native void monitoredBarrier(
        @Const @ByRef BarrierOptions opts);

  // Agrees on an initial sequence number for the whole group by having rank 0
  // create it and broadcast it to other ranks using the store. Only implemented
  // for GLOO and NCCL backends currently.
  public native void setSequenceNumberForGroup();

  // Retrieves the current sequence number for the whole group, which should be
  // in sync. If the returned number is not consistent across the group, it
  // may indicate that there is some sort of collective desynchronization.
  public native @Cast("uint64_t") long getSequenceNumberForGroup();

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

  public native @IntrusivePtr("c10d::ProcessGroup::Options") @Cast({"", "c10::intrusive_ptr<c10d::ProcessGroup::Options>&"}) Options getOptions();

  public native @Cast("bool") boolean hasBackends();

  public native void setBackend(
        DeviceType deviceType,
        BackendType backendType,
        @Const @ByRef DistributedBackendOptional backend);
  public native void setBackend(
        @Cast("c10::DeviceType") byte deviceType,
        @Cast("c10d::ProcessGroup::BackendType") int backendType,
        @Const @ByRef DistributedBackendOptional backend);

  public native @IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend getDefaultBackend();

  public native @IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend getBackend(DeviceType deviceType);
  public native @IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend getBackend(@Cast("c10::DeviceType") byte deviceType);

  public native @IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend getBackend(BackendType backendType);
  public native @IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend getBackend(@Cast("c10d::ProcessGroup::BackendType") int backendType);

  // Return device types supported by this ProcessGroup.
  // Note: the return type is `Device` rather than `DeviceType` for the purpose
  // of easy comparison at Python level. The `Device` will have default index
  // (-1).
  public native @StdVector Device getDeviceTypes();

  public native void registerOnCompletionHook(
        @ByRef(true) WorkInfoConsumer hook);

  public native void waitForPendingWorks();

  public native @Cast("bool") boolean hasHooks();

  public native @StdString BytePointer getGroupName();
  public native void setGroupName(@StdString BytePointer name);
  public native void setGroupName(@StdString String name);
  public native void enableCollectivesTiming();

  public native void release_resources();

  // ProcessGroups optionally can be "bound" to a specific device.
  // Currently this is only for nccl and allows for some opt-in
  // optimizations such as automatic use of ncclCommSplit.  The device
  // is specified in `init_process_group` and eventually makes it
  // here and then down into the actual backend instances.
  public native @ByVal DeviceOptional getBoundDeviceId();

  public native void setBoundDeviceId(@ByVal DeviceOptional device);
}
