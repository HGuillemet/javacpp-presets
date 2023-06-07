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


/** Extrinsics structure */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class Extrinsics extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Extrinsics() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Extrinsics(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Extrinsics(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Extrinsics position(long position) {
        return (Extrinsics)super.position(position);
    }
    @Override public Extrinsics getPointer(long i) {
        return new Extrinsics((Pointer)this).offsetAddress(i);
    }

    public native @ByRef FloatVectorVector rotationMatrix(); public native Extrinsics rotationMatrix(FloatVectorVector setter);
    /**
     *  (x, y, z) pose of destCameraSocket w.r.t currentCameraSocket obtained through calibration
     */
    public native @ByRef Point3f translation(); public native Extrinsics translation(Point3f setter);
    /**
     *  (x, y, z) pose of destCameraSocket w.r.t currentCameraSocket measured through CAD design
     */
    public native @ByRef Point3f specTranslation(); public native Extrinsics specTranslation(Point3f setter);
    public native CameraBoardSocket toCameraSocket(); public native Extrinsics toCameraSocket(CameraBoardSocket setter);
}
