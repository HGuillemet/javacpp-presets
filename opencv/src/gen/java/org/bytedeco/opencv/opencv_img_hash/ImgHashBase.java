// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_img_hash;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_img_hash.*;


/** \addtogroup img_hash
 *  \{
<p>
/** \brief The base class for image hash algorithms
 */
@Namespace("cv::img_hash") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_img_hash.class)
public class ImgHashBase extends Algorithm {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ImgHashBase(Pointer p) { super(p); }

    @Opaque public static class ImgHashImpl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public ImgHashImpl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public ImgHashImpl(Pointer p) { super(p); }
    }
    /** \brief Computes hash of the input image
        @param inputArr input image want to compute hash value
        @param outputArr hash of the image
    */
    public native void compute(@ByVal Mat inputArr, @ByVal Mat outputArr);
    public native void compute(@ByVal UMat inputArr, @ByVal UMat outputArr);
    public native void compute(@ByVal GpuMat inputArr, @ByVal GpuMat outputArr);
    /** \brief Compare the hash value between inOne and inTwo
        @param hashOne Hash value one
        @param hashTwo Hash value two
        @return value indicate similarity between inOne and inTwo, the meaning
        of the value vary from algorithms to algorithms
    */
    public native double compare(@ByVal Mat hashOne, @ByVal Mat hashTwo);
    public native double compare(@ByVal UMat hashOne, @ByVal UMat hashTwo);
    public native double compare(@ByVal GpuMat hashOne, @ByVal GpuMat hashTwo);
}
