// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_xfeatures2d.*;

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

public class opencv_xfeatures2d extends org.bytedeco.opencv.presets.opencv_xfeatures2d {
    static { Loader.load(); }

// Parsed from <opencv2/xfeatures2d.hpp>

/*
By downloading, copying, installing or using the software you agree to this
license. If you do not agree to this license, do not download, install,
copy or use the software.

                          License Agreement
               For Open Source Computer Vision Library
                       (3-clause BSD License)

Copyright (C) 2013, OpenCV Foundation, all rights reserved.
Third party copyrights are property of their respective owners.

Redistribution and use in source and binary forms, with or without modification,
are permitted provided that the following conditions are met:

  * Redistributions of source code must retain the above copyright notice,
    this list of conditions and the following disclaimer.

  * Redistributions in binary form must reproduce the above copyright notice,
    this list of conditions and the following disclaimer in the documentation
    and/or other materials provided with the distribution.

  * Neither the names of the copyright holders nor the names of the contributors
    may be used to endorse or promote products derived from this software
    without specific prior written permission.

This software is provided by the copyright holders and contributors "as is" and
any express or implied warranties, including, but not limited to, the implied
warranties of merchantability and fitness for a particular purpose are
disclaimed. In no event shall copyright holders or contributors be liable for
any direct, indirect, incidental, special, exemplary, or consequential damages
(including, but not limited to, procurement of substitute goods or services;
loss of use, data, or profits; or business interruption) however caused
and on any theory of liability, whether in contract, strict liability,
or tort (including negligence or otherwise) arising in any way out of
the use of this software, even if advised of the possibility of such damage.
*/

// #ifndef __OPENCV_XFEATURES2D_HPP__
// #define __OPENCV_XFEATURES2D_HPP__

// #include "opencv2/features2d.hpp"
// #include "opencv2/xfeatures2d/nonfree.hpp"

/** \defgroup xfeatures2d Extra 2D Features Framework
\{
    \defgroup xfeatures2d_experiment Experimental 2D Features Algorithms
<p>
This section describes experimental algorithms for 2d feature detection.
    <p>
    \defgroup xfeatures2d_nonfree Non-free 2D Features Algorithms
<p>
This section describes two popular algorithms for 2d feature detection, SIFT and SURF, that are
known to be patented. You need to set the OPENCV_ENABLE_NONFREE option in cmake to use those. Use them at your own risk.
    <p>
    \defgroup xfeatures2d_match Experimental 2D Features Matching Algorithm
<p>
This section describes the GMS (Grid-based Motion Statistics) matching strategy.
<p>
\}
*/
// Targeting ../opencv_xfeatures2d/FREAK.java


// Targeting ../opencv_xfeatures2d/StarDetector.java


// Targeting ../opencv_xfeatures2d/BriefDescriptorExtractor.java


// Targeting ../opencv_xfeatures2d/LUCID.java


// Targeting ../opencv_xfeatures2d/LATCH.java


// Targeting ../opencv_xfeatures2d/DAISY.java


// Targeting ../opencv_xfeatures2d/MSDDetector.java


// Targeting ../opencv_xfeatures2d/VGG.java


// Targeting ../opencv_xfeatures2d/BoostDesc.java


// Targeting ../opencv_xfeatures2d/PCTSignatures.java


// Targeting ../opencv_xfeatures2d/PCTSignaturesSQFD.java


// Targeting ../opencv_xfeatures2d/Elliptic_KeyPoint.java


// Targeting ../opencv_xfeatures2d/HarrisLaplaceFeatureDetector.java


// Targeting ../opencv_xfeatures2d/AffineFeature2D.java




/** \brief Estimates cornerness for prespecified KeyPoints using the FAST algorithm
<p>
@param image grayscale image where keypoints (corners) are detected.
@param keypoints keypoints which should be tested to fit the FAST criteria. Keypoints not beeing
detected as corners are removed.
@param threshold threshold on difference between intensity of the central pixel and pixels of a
circle around this pixel.
@param nonmaxSuppression if true, non-maximum suppression is applied to detected corners
(keypoints).
@param type one of the three neighborhoods as defined in the paper:
FastFeatureDetector::TYPE_9_16, FastFeatureDetector::TYPE_7_12,
FastFeatureDetector::TYPE_5_8
<p>
Detects corners using the FAST algorithm by \cite Rosten06 .
 */
@Namespace("cv::xfeatures2d") public static native void FASTForPointSet( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/, @Cast("cv::FastFeatureDetector::DetectorType") int type/*=cv::FastFeatureDetector::TYPE_9_16*/);
@Namespace("cv::xfeatures2d") public static native void FASTForPointSet( @ByVal Mat image, @ByRef KeyPointVector keypoints,
                      int threshold);
@Namespace("cv::xfeatures2d") public static native void FASTForPointSet( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/, @Cast("cv::FastFeatureDetector::DetectorType") int type/*=cv::FastFeatureDetector::TYPE_9_16*/);
@Namespace("cv::xfeatures2d") public static native void FASTForPointSet( @ByVal UMat image, @ByRef KeyPointVector keypoints,
                      int threshold);
@Namespace("cv::xfeatures2d") public static native void FASTForPointSet( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold, @Cast("bool") boolean nonmaxSuppression/*=true*/, @Cast("cv::FastFeatureDetector::DetectorType") int type/*=cv::FastFeatureDetector::TYPE_9_16*/);
@Namespace("cv::xfeatures2d") public static native void FASTForPointSet( @ByVal GpuMat image, @ByRef KeyPointVector keypoints,
                      int threshold);


/** \}
 <p>
 <p>
 *  \addtogroup xfeatures2d_match
 *  \{
<p>
/** \brief GMS  (Grid-based Motion Statistics) feature matching strategy by \cite Bian2017gms .
    @param size1 Input size of image1.
    @param size2 Input size of image2.
    @param keypoints1 Input keypoints of image1.
    @param keypoints2 Input keypoints of image2.
    @param matches1to2 Input 1-nearest neighbor matches.
    @param matchesGMS Matches returned by the GMS matching strategy.
    @param withRotation Take rotation transformation into account.
    @param withScale Take scale transformation into account.
    @param thresholdFactor The higher, the less matches.
    \note
        Since GMS works well when the number of features is large, we recommend to use the ORB feature and set FastThreshold to 0 to get as many as possible features quickly.
        If matching results are not satisfying, please add more features. (We use 10000 for images with 640 X 480).
        If your images have big rotation and scale changes, please set withRotation or withScale to true.
 */

@Namespace("cv::xfeatures2d") public static native void matchGMS( @Const @ByRef Size size1, @Const @ByRef Size size2, @Const @ByRef KeyPointVector keypoints1, @Const @ByRef KeyPointVector keypoints2,
                          @Const @ByRef DMatchVector matches1to2, @ByRef DMatchVector matchesGMS, @Cast("const bool") boolean withRotation/*=false*/,
                          @Cast("const bool") boolean withScale/*=false*/, double thresholdFactor/*=6.0*/ );
@Namespace("cv::xfeatures2d") public static native void matchGMS( @Const @ByRef Size size1, @Const @ByRef Size size2, @Const @ByRef KeyPointVector keypoints1, @Const @ByRef KeyPointVector keypoints2,
                          @Const @ByRef DMatchVector matches1to2, @ByRef DMatchVector matchesGMS );

/** \} */




// #endif


// Parsed from <opencv2/xfeatures2d/nonfree.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                           License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Third party copyrights are property of their respective owners.
//
// Redistribution and use in source and binary forms, with or without modification,
// are permitted provided that the following conditions are met:
//
//   * Redistribution's of source code must retain the above copyright notice,
//     this list of conditions and the following disclaimer.
//
//   * Redistribution's in binary form must reproduce the above copyright notice,
//     this list of conditions and the following disclaimer in the documentation
//     and/or other materials provided with the distribution.
//
//   * The name of the copyright holders may not be used to endorse or promote products
//     derived from this software without specific prior written permission.
//
// This software is provided by the copyright holders and contributors "as is" and
// any express or implied warranties, including, but not limited to, the implied
// warranties of merchantability and fitness for a particular purpose are disclaimed.
// In no event shall the Intel Corporation or contributors be liable for any direct,
// indirect, incidental, special, exemplary, or consequential damages
// (including, but not limited to, procurement of substitute goods or services;
// loss of use, data, or profits; or business interruption) however caused
// and on any theory of liability, whether in contract, strict liability,
// or tort (including negligence or otherwise) arising in any way out of
// the use of this software, even if advised of the possibility of such damage.
//
//M*/

// #ifndef __OPENCV_XFEATURES2D_FEATURES_2D_HPP__
// #define __OPENCV_XFEATURES2D_FEATURES_2D_HPP__

// #include "opencv2/features2d.hpp"
// Targeting ../opencv_xfeatures2d/SIFT.java


// Targeting ../opencv_xfeatures2d/SURF.java



/** \} */


 /* namespace cv */

// #endif


}
