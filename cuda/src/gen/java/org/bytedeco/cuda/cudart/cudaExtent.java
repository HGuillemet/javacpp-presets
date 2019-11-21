// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA extent
 *
 * @see ::make_cudaExtent
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaExtent extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaExtent() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaExtent(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaExtent(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaExtent position(long position) {
        return (cudaExtent)super.position(position);
    }

    /** Width in elements when referring to array memory, in bytes when referring to linear memory */
    public native @Cast("size_t") long width(); public native cudaExtent width(long setter);
    /** Height in elements */
    public native @Cast("size_t") long height(); public native cudaExtent height(long setter);
    /** Depth in elements */
    public native @Cast("size_t") long depth(); public native cudaExtent depth(long setter);
}
