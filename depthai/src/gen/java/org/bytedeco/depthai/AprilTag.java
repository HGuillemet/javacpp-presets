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


/**
 * AprilTag structure.
 */
@Namespace("dai") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class AprilTag extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AprilTag() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AprilTag(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AprilTag(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AprilTag position(long position) {
        return (AprilTag)super.position(position);
    }
    @Override public AprilTag getPointer(long i) {
        return new AprilTag((Pointer)this).offsetAddress(i);
    }

    /**
     * The decoded ID of the tag
     */
    public native int id(); public native AprilTag id(int setter);

    /**
     * How many error bits were corrected? Note: accepting large numbers of
     * corrected errors leads to greatly increased false positive rates.
     * As of this implementation, the detector cannot detect tags with
     * a hamming distance greater than 2.
     */
    public native int hamming(); public native AprilTag hamming(int setter);

    /**
     * A measure of the quality of the binary decoding process; the
     * average difference between the intensity of a data bit versus
     * the decision threshold. Higher numbers roughly indicate better
     * decodes. This is a reasonable measure of detection accuracy
     * only for very small tags-- not effective for larger tags (where
     * we could have sampled anywhere within a bit cell and still
     * gotten a good detection.
     */
    public native float decisionMargin(); public native AprilTag decisionMargin(float setter);

    /**
     * The detected top left coordinates.
     */
    public native @ByRef Point2f topLeft(); public native AprilTag topLeft(Point2f setter);

    /**
     * The detected top right coordinates.
     */
    public native @ByRef Point2f topRight(); public native AprilTag topRight(Point2f setter);

    /**
     * The detected bottom right coordinates.
     */
    public native @ByRef Point2f bottomRight(); public native AprilTag bottomRight(Point2f setter);

    /**
     * The detected bottom left coordinates.
     */
    public native @ByRef Point2f bottomLeft(); public native AprilTag bottomLeft(Point2f setter);
}
