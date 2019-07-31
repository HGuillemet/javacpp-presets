// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;

// #endif

/** \addtogroup imgproc_c
  \{
*/

/** Connected component structure */
@Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class CvConnectedComp extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CvConnectedComp() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CvConnectedComp(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvConnectedComp(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CvConnectedComp position(long position) {
        return (CvConnectedComp)super.position(position);
    }

    /**area of the connected component  */
    public native double area(); public native CvConnectedComp area(double setter);
    /**average color of the connected component */
    public native @ByRef CvScalar value(); public native CvConnectedComp value(CvScalar setter);
    /**ROI of the component  */
    public native @ByRef CvRect rect(); public native CvConnectedComp rect(CvRect setter);
    /**optional component boundary
                          (the contour might have child contours corresponding to the holes)*/
    public native CvSeq contour(); public native CvConnectedComp contour(CvSeq setter);
}
