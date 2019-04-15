// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_aruco;

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

import static org.bytedeco.opencv.global.opencv_aruco.*;


/** \addtogroup aruco
 *  \{
<p>
<p>
/**
 * \brief Dictionary/Set of markers. It contains the inner codification
 *
 * bytesList contains the marker codewords where
 * - bytesList.rows is the dictionary size
 * - each marker is encoded using {@code nbytes = ceil(markerSize*markerSize/8.)}
 * - each row contains all 4 rotations of the marker, so its length is {@code 4*nbytes}
 *
 * {@code bytesList.ptr(i)[k*nbytes + j]} is then the j-th byte of i-th marker, in its k-th rotation.
 */
@Namespace("cv::aruco") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_aruco.class)
public class Dictionary extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dictionary(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dictionary(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Dictionary position(long position) {
        return (Dictionary)super.position(position);
    }

    public native @ByRef Mat bytesList(); public native Dictionary bytesList(Mat setter);         // marker code information
    public native int markerSize(); public native Dictionary markerSize(int setter);        // number of bits per dimension
    public native int maxCorrectionBits(); public native Dictionary maxCorrectionBits(int setter); // maximum number of bits that can be corrected


    /**
      */
    public Dictionary(@Const @ByRef(nullValue = "cv::Mat()") Mat _bytesList, int _markerSize/*=0*/, int _maxcorr/*=0*/) { super((Pointer)null); allocate(_bytesList, _markerSize, _maxcorr); }
    private native void allocate(@Const @ByRef(nullValue = "cv::Mat()") Mat _bytesList, int _markerSize/*=0*/, int _maxcorr/*=0*/);
    public Dictionary() { super((Pointer)null); allocate(); }
    private native void allocate();


    /**
    Dictionary(const Dictionary &_dictionary);
    */


    /**
      */
    public Dictionary(@Ptr Dictionary _dictionary) { super((Pointer)null); allocate(_dictionary); }
    private native void allocate(@Ptr Dictionary _dictionary);


    /**
     * @see generateCustomDictionary
     */
    public static native @Ptr Dictionary create(int nMarkers, int markerSize, int randomSeed/*=0*/);
    public static native @Ptr Dictionary create(int nMarkers, int markerSize);


    /**
     * @see generateCustomDictionary
     */
    public static native @Ptr @Name("create") Dictionary create_from(int nMarkers, int markerSize,
                @Ptr Dictionary baseDictionary, int randomSeed/*=0*/);
    public static native @Ptr @Name("create") Dictionary create_from(int nMarkers, int markerSize,
                @Ptr Dictionary baseDictionary);

    /**
     * @see getPredefinedDictionary
     */
    public static native @Ptr Dictionary get(int dict);

    /**
     * \brief Given a matrix of bits. Returns whether if marker is identified or not.
     * It returns by reference the correct id (if any) and the correct rotation
     */
    public native @Cast("bool") boolean identify(@Const @ByRef Mat onlyBits, @ByRef IntPointer idx, @ByRef IntPointer rotation, double maxCorrectionRate);
    public native @Cast("bool") boolean identify(@Const @ByRef Mat onlyBits, @ByRef IntBuffer idx, @ByRef IntBuffer rotation, double maxCorrectionRate);
    public native @Cast("bool") boolean identify(@Const @ByRef Mat onlyBits, @ByRef int[] idx, @ByRef int[] rotation, double maxCorrectionRate);

    /**
      * \brief Returns the distance of the input bits to the specific id. If allRotations is true,
      * the four posible bits rotation are considered
      */
    public native int getDistanceToId(@ByVal Mat bits, int id, @Cast("bool") boolean allRotations/*=true*/);
    public native int getDistanceToId(@ByVal Mat bits, int id);
    public native int getDistanceToId(@ByVal UMat bits, int id, @Cast("bool") boolean allRotations/*=true*/);
    public native int getDistanceToId(@ByVal UMat bits, int id);
    public native int getDistanceToId(@ByVal GpuMat bits, int id, @Cast("bool") boolean allRotations/*=true*/);
    public native int getDistanceToId(@ByVal GpuMat bits, int id);


    /**
     * \brief Draw a canonical marker image
     */
    public native void drawMarker(int id, int sidePixels, @ByVal Mat _img, int borderBits/*=1*/);
    public native void drawMarker(int id, int sidePixels, @ByVal Mat _img);
    public native void drawMarker(int id, int sidePixels, @ByVal UMat _img, int borderBits/*=1*/);
    public native void drawMarker(int id, int sidePixels, @ByVal UMat _img);
    public native void drawMarker(int id, int sidePixels, @ByVal GpuMat _img, int borderBits/*=1*/);
    public native void drawMarker(int id, int sidePixels, @ByVal GpuMat _img);


    /**
      * \brief Transform matrix of bits to list of bytes in the 4 rotations
      */
    public static native @ByVal Mat getByteListFromBits(@Const @ByRef Mat bits);


    /**
      * \brief Transform list of bytes to matrix of bits
      */
    public static native @ByVal Mat getBitsFromByteList(@Const @ByRef Mat byteList, int markerSize);
}
