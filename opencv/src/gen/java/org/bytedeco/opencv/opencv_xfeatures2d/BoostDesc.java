// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

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


/** \brief Class implementing BoostDesc (Learning Image Descriptors with Boosting), described in
\cite Trzcinski13a and \cite Trzcinski13b.
<p>
@param desc type of descriptor to use, BoostDesc::BINBOOST_256 is default (256 bit long dimension)
Available types are: BoostDesc::BGM, BoostDesc::BGM_HARD, BoostDesc::BGM_BILINEAR, BoostDesc::LBGM,
BoostDesc::BINBOOST_64, BoostDesc::BINBOOST_128, BoostDesc::BINBOOST_256
@param use_orientation sample patterns using keypoints orientation, enabled by default
@param scale_factor adjust the sampling window of detected keypoints
6.25f is default and fits for KAZE, SURF detected keypoints window ratio
6.75f should be the scale for SIFT detected keypoints window ratio
5.00f should be the scale for AKAZE, MSD, AGAST, FAST, BRISK keypoints window ratio
0.75f should be the scale for ORB keypoints ratio
1.50f was the default in original implementation
<p>
\note BGM is the base descriptor where each binary dimension is computed as the output of a single weak learner.
BGM_HARD and BGM_BILINEAR refers to same BGM but use different type of gradient binning. In the BGM_HARD that
use ASSIGN_HARD binning type the gradient is assigned to the nearest orientation bin. In the BGM_BILINEAR that use
ASSIGN_BILINEAR binning type the gradient is assigned to the two neighbouring bins. In the BGM and all other modes that use
ASSIGN_SOFT binning type the gradient is assigned to 8 nearest bins according to the cosine value between the gradient
angle and the bin center. LBGM (alias FP-Boost) is the floating point extension where each dimension is computed
as a linear combination of the weak learner responses. BINBOOST and subvariants are the binary extensions of LBGM
where each bit is computed as a thresholded linear combination of a set of weak learners.
BoostDesc header files (boostdesc_*.i) was exported from original binaries with export-boostdesc.py script from
samples subfolder.
<p>
*/

@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class BoostDesc extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BoostDesc(Pointer p) { super(p); }


    /** enum cv::xfeatures2d::BoostDesc:: */
    public static final int
       BGM = 100, BGM_HARD = 101, BGM_BILINEAR = 102, LBGM = 200,
       BINBOOST_64 = 300, BINBOOST_128 = 301, BINBOOST_256 = 302;

    public static native @Ptr BoostDesc create( int desc/*=cv::xfeatures2d::BoostDesc::BINBOOST_256*/,
                        @Cast("bool") boolean use_scale_orientation/*=true*/, float scale_factor/*=6.25f*/ );
    public static native @Ptr BoostDesc create( );

    public native void setUseScaleOrientation(@Cast("const bool") boolean use_scale_orientation);
    public native @Cast("bool") boolean getUseScaleOrientation();

    public native void setScaleFactor(float scale_factor);
    public native float getScaleFactor();
}
