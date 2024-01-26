// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_shape;

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

import static org.bytedeco.opencv.global.opencv_shape.*;


/** \addtogroup shape
 *  \{
<p>
/** \brief Abstract base class for histogram cost algorithms.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_shape.class)
public class HistogramCostExtractor extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HistogramCostExtractor(Pointer p) { super(p); }
    /** Downcast constructor. */
    public HistogramCostExtractor(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::HistogramCostExtractor*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(HistogramCostExtractor pointer);

    public native void buildCostMatrix(@ByVal Mat descriptors1, @ByVal Mat descriptors2, @ByVal Mat costMatrix);
    public native void buildCostMatrix(@ByVal UMat descriptors1, @ByVal UMat descriptors2, @ByVal UMat costMatrix);
    public native void buildCostMatrix(@ByVal GpuMat descriptors1, @ByVal GpuMat descriptors2, @ByVal GpuMat costMatrix);

    public native void setNDummies(int nDummies);
    public native int getNDummies();

    public native void setDefaultCost(float defaultCost);
    public native float getDefaultCost();
}
