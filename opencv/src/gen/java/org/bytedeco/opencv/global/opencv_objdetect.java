// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.global;

import org.bytedeco.opencv.opencv_objdetect.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
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
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

public class opencv_objdetect extends org.bytedeco.opencv.presets.opencv_objdetect {
    static { Loader.load(); }

// Parsed from <opencv2/objdetect.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
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

// #ifndef OPENCV_OBJDETECT_HPP
// #define OPENCV_OBJDETECT_HPP

// #include "opencv2/core.hpp"
// #include "opencv2/objdetect/aruco_detector.hpp"
// #include "opencv2/objdetect/graphical_code_detector.hpp"
// Targeting ../opencv_objdetect/CvHaarClassifierCascade.java


// Targeting ../opencv_objdetect/SimilarRects.java



/** \brief Groups the object candidate rectangles.
<p>
@param rectList Input/output vector of rectangles. Output vector includes retained and grouped
rectangles. (The Python list is not modified in place.)
@param groupThreshold Minimum possible number of rectangles minus 1. The threshold is used in a
group of rectangles to retain it.
@param eps Relative difference between sides of the rectangles to merge them into a group.
<p>
The function is a wrapper for the generic function partition . It clusters all the input rectangles
using the rectangle equivalence criteria that combines rectangles with similar sizes and similar
locations. The similarity is defined by eps. When eps=0 , no clustering is done at all. If
{@code \texttt{eps}\rightarrow +\inf} , all the rectangles are put in one cluster. Then, the small
clusters containing less than or equal to groupThreshold rectangles are rejected. In each other
cluster, the average rectangle is computed and put into the output rectangle list.
 */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer weights,
                                  int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer weights,
                                  int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] weights,
                                  int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] weights,
                                  int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector IntPointer weights, @StdVector DoublePointer levelWeights );
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector IntBuffer weights, @StdVector DoubleBuffer levelWeights );
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, int groupThreshold,
                                  double eps, @StdVector int[] weights, @StdVector double[] levelWeights );
/** \overload */
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer rejectLevels,
                                  @StdVector DoublePointer levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntPointer rejectLevels,
                                  @StdVector DoublePointer levelWeights, int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer rejectLevels,
                                  @StdVector DoubleBuffer levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector IntBuffer rejectLevels,
                                  @StdVector DoubleBuffer levelWeights, int groupThreshold);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] rejectLevels,
                                  @StdVector double[] levelWeights, int groupThreshold, double eps/*=0.2*/);
@Namespace("cv") public static native void groupRectangles(@ByRef RectVector rectList, @StdVector int[] rejectLevels,
                                  @StdVector double[] levelWeights, int groupThreshold);
/** \overload */
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoublePointer foundWeights,
                                            @StdVector DoublePointer foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoublePointer foundWeights,
                                            @StdVector DoublePointer foundScales);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoubleBuffer foundWeights,
                                            @StdVector DoubleBuffer foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector DoubleBuffer foundWeights,
                                            @StdVector DoubleBuffer foundScales);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector double[] foundWeights,
                                            @StdVector double[] foundScales,
                                            double detectThreshold/*=0.0*/, @ByVal(nullValue = "cv::Size(64, 128)") Size winDetSize);
@Namespace("cv") public static native void groupRectangles_meanshift(@ByRef RectVector rectList, @StdVector double[] foundWeights,
                                            @StdVector double[] foundScales);
/** \}
 <p>
 *  \addtogroup objdetect_cascade_classifier
 *  \{ */

/** enum cv:: */
public static final int CASCADE_DO_CANNY_PRUNING    = 1,
       CASCADE_SCALE_IMAGE         = 2,
       CASCADE_FIND_BIGGEST_OBJECT = 4,
       CASCADE_DO_ROUGH_SEARCH     = 8;
// Targeting ../opencv_objdetect/BaseCascadeClassifier.java


// Targeting ../opencv_objdetect/CascadeClassifier.java



@Namespace("cv") public static native @Ptr BaseCascadeClassifier.MaskGenerator createFaceDetectionMaskGenerator();
// Targeting ../opencv_objdetect/DetectionROI.java


// Targeting ../opencv_objdetect/HOGDescriptor.java


// Targeting ../opencv_objdetect/QRCodeEncoder.java


