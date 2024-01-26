// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xphoto;

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
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_xphoto.*;


/** \addtogroup xphoto
 *  \{
<p>
/** \brief The base class for auto white balance algorithms.
 */
@Namespace("cv::xphoto") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xphoto.class)
public class WhiteBalancer extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WhiteBalancer(Pointer p) { super(p); }
    /** Downcast constructor. */
    public WhiteBalancer(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::xphoto::WhiteBalancer*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(WhiteBalancer pointer);

    /** \brief Applies white balancing to the input image
    <p>
    @param src Input image
    @param dst White balancing result
    @see cvtColor, equalizeHist
    */
    public native void balanceWhite(@ByVal Mat src, @ByVal Mat dst);
    public native void balanceWhite(@ByVal UMat src, @ByVal UMat dst);
    public native void balanceWhite(@ByVal GpuMat src, @ByVal GpuMat dst);
}
