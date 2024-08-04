// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.global;

import org.bytedeco.pytorch.cuda.*;

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

public class torch_cuda extends org.bytedeco.pytorch.presets.torch_cuda {
    static { Loader.load(); }
@Namespace("at") public static native @ByVal @Name("make_generator<at::CUDAGeneratorImpl>") Generator make_generator_cuda();
@Namespace("at") public static native @ByVal @Name("make_generator<at::CUDAGeneratorImpl,int8_t>") Generator make_generator_cuda(@Cast("int8_t&&") byte device_index);


// Targeting ../cuda/TraceEntryVector.java


// Targeting ../cuda/DeviceAssertionsDataVector.java


// Targeting ../cuda/CUDAKernelLaunchInfoVector.java


// Targeting ../cuda/DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair.java


// Targeting ../cuda/PointerSet.java


// Parsed from c10/util/ArrayRef.h

//===--- ArrayRef.h - Array Reference Wrapper -------------------*- C++ -*-===//
//
//                     The LLVM Compiler Infrastructure
//
// This file is distributed under the University of Illinois Open Source
// License. See LICENSE.TXT for details.
//
//===----------------------------------------------------------------------===//

// ATen: modified from llvm::ArrayRef.
// removed llvm-specific functionality
// removed some implicit const -> non-const conversions that rely on
// complicated std::enable_if meta-programming
// removed a bunch of slice variants for simplicity...

// #pragma once

// #include <c10/macros/Macros.h>
// #include <c10/util/Deprecated.h>
// #include <c10/util/Exception.h>
// #include <c10/util/SmallVector.h>

// #include <array>
// #include <cstddef>
// #include <cstdint>
// #include <initializer_list>
// #include <iterator>
// #include <ostream>
// #include <type_traits>
// #include <vector>
// Targeting ../cuda/CUDAStreamArrayRef.java



/** \name ArrayRef Convenience constructors
 *  \{
 <p>
 *  Construct an ArrayRef from a single element. */

/** Construct an ArrayRef from a pointer and length. */

/** Construct an ArrayRef from a range. */

/** Construct an ArrayRef from a SmallVector. */

/** Construct an ArrayRef from a SmallVector. */

/** Construct an ArrayRef from a std::vector. */

/** Construct an ArrayRef from a std::array. */

/** Construct an ArrayRef from an ArrayRef (no-op) (const) */

/** Construct an ArrayRef from an ArrayRef (no-op) */

/** Construct an ArrayRef from a C array. */

// WARNING: Template instantiation will NOT be willing to do an implicit
// conversions to get you to an c10::ArrayRef, which is why we need so
// many overloads.

// This alias is deprecated because it doesn't make ownership
// semantics obvious.  Use IntArrayRef instead!
 // namespace c10


// Parsed from ATen/cudnn/cudnn-wrapper.h

// #pragma once

// #include <cudnn.h>

// #define STRINGIFY(x) #x
// #define STRING(x) STRINGIFY(x)

// #if CUDNN_MAJOR < 6
// #pragma message ("CuDNN v" STRING(CUDNN_MAJOR) " found, but need at least CuDNN v6. You can get the latest version of CuDNN from https://developer.nvidia.com/cudnn or disable CuDNN with USE_CUDNN=0")
// #pragma message "We strongly encourage you to move to 6.0 and above."
// #pragma message "This message is intended to annoy you enough to update."
// #endif

// #undef STRINGIFY
// #undef STRING


// Parsed from c10/core/impl/GPUTrace.h

// #pragma once

// #include <c10/core/impl/PyInterpreter.h>

 // namespace c10::impl


// Parsed from c10/cuda/CUDAMacros.h

// #pragma once

// #ifndef C10_USING_CUSTOM_GENERATED_MACROS

// We have not yet modified the AMD HIP build to generate this file so
// we add an extra option to specifically ignore it.
// #ifndef C10_CUDA_NO_CMAKE_CONFIGURE_FILE
// #include <c10/cuda/impl/cuda_cmake_macros.h>
// #endif // C10_CUDA_NO_CMAKE_CONFIGURE_FILE

// #endif

// See c10/macros/Export.h for a detailed explanation of what the function
// of these macros are.  We need one set of macros for every separate library
// we build.

// #ifdef _WIN32
// #else // _WIN32
// #if defined(__GNUC__)
// #define C10_CUDA_EXPORT __attribute__((__visibility__("default")))
// #else // defined(__GNUC__)
// #define C10_CUDA_EXPORT
// #endif // defined(__GNUC__)
// #define C10_CUDA_IMPORT C10_CUDA_EXPORT
// #endif // _WIN32

// This one is being used by libc10_cuda.so
// #ifdef C10_CUDA_BUILD_MAIN_LIB
// #define C10_CUDA_API C10_CUDA_EXPORT
// #else
// #define C10_CUDA_API C10_CUDA_IMPORT
// #endif

/**
 * The maximum number of GPUs that we recognizes. Increasing this beyond the
 * initial limit of 16 broke Caffe2 testing, hence the ifdef guards.
 * This value cannot be more than 128 because our DeviceIndex is a uint8_t.
o */
// #ifdef FBCODE_CAFFE2
// fbcode depends on this value being 16
public static final int C10_COMPILE_TIME_MAX_GPUS = 16;
// #else
// #endif


// Parsed from c10/cuda/CUDADeviceAssertionHost.h

// #pragma once

// #include <c10/cuda/CUDAMacros.h>

// #include <cstdint>
// #include <memory>
// #include <mutex>
// #include <string>
// #include <utility>
// #include <vector>

// #ifdef USE_CUDA
// #define TORCH_USE_CUDA_DSA
// #endif

/** Number of assertion failure messages we can store. If this is too small
 *  threads will fail silently. */
@MemberGetter public static native int C10_CUDA_DSA_ASSERTION_COUNT();
@MemberGetter public static native int C10_CUDA_DSA_MAX_STR_LEN();
// Targeting ../cuda/DeviceAssertionData.java


// Targeting ../cuda/DeviceAssertionsData.java


// Targeting ../cuda/CUDAKernelLaunchInfo.java


// Targeting ../cuda/CUDAKernelLaunchRegistry.java





