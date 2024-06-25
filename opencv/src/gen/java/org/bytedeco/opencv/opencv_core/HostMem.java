// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


//===================================================================================
// HostMem
//===================================================================================

/** \brief Class with reference counting wrapping special memory type allocation functions from CUDA.
<p>
Its interface is also Mat-like but with additional memory type parameters.
<p>
-   **PAGE_LOCKED** sets a page locked memory type used commonly for fast and asynchronous
    uploading/downloading data from/to GPU.
-   **SHARED** specifies a zero copy memory allocation that enables mapping the host memory to GPU
    address space, if supported.
-   **WRITE_COMBINED** sets the write combined buffer that is not cached by CPU. Such buffers are
    used to supply GPU with data when GPU only reads it. The advantage is a better CPU cache
    utilization.
<p>
\note Allocation size of such memory types is usually limited. For more details, see *CUDA 2.2
Pinned Memory APIs* document or *CUDA C Programming Guide*.
 */
@Namespace("cv::cuda") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class HostMem extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HostMem(Pointer p) { super(p); }

    /** enum cv::cuda::HostMem::AllocType */
    public static final int PAGE_LOCKED = 1, SHARED = 2, WRITE_COMBINED = 4;

    public static native MatAllocator getAllocator(@Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public static native MatAllocator getAllocator();

    public HostMem(@Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/) { super((Pointer)null); allocate(alloc_type); }
    private native void allocate(@Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public HostMem() { super((Pointer)null); allocate(); }
    private native void allocate();

    public HostMem(@Const @ByRef HostMem m) { super((Pointer)null); allocate(m); }
    private native void allocate(@Const @ByRef HostMem m);

    public HostMem(int rows, int cols, int type, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/) { super((Pointer)null); allocate(rows, cols, type, alloc_type); }
    private native void allocate(int rows, int cols, int type, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public HostMem(int rows, int cols, int type) { super((Pointer)null); allocate(rows, cols, type); }
    private native void allocate(int rows, int cols, int type);
    public HostMem(@ByVal Size size, int type, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/) { super((Pointer)null); allocate(size, type, alloc_type); }
    private native void allocate(@ByVal Size size, int type, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public HostMem(@ByVal Size size, int type) { super((Pointer)null); allocate(size, type); }
    private native void allocate(@ByVal Size size, int type);

    /** creates from host memory with coping data */
    public HostMem(@ByVal Mat arr, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/) { super((Pointer)null); allocate(arr, alloc_type); }
    private native void allocate(@ByVal Mat arr, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public HostMem(@ByVal Mat arr) { super((Pointer)null); allocate(arr); }
    private native void allocate(@ByVal Mat arr);
    public HostMem(@ByVal UMat arr, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/) { super((Pointer)null); allocate(arr, alloc_type); }
    private native void allocate(@ByVal UMat arr, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public HostMem(@ByVal UMat arr) { super((Pointer)null); allocate(arr); }
    private native void allocate(@ByVal UMat arr);
    public HostMem(@ByVal GpuMat arr, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/) { super((Pointer)null); allocate(arr, alloc_type); }
    private native void allocate(@ByVal GpuMat arr, @Cast("cv::cuda::HostMem::AllocType") int alloc_type/*=cv::cuda::HostMem::AllocType::PAGE_LOCKED*/);
    public HostMem(@ByVal GpuMat arr) { super((Pointer)null); allocate(arr); }
    private native void allocate(@ByVal GpuMat arr);

    public native @ByRef @Name("operator =") HostMem put(@Const @ByRef HostMem m);

    /** swaps with other smart pointer */
    public native void swap(@ByRef HostMem b);

    /** returns deep copy of the matrix, i.e. the data is copied */
    public native @ByVal HostMem clone();

    /** allocates new matrix data unless the matrix already has specified size and type. */
    public native void create(int rows, int cols, int type);
    public native void create(@ByVal Size size, int type);

    /** creates alternative HostMem header for the same data, with different
     *  number of channels and/or different number of rows */
    public native @ByVal HostMem reshape(int cn, int rows/*=0*/);
    public native @ByVal HostMem reshape(int cn);

    /** decrements reference counter and released memory if needed. */
    public native void release();

    /** returns matrix header with disabled reference counting for HostMem data. */
    public native @ByVal Mat createMatHeader();

    /** \brief Maps CPU memory to GPU address space and creates the cuda::GpuMat header without reference counting
    for it.
    <p>
    This can be done only if memory was allocated with the SHARED flag and if it is supported by the
    hardware. Laptops often share video and CPU memory, so address spaces can be mapped, which
    eliminates an extra copy.
     */
    public native @ByVal GpuMat createGpuMatHeader();

    // Please see cv::Mat for descriptions
    public native @Cast("bool") boolean isContinuous();
    public native @Cast("size_t") long elemSize();
    public native @Cast("size_t") long elemSize1();
    public native int type();
    public native int depth();
    public native int channels();
    public native @Cast("size_t") long step1();
    public native @ByVal Size size();
    public native @Cast("bool") boolean empty();

    // Please see cv::Mat for descriptions
    public native int flags(); public native HostMem flags(int setter);
    public native int rows(); public native HostMem rows(int setter);
    public native int cols(); public native HostMem cols(int setter);
    public native @Cast("size_t") long step(); public native HostMem step(long setter);

    public native @Cast("uchar*") BytePointer data(); public native HostMem data(BytePointer setter);
    public native IntPointer refcount(); public native HostMem refcount(IntPointer setter);

    public native @Cast("uchar*") BytePointer datastart(); public native HostMem datastart(BytePointer setter);
    public native @Cast("const uchar*") BytePointer dataend(); public native HostMem dataend(BytePointer setter);

    public native @Cast("cv::cuda::HostMem::AllocType") int alloc_type(); public native HostMem alloc_type(int setter);
}