// Targeting ../opencv_objdetect/QRCodeDetector.java


// Targeting ../opencv_objdetect/QRCodeDetectorAruco.java



/** \} */


// #include "opencv2/objdetect/detection_based_tracker.hpp"
// #include "opencv2/objdetect/face.hpp"
// #include "opencv2/objdetect/charuco_detector.hpp"
// #include "opencv2/objdetect/barcode.hpp"

// #endif


// Parsed from opencv2/objdetect/graphical_code_detector.hpp

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html
// #ifndef OPENCV_OBJDETECT_GRAPHICAL_CODE_DETECTOR_HPP
// #define OPENCV_OBJDETECT_GRAPHICAL_CODE_DETECTOR_HPP

// #include <opencv2/core.hpp>
// Targeting ../opencv_objdetect/GraphicalCodeDetector.java



/** \} */



// #endif

// Parsed from <opencv2/objdetect/barcode.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.
// Copyright (c) 2020-2021 darkliang wangberlinT Certseeds

// #ifndef OPENCV_OBJDETECT_BARCODE_HPP
// #define OPENCV_OBJDETECT_BARCODE_HPP

// #include <opencv2/core.hpp>
// #include <opencv2/objdetect/graphical_code_detector.hpp>
// Targeting ../opencv_objdetect/BarcodeDetector.java


/** \} */

 // cv::barcode::

// #endif // OPENCV_OBJDETECT_BARCODE_HPP


// Parsed from <opencv2/objdetect/detection_based_tracker.hpp>

/*M///////////////////////////////////////////////////////////////////////////////////////
//
//  IMPORTANT: READ BEFORE DOWNLOADING, COPYING, INSTALLING OR USING.
//
//  By downloading, copying, installing or using the software you agree to this license.
//  If you do not agree to this license, do not download, install,
//  copy or use the software.
//
//
//                          License Agreement
//                For Open Source Computer Vision Library
//
// Copyright (C) 2000-2008, Intel Corporation, all rights reserved.
// Copyright (C) 2009, Willow Garage Inc., all rights reserved.
// Copyright (C) 2013, OpenCV Foundation, all rights reserved.
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

// #ifndef OPENCV_OBJDETECT_DBT_HPP
// #define OPENCV_OBJDETECT_DBT_HPP

// #include <opencv2/core.hpp>

// #include <vector>
// Targeting ../opencv_objdetect/DetectionBasedTracker.java



/** \} */

 //end of cv namespace

// #endif


// Parsed from <opencv2/objdetect/face.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html.

// #ifndef OPENCV_OBJDETECT_FACE_HPP
// #define OPENCV_OBJDETECT_FACE_HPP

// #include <opencv2/core.hpp>
// Targeting ../opencv_objdetect/FaceDetectorYN.java


// Targeting ../opencv_objdetect/FaceRecognizerSF.java



/** \} */
 // namespace cv

// #endif


// Parsed from <opencv2/objdetect/aruco_board.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html
// #ifndef OPENCV_OBJDETECT_ARUCO_BOARD_HPP
// #define OPENCV_OBJDETECT_ARUCO_BOARD_HPP

// #include <opencv2/core.hpp>
/** \addtogroup objdetect_aruco
 *  \{ */
// Targeting ../opencv_objdetect/Board.java


// Targeting ../opencv_objdetect/GridBoard.java


// Targeting ../opencv_objdetect/CharucoBoard.java



/** \} */




// #endif


// Parsed from <opencv2/objdetect/aruco_dictionary.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html
// #ifndef OPENCV_OBJDETECT_DICTIONARY_HPP
// #define OPENCV_OBJDETECT_DICTIONARY_HPP

// #include <opencv2/core.hpp>
// Targeting ../opencv_objdetect/Dictionary.java






/** \brief Predefined markers dictionaries/sets
 *
 * Each dictionary indicates the number of bits and the number of markers contained
 * - DICT_ARUCO_ORIGINAL: standard ArUco Library Markers. 1024 markers, 5x5 bits, 0 minimum
                          distance
 */