 // namespace c10::cuda

// Each kernel launched with TORCH_DSA_KERNEL_LAUNCH
// requires the same input arguments. We introduce the following macro to
// standardize these.
// #define TORCH_DSA_KERNEL_ARGS
//   [[maybe_unused]] c10::cuda::DeviceAssertionsData *const assertions_data,
//       [[maybe_unused]] uint32_t assertion_caller_id

// This macro can be used to pass the DSA arguments onward to another
// function
// #define TORCH_DSA_KERNEL_ARGS_PASS assertions_data, assertion_caller_id


// Parsed from c10/cuda/CUDAMiscFunctions.h

// #pragma once
// this file is to avoid circular dependency between CUDAFunctions.h and
// CUDAExceptions.h

// #include <c10/cuda/CUDAMacros.h>

// #include <mutex>
@Namespace("c10::cuda") public static native @NoException(true) @Cast("const char*") BytePointer get_cuda_check_suffix();
 // namespace c10::cuda


// Parsed from c10/cuda/CUDAException.h

// #pragma once

// #include <c10/cuda/CUDADeviceAssertionHost.h>
// #include <c10/cuda/CUDAMacros.h>
// #include <c10/cuda/CUDAMiscFunctions.h>
// #include <c10/macros/Macros.h>
// #include <c10/util/Exception.h>
// #include <c10/util/irange.h>
// #include <cuda.h>

// Note [CHECK macro]
// ~~~~~~~~~~~~~~~~~~
// This is a macro so that AT_ERROR can get accurate __LINE__
// and __FILE__ information.  We could split this into a short
// macro and a function implementation if we pass along __LINE__
// and __FILE__, but no one has found this worth doing.

// Used to denote errors from CUDA framework.
// This needs to be declared here instead util/Exception.h for proper conversion
// during hipify.
 // namespace c10

// #define C10_CUDA_CHECK(EXPR)
//   do {
//     const cudaError_t __err = EXPR;
//     c10::cuda::c10_cuda_check_implementation(
//         static_cast<int32_t>(__err),
//         __FILE__,
//         __func__, /* Line number data type not well-defined between \
//                      compilers, so we perform an explicit cast */
//         static_cast<uint32_t>(__LINE__),
//         true);
//   } while (0)

// #define C10_CUDA_CHECK_WARN(EXPR)
//   do {
//     const cudaError_t __err = EXPR;
//     if (C10_UNLIKELY(__err != cudaSuccess)) {
//       auto error_unused C10_UNUSED = cudaGetLastError();
//       (void)error_unused;
//       TORCH_WARN("CUDA warning: ", cudaGetErrorString(__err));
//     }
//   } while (0)

// Indicates that a CUDA error is handled in a non-standard way
// #define C10_CUDA_ERROR_HANDLED(EXPR) EXPR

// Intentionally ignore a CUDA error
// #define C10_CUDA_IGNORE_ERROR(EXPR)
//   do {
//     const cudaError_t __err = EXPR;
//     if (C10_UNLIKELY(__err != cudaSuccess)) {
//       cudaError_t error_unused C10_UNUSED = cudaGetLastError();
//       (void)error_unused;
//     }
//   } while (0)

// Clear the last CUDA error
// #define C10_CUDA_CLEAR_ERROR()
//   do {
//     cudaError_t error_unused C10_UNUSED = cudaGetLastError();
//     (void)error_unused;
//   } while (0)

// This should be used directly after every kernel launch to ensure
// the launch happened correctly and provide an early, close-to-source
// diagnostic if it didn't.
// #define C10_CUDA_KERNEL_LAUNCH_CHECK() C10_CUDA_CHECK(cudaGetLastError())

/** Launches a CUDA kernel appending to it all the information need to handle
 *  device-side assertion failures. Checks that the launch was successful. */
// #define TORCH_DSA_KERNEL_LAUNCH(
//     kernel, blocks, threads, shared_mem, stream, ...)
//   do {
//     auto& launch_registry =
//         c10::cuda::CUDAKernelLaunchRegistry::get_singleton_ref();
//     kernel<<<blocks, threads, shared_mem, stream>>>(
//         __VA_ARGS__,
//         launch_registry.get_uvm_assertions_ptr_for_current_device(),
//         launch_registry.insert(
//             __FILE__, __FUNCTION__, __LINE__, #kernel, stream.id()));
//     C10_CUDA_KERNEL_LAUNCH_CHECK();
//   } while (0)

/** In the event of a CUDA failure, formats a nice error message about that
 *  failure and also checks for device-side assertion failures */
@Namespace("c10::cuda") public static native void c10_cuda_check_implementation(
    int err,
    @Cast("const char*") BytePointer filename,
    @Cast("const char*") BytePointer function_name,
    int line_number,
    @Cast("const bool") boolean include_device_assertions);
@Namespace("c10::cuda") public static native void c10_cuda_check_implementation(
    int err,
    String filename,
    String function_name,
    int line_number,
    @Cast("const bool") boolean include_device_assertions);

