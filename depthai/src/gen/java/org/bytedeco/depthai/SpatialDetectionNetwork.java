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
 * \brief SpatialDetectionNetwork node. Runs a neural inference on input image and calculates spatial location data.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialDetectionNetwork extends SpatialDetectionNetworkPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialDetectionNetwork(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    /**
     * Input message with data to be inferred upon
     * Default queue is blocking with size 5
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Input message with depth data used to retrieve spatial information about detected object
     * Default queue is non-blocking with size 4
     */
    @MemberGetter public native @ByRef Input inputDepth();

    /**
     * Outputs ImgDetections message that carries parsed detection results.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Outputs mapping of detected bounding boxes relative to depth map
     *
     * Suitable for when displaying remapped bounding boxes on depth frame
     */
    @MemberGetter public native @ByRef Output boundingBoxMapping();

    /**
     * Passthrough message on which the inference was performed.
     *
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthrough();

    /**
     * Passthrough message for depth frame on which the spatial location calculation was performed.
     *
     * Suitable for when input queue is set to non-blocking behavior.
     */
    @MemberGetter public native @ByRef Output passthroughDepth();

    /**
     * Output of SpatialLocationCalculator node, which is used internally by SpatialDetectionNetwork.
     * Suitable when extra information is required from SpatialLocationCalculator node, e.g. minimum, maximum distance.
     */
    @MemberGetter public native @ByRef Output spatialLocationCalculatorOutput();

    /**
     * Specifies scale factor for detected bounding boxes.
     * @param scaleFactor Scale factor must be in the interval (0,1].
     */
    public native void setBoundingBoxScaleFactor(float scaleFactor);

    /**
     * Specifies lower threshold in depth units (millimeter by default) for depth values which will used to calculate spatial data
     * @param lowerThreshold LowerThreshold must be in the interval [0,upperThreshold] and less than upperThreshold.
     */
    public native void setDepthLowerThreshold(@Cast("uint32_t") int lowerThreshold);

    /**
     * Specifies upper threshold in depth units (millimeter by default) for depth values which will used to calculate spatial data
     * @param upperThreshold UpperThreshold must be in the interval (lowerThreshold,65535].
     */
    public native void setDepthUpperThreshold(@Cast("uint32_t") int upperThreshold);

    /**
     * Specifies spatial location calculator algorithm: Average/Min/Max
     * @param calculationAlgorithm Calculation algorithm.
     */
    public native void setSpatialCalculationAlgorithm(SpatialLocationCalculatorAlgorithm calculationAlgorithm);
    public native void setSpatialCalculationAlgorithm(@Cast("dai::SpatialLocationCalculatorAlgorithm") int calculationAlgorithm);

    /**
     * Specifies spatial location calculator step size for depth calculation.
     * Step size 1 means that every pixel is taken into calculation, size 2 means every second etc.
     * @param stepSize Step size.
     */
    public native void setSpatialCalculationStepSize(int stepSize);
}
