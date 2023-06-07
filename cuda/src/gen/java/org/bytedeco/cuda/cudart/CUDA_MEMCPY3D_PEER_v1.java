// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * 3D memory cross-context copy parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEMCPY3D_PEER_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY3D_PEER_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEMCPY3D_PEER_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY3D_PEER_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEMCPY3D_PEER_v1 position(long position) {
        return (CUDA_MEMCPY3D_PEER_v1)super.position(position);
    }
    @Override public CUDA_MEMCPY3D_PEER_v1 getPointer(long i) {
        return new CUDA_MEMCPY3D_PEER_v1((Pointer)this).offsetAddress(i);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY3D_PEER_v1 srcXInBytes(long setter);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY3D_PEER_v1 srcY(long setter);
    /** Source Z */
    public native @Cast("size_t") long srcZ(); public native CUDA_MEMCPY3D_PEER_v1 srcZ(long setter);
    /** Source LOD */
    public native @Cast("size_t") long srcLOD(); public native CUDA_MEMCPY3D_PEER_v1 srcLOD(long setter);
    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY3D_PEER_v1 srcMemoryType(int setter);
    /** Source host pointer */
    public native @Const Pointer srcHost(); public native CUDA_MEMCPY3D_PEER_v1 srcHost(Pointer setter);
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY3D_PEER_v1 srcDevice(long setter);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY3D_PEER_v1 srcArray(CUarray_st setter);
    /** Source context (ignored with srcMemoryType is ::CU_MEMORYTYPE_ARRAY) */
    public native CUctx_st srcContext(); public native CUDA_MEMCPY3D_PEER_v1 srcContext(CUctx_st setter);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY3D_PEER_v1 srcPitch(long setter);
    /** Source height (ignored when src is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long srcHeight(); public native CUDA_MEMCPY3D_PEER_v1 srcHeight(long setter);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY3D_PEER_v1 dstXInBytes(long setter);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY3D_PEER_v1 dstY(long setter);
    /** Destination Z */
    public native @Cast("size_t") long dstZ(); public native CUDA_MEMCPY3D_PEER_v1 dstZ(long setter);
    /** Destination LOD */
    public native @Cast("size_t") long dstLOD(); public native CUDA_MEMCPY3D_PEER_v1 dstLOD(long setter);
    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY3D_PEER_v1 dstMemoryType(int setter);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY3D_PEER_v1 dstHost(Pointer setter);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY3D_PEER_v1 dstDevice(long setter);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY3D_PEER_v1 dstArray(CUarray_st setter);
    /** Destination context (ignored with dstMemoryType is ::CU_MEMORYTYPE_ARRAY) */
    public native CUctx_st dstContext(); public native CUDA_MEMCPY3D_PEER_v1 dstContext(CUctx_st setter);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY3D_PEER_v1 dstPitch(long setter);
    /** Destination height (ignored when dst is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long dstHeight(); public native CUDA_MEMCPY3D_PEER_v1 dstHeight(long setter);

    /** Width of 3D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY3D_PEER_v1 WidthInBytes(long setter);
    /** Height of 3D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY3D_PEER_v1 Height(long setter);
    /** Depth of 3D memory copy */
    public native @Cast("size_t") long Depth(); public native CUDA_MEMCPY3D_PEER_v1 Depth(long setter);
}