 // namespace c10::cuda


// Parsed from c10/cuda/CUDAFunctions.h

// #pragma once

// This header provides C++ wrappers around commonly used CUDA API functions.
// The benefit of using C++ here is that we can raise an exception in the
// event of an error, rather than explicitly pass around error codes.  This
// leads to more natural APIs.
//
// The naming convention used here matches the naming convention of torch.cuda

// #include <c10/core/Device.h>
// #include <c10/core/impl/GPUTrace.h>
// #include <c10/cuda/CUDAException.h>
// #include <c10/cuda/CUDAMacros.h>
// #include <cuda_runtime_api.h>

// NB: In the past, we were inconsistent about whether or not this reported
// an error if there were driver problems are not.  Based on experience
// interacting with users, it seems that people basically ~never want this
// function to fail; it should just return zero if things are not working.
// Oblige them.
// It still might log a warning for user first time it's invoked
@Namespace("c10::cuda") public static native @NoException(true) byte device_count();

// Version of device_count that throws is no devices are detected
@Namespace("c10::cuda") public static native byte device_count_ensure_non_zero();

@Namespace("c10::cuda") public static native byte current_device();

@Namespace("c10::cuda") public static native void set_device(byte device);

@Namespace("c10::cuda") public static native void device_synchronize();

@Namespace("c10::cuda") public static native void warn_or_error_on_sync();

// Raw CUDA device management functions
@Namespace("c10::cuda") public static native @Cast("cudaError_t") int GetDeviceCount(IntPointer dev_count);
@Namespace("c10::cuda") public static native @Cast("cudaError_t") int GetDeviceCount(IntBuffer dev_count);
@Namespace("c10::cuda") public static native @Cast("cudaError_t") int GetDeviceCount(int[] dev_count);

@Namespace("c10::cuda") public static native @Cast("cudaError_t") int GetDevice(BytePointer device);
@Namespace("c10::cuda") public static native @Cast("cudaError_t") int GetDevice(ByteBuffer device);
@Namespace("c10::cuda") public static native @Cast("cudaError_t") int GetDevice(byte[] device);

@Namespace("c10::cuda") public static native @Cast("cudaError_t") int SetDevice(byte device);

@Namespace("c10::cuda") public static native @Cast("cudaError_t") int MaybeSetDevice(byte device);

@Namespace("c10::cuda") public static native byte ExchangeDevice(byte device);

@Namespace("c10::cuda") public static native byte MaybeExchangeDevice(byte device);

@Namespace("c10::cuda") public static native void SetTargetDevice();

@Namespace("c10::cuda") public enum SyncDebugMode { L_DISABLED(0), L_WARN(1), L_ERROR(2);

