// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_photo;

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

import static org.bytedeco.opencv.global.opencv_photo.*;


/** \brief The base class for algorithms that align images of the same scene with different exposures
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_photo.class)
public class AlignExposures extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AlignExposures(Pointer p) { super(p); }

    /** \brief Aligns images
    <p>
    @param src vector of input images
    @param dst vector of aligned images
    @param times vector of exposure time values for each image
    @param response 256x1 matrix with inverse camera response function for each pixel value, it should
    have the same number of channels as images.
     */
    public native void process(@ByVal MatVector src, @ByRef MatVector dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native void process(@ByVal UMatVector src, @ByRef MatVector dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native void process(@ByVal GpuMatVector src, @ByRef MatVector dst,
                                     @ByVal Mat times, @ByVal Mat response);
    public native void process(@ByVal MatVector src, @ByRef MatVector dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native void process(@ByVal UMatVector src, @ByRef MatVector dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native void process(@ByVal GpuMatVector src, @ByRef MatVector dst,
                                     @ByVal UMat times, @ByVal UMat response);
    public native void process(@ByVal MatVector src, @ByRef MatVector dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native void process(@ByVal UMatVector src, @ByRef MatVector dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
    public native void process(@ByVal GpuMatVector src, @ByRef MatVector dst,
                                     @ByVal GpuMat times, @ByVal GpuMat response);
}
