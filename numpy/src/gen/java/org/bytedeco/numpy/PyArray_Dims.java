// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_Dims extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArray_Dims() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArray_Dims(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArray_Dims(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArray_Dims position(long position) {
        return (PyArray_Dims)super.position(position);
    }

        public native @Cast("npy_intp*") SizeTPointer ptr(); public native PyArray_Dims ptr(SizeTPointer setter);
        public native int len(); public native PyArray_Dims len(int setter);
}
