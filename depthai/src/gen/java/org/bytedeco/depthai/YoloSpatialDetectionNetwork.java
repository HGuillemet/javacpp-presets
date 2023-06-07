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


/**
 * YoloSpatialDetectionNetwork node. Yolo-based network with spatial location data.
 */
@Namespace("dai::node") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class YoloSpatialDetectionNetwork extends YoloSpatialDetectionNetworkPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public YoloSpatialDetectionNetwork(Pointer p) { super(p); }

    public YoloSpatialDetectionNetwork(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);

    /** Set num classes */
    public native void setNumClasses(int numClasses);
    /** Set coordianate size */
    public native void setCoordinateSize(int coordinates);
    /** Set anchors */
    public native void setAnchors(@StdVector FloatPointer anchors);
    public native void setAnchors(@StdVector FloatBuffer anchors);
    public native void setAnchors(@StdVector float[] anchors);
    /** Set anchor masks */
    public native void setAnchorMasks(@ByVal StringIntVectorMap anchorMasks);
    /** Set Iou threshold */
    public native void setIouThreshold(float thresh);

    /** Get num classes */
    public native int getNumClasses();
    /** Get coordianate size */
    public native int getCoordinateSize();
    /** Get anchors */
    public native @StdVector FloatPointer getAnchors();
    /** Get anchor masks */
    public native @ByVal StringIntVectorMap getAnchorMasks();
    /** Get Iou threshold */
    public native float getIouThreshold();
}
