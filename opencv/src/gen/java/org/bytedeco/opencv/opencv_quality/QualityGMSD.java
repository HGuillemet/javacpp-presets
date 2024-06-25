// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_quality;

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
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;

import static org.bytedeco.opencv.global.opencv_quality.*;


/**
\brief Full reference GMSD algorithm
http://www4.comp.polyu.edu.hk/~cslzhang/IQA/GMSD/GMSD.htm
*/
@Namespace("cv::quality") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_quality.class)
public class QualityGMSD extends QualityBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QualityGMSD(Pointer p) { super(p); }
    /** Downcast constructor. */
    public QualityGMSD(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::quality::QualityGMSD*>") void allocate(Algorithm pointer);


    /**
    \brief Compute GMSD
    @param cmp comparison image
    @return cv::Scalar with per-channel quality value.  Values range from 0 (worst) to 1 (best)
    */
    public native @ByVal @Override Scalar compute( @ByVal Mat cmp );
    public native @ByVal @Override Scalar compute( @ByVal UMat cmp );
    public native @ByVal @Override Scalar compute( @ByVal GpuMat cmp );

    /** \brief Implements Algorithm::empty()  */
    public native @Cast("bool") @Override boolean empty();

    /** \brief Implements Algorithm::clear()  */
    public native @Override void clear();

    /**
    \brief Create an object which calculates image quality
    @param ref reference image
    */
    public static native @Ptr QualityGMSD create( @ByVal Mat ref );
    public static native @Ptr QualityGMSD create( @ByVal UMat ref );
    public static native @Ptr QualityGMSD create( @ByVal GpuMat ref );

    /**
    \brief static method for computing quality
    @param ref reference image
    @param cmp comparison image
    @param qualityMap output quality map, or cv::noArray()
    @return cv::Scalar with per-channel quality value.  Values range from 0 (worst) to 1 (best)
    */
    public static native @ByVal Scalar compute( @ByVal Mat ref, @ByVal Mat cmp, @ByVal Mat qualityMap );
    public static native @ByVal Scalar compute( @ByVal UMat ref, @ByVal UMat cmp, @ByVal UMat qualityMap );
    public static native @ByVal Scalar compute( @ByVal GpuMat ref, @ByVal GpuMat cmp, @ByVal GpuMat qualityMap );

}
