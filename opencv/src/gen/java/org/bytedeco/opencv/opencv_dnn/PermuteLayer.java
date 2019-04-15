// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

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


    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class PermuteLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public PermuteLayer(Pointer p) { super(p); }
    
        public static native @Ptr PermuteLayer create(@Const @ByRef LayerParams params);
    }
