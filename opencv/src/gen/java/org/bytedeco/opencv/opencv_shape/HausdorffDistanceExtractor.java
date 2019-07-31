// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_shape;

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

import static org.bytedeco.opencv.global.opencv_shape.*;


/***********************************************************************************/
/***********************************************************************************/
/***********************************************************************************/
/** \brief A simple Hausdorff distance measure between shapes defined by contours
<p>
according to the paper "Comparing Images using the Hausdorff distance." by D.P. Huttenlocher, G.A.
Klanderman, and W.J. Rucklidge. (PAMI 1993). :
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_shape.class)
public class HausdorffDistanceExtractor extends ShapeDistanceExtractor {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HausdorffDistanceExtractor(Pointer p) { super(p); }

    /** \brief Set the norm used to compute the Hausdorff value between two shapes. It can be L1 or L2 norm.
    <p>
    @param distanceFlag Flag indicating which norm is used to compute the Hausdorff distance
    (NORM_L1, NORM_L2).
     */
    public native void setDistanceFlag(int distanceFlag);
    public native int getDistanceFlag();

    /** \brief This method sets the rank proportion (or fractional value) that establish the Kth ranked value of
    the partial Hausdorff distance. Experimentally had been shown that 0.6 is a good value to compare
    shapes.
    <p>
    @param rankProportion fractional value (between 0 and 1).
     */
    public native void setRankProportion(float rankProportion);
    public native float getRankProportion();
}
