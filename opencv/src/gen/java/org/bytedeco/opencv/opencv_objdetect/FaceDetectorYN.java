// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


/** \addtogroup objdetect_dnn_face
 *  \{
<p>
/** \brief DNN-based face detector
<p>
model download link: https://github.com/opencv/opencv_zoo/tree/master/models/face_detection_yunet
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_objdetect.class)
public class FaceDetectorYN extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FaceDetectorYN(Pointer p) { super(p); }


    /** \brief Set the size for the network input, which overwrites the input size of creating model. Call this method when the size of input image does not match the input size when creating model
     *
     * @param input_size the size of the input image
     */
    public native void setInputSize(@Const @ByRef Size input_size);

    public native @ByVal Size getInputSize();

    /** \brief Set the score threshold to filter out bounding boxes of score less than the given value
     *
     * @param score_threshold threshold for filtering out bounding boxes
     */
    public native void setScoreThreshold(float score_threshold);

    public native float getScoreThreshold();

    /** \brief Set the Non-maximum-suppression threshold to suppress bounding boxes that have IoU greater than the given value
     *
     * @param nms_threshold threshold for NMS operation
     */
    public native void setNMSThreshold(float nms_threshold);

    public native float getNMSThreshold();

    /** \brief Set the number of bounding boxes preserved before NMS
     *
     * @param top_k the number of bounding boxes to preserve from top rank based on score
     */
    public native void setTopK(int top_k);

    public native int getTopK();

    /** \brief A simple interface to detect face from given image
     *
     *  @param image an image to detect
     *  @param faces detection results stored in a cv::Mat
     */
    public native int detect(@ByVal Mat image, @ByVal Mat faces);
    public native int detect(@ByVal UMat image, @ByVal UMat faces);
    public native int detect(@ByVal GpuMat image, @ByVal GpuMat faces);

    /** \brief Creates an instance of this class with given parameters
     *
     *  @param model the path to the requested model
     *  @param config the path to the config file for compability, which is not requested for ONNX models
     *  @param input_size the size of the input image
     *  @param score_threshold the threshold to filter out bounding boxes of score smaller than the given value
     *  @param nms_threshold the threshold to suppress bounding boxes of IoU bigger than the given value
     *  @param top_k keep top K bboxes before NMS
     *  @param backend_id the id of backend
     *  @param target_id the id of target device
     */
    public static native @Ptr FaceDetectorYN create(@Str BytePointer model,
                                                  @Str BytePointer config,
                                                  @Const @ByRef Size input_size,
                                                  float score_threshold/*=0.9f*/,
                                                  float nms_threshold/*=0.3f*/,
                                                  int top_k/*=5000*/,
                                                  int backend_id/*=0*/,
                                                  int target_id/*=0*/);
    public static native @Ptr FaceDetectorYN create(@Str BytePointer model,
                                                  @Str BytePointer config,
                                                  @Const @ByRef Size input_size);
    public static native @Ptr FaceDetectorYN create(@Str String model,
                                                  @Str String config,
                                                  @Const @ByRef Size input_size,
                                                  float score_threshold/*=0.9f*/,
                                                  float nms_threshold/*=0.3f*/,
                                                  int top_k/*=5000*/,
                                                  int backend_id/*=0*/,
                                                  int target_id/*=0*/);
    public static native @Ptr FaceDetectorYN create(@Str String model,
                                                  @Str String config,
                                                  @Const @ByRef Size input_size);
}
