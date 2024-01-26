// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Array descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_ARRAY_DESCRIPTOR_v2 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_ARRAY_DESCRIPTOR_v2() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_ARRAY_DESCRIPTOR_v2(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_ARRAY_DESCRIPTOR_v2(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_ARRAY_DESCRIPTOR_v2 position(long position) {
        return (CUDA_ARRAY_DESCRIPTOR_v2)super.position(position);
    }
    @Override public CUDA_ARRAY_DESCRIPTOR_v2 getPointer(long i) {
        return new CUDA_ARRAY_DESCRIPTOR_v2((Pointer)this).offsetAddress(i);
    }

    /** Width of array */
    public native @Cast("size_t") long Width(); public native CUDA_ARRAY_DESCRIPTOR_v2 Width(long setter);
    /** Height of array */
    public native @Cast("size_t") long Height(); public native CUDA_ARRAY_DESCRIPTOR_v2 Height(long setter);

    /** Array format */
    public native @Cast("CUarray_format") int Format(); public native CUDA_ARRAY_DESCRIPTOR_v2 Format(int setter);
    /** Channels per array element */
    public native @Cast("unsigned int") int NumChannels(); public native CUDA_ARRAY_DESCRIPTOR_v2 NumChannels(int setter);
}
