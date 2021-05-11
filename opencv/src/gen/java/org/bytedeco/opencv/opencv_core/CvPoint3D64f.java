// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;



@NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvPoint3D64f extends AbstractCvPoint3D64f {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvPoint3D64f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvPoint3D64f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CvPoint3D64f position(long position) {
        return (CvPoint3D64f)super.position(position);
    }
    @Override public CvPoint3D64f getPointer(long i) {
        return new CvPoint3D64f((Pointer)this).offsetAddress(i);
    }

    public native double x(); public native CvPoint3D64f x(double setter);
    public native double y(); public native CvPoint3D64f y(double setter);
    public native double z(); public native CvPoint3D64f z(double setter);
// #ifdef CV__VALIDATE_UNUNITIALIZED_VARS
    public CvPoint3D64f() { super((Pointer)null); allocate(); }
    private native void allocate();
// #endif
}
