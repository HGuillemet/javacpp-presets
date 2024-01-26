// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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



/*
* LATCH Descriptor
*/

/** latch Class for computing the LATCH descriptor.
If you find this code useful, please add a reference to the following paper in your work:
Gil Levi and Tal Hassner, "LATCH: Learned Arrangements of Three Patch Codes", arXiv preprint arXiv:1501.03719, 15 Jan. 2015
<p>
LATCH is a binary descriptor based on learned comparisons of triplets of image patches.
<p>
* bytes is the size of the descriptor - can be 64, 32, 16, 8, 4, 2 or 1
* rotationInvariance - whether or not the descriptor should compansate for orientation changes.
* half_ssd_size - the size of half of the mini-patches size. For example, if we would like to compare triplets of patches of size 7x7x
    then the half_ssd_size should be (7-1)/2 = 3.
* sigma - sigma value for GaussianBlur smoothing of the source image. Source image will be used without smoothing in case sigma value is 0.
<p>
Note: the descriptor can be coupled with any keypoint extractor. The only demand is that if you use set rotationInvariance = True then
    you will have to use an extractor which estimates the patch orientation (in degrees). Examples for such extractors are ORB and SIFT.
<p>
Note: a complete example can be found under /samples/cpp/tutorial_code/xfeatures2D/latch_match.cpp
<p>
*/
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class LATCH extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LATCH(Pointer p) { super(p); }
    /** Downcast constructor. */
    public LATCH(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::xfeatures2d::LATCH*>") void allocate(Algorithm pointer);

    public static native @Ptr LATCH create(int bytes/*=32*/, @Cast("bool") boolean rotationInvariance/*=true*/, int half_ssd_size/*=3*/, double sigma/*=2.0*/);
    public static native @Ptr LATCH create();

    public native void setBytes(int bytes);
    public native int getBytes();

    public native void setRotationInvariance(@Cast("bool") boolean rotationInvariance);
    public native @Cast("bool") boolean getRotationInvariance();

    public native void setHalfSSDsize(int half_ssd_size);
    public native int getHalfSSDsize();

    public native void setSigma(double sigma);
    public native double getSigma();

    public native @Str @Override BytePointer getDefaultName();
}