/** enum cv::aruco::PredefinedDictionaryType */
public static final int
    /** 4x4 bits, minimum hamming distance between any two codes = 4, 50 codes */
    DICT_4X4_50 = 0,
    /** 4x4 bits, minimum hamming distance between any two codes = 3, 100 codes */
    DICT_4X4_100 = 1,
    /** 4x4 bits, minimum hamming distance between any two codes = 3, 250 codes */
    DICT_4X4_250 = 2,
    /** 4x4 bits, minimum hamming distance between any two codes = 2, 1000 codes */
    DICT_4X4_1000 = 3,
    /** 5x5 bits, minimum hamming distance between any two codes = 8, 50 codes */
    DICT_5X5_50 = 4,
    /** 5x5 bits, minimum hamming distance between any two codes = 7, 100 codes */
    DICT_5X5_100 = 5,
    /** 5x5 bits, minimum hamming distance between any two codes = 6, 250 codes */
    DICT_5X5_250 = 6,
    /** 5x5 bits, minimum hamming distance between any two codes = 5, 1000 codes */
    DICT_5X5_1000 = 7,
    /** 6x6 bits, minimum hamming distance between any two codes = 13, 50 codes */
    DICT_6X6_50 = 8,
    /** 6x6 bits, minimum hamming distance between any two codes = 12, 100 codes */
    DICT_6X6_100 = 9,
    /** 6x6 bits, minimum hamming distance between any two codes = 11, 250 codes */
    DICT_6X6_250 = 10,
    /** 6x6 bits, minimum hamming distance between any two codes = 9, 1000 codes */
    DICT_6X6_1000 = 11,
    /** 7x7 bits, minimum hamming distance between any two codes = 19, 50 codes */
    DICT_7X7_50 = 12,
    /** 7x7 bits, minimum hamming distance between any two codes = 18, 100 codes */
    DICT_7X7_100 = 13,
    /** 7x7 bits, minimum hamming distance between any two codes = 17, 250 codes */
    DICT_7X7_250 = 14,
    /** 7x7 bits, minimum hamming distance between any two codes = 14, 1000 codes */
    DICT_7X7_1000 = 15,
    /** 6x6 bits, minimum hamming distance between any two codes = 3, 1024 codes */
    DICT_ARUCO_ORIGINAL = 16,
    /** 4x4 bits, minimum hamming distance between any two codes = 5, 30 codes */
    DICT_APRILTAG_16h5 = 17,
    /** 5x5 bits, minimum hamming distance between any two codes = 9, 35 codes */
    DICT_APRILTAG_25h9 = 18,
    /** 6x6 bits, minimum hamming distance between any two codes = 10, 2320 codes */
    DICT_APRILTAG_36h10 = 19,
    /** 6x6 bits, minimum hamming distance between any two codes = 11, 587 codes */
    DICT_APRILTAG_36h11 = 20,
    /** 6x6 bits, minimum hamming distance between any two codes = 12, 250 codes */
    DICT_ARUCO_MIP_36h12 = 21;


/** \brief Returns one of the predefined dictionaries defined in PredefinedDictionaryType
  */
@Namespace("cv::aruco") public static native @ByVal Dictionary getPredefinedDictionary(@Cast("cv::aruco::PredefinedDictionaryType") int name);


/** \brief Returns one of the predefined dictionaries referenced by DICT_*.
  */

/** \brief Extend base dictionary by new nMarkers
  *
  * @param nMarkers number of markers in the dictionary
  * @param markerSize number of bits per dimension of each markers
  * @param baseDictionary Include the markers in this dictionary at the beginning (optional)
  * @param randomSeed a user supplied seed for theRNG()
  *
  * This function creates a new dictionary composed by nMarkers markers and each markers composed
  * by markerSize x markerSize bits. If baseDictionary is provided, its markers are directly
  * included and the rest are generated based on them. If the size of baseDictionary is higher
  * than nMarkers, only the first nMarkers in baseDictionary are taken and no new marker is added.
  */
@Namespace("cv::aruco") public static native @ByVal Dictionary extendDictionary(int nMarkers, int markerSize, @Const @ByRef(nullValue = "cv::aruco::Dictionary()") Dictionary baseDictionary,
                                         int randomSeed/*=0*/);
@Namespace("cv::aruco") public static native @ByVal Dictionary extendDictionary(int nMarkers, int markerSize);



/** \} */



// #endif


