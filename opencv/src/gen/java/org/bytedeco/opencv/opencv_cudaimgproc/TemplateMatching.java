// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudaimgproc;

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
import org.bytedeco.opencv.opencv_cudaarithm.*;
import static org.bytedeco.opencv.global.opencv_cudaarithm.*;
import org.bytedeco.opencv.opencv_cudafilters.*;
import static org.bytedeco.opencv.global.opencv_cudafilters.*;

import static org.bytedeco.opencv.global.opencv_cudaimgproc.*;


/////////////////////////// Match Template ////////////////////////////

/** \brief Base class for Template Matching. :
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudaimgproc.class)
public class TemplateMatching extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TemplateMatching(Pointer p) { super(p); }
    /** Downcast constructor. */
    public TemplateMatching(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("static_cast<cv::cuda::TemplateMatching*>") void allocate(Algorithm pointer);
    @Override public Algorithm asAlgorithm() { return asAlgorithm(this); }
    @Namespace public static native @Name("static_cast<cv::Algorithm*>") Algorithm asAlgorithm(TemplateMatching pointer);

    /** \brief Computes a proximity map for a raster template and an image where the template is searched for.
    <p>
    @param image Source image.
    @param templ Template image with the size and type the same as image .
    @param result Map containing comparison results ( CV_32FC1 ). If image is *W x H* and templ is *w
    x h*, then result must be *W-w+1 x H-h+1*.
    @param stream Stream for the asynchronous version.
     */
    public native void match(@ByVal Mat image, @ByVal Mat templ, @ByVal Mat result, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void match(@ByVal Mat image, @ByVal Mat templ, @ByVal Mat result);
    public native void match(@ByVal UMat image, @ByVal UMat templ, @ByVal UMat result, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void match(@ByVal UMat image, @ByVal UMat templ, @ByVal UMat result);
    public native void match(@ByVal GpuMat image, @ByVal GpuMat templ, @ByVal GpuMat result, @ByRef(nullValue = "cv::cuda::Stream::Null()") Stream stream);
    public native void match(@ByVal GpuMat image, @ByVal GpuMat templ, @ByVal GpuMat result);
}
