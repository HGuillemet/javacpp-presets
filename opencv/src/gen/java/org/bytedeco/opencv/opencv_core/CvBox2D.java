// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

/** @see RotatedRect
 */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class CvBox2D extends AbstractCvBox2D {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvBox2D() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvBox2D(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvBox2D(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvBox2D position(long position) {
        return (CvBox2D)super.position(position);
    }
    @Override public CvBox2D getPointer(long i) {
        return new CvBox2D((Pointer)this).offsetAddress(i);
    }

    /** Center of the box.                          */
    public native @ByRef CvPoint2D32f center(); public native CvBox2D center(CvPoint2D32f setter);
    /** Box width and length.                       */
    public native @ByRef CvSize2D32f size(); public native CvBox2D size(CvSize2D32f setter);
    /** Angle between the horizontal axis           */
    /** and the first side (i.e. length) in degrees */
    public native float angle(); public native CvBox2D angle(float setter);

// #if defined(CV__ENABLE_C_API_CTORS) && defined(__cplusplus)
// #endif
// #ifdef __cplusplus
    public native @ByVal @Name("operator cv::RotatedRect") RotatedRect asRotatedRect();
// #endif
}
