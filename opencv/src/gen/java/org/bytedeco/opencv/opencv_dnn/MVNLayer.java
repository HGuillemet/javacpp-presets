// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

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

import static org.bytedeco.opencv.global.opencv_dnn.*;


    @Namespace("cv::dnn") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class MVNLayer extends Layer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public MVNLayer(Pointer p) { super(p); }
    
        public native float eps(); public native MVNLayer eps(float setter);
        public native @Cast("bool") boolean normVariance(); public native MVNLayer normVariance(boolean setter);
        public native @Cast("bool") boolean acrossChannels(); public native MVNLayer acrossChannels(boolean setter);

        public static native @Ptr MVNLayer create(@Const @ByRef LayerParams params);
    }
