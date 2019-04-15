// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvGraphVtx2D extends CvGraphVtx {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvGraphVtx2D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvGraphVtx2D(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvGraphVtx2D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvGraphVtx2D position(long position) {
        return (CvGraphVtx2D)super.position(position);
    }

    public native int flags(); public native CvGraphVtx2D flags(int setter);
    public native CvGraphEdge first(); public native CvGraphVtx2D first(CvGraphEdge setter);
    public native CvPoint2D32f ptr(); public native CvGraphVtx2D ptr(CvPoint2D32f setter);
}
