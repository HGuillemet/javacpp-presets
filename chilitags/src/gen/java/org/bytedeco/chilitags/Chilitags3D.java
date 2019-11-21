// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.chilitags;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;

import static org.bytedeco.chilitags.global.chilitags.*;


/**
    Chilitags3D aims at recovering the 3D pose (i.e. the 3D position and the 3D
    rotation) of chilitags. It embeds a Chilitags instance to take care of the
    (2D) detection.
 */
@Name("chilitags::Chilitags3D_<float>") @NoOffset @Properties(inherit = org.bytedeco.chilitags.presets.chilitags.class)
public class Chilitags3D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Chilitags3D(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Chilitags3D(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Chilitags3D position(long position) {
        return (Chilitags3D)super.position(position);
    }


/**
    Creates an object ready to find the 3D pose of chilitags.
    <p>
    By default, Chilitags3D assumes an arbitrary, but reasonnable focal length
    (700), and expects the dimensions of the captured images. In this
    configuration, the depth estimation makes sense, but it is not accurate. In
    order to correctly estimate the 3D pose, the intrinsic calibration
    parameters of your camera needs to be provided. To do so, use the
    readCalibration() or setCalibration() methods.
    <p>
    Chilitags3D also assumes by default that the 3D pose of every detected tag
    is expected, and that every tag is independent from the others, and that
    they are 20 millimetres wide. The method read3DConfiguration() can be used
    to specify which tags are of interest, and how they are arranged on a rigid
    object, and how big they are.
    <p>
    To first detect th tags in the image, Chilitags3D creates a Chilitags
    instance, which can be accessed through the getChilitags() accessors. This
    Chilitags instance is set to have a persistence of 0, because Chilitags3D
    uses a more advanced Kalman filter. See enableFilter() and setPersistence()
    for more details.
    <p>
    You can also create yourself a separate instance of Chilitagsfor the 2D
    detection of tags and use it by calling
    Chilitags3D::estimate(const TagCornerMap &tags)
    with the output of
    Chilitags::find(const cv::Mat &inputImage)
    instead of calling directly
    Chilitags3D::estimate(const cv::Mat &inputImage).
    <p>
    @param cameraResolution Resolution of the camera used as input (640x480 by
    default). This parameter is only used to provide meaningful pose
    estimation. Input images of different resolution can be provided to the
    detection anyway. This parameter is overridden by readCalibration() or
    setCalibration().
 */
public Chilitags3D(@ByVal(nullValue = "cv::Size(640, 480)") Size cameraResolution) { super((Pointer)null); allocate(cameraResolution); }
private native void allocate(@ByVal(nullValue = "cv::Size(640, 480)") Size cameraResolution);
public Chilitags3D() { super((Pointer)null); allocate(); }
private native void allocate();

/** Accessor to the underlying (2D) Chilitags detection. */

/** Accessor to the underlying (2D) Chilitags detection. */
public native @ByRef Chilitags getChilitags();

/**
    @return a mapping of the detected objects to their transformation
    matrices. Transformation matrices are row-major and follow the standard
    convention to code the rotation and translation parameters in homogeneous
    coordinates:
    <pre>{@literal
    { r11 , r12 , r13 , tx
      r21 , r22 , r23 , ty
      r31 , r32 , r33 , tz
        0 ,   0 ,   0 ,  1 }
    }</pre>
    @param tags a list of tags, as returned by Chilitags::find().
    <p>
    @param camDeltaR Rotation from the previous camera frame to
    the current camera frame, i.e rotation of the current camera frame in the
    last camera frame. Quaternion format (scalar, vx, vy, vz).
    <p>
    @param camDeltaX Translation from the previous camera frame
    to the current camera frame, i.e position of the current camera frame in
    the last camera frame.
 */
public native @ByVal TagPoseMap estimate(@Const @ByRef TagCornerMap tags);

/**
    This is a convenience variant of estimate() which also takes care of the
    detection.
    <p>
    @return a mapping of the detected objects to their transformation
    matrices. Transformation matrices are row-major and follow the standard
    convention to code the rotation and translation parameters in homogeneous
    coordinates:
    <pre>{@literal
    { r11 , r12 , r13 , tx
      r21 , r22 , r23 , ty
      r31 , r32 , r33 , tz
        0 ,   0 ,   0 ,  1 }
    }</pre>
    <p>
    @param inputImage the image to feed to Chilitags::find().
    <p>
    @param detectionTrigger specifies how to combine tracking and
    full detection. Tracking is drastically faster, but it can at
    best return tags previously found; it won't find new ones, but
    can lose some. See Chilitags::DetectionTrigger for a description of the
    possible values.
    <p>
    @param camDeltaR Rotation from the previous camera frame to
    the current camera frame, i.e rotation of the current camera frame in the
    last camera frame. Quaternion format (scalar, vx, vy, vz).
    <p>
    @param camDeltaX Translation from the previous camera frame
    to the current camera frame, i.e position of the current camera frame in
    the last camera frame.
 */
public native @ByVal TagPoseMap estimate(
    @Const @ByRef Mat inputImage);

/**
    Chilitags3D can also detect rigid assemblies of tags. This allows for a
    more precise estimation of the object holding the tag, and for a graceful
    degradation of the estimation, should some of the tag be misdetected or
    occluded.
    <p>
    @param filenameOrString The name of the YAML configuration file (or the whole
    file itself as a string) describing rigid clusters of tags. The library is
    distributed with a sample configuration file documenting the expected format.
    <p>
    @param omitOtherTags If true, ignore the tags that are not explicitly
    listed in the configuration file. If false (default),
    Chilitags3D::estimate() estimates the 3D pose of all the detected tags. You
    can set the size of tags not described in the configuration file with
    setDefaultTagSize().
    <p>
    @param readFromString If true, will read tag configuration directly from the
    given string. If false (default) will open the file with the given name and
    try to read the configuration from there.
    <p>
    @return Whether reading the configuration was successful
 */
public native @Cast("bool") boolean readTagConfiguration(
    @StdString BytePointer filenameOrString,
    @Cast("bool") boolean omitOtherTags/*=false*/,
    @Cast("bool") boolean readFromString/*=false*/);
public native @Cast("bool") boolean readTagConfiguration(
    @StdString BytePointer filenameOrString);
public native @Cast("bool") boolean readTagConfiguration(
    @StdString String filenameOrString,
    @Cast("bool") boolean omitOtherTags/*=false*/,
    @Cast("bool") boolean readFromString/*=false*/);
public native @Cast("bool") boolean readTagConfiguration(
    @StdString String filenameOrString);

/**
    Sets the default size of tags (used to compute their 3D pose) when not
    explicitly specified with read3DConfiguration(). To be accurate, the unit
    must match the unit used for the camera calibration (usually, millimetres).
    <p>
    Note that is assumes all the tags have the same size. If tags have
    different size, you may want to list them in the configuration file (see
    read3DConfiguration()).
    <p>
    The default value of the default tag size is 20 millimetres.
 */
public native void setDefaultTagSize(float defaultSize);

/**
 * \brief Enables/disables Kalman filtering on tag pose (enabled by default)
 *
 * @param enabled Whether to enable Kalman filtering
 */
public native void enableFilter(@Cast("bool") boolean enabled);

/**
 * \brief Sets the persistence of tags against being discarded when not
 * observed (10 by default)
 *
 * @param persistence Persistence value, roughly correponds to number of frames
 */
public native void setPersistence(float persistence);

/**
 * \brief Sets the process noise covariance matrix a.k.a Q for the Kalman filter
 *
 * The state is described by (x,y,z,qw,qx,qy,qz) where x,y,z is the tag
 * position and qw,qx,qy,qz is the tag orientation in quaternion
 * representation. Therefore, the input matrix should correspond to
 * cov((x,y,z,qw,qx,qy,qz)).
 *
 * When IMU data is present, the process moves the tag according to camera
 * movement. When IMU data is not present, the process tries to keep the tag
 * still. Smaller values in the process covariance matrix causes the tags to
 * resist motion more. By default, this matrix has
 * 1e-3, 1e-3, 1e-3, 1e-4, 1e-4, 1e-4, 1e-4
 * on its diagonal.
 *
 * @param covariance 7x7 covariance matrix
 */
public native void setFilterProcessNoiseCovariance(@Const @ByRef Mat covariance);

/**
 * \brief Sets the observation noise covariance matrix a.k.a R for the Kalman filter
 *
 * The observation (done by image processing on the camera image) is described
 * by (x,y,z,qw,qx,qy,qz) where x,y,z is the tag position and qw,qx,qy,qz is
 * the tag orientation in quaternion representation. Therefore, the input
 * matrix should correspond to cov((x,y,z,qw,qx,qy,qz)).
 *
 * Larger values in the observation noise covariance matrix indicates noisier
 * measurements and causes observations to affect the state less, making tags
 * more resistant to motion. By default, this matrix has
 * 1e-3, 1e-3, 1e-1, 1e-3, 1e-2, 1e-2, 1e-5
 * on its diagonal.
 *
 * @param covariance 7x7 covariance matrix
 */
public native void setFilterObservationNoiseCovariance(@Const @ByRef Mat covariance);

/**
    For accurate results, Chilitags3D can be provided the calibration data of
    the camera detecting the chilitags.  See
    https://docs.opencv.org/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html
    for background on this topic.
    <p>
    Note that this method can be called as often as needed with a new calibration
    configuration (for instance if the user switched to another camera).
    <p>
    @param newCameraMatrix the 3x3 matrix of the camera intrinsics (see
    https://en.wikipedia.org/wiki/Camera_resectioning#Intrinsic_parameters).
    @param newDistCoeffs a vector containing the distortion coefficients.
 */
public native void setCalibration(@ByVal Mat newCameraMatrix,
                    @ByVal Mat newDistCoeffs);
public native void setCalibration(@ByVal UMat newCameraMatrix,
                    @ByVal UMat newDistCoeffs);
public native void setCalibration(@ByVal GpuMat newCameraMatrix,
                    @ByVal GpuMat newDistCoeffs);

/**
    For accurate results, Chilitags3D can be provided the calibration data of
    the camera detecting the chilitags.  See
    http://docs.opencv.org/modules/calib3d/doc/camera_calibration_and_3d_reconstruction.html
    for background on this topic.
    <p>
    Note that this method can be called as often as needed with a new calibration
    configuration (for instance if the user switched to another camera).
    <p>
    This method is similar to setCalibration, but reads the camera calibration
    information directly from a file, as generated by OpenCV's 'calibration'
    sample.
    <p>
    @param filename the path to a file containing the calibration data
    @return the size of the images used to generate the calibration data.
 */
public native @ByVal Size readCalibration(@StdString BytePointer filename);
public native @ByVal Size readCalibration(@StdString String filename);

/**
    Returns the camera matrix used for the pose estimation.
 */
public native @Const @ByRef Mat getCameraMatrix();

/**
    Returns the distortion coefficients used for the pose estimation.
 */
public native @Const @ByRef Mat getDistortionCoeffs();

}
