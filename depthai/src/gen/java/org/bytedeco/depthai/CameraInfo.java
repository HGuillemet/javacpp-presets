// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

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

import static org.bytedeco.depthai.global.depthai.*;


/** CameraInfo structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class CameraInfo extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CameraInfo() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CameraInfo(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CameraInfo(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CameraInfo position(long position) {
        return (CameraInfo)super.position(position);
    }
    @Override public CameraInfo getPointer(long i) {
        return new CameraInfo((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint16_t") short width(); public native CameraInfo width(short setter);
    public native @Cast("uint16_t") short height(); public native CameraInfo height(short setter);
    public native @Cast("uint8_t") byte lensPosition(); public native CameraInfo lensPosition(byte setter);
    public native @ByRef FloatVectorVector intrinsicMatrix(); public native CameraInfo intrinsicMatrix(FloatVectorVector setter);
    public native @StdVector FloatPointer distortionCoeff(); public native CameraInfo distortionCoeff(FloatPointer setter);
    public native @ByRef Extrinsics extrinsics(); public native CameraInfo extrinsics(Extrinsics setter);
    public native float specHfovDeg(); public native CameraInfo specHfovDeg(float setter);  // fov in deg
    public native CameraModel cameraType(); public native CameraInfo cameraType(CameraModel setter);
}
