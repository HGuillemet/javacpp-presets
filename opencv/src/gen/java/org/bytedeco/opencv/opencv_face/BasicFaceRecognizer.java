// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_face;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

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
import org.bytedeco.opencv.opencv_objdetect.*;
import static org.bytedeco.opencv.global.opencv_objdetect.*;
import org.bytedeco.opencv.opencv_photo.*;
import static org.bytedeco.opencv.global.opencv_photo.*;

import static org.bytedeco.opencv.global.opencv_face.*;


/** \addtogroup face
 *  \{ */

// base for two classes
@Namespace("cv::face") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_face.class)
public class BasicFaceRecognizer extends FaceRecognizer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BasicFaceRecognizer(Pointer p) { super(p); }

    /** @see setNumComponents */
    public native int getNumComponents();
    /** \copybrief getNumComponents @see getNumComponents */
    public native void setNumComponents(int val);
    /** @see setThreshold */
    public native @Override double getThreshold();
    /** \copybrief getThreshold @see getThreshold */
    public native @Override void setThreshold(double val);
    public native @ByVal MatVector getProjections();
    public native @ByVal Mat getLabels();
    public native @ByVal Mat getEigenValues();
    public native @ByVal Mat getEigenVectors();
    public native @ByVal Mat getMean();

    public native @Override void read(@Const @ByRef FileNode fn);
    public native @Override void write(@ByRef FileStorage fs);
    public native @Cast("bool") @Override boolean empty();
}