    public final int value;
    private SyncDebugMode(int v) { this.value = v; }
    private SyncDebugMode(SyncDebugMode e) { this.value = e.value; }
    public SyncDebugMode intern() { for (SyncDebugMode e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}
// Targeting ../cuda/WarningState.java



@Namespace("c10::cuda") public static native @ByRef WarningState warning_state();
// the subsequent functions are defined in the header because for performance
// reasons we want them to be inline
@Namespace("c10::cuda") public static native void memcpy_and_sync(
    Pointer dst,
    @Const Pointer src,
    @Cast("int64_t") long nbytes,
    @Cast("cudaMemcpyKind") int kind,
    CUstream_st stream);

@Namespace("c10::cuda") public static native void stream_synchronize(CUstream_st stream);

@Namespace("c10::cuda") public static native @Cast("bool") boolean hasPrimaryContext(byte device_index);
@Namespace("c10::cuda") public static native @ByVal ByteOptional getDeviceIndexWithPrimaryContext();

 // namespace c10::cuda


// Parsed from ATen/cuda/CUDAContextLight.h

// #pragma once
// Light-weight version of CUDAContext.h with fewer transitive includes

// #include <cstdint>

// #include <cuda_runtime_api.h>
// #include <cusparse.h>
// #include <cublas_v2.h>

// cublasLT was introduced in CUDA 10.1 but we enable only for 11.1 that also
// added bf16 support
// #include <cublasLt.h>

// #ifdef CUDART_VERSION
// #include <cusolverDn.h>
// #endif

// #if defined(USE_ROCM)
// #endif

// #include <c10/core/Allocator.h>
// #include <c10/cuda/CUDAFunctions.h>


/*
A common CUDA interface for ATen.

This interface is distinct from CUDAHooks, which defines an interface that links
to both CPU-only and CUDA builds. That interface is intended for runtime
dispatch and should be used from files that are included in both CPU-only and
CUDA builds.

CUDAContext, on the other hand, should be preferred by files only included in
CUDA builds. It is intended to expose CUDA functionality in a consistent
manner.

This means there is some overlap between the CUDAContext and CUDAHooks, but
the choice of which to use is simple: use CUDAContext when in a CUDA-only file,
use CUDAHooks otherwise.

Note that CUDAContext simply defines an interface with no associated class.
It is expected that the modules whose functions compose this interface will
manage their own state. There is only a single CUDA context/state.
*/

/**
 * DEPRECATED: use device_count() instead
 */
@Namespace("at::cuda") public static native @Cast("int64_t") long getNumGPUs();

/**
 * CUDA is available if we compiled with CUDA, and there are one or more
 * devices.  If we compiled with CUDA but there is a driver problem, etc.,
 * this function will report CUDA is not available (rather than raise an error.)
 */
@Namespace("at::cuda") public static native @Cast("bool") boolean is_available();

@Namespace("at::cuda") public static native cudaDeviceProp getCurrentDeviceProperties();

@Namespace("at::cuda") public static native int warp_size();

@Namespace("at::cuda") public static native cudaDeviceProp getDeviceProperties(byte device);

@Namespace("at::cuda") public static native @Cast("bool") boolean canDeviceAccessPeer(
    byte device,
    byte peer_device);

@Namespace("at::cuda") public static native Allocator getCUDADeviceAllocator();

/* Handles */
@Namespace("at::cuda") public static native cusparseContext getCurrentCUDASparseHandle();
@Namespace("at::cuda") public static native cublasContext getCurrentCUDABlasHandle();


@Namespace("at::cuda") public static native void clearCublasWorkspaces();

// #if defined(CUDART_VERSION) || defined(USE_ROCM)
@Namespace("at::cuda") public static native cusolverDnContext getCurrentCUDASolverDnHandle();
// #endif

 // namespace at::cuda


// Parsed from c10/cuda/CUDAStream.h

// #pragma once

// #include <cuda_runtime_api.h>

// #include <c10/core/DeviceGuard.h>
// #include <c10/core/Stream.h>
// #include <c10/cuda/CUDAFunctions.h>
// #include <c10/util/Exception.h>

/*
 * Stream pool note.
 *
 * A CUDAStream is an abstraction of an actual cuStream on the GPU. CUDAStreams
 * are backed by cuStreams, but they use several pools to minimize the costs
 * associated with creating, retaining, and destroying cuStreams.
 *
 * There are three pools per device, and a device's pools are lazily created.
 *
 * The first pool contains only the default stream. When the default stream
 * is requested it's returned.
 *
 * The second pool is the "low priority" or "default priority" streams. In
 * HIP builds there is no distinction between streams in this pool and streams
 * in the third pool (below). There are 32 of these streams per device, and
 * when a stream is requested one of these streams is returned round-robin.
 * That is, the first stream requested is at index 0, the second at index 1...
 * to index 31, then index 0 again.
 *
 * This means that if 33 low priority streams are requested, the first and
 * last streams requested are actually the same stream (under the covers)
 * and kernels enqueued on them cannot run concurrently.
 *
 * The third pool is the "high priority" streams. The third pool acts like
 * the second pool except the streams are created with a higher priority.
 *
 * These pools suggest that stream users should prefer many short-lived streams,
 * as the cost of acquiring and releasing streams is effectively zero. If
 * many longer-lived streams are required in performance critical scenarios
 * then the functionality here may need to be extended to allow, for example,
 * "reserving" a subset of the pool so that other streams do not accidentally
 * overlap the performance critical streams.
 *
 * Note: although the notion of "current stream for device" is thread local
 * (every OS thread has a separate current stream, as one might expect),
 * the stream pool is global across all threads; stream 0 is always stream 0
 * no matter which thread you use it on.  Multiple threads can synchronize
 * on the same stream.  Although the CUDA documentation is not very clear
 * on the matter, streams are thread safe; e.g., it is safe to enqueue
 * a kernel on the same stream from two different threads.
 */

@Namespace("c10::cuda") @MemberGetter public static native int max_compile_time_stream_priorities();
public static final int max_compile_time_stream_priorities = max_compile_time_stream_priorities();
// Targeting ../cuda/CUDAStream.java



/**
 * Get a new stream from the CUDA stream pool.  You can think of this
 * as "creating" a new stream, but no such creation actually happens;
 * instead, streams are preallocated from the pool and returned in a
 * round-robin fashion.
 *
 * You can request a stream from the high priority pool by setting
 * isHighPriority to true, or a stream for a specific device by setting device
 * (defaulting to the current CUDA stream.)
 */
@Namespace("c10::cuda") public static native @ByVal CUDAStream getStreamFromPool(@Cast("const bool") boolean isHighPriority/*=false*/, byte device/*=-1*/);
@Namespace("c10::cuda") public static native @ByVal CUDAStream getStreamFromPool();
// no default priority to disambiguate overloads
@Namespace("c10::cuda") public static native @ByVal CUDAStream getStreamFromPool(int priority, byte device/*=-1*/);
@Namespace("c10::cuda") public static native @ByVal CUDAStream getStreamFromPool(int priority);

/**
 * Get a CUDAStream from a externally allocated one.
 *
 * This is mainly for interoperability with different libraries where we
 * want to operate on a non-torch allocated stream for data exchange or similar
 * purposes
 */
@Namespace("c10::cuda") public static native @ByVal CUDAStream getStreamFromExternal(CUstream_st ext_stream, byte device_index);

/**
 * Get the default CUDA stream, for the passed CUDA device, or for the
 * current device if no device index is passed.  The default stream is
 * where most computation occurs when you aren't explicitly using
 * streams.
 */
@Namespace("c10::cuda") public static native @ByVal CUDAStream getDefaultCUDAStream(byte device_index/*=-1*/);
@Namespace("c10::cuda") public static native @ByVal CUDAStream getDefaultCUDAStream();

/**
 * Get the current CUDA stream, for the passed CUDA device, or for the
 * current device if no device index is passed.  The current CUDA stream
 * will usually be the default CUDA stream for the device, but it may
 * be different if someone called 'setCurrentCUDAStream' or used 'StreamGuard'
 * or 'CUDAStreamGuard'.
 */
@Namespace("c10::cuda") public static native @ByVal CUDAStream getCurrentCUDAStream(byte device_index/*=-1*/);
@Namespace("c10::cuda") public static native @ByVal CUDAStream getCurrentCUDAStream();

/**
 * Set the current stream on the device of the passed in stream to be
 * the passed in stream.  Yes, you read that right: this function
 * has *nothing* to do with the current device: it toggles the current
 * stream of the device of the passed stream.
 *
 * Confused?  Avoid using this function; prefer using 'CUDAStreamGuard' instead
 * (which will switch both your current device and current stream in the way you
 * expect, and reset it back to its original state afterwards).
 */
@Namespace("c10::cuda") public static native void setCurrentCUDAStream(@ByVal CUDAStream stream);

@Namespace("c10::cuda") public static native @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer stream, @Const @ByRef CUDAStream s);

