// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * 2D memory copy parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEMCPY2D_v2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY2D_v2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEMCPY2D_v2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY2D_v2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEMCPY2D_v2 position(long position) {
        return (CUDA_MEMCPY2D_v2)super.position(position);
    }
    @Override public CUDA_MEMCPY2D_v2 getPointer(long i) {
        return new CUDA_MEMCPY2D_v2((Pointer)this).offsetAddress(i);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY2D_v2 srcXInBytes(long setter);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY2D_v2 srcY(long setter);

    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY2D_v2 srcMemoryType(int setter);
    /** Source host pointer */
    public native @Const Pointer srcHost(); public native CUDA_MEMCPY2D_v2 srcHost(Pointer setter);
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY2D_v2 srcDevice(long setter);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY2D_v2 srcArray(CUarray_st setter);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY2D_v2 srcPitch(long setter);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY2D_v2 dstXInBytes(long setter);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY2D_v2 dstY(long setter);

    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY2D_v2 dstMemoryType(int setter);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY2D_v2 dstHost(Pointer setter);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY2D_v2 dstDevice(long setter);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY2D_v2 dstArray(CUarray_st setter);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY2D_v2 dstPitch(long setter);

    /** Width of 2D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY2D_v2 WidthInBytes(long setter);
    /** Height of 2D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY2D_v2 Height(long setter);
}
