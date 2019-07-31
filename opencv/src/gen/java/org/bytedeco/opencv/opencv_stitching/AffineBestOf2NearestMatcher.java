// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_stitching;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;
import org.bytedeco.opencv.opencv_xfeatures2d.*;
import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;

import static org.bytedeco.opencv.global.opencv_stitching.*;


/** \brief Features matcher similar to cv::detail::BestOf2NearestMatcher which
finds two best matches for each feature and leaves the best one only if the
ratio between descriptor distances is greater than the threshold match_conf.
<p>
Unlike cv::detail::BestOf2NearestMatcher this matcher uses affine
transformation (affine trasformation estimate will be placed in matches_info).
<p>
@see cv::detail::FeaturesMatcher cv::detail::BestOf2NearestMatcher
 */
@Namespace("cv::detail") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_stitching.class)
public class AffineBestOf2NearestMatcher extends BestOf2NearestMatcher {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AffineBestOf2NearestMatcher(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AffineBestOf2NearestMatcher(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AffineBestOf2NearestMatcher position(long position) {
        return (AffineBestOf2NearestMatcher)super.position(position);
    }

    /** \brief Constructs a "best of 2 nearest" matcher that expects affine trasformation
    between images
    <p>
    @param full_affine whether to use full affine transformation with 6 degress of freedom or reduced
    transformation with 4 degrees of freedom using only rotation, translation and uniform scaling
    @param try_use_gpu Should try to use GPU or not
    @param match_conf Match distances ration threshold
    @param num_matches_thresh1 Minimum number of matches required for the 2D affine transform
    estimation used in the inliers classification step
    <p>
    @see cv::estimateAffine2D cv::estimateAffinePartial2D
     */
    public AffineBestOf2NearestMatcher(@Cast("bool") boolean full_affine/*=false*/, @Cast("bool") boolean try_use_gpu/*=false*/,
                                    float match_conf/*=0.3f*/, int num_matches_thresh1/*=6*/) { super((Pointer)null); allocate(full_affine, try_use_gpu, match_conf, num_matches_thresh1); }
    private native void allocate(@Cast("bool") boolean full_affine/*=false*/, @Cast("bool") boolean try_use_gpu/*=false*/,
                                    float match_conf/*=0.3f*/, int num_matches_thresh1/*=6*/);
    public AffineBestOf2NearestMatcher() { super((Pointer)null); allocate(); }
    private native void allocate();
}