// Parsed from <opencv2/objdetect/aruco_detector.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html
// #ifndef OPENCV_OBJDETECT_ARUCO_DETECTOR_HPP
// #define OPENCV_OBJDETECT_ARUCO_DETECTOR_HPP

// #include <opencv2/objdetect/aruco_dictionary.hpp>
// #include <opencv2/objdetect/aruco_board.hpp>

/** \addtogroup objdetect_aruco
 *  \{ */

/** enum cv::aruco::CornerRefineMethod */
public static final int
    /** Tag and corners detection based on the ArUco approach */
    CORNER_REFINE_NONE = 0,
    /** ArUco approach and refine the corners locations using corner subpixel accuracy */
    CORNER_REFINE_SUBPIX = 1,
    /** ArUco approach and refine the corners locations using the contour-points line fitting */
    CORNER_REFINE_CONTOUR = 2,
    /** Tag and corners detection based on the AprilTag 2 approach \cite wang2016iros */
    CORNER_REFINE_APRILTAG = 3;
// Targeting ../opencv_objdetect/DetectorParameters.java


// Targeting ../opencv_objdetect/RefineParameters.java


// Targeting ../opencv_objdetect/ArucoDetector.java



/** \brief Draw detected markers in image
 *
 * @param image input/output image. It must have 1 or 3 channels. The number of channels is not altered.
 * @param corners positions of marker corners on input image.
 * (e.g std::vector<std::vector<cv::Point2f> > ). For N detected markers, the dimensions of
 * this array should be Nx4. The order of the corners should be clockwise.
 * @param ids vector of identifiers for markers in markersCorners .
 * Optional, if not provided, ids are not painted.
 * @param borderColor color of marker borders. Rest of colors (text color and first corner color)
 * are calculated based on this one to improve visualization.
 *
 * Given an array of detected marker corners and its corresponding ids, this functions draws
 * the markers in the image. The marker borders are painted and the markers identifiers if provided.
 * Useful for debugging purposes.
 */
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal Mat image, @ByVal MatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal Mat image, @ByVal MatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal Mat image, @ByVal UMatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal Mat image, @ByVal UMatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal Mat image, @ByVal GpuMatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal Mat image, @ByVal GpuMatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal UMat image, @ByVal MatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal UMat image, @ByVal MatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal UMat image, @ByVal UMatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal UMat image, @ByVal UMatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal UMat image, @ByVal GpuMatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal UMat image, @ByVal GpuMatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal GpuMat image, @ByVal MatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal GpuMat image, @ByVal MatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal GpuMat image, @ByVal UMatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal GpuMat image, @ByVal UMatVector corners);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal GpuMat image, @ByVal GpuMatVector corners,
                                      @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat ids, @ByVal(nullValue = "cv::Scalar(0, 255, 0)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedMarkers(@ByVal GpuMat image, @ByVal GpuMatVector corners);

/** \brief Generate a canonical marker image
 *
 * @param dictionary dictionary of markers indicating the type of markers
 * @param id identifier of the marker that will be returned. It has to be a valid id in the specified dictionary.
 * @param sidePixels size of the image in pixels
 * @param img output image with the marker
 * @param borderBits width of the marker border.
 *
 * This function returns a marker image in its canonical form (i.e. ready to be printed)
 */
@Namespace("cv::aruco") public static native void generateImageMarker(@Const @ByRef Dictionary dictionary, int id, int sidePixels, @ByVal Mat img,
                                      int borderBits/*=1*/);
@Namespace("cv::aruco") public static native void generateImageMarker(@Const @ByRef Dictionary dictionary, int id, int sidePixels, @ByVal Mat img);
@Namespace("cv::aruco") public static native void generateImageMarker(@Const @ByRef Dictionary dictionary, int id, int sidePixels, @ByVal UMat img,
                                      int borderBits/*=1*/);
@Namespace("cv::aruco") public static native void generateImageMarker(@Const @ByRef Dictionary dictionary, int id, int sidePixels, @ByVal UMat img);
@Namespace("cv::aruco") public static native void generateImageMarker(@Const @ByRef Dictionary dictionary, int id, int sidePixels, @ByVal GpuMat img,
                                      int borderBits/*=1*/);
@Namespace("cv::aruco") public static native void generateImageMarker(@Const @ByRef Dictionary dictionary, int id, int sidePixels, @ByVal GpuMat img);

/** \} */




// #endif


// Parsed from <opencv2/objdetect/charuco_detector.hpp>

// This file is part of OpenCV project.
// It is subject to the license terms in the LICENSE file found in the top-level directory
// of this distribution and at http://opencv.org/license.html
// #ifndef OPENCV_OBJDETECT_CHARUCO_DETECTOR_HPP
// #define OPENCV_OBJDETECT_CHARUCO_DETECTOR_HPP

// #include "opencv2/objdetect/aruco_detector.hpp"
// Targeting ../opencv_objdetect/CharucoParameters.java


// Targeting ../opencv_objdetect/CharucoDetector.java



/**
 * \brief Draws a set of Charuco corners
 * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
 * altered.
 * @param charucoCorners vector of detected charuco corners
 * @param charucoIds list of identifiers for each corner in charucoCorners
 * @param cornerColor color of the square surrounding each corner
 *
 * This function draws a set of detected Charuco corners. If identifiers vector is provided, it also
 * draws the id of each corner.
 */
@Namespace("cv::aruco") public static native void drawDetectedCornersCharuco(@ByVal Mat image, @ByVal Mat charucoCorners,
                                             @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat charucoIds, @ByVal(nullValue = "cv::Scalar(255, 0, 0)") Scalar cornerColor);
@Namespace("cv::aruco") public static native void drawDetectedCornersCharuco(@ByVal Mat image, @ByVal Mat charucoCorners);
@Namespace("cv::aruco") public static native void drawDetectedCornersCharuco(@ByVal UMat image, @ByVal UMat charucoCorners,
                                             @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat charucoIds, @ByVal(nullValue = "cv::Scalar(255, 0, 0)") Scalar cornerColor);
@Namespace("cv::aruco") public static native void drawDetectedCornersCharuco(@ByVal UMat image, @ByVal UMat charucoCorners);
@Namespace("cv::aruco") public static native void drawDetectedCornersCharuco(@ByVal GpuMat image, @ByVal GpuMat charucoCorners,
                                             @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat charucoIds, @ByVal(nullValue = "cv::Scalar(255, 0, 0)") Scalar cornerColor);
@Namespace("cv::aruco") public static native void drawDetectedCornersCharuco(@ByVal GpuMat image, @ByVal GpuMat charucoCorners);

/**
 * \brief Draw a set of detected ChArUco Diamond markers
 *
 * @param image input/output image. It must have 1 or 3 channels. The number of channels is not
 * altered.
 * @param diamondCorners positions of diamond corners in the same format returned by
 * detectCharucoDiamond(). (e.g std::vector<std::vector<cv::Point2f> > ). For N detected markers,
 * the dimensions of this array should be Nx4. The order of the corners should be clockwise.
 * @param diamondIds vector of identifiers for diamonds in diamondCorners, in the same format
 * returned by detectCharucoDiamond() (e.g. std::vector<Vec4i>).
 * Optional, if not provided, ids are not painted.
 * @param borderColor color of marker borders. Rest of colors (text color and first corner color)
 * are calculated based on this one.
 *
 * Given an array of detected diamonds, this functions draws them in the image. The marker borders
 * are painted and the markers identifiers if provided.
 * Useful for debugging purposes.
 */
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal Mat image, @ByVal MatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal Mat image, @ByVal MatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal Mat image, @ByVal UMatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal Mat image, @ByVal UMatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal Mat image, @ByVal GpuMatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal Mat image, @ByVal GpuMatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal UMat image, @ByVal MatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal UMat image, @ByVal MatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal UMat image, @ByVal UMatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal UMat image, @ByVal UMatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal UMat image, @ByVal GpuMatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal UMat image, @ByVal GpuMatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal GpuMat image, @ByVal MatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal GpuMat image, @ByVal MatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal GpuMat image, @ByVal UMatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal GpuMat image, @ByVal UMatVector diamondCorners);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal GpuMat image, @ByVal GpuMatVector diamondCorners,
                                       @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat diamondIds,
                                       @ByVal(nullValue = "cv::Scalar(0, 0, 255)") Scalar borderColor);
@Namespace("cv::aruco") public static native void drawDetectedDiamonds(@ByVal GpuMat image, @ByVal GpuMatVector diamondCorners);

/** \} */




// #endif


}
