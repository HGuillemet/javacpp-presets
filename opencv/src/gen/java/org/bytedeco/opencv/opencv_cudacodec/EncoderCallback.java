// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_cudacodec;

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

import static org.bytedeco.opencv.global.opencv_cudacodec.*;


/** \brief Interface for encoder callbacks.
<p>
User can implement own multiplexing by implementing this interface.
*/
@Namespace("cv::cudacodec") @Properties(inherit = org.bytedeco.opencv.presets.opencv_cudacodec.class)
public class EncoderCallback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncoderCallback(Pointer p) { super(p); }

    /** \brief Callback function to signal that the encoded bitstream for one or more frames is ready.
    <p>
    @param vPacket The raw bitstream for one or more frames.
    */
    public native void onEncoded(@ByVal @Cast("std::vector<std::vector<cv::uint8_t> >*") ByteVectorVector vPacket);

    /** \brief Callback function to that the encoding has finished.
    * */
    public native void onEncodingFinished();
}
