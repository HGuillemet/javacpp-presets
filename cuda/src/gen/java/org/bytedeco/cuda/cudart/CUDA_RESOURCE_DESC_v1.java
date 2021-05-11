// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA Resource descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_RESOURCE_DESC_v1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_RESOURCE_DESC_v1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_RESOURCE_DESC_v1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_RESOURCE_DESC_v1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_RESOURCE_DESC_v1 position(long position) {
        return (CUDA_RESOURCE_DESC_v1)super.position(position);
    }
    @Override public CUDA_RESOURCE_DESC_v1 getPointer(long i) {
        return new CUDA_RESOURCE_DESC_v1((Pointer)this).offsetAddress(i);
    }

    /** Resource type */
    public native @Cast("CUresourcetype") int resType(); public native CUDA_RESOURCE_DESC_v1 resType(int setter);

            /** CUDA array */
            @Name("res.array.hArray") public native CUarray_st res_array_hArray(); public native CUDA_RESOURCE_DESC_v1 res_array_hArray(CUarray_st setter);
            /** CUDA mipmapped array */
            @Name("res.mipmap.hMipmappedArray") public native CUmipmappedArray_st res_mipmap_hMipmappedArray(); public native CUDA_RESOURCE_DESC_v1 res_mipmap_hMipmappedArray(CUmipmappedArray_st setter);
            /** Device pointer */
            @Name("res.linear.devPtr") public native @Cast("CUdeviceptr") long res_linear_devPtr(); public native CUDA_RESOURCE_DESC_v1 res_linear_devPtr(long setter);
            /** Array format */
            @Name("res.linear.format") public native @Cast("CUarray_format") int res_linear_format(); public native CUDA_RESOURCE_DESC_v1 res_linear_format(int setter);
            /** Channels per array element */
            @Name("res.linear.numChannels") public native @Cast("unsigned int") int res_linear_numChannels(); public native CUDA_RESOURCE_DESC_v1 res_linear_numChannels(int setter);
            /** Size in bytes */
            @Name("res.linear.sizeInBytes") public native @Cast("size_t") long res_linear_sizeInBytes(); public native CUDA_RESOURCE_DESC_v1 res_linear_sizeInBytes(long setter);
            /** Device pointer */
            @Name("res.pitch2D.devPtr") public native @Cast("CUdeviceptr") long res_pitch2D_devPtr(); public native CUDA_RESOURCE_DESC_v1 res_pitch2D_devPtr(long setter);
            /** Array format */
            @Name("res.pitch2D.format") public native @Cast("CUarray_format") int res_pitch2D_format(); public native CUDA_RESOURCE_DESC_v1 res_pitch2D_format(int setter);
            /** Channels per array element */
            @Name("res.pitch2D.numChannels") public native @Cast("unsigned int") int res_pitch2D_numChannels(); public native CUDA_RESOURCE_DESC_v1 res_pitch2D_numChannels(int setter);
            /** Width of the array in elements */
            @Name("res.pitch2D.width") public native @Cast("size_t") long res_pitch2D_width(); public native CUDA_RESOURCE_DESC_v1 res_pitch2D_width(long setter);
            /** Height of the array in elements */
            @Name("res.pitch2D.height") public native @Cast("size_t") long res_pitch2D_height(); public native CUDA_RESOURCE_DESC_v1 res_pitch2D_height(long setter);
            /** Pitch between two rows in bytes */
            @Name("res.pitch2D.pitchInBytes") public native @Cast("size_t") long res_pitch2D_pitchInBytes(); public native CUDA_RESOURCE_DESC_v1 res_pitch2D_pitchInBytes(long setter);
            @Name("res.reserved.reserved") public native int res_reserved_reserved(int i); public native CUDA_RESOURCE_DESC_v1 res_reserved_reserved(int i, int setter);
            @Name("res.reserved.reserved") @MemberGetter public native IntPointer res_reserved_reserved();

    /** Flags (must be zero) */
    public native @Cast("unsigned int") int flags(); public native CUDA_RESOURCE_DESC_v1 flags(int setter);
}
