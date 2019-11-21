// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * 3D memory cross-context copy parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_MEMCPY3D_PEER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_MEMCPY3D_PEER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_MEMCPY3D_PEER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_MEMCPY3D_PEER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_MEMCPY3D_PEER position(long position) {
        return (CUDA_MEMCPY3D_PEER)super.position(position);
    }

    /** Source X in bytes */
    public native @Cast("size_t") long srcXInBytes(); public native CUDA_MEMCPY3D_PEER srcXInBytes(long setter);
    /** Source Y */
    public native @Cast("size_t") long srcY(); public native CUDA_MEMCPY3D_PEER srcY(long setter);
    /** Source Z */
    public native @Cast("size_t") long srcZ(); public native CUDA_MEMCPY3D_PEER srcZ(long setter);
    /** Source LOD */
    public native @Cast("size_t") long srcLOD(); public native CUDA_MEMCPY3D_PEER srcLOD(long setter);
    /** Source memory type (host, device, array) */
    public native @Cast("CUmemorytype") int srcMemoryType(); public native CUDA_MEMCPY3D_PEER srcMemoryType(int setter);
    /** Source host pointer */
    public native @Const Pointer srcHost(); public native CUDA_MEMCPY3D_PEER srcHost(Pointer setter);
    /** Source device pointer */
    public native @Cast("CUdeviceptr") long srcDevice(); public native CUDA_MEMCPY3D_PEER srcDevice(long setter);
    /** Source array reference */
    public native CUarray_st srcArray(); public native CUDA_MEMCPY3D_PEER srcArray(CUarray_st setter);
    /** Source context (ignored with srcMemoryType is ::CU_MEMORYTYPE_ARRAY) */
    public native CUctx_st srcContext(); public native CUDA_MEMCPY3D_PEER srcContext(CUctx_st setter);
    /** Source pitch (ignored when src is array) */
    public native @Cast("size_t") long srcPitch(); public native CUDA_MEMCPY3D_PEER srcPitch(long setter);
    /** Source height (ignored when src is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long srcHeight(); public native CUDA_MEMCPY3D_PEER srcHeight(long setter);

    /** Destination X in bytes */
    public native @Cast("size_t") long dstXInBytes(); public native CUDA_MEMCPY3D_PEER dstXInBytes(long setter);
    /** Destination Y */
    public native @Cast("size_t") long dstY(); public native CUDA_MEMCPY3D_PEER dstY(long setter);
    /** Destination Z */
    public native @Cast("size_t") long dstZ(); public native CUDA_MEMCPY3D_PEER dstZ(long setter);
    /** Destination LOD */
    public native @Cast("size_t") long dstLOD(); public native CUDA_MEMCPY3D_PEER dstLOD(long setter);
    /** Destination memory type (host, device, array) */
    public native @Cast("CUmemorytype") int dstMemoryType(); public native CUDA_MEMCPY3D_PEER dstMemoryType(int setter);
    /** Destination host pointer */
    public native Pointer dstHost(); public native CUDA_MEMCPY3D_PEER dstHost(Pointer setter);
    /** Destination device pointer */
    public native @Cast("CUdeviceptr") long dstDevice(); public native CUDA_MEMCPY3D_PEER dstDevice(long setter);
    /** Destination array reference */
    public native CUarray_st dstArray(); public native CUDA_MEMCPY3D_PEER dstArray(CUarray_st setter);
    /** Destination context (ignored with dstMemoryType is ::CU_MEMORYTYPE_ARRAY) */
    public native CUctx_st dstContext(); public native CUDA_MEMCPY3D_PEER dstContext(CUctx_st setter);
    /** Destination pitch (ignored when dst is array) */
    public native @Cast("size_t") long dstPitch(); public native CUDA_MEMCPY3D_PEER dstPitch(long setter);
    /** Destination height (ignored when dst is array; may be 0 if Depth==1) */
    public native @Cast("size_t") long dstHeight(); public native CUDA_MEMCPY3D_PEER dstHeight(long setter);

    /** Width of 3D memory copy in bytes */
    public native @Cast("size_t") long WidthInBytes(); public native CUDA_MEMCPY3D_PEER WidthInBytes(long setter);
    /** Height of 3D memory copy */
    public native @Cast("size_t") long Height(); public native CUDA_MEMCPY3D_PEER Height(long setter);
    /** Depth of 3D memory copy */
    public native @Cast("size_t") long Depth(); public native CUDA_MEMCPY3D_PEER Depth(long setter);
}
