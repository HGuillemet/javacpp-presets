// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/**
* \brief Elliptic region around an interest point.
*/
@Namespace("cv::xfeatures2d") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class Elliptic_KeyPoint extends KeyPoint {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Elliptic_KeyPoint(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Elliptic_KeyPoint(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Elliptic_KeyPoint position(long position) {
        return (Elliptic_KeyPoint)super.position(position);
    }
    @Override public Elliptic_KeyPoint getPointer(long i) {
        return new Elliptic_KeyPoint((Pointer)this).offsetAddress(i);
    }

    /** the lengths of the major and minor ellipse axes */
    public native @ByRef Size2f axes(); public native Elliptic_KeyPoint axes(Size2f setter);
    /** the integration scale at which the parameters were estimated */
    public native float si(); public native Elliptic_KeyPoint si(float setter);
    /** the transformation between image space and local patch space */
    public native @ByRef @Cast("cv::Matx23f*") FloatPointer transf(); public native Elliptic_KeyPoint transf(FloatPointer setter);
    public Elliptic_KeyPoint() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Elliptic_KeyPoint(@ByVal Point2f pt, float angle, @ByVal Size axes, float size, float si) { super((Pointer)null); allocate(pt, angle, axes, size, si); }
    private native void allocate(@ByVal Point2f pt, float angle, @ByVal Size axes, float size, float si);
}
