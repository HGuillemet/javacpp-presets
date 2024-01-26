// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_objdetect;

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
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_objdetect.*;


/** \brief DNN-based face recognizer
<p>
model download link: https://github.com/opencv/opencv_zoo/tree/master/models/face_recognition_sface
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class FaceRecognizerSF extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FaceRecognizerSF(Pointer p) { super(p); }


    /** \brief Definition of distance used for calculating the distance between two face features
     */
    /** enum cv::FaceRecognizerSF::DisType */
    public static final int FR_COSINE = 0, FR_NORM_L2 = 1;

    /** \brief Aligning image to put face on the standard position
     *  @param src_img input image
     *  @param face_box the detection result used for indicate face in input image
     *  @param aligned_img output aligned image
     */
    public native void alignCrop(@ByVal Mat src_img, @ByVal Mat face_box, @ByVal Mat aligned_img);
    public native void alignCrop(@ByVal UMat src_img, @ByVal UMat face_box, @ByVal UMat aligned_img);
    public native void alignCrop(@ByVal GpuMat src_img, @ByVal GpuMat face_box, @ByVal GpuMat aligned_img);

    /** \brief Extracting face feature from aligned image
     *  @param aligned_img input aligned image
     *  @param face_feature output face feature
     */
    public native void feature(@ByVal Mat aligned_img, @ByVal Mat face_feature);
    public native void feature(@ByVal UMat aligned_img, @ByVal UMat face_feature);
    public native void feature(@ByVal GpuMat aligned_img, @ByVal GpuMat face_feature);

    /** \brief Calculating the distance between two face features
     *  @param face_feature1 the first input feature
     *  @param face_feature2 the second input feature of the same size and the same type as face_feature1
     *  @param dis_type defining the similarity with optional values "FR_OSINE" or "FR_NORM_L2"
     */
    public native double match(@ByVal Mat face_feature1, @ByVal Mat face_feature2, int dis_type/*=cv::FaceRecognizerSF::FR_COSINE*/);
    public native double match(@ByVal Mat face_feature1, @ByVal Mat face_feature2);
    public native double match(@ByVal UMat face_feature1, @ByVal UMat face_feature2, int dis_type/*=cv::FaceRecognizerSF::FR_COSINE*/);
    public native double match(@ByVal UMat face_feature1, @ByVal UMat face_feature2);
    public native double match(@ByVal GpuMat face_feature1, @ByVal GpuMat face_feature2, int dis_type/*=cv::FaceRecognizerSF::FR_COSINE*/);
    public native double match(@ByVal GpuMat face_feature1, @ByVal GpuMat face_feature2);

    /** \brief Creates an instance of this class with given parameters
     *  @param model the path of the onnx model used for face recognition
     *  @param config the path to the config file for compability, which is not requested for ONNX models
     *  @param backend_id the id of backend
     *  @param target_id the id of target device
     */
    public static native @Ptr FaceRecognizerSF create(@Str BytePointer model, @Str BytePointer config, int backend_id/*=0*/, int target_id/*=0*/);
    public static native @Ptr FaceRecognizerSF create(@Str BytePointer model, @Str BytePointer config);
    public static native @Ptr FaceRecognizerSF create(@Str String model, @Str String config, int backend_id/*=0*/, int target_id/*=0*/);
    public static native @Ptr FaceRecognizerSF create(@Str String model, @Str String config);
}
