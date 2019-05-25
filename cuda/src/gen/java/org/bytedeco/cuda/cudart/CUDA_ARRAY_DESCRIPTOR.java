// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * Array descriptor
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUDA_ARRAY_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUDA_ARRAY_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDA_ARRAY_DESCRIPTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDA_ARRAY_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUDA_ARRAY_DESCRIPTOR position(long position) {
        return (CUDA_ARRAY_DESCRIPTOR)super.position(position);
    }

    /** Width of array */
    public native @Cast("size_t") long Width(); public native CUDA_ARRAY_DESCRIPTOR Width(long setter);
    /** Height of array */
    public native @Cast("size_t") long Height(); public native CUDA_ARRAY_DESCRIPTOR Height(long setter);

    /** Array format */
    public native @Cast("CUarray_format") int Format(); public native CUDA_ARRAY_DESCRIPTOR Format(int setter);
    /** Channels per array element */
    public native @Cast("unsigned int") int NumChannels(); public native CUDA_ARRAY_DESCRIPTOR NumChannels(int setter);
}
