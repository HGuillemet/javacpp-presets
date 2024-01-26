// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


/** StereoRectification structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class StereoRectification extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StereoRectification() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StereoRectification(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StereoRectification(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StereoRectification position(long position) {
        return (StereoRectification)super.position(position);
    }
    @Override public StereoRectification getPointer(long i) {
        return new StereoRectification((Pointer)this).offsetAddress(i);
    }

    public native @ByRef FloatVectorVector rectifiedRotationLeft(); public native StereoRectification rectifiedRotationLeft(FloatVectorVector setter);
    public native @ByRef FloatVectorVector rectifiedRotationRight(); public native StereoRectification rectifiedRotationRight(FloatVectorVector setter);
    public native CameraBoardSocket leftCameraSocket(); public native StereoRectification leftCameraSocket(CameraBoardSocket setter);
    public native CameraBoardSocket rightCameraSocket(); public native StereoRectification rightCameraSocket(CameraBoardSocket setter);
}
