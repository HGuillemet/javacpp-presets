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


@Name("c10d::Backend") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DistributedBackend extends CustomClassHolder {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DistributedBackend(Pointer p) { super(p); }

  // Backend Options is a base struct that defines the basic options
  // when constructing a Backend. Each Backend subclass should
  // extend this struct and define its options if it wants to provide more
  // config options (beyond basic ones defined here) to end user.
  @NoOffset public static class Options extends CustomClassHolder {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Options(Pointer p) { super(p); }
  
    public Options(
            @StdString BytePointer backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout) { super((Pointer)null); allocate(backend, timeout); }
    private native void allocate(
            @StdString BytePointer backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout);
    public Options(
            @StdString BytePointer backend) { super((Pointer)null); allocate(backend); }
    private native void allocate(
            @StdString BytePointer backend);
    public Options(
            @StdString String backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout) { super((Pointer)null); allocate(backend, timeout); }
    private native void allocate(
            @StdString String backend,
            @ByVal(nullValue = "std::chrono::milliseconds(kBackendDefaultTimeout)") Milliseconds timeout);
    public Options(
            @StdString String backend) { super((Pointer)null); allocate(backend); }
    private native void allocate(
            @StdString String backend);

    public native @ByRef Milliseconds timeout(); public native Options timeout(Milliseconds setter);

    // backend name
    // NOLINTNEXTLINE(cppcoreguidelines-avoid-const-or-ref-data-members)
    @MemberGetter public native @StdString BytePointer backend();
  }

  public native int getRank();

  public native int getSize();

  // Returns an unique opaque ID of this backend that can be used to correlate
  // with its collectives.
  public native @Cast("int64_t") long getID();

  public native @Cast("bool") boolean supportsSplitting();

  public native void startCoalescing();

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work endCoalescing();

  // Subclasses must override this method to return the backend name
  public native @StdString BytePointer getBackendName();

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work broadcast(
        @ByRef TensorVector arg0,
        @Const @ByRef(nullValue = "c10d::BroadcastOptions()") BroadcastOptions arg1);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work broadcast(
        @ByRef TensorVector arg0);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce(
        @ByRef TensorVector arg0,
        @Const @ByRef(nullValue = "c10d::AllreduceOptions()") AllreduceOptions arg1);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce(
        @ByRef TensorVector arg0);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_sparse(
        @ByRef TensorVector arg0,
        @Const @ByRef(nullValue = "c10d::AllreduceOptions()") AllreduceOptions arg1);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_sparse(
        @ByRef TensorVector arg0);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_coalesced(
        @ByRef TensorVector arg0,
        @Const @ByRef(nullValue = "c10d::AllreduceCoalescedOptions()") AllreduceCoalescedOptions arg1);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allreduce_coalesced(
        @ByRef TensorVector arg0);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce(
        @ByRef TensorVector arg0,
        @Const @ByRef(nullValue = "c10d::ReduceOptions()") ReduceOptions arg1);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce(
        @ByRef TensorVector arg0);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather(
        @StdVector TensorVector arg0,
        @ByRef TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather(
        @StdVector TensorVector arg0,
        @ByRef TensorVector arg1);

  // Gathers a single tensor inputBuffer into a single buffer outputBuffer that
  // is interpreted as a contiguous collection of size inputBuffer * WORLD_SIZE.
  // For implementers of ProcessGroup API and advanced users only.
  // Note: this function will be deprecated in near future.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _allgather_base(
        @ByRef Tensor arg0,
        @ByRef Tensor arg1,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _allgather_base(
        @ByRef Tensor arg0,
        @ByRef Tensor arg1);

  // This function is deprecated and will be moved out of Backend to comms:
  // * do not add dependencies on this function,
  // * do not implement it in your Backend, implement _allgather_base
  //   instead.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_coalesced(
        @StdVector TensorVector arg0,
        @ByRef TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_coalesced(
        @StdVector TensorVector arg0,
        @ByRef TensorVector arg1);

  // This function is a coalesced version of `allgather_into_tensor` (currently
  // still named as `_allgather_base`). Each tensor in the vector corresponds to
  // an input/output of one `allgather_into_tensor` operation.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_into_tensor_coalesced(
        @ByRef TensorVector arg0,
        @ByRef TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::AllgatherOptions()") AllgatherOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work allgather_into_tensor_coalesced(
        @ByRef TensorVector arg0,
        @ByRef TensorVector arg1);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work gather(
        @StdVector TensorVector arg0,
        @ByRef TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::GatherOptions()") GatherOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work gather(
        @StdVector TensorVector arg0,
        @ByRef TensorVector arg1);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work scatter(
        @ByRef TensorVector arg0,
        @StdVector TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::ScatterOptions()") ScatterOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work scatter(
        @ByRef TensorVector arg0,
        @StdVector TensorVector arg1);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter(
        @ByRef TensorVector arg0,
        @StdVector TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter(
        @ByRef TensorVector arg0,
        @StdVector TensorVector arg1);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _reduce_scatter_base(
        @ByRef Tensor arg0,
        @ByRef Tensor arg1,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work _reduce_scatter_base(
        @ByRef Tensor arg0,
        @ByRef Tensor arg1);

  // This function is a coalesced version of `reduce_scatter_tensor` (currently
  // still named as `_reduce_scatter_base`). Each tensor in the vector
  // corresponds to an input/output of one `reduce_scatter_tensor` operation.
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter_tensor_coalesced(
        @ByRef TensorVector arg0,
        @ByRef TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::ReduceScatterOptions()") ReduceScatterOptions arg2);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work reduce_scatter_tensor_coalesced(
        @ByRef TensorVector arg0,
        @ByRef TensorVector arg1);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall_base(
        @ByRef Tensor arg0,
        @ByRef Tensor arg1,
        @Cast("std::vector<int64_t>*") @ByRef LongVector arg2,
        @Cast("std::vector<int64_t>*") @ByRef LongVector arg3,
        @Const @ByRef(nullValue = "c10d::AllToAllOptions()") AllToAllOptions arg4);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall_base(
        @ByRef Tensor arg0,
        @ByRef Tensor arg1,
        @Cast("std::vector<int64_t>*") @ByRef LongVector arg2,
        @Cast("std::vector<int64_t>*") @ByRef LongVector arg3);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall(
        @ByRef TensorVector arg0,
        @ByRef TensorVector arg1,
        @Const @ByRef(nullValue = "c10d::AllToAllOptions()") AllToAllOptions opts);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work alltoall(
        @ByRef TensorVector arg0,
        @ByRef TensorVector arg1);

  public native void monitoredBarrier(
        @Const @ByRef BarrierOptions arg0,
        @Cast("bool") boolean arg1/*=false*/);
  public native void monitoredBarrier(
        @Const @ByRef BarrierOptions arg0);

  // Agrees on an initial sequence number for the whole group by having rank 0
  // create it and broadcast it to other ranks using the store. Only implemented
  // for GLOO and NCCL backends currently.
  public native void setSequenceNumberForGroup();

  // Retrieves the current sequence number for the whole group, which should be
  // in sync. If the returned number is not consistent across the group, it
  // may indicate that there is some sort of collective desynchronization.
  public native @Cast("uint64_t") long getSequenceNumberForGroup();

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work send(
        @ByRef TensorVector arg0,
        int arg1,
        int arg2);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work recv(
        @ByRef TensorVector arg0,
        int arg1,
        int arg2);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work recvAnysource(
        @ByRef TensorVector arg0,
        int arg1);

  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work barrier(
        @Const @ByRef(nullValue = "c10d::BarrierOptions()") BarrierOptions arg0);
  public native @IntrusivePtr("c10d::Work") @Cast({"", "c10::intrusive_ptr<c10d::Work>&"}) Work barrier();

  public native void registerOnCompletionHook(
        @ByRef(true) WorkInfoConsumer hook);

  public native void waitForPendingWorks();

  public native void enableCollectivesTiming();

  public native @Cast("bool") boolean hasHooks();

  // Do not call this directly, use ProcessGroup::setGroupName instead.
  public native void setGroupName(@StdString BytePointer name);
  public native void setGroupName(@StdString String name);

  public native @StdString BytePointer getGroupName();

  public native void setGroupDesc(@StdString BytePointer desc);
  public native void setGroupDesc(@StdString String desc);

  public native @StdString BytePointer getGroupDesc();

  // See similar functions in ProcessGroup.hpp for context.
  public native @ByVal DeviceOptional getBoundDeviceId();

  // Perform an eager connect to the specified device if the backend supports
  // it.
  public native void eagerConnectSingleDevice(@ByVal Device device);

  public native void setBoundDeviceId(@ByVal DeviceOptional device);
}
