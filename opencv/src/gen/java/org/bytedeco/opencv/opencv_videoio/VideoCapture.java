// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_videoio;

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

import static org.bytedeco.opencv.global.opencv_videoio.*;

/** \endcond IGNORED
<p>
/** \brief Class for video capturing from video files, image sequences or cameras.
<p>
The class provides C++ API for capturing video from cameras or for reading video files and image sequences.
<p>
Here is how the class can be used:
\include samples/cpp/videocapture_basic.cpp
<p>
\note In \ref videoio_c "C API" the black-box structure {@code CvCapture} is used instead of %VideoCapture.
\note
-   (C++) A basic sample on using the %VideoCapture interface can be found at
    {@code OPENCV_SOURCE_CODE/samples/cpp/videocapture_starter.cpp}
-   (Python) A basic sample on using the %VideoCapture interface can be found at
    {@code OPENCV_SOURCE_CODE/samples/python/video.py}
-   (Python) A multi threaded video processing sample can be found at
    {@code OPENCV_SOURCE_CODE/samples/python/video_threaded.py}
-   (Python) %VideoCapture sample showcasing some features of the Video4Linux2 backend
    {@code OPENCV_SOURCE_CODE/samples/python/video_v4l2.py}
 */
@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_videoio.class)
public class VideoCapture extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoCapture(Pointer p) { super(p); }

    /** \brief Default constructor
    \note In \ref videoio_c "C API", when you finished working with video, release CvCapture structure with
    cvReleaseCapture(), or use Ptr\<CvCapture\> that calls cvReleaseCapture() automatically in the
    destructor.
     */
    public VideoCapture() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** \overload
    \brief  Opens a video file or a capturing device or an IP video stream for video capturing with API Preference
    <p>
    @param filename it can be:
    - name of video file (eg. {@code video.avi})
    - or image sequence (eg. {@code img_%02d.jpg}, which will read samples like {@code img_00.jpg, img_01.jpg, img_02.jpg, ...})
    - or URL of video stream (eg. {@code protocol://host:port/script_name?script_params|auth})
    - or GStreamer pipeline string in gst-launch tool format in case if GStreamer is used as backend
      Note that each video stream or IP camera feed has its own URL scheme. Please refer to the
      documentation of source stream to know the right URL.
    @param apiPreference preferred Capture API backends to use. Can be used to enforce a specific reader
    implementation if multiple are available: e.g. cv::CAP_FFMPEG or cv::CAP_IMAGES or cv::CAP_DSHOW.
    <p>
    @see cv::VideoCaptureAPIs
    */
    public VideoCapture(@Str BytePointer filename, int apiPreference/*=cv::CAP_ANY*/) { super((Pointer)null); allocate(filename, apiPreference); }
    private native void allocate(@Str BytePointer filename, int apiPreference/*=cv::CAP_ANY*/);
    public VideoCapture(@Str BytePointer filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str BytePointer filename);
    public VideoCapture(@Str String filename, int apiPreference/*=cv::CAP_ANY*/) { super((Pointer)null); allocate(filename, apiPreference); }
    private native void allocate(@Str String filename, int apiPreference/*=cv::CAP_ANY*/);
    public VideoCapture(@Str String filename) { super((Pointer)null); allocate(filename); }
    private native void allocate(@Str String filename);

    /** \overload
    \brief Opens a video file or a capturing device or an IP video stream for video capturing with API Preference and parameters
    <p>
    The {@code params} parameter allows to specify extra parameters encoded as pairs {@code (paramId_1, paramValue_1, paramId_2, paramValue_2, ...)}.
    See cv::VideoCaptureProperties
    */
    public VideoCapture(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params) { super((Pointer)null); allocate(filename, apiPreference, params); }
    private native void allocate(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params);
    public VideoCapture(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params) { super((Pointer)null); allocate(filename, apiPreference, params); }
    private native void allocate(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params);
    public VideoCapture(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params) { super((Pointer)null); allocate(filename, apiPreference, params); }
    private native void allocate(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params);
    public VideoCapture(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params) { super((Pointer)null); allocate(filename, apiPreference, params); }
    private native void allocate(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params);
    public VideoCapture(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params) { super((Pointer)null); allocate(filename, apiPreference, params); }
    private native void allocate(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params);
    public VideoCapture(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params) { super((Pointer)null); allocate(filename, apiPreference, params); }
    private native void allocate(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params);

    /** \overload
    \brief  Opens a camera for video capturing
    <p>
    @param index id of the video capturing device to open. To open default camera using default backend just pass 0.
    (to backward compatibility usage of camera_id + domain_offset (CAP_*) is valid when apiPreference is CAP_ANY)
    @param apiPreference preferred Capture API backends to use. Can be used to enforce a specific reader
    implementation if multiple are available: e.g. cv::CAP_DSHOW or cv::CAP_MSMF or cv::CAP_V4L.
    <p>
    @see cv::VideoCaptureAPIs
    */
    public VideoCapture(int index, int apiPreference/*=cv::CAP_ANY*/) { super((Pointer)null); allocate(index, apiPreference); }
    private native void allocate(int index, int apiPreference/*=cv::CAP_ANY*/);
    public VideoCapture(int index) { super((Pointer)null); allocate(index); }
    private native void allocate(int index);

    /** \overload
    \brief Opens a camera for video capturing with API Preference and parameters
    <p>
    The {@code params} parameter allows to specify extra parameters encoded as pairs {@code (paramId_1, paramValue_1, paramId_2, paramValue_2, ...)}.
    See cv::VideoCaptureProperties
    */
    public VideoCapture(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params) { super((Pointer)null); allocate(index, apiPreference, params); }
    private native void allocate(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params);
    public VideoCapture(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params) { super((Pointer)null); allocate(index, apiPreference, params); }
    private native void allocate(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params);
    public VideoCapture(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params) { super((Pointer)null); allocate(index, apiPreference, params); }
    private native void allocate(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params);

    /** \brief Default destructor
    <p>
    The method first calls VideoCapture::release to close the already opened file or camera.
    */

    /** \brief  Opens a video file or a capturing device or an IP video stream for video capturing.
    <p>
    \overload
    <p>
    Parameters are same as the constructor VideoCapture(const String& filename, int apiPreference = CAP_ANY)
    @return {@code true} if the file has been successfully opened
    <p>
    The method first calls VideoCapture::release to close the already opened file or camera.
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference/*=cv::CAP_ANY*/);
    public native @Cast("bool") boolean open(@Str BytePointer filename);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference/*=cv::CAP_ANY*/);
    public native @Cast("bool") boolean open(@Str String filename);

    /** \brief  Opens a video file or a capturing device or an IP video stream for video capturing with API Preference and parameters
    <p>
    \overload
    <p>
    The {@code params} parameter allows to specify extra parameters encoded as pairs {@code (paramId_1, paramValue_1, paramId_2, paramValue_2, ...)}.
    See cv::VideoCaptureProperties
    <p>
    @return {@code true} if the file has been successfully opened
    <p>
    The method first calls VideoCapture::release to close the already opened file or camera.
     */
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params);
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params);
    public native @Cast("bool") boolean open(@Str BytePointer filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params);
    public native @Cast("bool") boolean open(@Str String filename, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params);

    /** \brief  Opens a camera for video capturing
    <p>
    \overload
    <p>
    Parameters are same as the constructor VideoCapture(int index, int apiPreference = CAP_ANY)
    @return {@code true} if the camera has been successfully opened.
    <p>
    The method first calls VideoCapture::release to close the already opened file or camera.
    */
    public native @Cast("bool") boolean open(int index, int apiPreference/*=cv::CAP_ANY*/);
    public native @Cast("bool") boolean open(int index);

    /** \brief  Opens a camera for video capturing with API Preference and parameters
    <p>
    \overload
    <p>
    The {@code params} parameter allows to specify extra parameters encoded as pairs {@code (paramId_1, paramValue_1, paramId_2, paramValue_2, ...)}.
    See cv::VideoCaptureProperties
    <p>
    @return {@code true} if the camera has been successfully opened.
    <p>
    The method first calls VideoCapture::release to close the already opened file or camera.
    */
    public native @Cast("bool") boolean open(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntPointer params);
    public native @Cast("bool") boolean open(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) IntBuffer params);
    public native @Cast("bool") boolean open(int index, int apiPreference, @StdVector @Cast({"int*", "std::vector<int>&"}) int[] params);

    /** \brief Returns true if video capturing has been initialized already.
    <p>
    If the previous call to VideoCapture constructor or VideoCapture::open() succeeded, the method returns
    true.
     */
    public native @Cast("bool") boolean isOpened();

    /** \brief Closes video file or capturing device.
    <p>
    The method is automatically called by subsequent VideoCapture::open and by VideoCapture
    destructor.
    <p>
    The C function also deallocates memory and clears \*capture pointer.
     */
    public native void release();

    /** \brief Grabs the next frame from video file or capturing device.
    <p>
    @return {@code true} (non-zero) in the case of success.
    <p>
    The method/function grabs the next frame from video file or camera and returns true (non-zero) in
    the case of success.
    <p>
    The primary use of the function is in multi-camera environments, especially when the cameras do not
    have hardware synchronization. That is, you call VideoCapture::grab() for each camera and after that
    call the slower method VideoCapture::retrieve() to decode and get frame from each camera. This way
    the overhead on demosaicing or motion jpeg decompression etc. is eliminated and the retrieved frames
    from different cameras will be closer in time.
    <p>
    Also, when a connected camera is multi-head (for example, a stereo camera or a Kinect device), the
    correct way of retrieving data from it is to call VideoCapture::grab() first and then call
    VideoCapture::retrieve() one or more times with different values of the channel parameter.
    <p>
    \ref tutorial_kinect_openni
     */
    public native @Cast("bool") boolean grab();

    /** \brief Decodes and returns the grabbed video frame.
    <p>
    @param image [out] the video frame is returned here. If no frames has been grabbed the image will be empty.
    @param flag it could be a frame index or a driver specific flag
    @return {@code false} if no frames has been grabbed
    <p>
    The method decodes and returns the just grabbed frame. If no frames has been grabbed
    (camera has been disconnected, or there are no more frames in video file), the method returns false
    and the function returns an empty image (with %cv::Mat, test it with Mat::empty()).
    <p>
    @see read()
    <p>
    \note In \ref videoio_c "C API", functions cvRetrieveFrame() and cv.RetrieveFrame() return image stored inside the video
    capturing structure. It is not allowed to modify or release the image! You can copy the frame using
    cvCloneImage and then do whatever you want with the copy.
     */
    public native @Cast("bool") boolean retrieve(@ByVal Mat image, int flag/*=0*/);
    public native @Cast("bool") boolean retrieve(@ByVal Mat image);
    public native @Cast("bool") boolean retrieve(@ByVal UMat image, int flag/*=0*/);
    public native @Cast("bool") boolean retrieve(@ByVal UMat image);
    public native @Cast("bool") boolean retrieve(@ByVal GpuMat image, int flag/*=0*/);
    public native @Cast("bool") boolean retrieve(@ByVal GpuMat image);

    /** \brief Stream operator to read the next video frame.
    @see read()
    */
    public native @ByRef @Name("operator >>") VideoCapture shiftRight(@ByRef Mat image);

    /** \overload
    @see read()
    */
    public native @ByRef @Name("operator >>") VideoCapture shiftRight(@ByRef UMat image);

    /** \brief Grabs, decodes and returns the next video frame.
    <p>
    @param image [out] the video frame is returned here. If no frames has been grabbed the image will be empty.
    @return {@code false} if no frames has been grabbed
    <p>
    The method/function combines VideoCapture::grab() and VideoCapture::retrieve() in one call. This is the
    most convenient method for reading video files or capturing data from decode and returns the just
    grabbed frame. If no frames has been grabbed (camera has been disconnected, or there are no more
    frames in video file), the method returns false and the function returns empty image (with %cv::Mat, test it with Mat::empty()).
    <p>
    \note In \ref videoio_c "C API", functions cvRetrieveFrame() and cv.RetrieveFrame() return image stored inside the video
    capturing structure. It is not allowed to modify or release the image! You can copy the frame using
    cvCloneImage and then do whatever you want with the copy.
     */
    public native @Cast("bool") boolean read(@ByVal Mat image);
    public native @Cast("bool") boolean read(@ByVal UMat image);
    public native @Cast("bool") boolean read(@ByVal GpuMat image);

    /** \brief Sets a property in the VideoCapture.
    <p>
    @param propId Property identifier from cv::VideoCaptureProperties (eg. cv::CAP_PROP_POS_MSEC, cv::CAP_PROP_POS_FRAMES, ...)
    or one from \ref videoio_flags_others
    @param value Value of the property.
    @return {@code true} if the property is supported by backend used by the VideoCapture instance.
    \note Even if it returns {@code true} this doesn't ensure that the property
    value has been accepted by the capture device. See note in VideoCapture::get()
     */
    public native @Cast("bool") boolean set(int propId, double value);

    /** \brief Returns the specified VideoCapture property
    <p>
    @param propId Property identifier from cv::VideoCaptureProperties (eg. cv::CAP_PROP_POS_MSEC, cv::CAP_PROP_POS_FRAMES, ...)
    or one from \ref videoio_flags_others
    @return Value for the specified property. Value 0 is returned when querying a property that is
    not supported by the backend used by the VideoCapture instance.
    <p>
    \note Reading / writing properties involves many layers. Some unexpected result might happens
    along this chain.
    <pre>{@code {.txt}
    VideoCapture -> API Backend -> Operating System -> Device Driver -> Device Hardware
    }</pre>
    The returned value might be different from what really used by the device or it could be encoded
    using device dependent rules (eg. steps or percentage). Effective behaviour depends from device
    driver and API Backend
    <p>
    */
    public native double get(int propId);

    /** \brief Returns used backend API name
     <p>
     \note Stream should be opened.
     */
    public native @Str BytePointer getBackendName();

    /** Switches exceptions mode
     *
     * methods raise exceptions if not successful instead of returning an error code
     */
    public native void setExceptionMode(@Cast("bool") boolean enable);

    /** query if exception mode is active */
    public native @Cast("bool") boolean getExceptionMode();


    /** \brief Wait for ready frames from VideoCapture.
    <p>
    @param streams input video streams
    @param readyIndex stream indexes with grabbed frames (ready to use .retrieve() to fetch actual frame)
    @param timeoutNs number of nanoseconds (0 - infinite)
    @return {@code true} if streamReady is not empty
    <p>
    @throws Exception %Exception on stream errors (check .isOpened() to filter out malformed streams) or VideoCapture type is not supported
    <p>
    The primary use of the function is in multi-camera environments.
    The method fills the ready state vector, grabs video frame, if camera is ready.
    <p>
    After this call use VideoCapture::retrieve() to decode and fetch frame data.
    */
    public static native @Cast("bool") boolean waitAny(
                @StdVector VideoCapture streams,
                @StdVector @ByRef IntPointer readyIndex,
                @Cast("int64") long timeoutNs/*=0*/);
    public static native @Cast("bool") boolean waitAny(
                @StdVector VideoCapture streams,
                @StdVector @ByRef IntPointer readyIndex);
    public static native @Cast("bool") boolean waitAny(
                @StdVector VideoCapture streams,
                @StdVector @ByRef IntBuffer readyIndex,
                @Cast("int64") long timeoutNs/*=0*/);
    public static native @Cast("bool") boolean waitAny(
                @StdVector VideoCapture streams,
                @StdVector @ByRef IntBuffer readyIndex);
    public static native @Cast("bool") boolean waitAny(
                @StdVector VideoCapture streams,
                @StdVector @ByRef int[] readyIndex,
                @Cast("int64") long timeoutNs/*=0*/);
    public static native @Cast("bool") boolean waitAny(
                @StdVector VideoCapture streams,
                @StdVector @ByRef int[] readyIndex);
}
