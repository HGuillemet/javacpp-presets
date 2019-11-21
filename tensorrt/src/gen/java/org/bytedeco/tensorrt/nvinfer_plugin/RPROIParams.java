// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer_plugin;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;

import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;


/**
 *  \brief RPROIParams is used to create the RPROIPlugin instance.
 *  It contains:
 *  @param poolingH Height of the output in pixels after ROI pooling on feature map.
 *  @param poolingW Width of the output in pixels after ROI pooling on feature map.
 *  @param featureStride Feature stride; ratio of input image size to feature map size. Assuming that max pooling layers in neural network use square filters.
 *  @param preNmsTop Number of proposals to keep before applying NMS.
 *  @param nmsMaxOut Number of remaining proposals after applying NMS.
 *  @param anchorsRatioCount Number of anchor box ratios.
 *  @param anchorsScaleCount Number of anchor box scales.
 *  @param iouThreshold IoU (Intersection over Union) threshold used for the NMS step.
 *  @param minBoxSize Minimum allowed bounding box size before scaling, used for anchor box calculation.
 *  @param spatialScale Spatial scale between the input image and the last feature map.
 *  */
@Namespace("nvinfer1::plugin") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer_plugin.class)
public class RPROIParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RPROIParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RPROIParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RPROIParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RPROIParams position(long position) {
        return (RPROIParams)super.position(position);
    }

    public native int poolingH(); public native RPROIParams poolingH(int setter);
    public native int poolingW(); public native RPROIParams poolingW(int setter);
    public native int featureStride(); public native RPROIParams featureStride(int setter);
    public native int preNmsTop(); public native RPROIParams preNmsTop(int setter);
    public native int nmsMaxOut(); public native RPROIParams nmsMaxOut(int setter);
    public native int anchorsRatioCount(); public native RPROIParams anchorsRatioCount(int setter);
    public native int anchorsScaleCount(); public native RPROIParams anchorsScaleCount(int setter);
    public native float iouThreshold(); public native RPROIParams iouThreshold(float setter);
    public native float minBoxSize(); public native RPROIParams minBoxSize(float setter);
    public native float spatialScale(); public native RPROIParams spatialScale(float setter);
}