 // namespace c10::cuda
 // namespace std


// Parsed from ATen/cuda/Exceptions.h

// #pragma once

// #include <cublas_v2.h>
// #include <cusparse.h>
// #include <c10/macros/Export.h>

// #ifdef CUDART_VERSION
// #include <cusolver_common.h>
// #endif

// #include <ATen/Context.h>
// #include <c10/util/Exception.h>
// #include <c10/cuda/CUDAException.h>

  // namespace c10

// #define AT_CUDNN_FRONTEND_CHECK(EXPR, ...)
//   do {
//     auto error_object = EXPR;
//     if (!error_object.is_good()) {
//       TORCH_CHECK_WITH(CuDNNError, false,
//             "cuDNN Frontend error: ", error_object.get_message());
//     }
//   } while (0)                                                                                   

// #define AT_CUDNN_CHECK_WITH_SHAPES(EXPR, ...) AT_CUDNN_CHECK(EXPR, "\n", ##__VA_ARGS__)

// See Note [CHECK macro]
// #define AT_CUDNN_CHECK(EXPR, ...)
//   do {
//     cudnnStatus_t status = EXPR;
//     if (status != CUDNN_STATUS_SUCCESS) {
//       if (status == CUDNN_STATUS_NOT_SUPPORTED) {
//         TORCH_CHECK_WITH(CuDNNError, false,
//             "cuDNN error: ",
//             cudnnGetErrorString(status),
//             ". This error may appear if you passed in a non-contiguous input.", ##__VA_ARGS__);
//       } else {
//         TORCH_CHECK_WITH(CuDNNError, false,
//             "cuDNN error: ", cudnnGetErrorString(status), ##__VA_ARGS__);
//       }
//     }
//   } while (0)
@Namespace("at::cuda::blas") public static native @Cast("const char*") BytePointer _cublasGetErrorEnum(@Cast("cublasStatus_t") int error);
 // namespace at::cuda::blas

// #define TORCH_CUDABLAS_CHECK(EXPR)
//   do {
//     cublasStatus_t __err = EXPR;
//     TORCH_CHECK(__err == CUBLAS_STATUS_SUCCESS,
//                 "CUDA error: ",
//                 at::cuda::blas::_cublasGetErrorEnum(__err),
//                 " when calling `" #EXPR "`");
//   } while (0)

public static native @Cast("const char*") BytePointer cusparseGetErrorString(@Cast("cusparseStatus_t") int status);

// #define TORCH_CUDASPARSE_CHECK(EXPR)
//   do {
//     cusparseStatus_t __err = EXPR;
//     TORCH_CHECK(__err == CUSPARSE_STATUS_SUCCESS,
//                 "CUDA error: ",
//                 cusparseGetErrorString(__err),
//                 " when calling `" #EXPR "`");
//   } while (0)

// cusolver related headers are only supported on cuda now
// #ifdef CUDART_VERSION
@Namespace("at::cuda::solver") public static native @Cast("const char*") BytePointer cusolverGetErrorMessage(@Cast("cusolverStatus_t") int status);

@Namespace("at::cuda::solver") @MemberGetter public static native @Cast("const char*") BytePointer _cusolver_backend_suggestion();

