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


/** Circular buffer used to hold information about kernel launches
 *  this is later used to reconstruct how a device-side kernel assertion failure
 *  occurred CUDAKernelLaunchRegistry is used as a singleton */
@Namespace("c10::cuda") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class CUDAKernelLaunchRegistry extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAKernelLaunchRegistry(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDAKernelLaunchRegistry(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CUDAKernelLaunchRegistry position(long position) {
        return (CUDAKernelLaunchRegistry)super.position(position);
    }
    @Override public CUDAKernelLaunchRegistry getPointer(long i) {
        return new CUDAKernelLaunchRegistry((Pointer)this).offsetAddress(i);
    }

  public CUDAKernelLaunchRegistry() { super((Pointer)null); allocate(); }
  private native void allocate();
  /** Register a new kernel launch and obtain a generation number back to be
   *  passed to the kernel */
  public native @Cast("uint32_t") int insert(
        @Cast("const char*") BytePointer launch_filename,
        @Cast("const char*") BytePointer launch_function,
        @Cast("const uint32_t") int launch_linenum,
        @Cast("const char*") BytePointer kernel_name,
        int stream_id);
  public native @Cast("uint32_t") int insert(
        String launch_filename,
        String launch_function,
        @Cast("const uint32_t") int launch_linenum,
        String kernel_name,
        int stream_id);
  /** Get copies of the kernel launch registry and each device's assertion
   *  failure buffer so they can be inspected without raising race conditions */
  public native @ByVal DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair snapshot();
  /** Get a pointer to the current device's assertion failure buffer. If no such
   *  buffer exists then one is created. This means that the first kernel launch
   *  made on each device will be slightly slower because memory allocations are
   *  required */
  public native DeviceAssertionsData get_uvm_assertions_ptr_for_current_device();
  /** Gets the global singleton of the registry */
  public static native @ByRef CUDAKernelLaunchRegistry get_singleton_ref();
  /** If not all devices support DSA, we disable it */
  @MemberGetter public native @Cast("const bool") boolean do_all_devices_support_managed_memory();
  /** Whether or not to gather stack traces when launching kernels */
  public native @Cast("bool") boolean gather_launch_stacktrace(); public native CUDAKernelLaunchRegistry gather_launch_stacktrace(boolean setter);
  /** Whether or not host-side DSA is enabled or disabled at run-time
   *  Note: Device-side code cannot be enabled/disabled at run-time */
  public native @Cast("bool") boolean enabled_at_runtime(); public native CUDAKernelLaunchRegistry enabled_at_runtime(boolean setter);
  /** Whether or not a device has indicated a failure */
  public native @Cast("bool") boolean has_failed();
// #ifdef TORCH_USE_CUDA_DSA
// #else
  @MemberGetter public native @Cast("const bool") boolean enabled_at_compile_time();
// #endif
}
