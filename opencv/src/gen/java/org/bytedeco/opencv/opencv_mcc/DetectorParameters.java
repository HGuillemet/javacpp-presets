// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_mcc;

import org.bytedeco.javacpp.annotation.Index;
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

import static org.bytedeco.opencv.global.opencv_mcc.*;

/** \addtogroup mcc
 *  \{
<p>
/**
 * \brief Parameters for the detectMarker process:
 * - int adaptiveThreshWinSizeMin : minimum window size for adaptive
 *                                  thresholding before finding contours
 *                                  (default 23).
 * - int adaptiveThreshWinSizeMax : maximum window size for adaptive
 *                                  thresholding before finding contours
 *                                  (default 153).
 * - int adaptiveThreshWinSizeStep : increments from adaptiveThreshWinSizeMin to
 *                                   adaptiveThreshWinSizeMax during the
 *                                   thresholding (default 16).
 * - double adaptiveThreshConstant : constant for adaptive thresholding before
 *                                   finding contours (default 7)
 * - double minContoursAreaRate : determine minimum area for marker contour to
 *                                be detected. This is defined as a rate respect
 *                                to the area of the input image. Used only if
 *                                neural network is used (default 0.003).
 * - double minContoursArea : determine minimum area for marker contour to be
 *                            detected. This is defined as the actual area. Used
 *                            only if neural network is not used (default 100).
 * - double confidenceThreshold : minimum confidence for a bounding box detected
 *                                by neural network to classify as
 *                                detection.(default 0.5)
 *                                (0<=confidenceThreshold<=1)
 * - double minContourSolidity : minimum solidity of a contour for it be
 *                               detected as a square in the chart. (default
 *                               0.9).
 * - double findCandidatesApproxPolyDPEpsMultiplier : multipler to be used in
 *                                                    cv::ApproxPolyDP function
 *                                                    (default 0.05)
 * - int borderWidth : width of the padding used to pass the inital neural
 *                     network detection in the succeeding system.(default 0)
 * - float B0factor : distance between two neighbours squares of the same chart.
 *                    Defined as the ratio between distance and large dimension
 *                    of square (default 1.25)
 * - float maxError : maximum allowed error in the detection of a chart.
 *                    default(0.1)
 * - int minContourPointsAllowed : minium points in a detected contour.
 *                                 default(4)
 * - int minContourLengthAllowed : minimum length of a countour. default(100)
 * - int minInterContourDistance : minimum distance between two contours.
 *                                 default(100)
 * - int minInterCheckerDistance : minimum distance between two checkers.
 *                                 default(10000)
 * - int minImageSize : minimum size of the smaller dimension of the image.
 *                      default(1000)
 * - unsigned minGroupSize : minimum number of a squared of a chart that must be
 *                           detected. default(4)
 */
@Namespace("cv::mcc") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_mcc.class)
public class DetectorParameters extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DetectorParameters(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DetectorParameters(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DetectorParameters position(long position) {
        return (DetectorParameters)super.position(position);
    }
    @Override public DetectorParameters getPointer(long i) {
        return new DetectorParameters((Pointer)this).offsetAddress(i);
    }


    public DetectorParameters() { super((Pointer)null); allocate(); }
    private native void allocate();

    public static native @Ptr DetectorParameters create();

    public native int adaptiveThreshWinSizeMin(); public native DetectorParameters adaptiveThreshWinSizeMin(int setter);
    public native int adaptiveThreshWinSizeMax(); public native DetectorParameters adaptiveThreshWinSizeMax(int setter);
    public native int adaptiveThreshWinSizeStep(); public native DetectorParameters adaptiveThreshWinSizeStep(int setter);
    public native double adaptiveThreshConstant(); public native DetectorParameters adaptiveThreshConstant(double setter);
    public native double minContoursAreaRate(); public native DetectorParameters minContoursAreaRate(double setter);
    public native double minContoursArea(); public native DetectorParameters minContoursArea(double setter);
    public native double confidenceThreshold(); public native DetectorParameters confidenceThreshold(double setter);
    public native double minContourSolidity(); public native DetectorParameters minContourSolidity(double setter);
    public native double findCandidatesApproxPolyDPEpsMultiplier(); public native DetectorParameters findCandidatesApproxPolyDPEpsMultiplier(double setter);
    public native int borderWidth(); public native DetectorParameters borderWidth(int setter);
    public native float B0factor(); public native DetectorParameters B0factor(float setter);
    public native float maxError(); public native DetectorParameters maxError(float setter);
    public native int minContourPointsAllowed(); public native DetectorParameters minContourPointsAllowed(int setter);
    public native int minContourLengthAllowed(); public native DetectorParameters minContourLengthAllowed(int setter);
    public native int minInterContourDistance(); public native DetectorParameters minInterContourDistance(int setter);
    public native int minInterCheckerDistance(); public native DetectorParameters minInterCheckerDistance(int setter);
    public native int minImageSize(); public native DetectorParameters minImageSize(int setter);
    public native @Cast("unsigned") int minGroupSize(); public native DetectorParameters minGroupSize(int setter);
}