 // namespace at::cuda::solver

// When cuda < 11.5, cusolver raises CUSOLVER_STATUS_EXECUTION_FAILED when input contains nan.
// When cuda >= 11.5, cusolver normally finishes execution and sets info array indicating convergence issue.
// #define TORCH_CUSOLVER_CHECK(EXPR)
//   do {
//     cusolverStatus_t __err = EXPR;
//     if ((CUDA_VERSION < 11500 &&
//          __err == CUSOLVER_STATUS_EXECUTION_FAILED) ||
//         (CUDA_VERSION >= 11500 &&
//          __err == CUSOLVER_STATUS_INVALID_VALUE)) {
//       TORCH_CHECK_LINALG(
//           false,
//           "cusolver error: ",
//           at::cuda::solver::cusolverGetErrorMessage(__err),
//           ", when calling `" #EXPR "`",
//           ". This error may appear if the input matrix contains NaN. ",
//           at::cuda::solver::_cusolver_backend_suggestion);
//     } else {
//       TORCH_CHECK(
//           __err == CUSOLVER_STATUS_SUCCESS,
//           "cusolver error: ",
//           at::cuda::solver::cusolverGetErrorMessage(__err),
//           ", when calling `" #EXPR "`. ",
//           at::cuda::solver::_cusolver_backend_suggestion);
//     }
//   } while (0)

// #else
// #define TORCH_CUSOLVER_CHECK(EXPR) EXPR
// #endif

// #define AT_CUDA_CHECK(EXPR) C10_CUDA_CHECK(EXPR)

// For CUDA Driver API
//
// This is here instead of in c10 because NVRTC is loaded dynamically via a stub
// in ATen, and we need to use its nvrtcGetErrorString.
// See NOTE [ USE OF NVRTC AND DRIVER API ].
// #if !defined(USE_ROCM)

// #define AT_CUDA_DRIVER_CHECK(EXPR)
//   do {
//     CUresult __err = EXPR;
//     if (__err != CUDA_SUCCESS) {
//       const char* err_str;
//       CUresult get_error_str_err C10_UNUSED = at::globalContext().getNVRTC().cGetErrorString(__err, &err_str);
//       if (get_error_str_err != CUDA_SUCCESS) {
//         AT_ERROR("CUDA driver error: unknown error");
//       } else {
//         AT_ERROR("CUDA driver error: ", err_str);
//       }
//     }
//   } while (0)

// #else

// #define AT_CUDA_DRIVER_CHECK(EXPR)
//   do {
//     CUresult __err = EXPR;
//     if (__err != CUDA_SUCCESS) {
//       AT_ERROR("CUDA driver error: ", static_cast<int>(__err));
//     }
//   } while (0)

// #endif

// For CUDA NVRTC
//
// Note: As of CUDA 10, nvrtc error code 7, NVRTC_ERROR_BUILTIN_OPERATION_FAILURE,
// incorrectly produces the error string "NVRTC unknown error."
// The following maps it correctly.
//
// This is here instead of in c10 because NVRTC is loaded dynamically via a stub
// in ATen, and we need to use its nvrtcGetErrorString.
// See NOTE [ USE OF NVRTC AND DRIVER API ].
// #define AT_CUDA_NVRTC_CHECK(EXPR)
//   do {
//     nvrtcResult __err = EXPR;
//     if (__err != NVRTC_SUCCESS) {
//       if (static_cast<int>(__err) != 7) {
//         AT_ERROR("CUDA NVRTC error: ", at::globalContext().getNVRTC().nvrtcGetErrorString(__err));
//       } else {
//         AT_ERROR("CUDA NVRTC error: NVRTC_ERROR_BUILTIN_OPERATION_FAILURE");
//       }
//     }
//   } while (0)


// Parsed from ATen/cuda/CUDAContext.h

// #pragma once

// #include <ATen/cuda/CUDAContextLight.h>

// Preserved for BC, as many files depend on these includes
// #include <ATen/Context.h>
// #include <c10/cuda/CUDAStream.h>
// #include <c10/util/Logging.h>
// #include <ATen/cuda/Exceptions.h>


// Parsed from ATen/cuda/ATenCUDAGeneral.h

// #pragma once

// #include <cuda.h>
// #include <cuda_runtime.h>
// #include <cuda_fp16.h>

// #include <c10/macros/Export.h>

// Use TORCH_CUDA_CPP_API or TORCH_CUDA_CU_API for exports from this folder


// Parsed from ATen/cudnn/Handle.h

// #pragma once

// #include <ATen/cudnn/cudnn-wrapper.h>
// #include <ATen/cuda/ATenCUDAGeneral.h>

@Namespace("at::native") public static native cudnnContext getCudnnHandle();
 // namespace at::native


// Parsed from ATen/cudnn/Utils.h

// #pragma once

// #include <ATen/core/Tensor.h>
// #include <ATen/cuda/Exceptions.h>
// #include <ATen/cudnn/cudnn-wrapper.h>
// #include <ATen/cudnn/Handle.h>

// cuDNN has a buggy check for tensor being contiguous (that is, it does
// not ignore stride for dimension that is equal to 0).  This function
// makes tensors which have zero stride contiguous, by setting the
// strides to 1 as cuDNN likes.
@Namespace("at::native") public static native @ByVal Tensor contiguousIfZeroInStrides(@Const @ByRef Tensor t);




// Parsed from c10/cuda/CUDAGraphsC10Utils.h

// #pragma once

// #include <c10/cuda/CUDAStream.h>
// #include <iostream>
// #include <utility>

// CUDA Graphs utils used by c10 and aten.
// aten/cuda/CUDAGraphsUtils.cuh adds utils used by aten only.

// first is set if the instance is created by CUDAGraph::capture_begin.
// second is set if the instance is created by at::cuda::graph_pool_handle.
// Targeting ../cuda/CUDAStreamCaptureModeGuard.java



// Protects against enum cudaStreamCaptureStatus implementation changes.
// Some compilers seem not to like static_assert without the messages.



@Namespace("c10::cuda") public static native @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer os, @Cast("c10::cuda::CaptureStatus") int status);

// Use this version where you're sure a CUDA context exists already.
@Namespace("c10::cuda") public static native @Cast("c10::cuda::CaptureStatus") int currentStreamCaptureStatusMayInitCtx();

