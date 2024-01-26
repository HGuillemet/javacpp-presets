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


/** \brief Class for extracting Speeded Up Robust Features from an image \cite Bay06 .
<p>
The algorithm parameters:
-   member int extended
    -   0 means that the basic descriptors (64 elements each) shall be computed
    -   1 means that the extended descriptors (128 elements each) shall be computed
-   member int upright
    -   0 means that detector computes orientation of each feature.
    -   1 means that the orientation is not computed (which is much, much faster). For example,
if you match images from a stereo pair, or do image stitching, the matched features
likely have very similar angles, and you can speed up feature extraction by setting
upright=1.
-   member double hessianThreshold
Threshold for the keypoint detector. Only features, whose hessian is larger than
hessianThreshold are retained by the detector. Therefore, the larger the value, the less
keypoints you will get. A good default value could be from 300 to 500, depending from the
image contrast.
-   member int nOctaves
The number of a gaussian pyramid octaves that the detector uses. It is set to 4 by default.
If you want to get very large features, use the larger value. If you want just small
features, decrease it.
-   member int nOctaveLayers
The number of images within each octave of a gaussian pyramid. It is set to 2 by default.
\note
   -   An example using the SURF feature detector can be found at
        opencv_source_code/samples/cpp/generic_descriptor_match.cpp
    -   Another example using the SURF feature detector, extractor and matcher can be found at
        opencv_source_code/samples/cpp/matcher_simple.cpp
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class SURF extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SURF(Pointer p) { super(p); }
    /** Downcast constructor. */
    public SURF(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::xfeatures2d::SURF*>") void allocate(Algorithm pointer);

    /**
    @param hessianThreshold Threshold for hessian keypoint detector used in SURF.
    @param nOctaves Number of pyramid octaves the keypoint detector will use.
    @param nOctaveLayers Number of octave layers within each octave.
    @param extended Extended descriptor flag (true - use extended 128-element descriptors; false - use
    64-element descriptors).
    @param upright Up-right or rotated features flag (true - do not compute orientation of features;
    false - compute orientation).
     */
    public static native @Ptr SURF create(double hessianThreshold/*=100*/,
                      int nOctaves/*=4*/, int nOctaveLayers/*=3*/,
                      @Cast("bool") boolean extended/*=false*/, @Cast("bool") boolean upright/*=false*/);
    public static native @Ptr SURF create();

    public native void setHessianThreshold(double hessianThreshold);
    public native double getHessianThreshold();

    public native void setNOctaves(int nOctaves);
    public native int getNOctaves();

    public native void setNOctaveLayers(int nOctaveLayers);
    public native int getNOctaveLayers();

    public native void setExtended(@Cast("bool") boolean extended);
    public native @Cast("bool") boolean getExtended();

    public native void setUpright(@Cast("bool") boolean upright);
    public native @Cast("bool") boolean getUpright();

    public native @Str @Override BytePointer getDefaultName();
}
