// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /**
     * \brief Adds extra values for specific axes.
     * @param paddings Vector of paddings in format
     *                 <pre>{@code
     *                 [ pad_before, pad_after,  // [0]th dimension
     *                   pad_before, pad_after,  // [1]st dimension
     *                   ...
     *                   pad_before, pad_after ] // [n]th dimension
     *                 }</pre>
     *                 that represents number of padded values at every dimension
     *                 starting from the first one. The rest of dimensions won't
     *                 be padded.
     * @param value Value to be padded. Defaults to zero.
     * @param type Padding type: 'constant', 'reflect'
     * @param input_dims Torch's parameter. If \p input_dims is not equal to the
     *                   actual input dimensionality then the {@code [0]th} dimension
     *                   is considered as a batch dimension and \p paddings are shifted
     *                   to a one dimension. Defaults to {@code -1} that means padding
     *                   corresponding to \p paddings.
     */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class PaddingLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PaddingLayer(Pointer p) { super(p); }
    
        public static native @Ptr PaddingLayer create(@Const @ByRef LayerParams params);
    }