 // namespace c10::cuda


// Parsed from c10/cuda/CUDACachingAllocator.h

// #pragma once

// #include <c10/core/Allocator.h>
// #include <c10/cuda/CUDAGraphsC10Utils.h>
// #include <c10/cuda/CUDAMacros.h>
// #include <c10/cuda/CUDAStream.h>
// #include <c10/util/ApproximateClock.h>
// #include <c10/util/Exception.h>
// #include <c10/util/Registry.h>

// #include <array>
// #include <atomic>
// #include <cstddef>
// #include <cstdint>
// #include <functional>
// #include <memory>
// #include <string>
// #include <unordered_set>
// #include <utility>

// Caching allocator will execute every registered callback if it unable to find
// block inside of already allocated area.


// #define REGISTER_FREE_MEMORY_CALLBACK(name, ...)
//   C10_REGISTER_CLASS(FreeCudaMemoryCallbacksRegistry, name, __VA_ARGS__);
 // namespace c10
  //
// TODO: Turn this into an honest to goodness class. I briefly attempted to do
// this, but it was a bit irritating to figure out how to also correctly
// apply pimpl pattern so I didn't have to leak any internal implementation
// details in the header (CUDACachingAllocator could be made a pimpl, but
// you also need to appropriately define a class which is a subclass
// of Allocator. Not impossible, but required a bit more surgery than
// I wanted to do at the time.)
//
// Why is this using a namespace rather than old-style THCCachingAllocator_
// prefix?  Mostly because it made the HIPify rules easier to write; _ is
// not counted as a word boundary, so you would otherwise have to list each
// of these functions.


// Targeting ../cuda/Stat.java



@Namespace("c10::cuda::CUDACachingAllocator") public enum StatType {
  AGGREGATE(0),
  SMALL_POOL(1),
  LARGE_POOL(2),
  NUM_TYPES(3);// remember to update this whenever a new stat type is added

