// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvSlice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvSlice(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvSlice(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvSlice position(long position) {
        return (CvSlice)super.position(position);
    }

    public native int start_index(); public native CvSlice start_index(int setter);
    public native int end_index(); public native CvSlice end_index(int setter);

// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvSlice() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus) && !defined(__CUDACC__)
    public CvSlice(int start/*=0*/, int end/*=0*/) { super((Pointer)null); allocate(start, end); }
    private native void allocate(int start/*=0*/, int end/*=0*/);
    public CvSlice(@Const @ByRef Range r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Range r);
    public native @ByVal @Name("operator cv::Range") Range asRange();
// #endif
}