    public final long value;
    private StatType(long v) { this.value = v; }
    private StatType(StatType e) { this.value = e.value; }
    public StatType intern() { for (StatType e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}
// Targeting ../cuda/DeviceStats.java


// Targeting ../cuda/BlockInfo.java


// Targeting ../cuda/SegmentInfo.java


// Targeting ../cuda/AllocatorState.java


// Targeting ../cuda/trace_time_.java


// Targeting ../cuda/TraceEntry.java


// Targeting ../cuda/AllocatorConfigInfo.java


// Targeting ../cuda/SnapshotInfo.java


// Targeting ../cuda/CheckpointDelta.java



@Namespace("c10::cuda::CUDACachingAllocator") public enum RecordContext {
  NEVER(0),
  STATE(1), // only keep stacks for active allocations
  ALLOC(2), // additionally keep stacks for allocations in the trace history
  ALL(3);// additionally record stacks for when something is freed

    public final int value;
    private RecordContext(int v) { this.value = v; }
    private RecordContext(RecordContext e) { this.value = e.value; }
    public RecordContext intern() { for (RecordContext e : values()) if (e.value == value) return e; return this; }
    @Override public String toString() { return intern().name(); }
}

// Size pretty-printer

// Targeting ../cuda/CUDAAllocator.java



// Allocator object, statically initialized
// See BackendInitializer in CUDACachingAllocator.cpp.
// Atomic loads on x86 are just normal loads,
// (atomic stores are different), so reading this value
// is no different than loading a pointer.


@Namespace("c10::cuda::CUDACachingAllocator") public static native @Name("get") CUDAAllocator getAllocator();

// Called directly by clients.






























// CUDAGraph interactions
@Namespace("c10::cuda::CUDACachingAllocator") public static native void beginAllocateToPool(
    byte device,
    @ByVal @Cast("c10::cuda::MempoolId_t*") DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair mempool_id,
    @ByVal StreamFilter filter);

@Namespace("c10::cuda::CUDACachingAllocator") public static native void endAllocateToPool(byte device, @ByVal @Cast("c10::cuda::MempoolId_t*") DeviceAssertionsDataVectorCUDAKernelLaunchInfoVectorPair mempool_id);









@Namespace("c10::cuda::CUDACachingAllocator") public static native void attachAllocatorTraceTracker(@ByVal AllocatorTraceTracker tracker);


// Not part of CUDA_ALLOCATOR_BACKEND_INTERFACE








 // namespace c10::cuda::CUDACachingAllocator


// Parsed from c10/cuda/impl/CUDAGuardImpl.h

// #pragma once

// #include <c10/core/impl/DeviceGuardImplInterface.h>
// #include <c10/core/impl/GPUTrace.h>
// #include <c10/macros/Macros.h>
// #include <c10/util/Exception.h>

// #include <c10/cuda/CUDACachingAllocator.h>
// #include <c10/cuda/CUDAException.h>
// #include <c10/cuda/CUDAFunctions.h>
// #include <c10/cuda/CUDAStream.h>

// #include <c10/core/Device.h>
// #include <c10/core/DeviceType.h>
// #include <c10/core/Stream.h>
// #include <c10/core/impl/PyInterpreter.h>
// #include <c10/util/Optional.h>
// #include <cuda_runtime_api.h>
// #include <cstdint>

 // namespace c10::cuda::impl


// Parsed from c10/cuda/CUDAGuard.h

// #pragma once

// #include <c10/core/DeviceType.h>
// #include <c10/core/impl/InlineDeviceGuard.h>
// #include <c10/core/impl/InlineStreamGuard.h>
// #include <c10/cuda/CUDAMacros.h>
// #include <c10/cuda/impl/CUDAGuardImpl.h>
// Targeting ../cuda/CUDAGuard.java



/** A variant of OptionalDeviceGuard that is specialized for CUDA.  See
 *  CUDAGuard for when you can use this. */
// Targeting ../cuda/CUDAStreamGuard.java



/** A variant of OptionalStreamGuard that is specialized for CUDA.  See
 *  CUDAGuard for when you can use this. */
// Targeting ../cuda/CUDAMultiStreamGuard.java



 // namespace c10::cuda


// Parsed from ATen/cudnn/Types.h

// #pragma once

// #include <ATen/cudnn/cudnn-wrapper.h>
// #include <ATen/Tensor.h>

@Namespace("at::native") public static native @Cast("cudnnDataType_t") int getCudnnDataTypeFromScalarType(ScalarType dtype);




  // namespace at::cudnn


// Parsed from ATen/cudnn/Descriptors.h

// #pragma once

// #include <string>

// #include <ATen/cuda/CUDAContext.h>
// #include <ATen/cuda/Exceptions.h>

// #include <ATen/cudnn/cudnn-wrapper.h>
// #include <ATen/cudnn/Utils.h>
// #include <ATen/core/Tensor.h>
// #include <ATen/TensorUtils.h>
// #include <ATen/cuda/ATenCUDAGeneral.h>
// #include <cuda.h>

// #ifndef AT_PER_OPERATOR_HEADERS
// #include <ATen/Functions.h>
// #else
// #include <ATen/ops/empty.h>
// #endif

// #if defined(CUDNN_VERSION) && CUDNN_VERSION >= 8907
// #define USE_CUDNN_RNN_V8_API
// #endif



// TODO: Add constructors for all of the descriptors

@Namespace("at::native") public static native int dataSize(@Cast("cudnnDataType_t") int dataType);

// The stride for a size-1 dimensions is not uniquely determined; in
// fact, it can be anything you want, because the fact that the
// tensor is size 1 at this dimension means that you will never actually
// try advancing your pointer by this stride.
//
// However, CuDNN has a much more stringent requirement on strides:
// if you are passing a contiguous input, it better be the case
// that the stride for dim i is the product of the sizes of dims
// i+1 to the end.  This stride is indeed uniquely determined.  This
// function modifies 'stride' in place so this invariant holds.
// Targeting ../cuda/RNNDataDescriptor.java


// Targeting ../cuda/TensorDescriptor.java




// Targeting ../cuda/FilterDescriptor.java




// Targeting ../cuda/ConvolutionDescriptor.java


// Targeting ../cuda/SpatialTransformerDescriptor.java


// Targeting ../cuda/DropoutDescriptor.java


// Targeting ../cuda/RNNDescriptor.java


// Targeting ../cuda/CTCLossDescriptor.java


// Targeting ../cuda/ActivationDescriptor.java


// Targeting ../cuda/Constant.java



  // namespace


// Parsed from ATen/cuda/CUDAEvent.h

// #pragma once

// #include <ATen/cuda/ATenCUDAGeneral.h>
// #include <ATen/cuda/CUDAContext.h>
// #include <c10/core/impl/GPUTrace.h>
// #include <c10/cuda/CUDAStream.h>
// #include <c10/cuda/CUDAGuard.h>
// #include <ATen/cuda/Exceptions.h>
// #include <c10/util/Exception.h>

// #include <cuda_runtime_api.h>

// #include <cstdint>
// #include <utility>
// Targeting ../cuda/CUDAEvent.java



 // namespace at::cuda


// Parsed from torch/csrc/inductor/aoti_runner/model_container_runner_cuda.h

// #if !defined(C10_MOBILE) && !defined(ANDROID)
// #pragma once

// #include <c10/cuda/CUDAStream.h>
// #include <torch/csrc/inductor/aoti_runner/model_container_runner.h>
// Targeting ../cuda/AOTIModelContainerRunnerCuda.java



 // namespace torch::inductor
// #endif


}
