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
 * \brief IMU node for BNO08X.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class IMU extends IMUPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMU(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();

    /**
     * Constructs IMU node.
     */
    public IMU(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public IMU(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr IMUProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr IMUProperties props);

    /**
     * Outputs IMUData message that carries IMU packets.
     */
    @MemberGetter public native @ByRef Output out();

    /**
     * Enable a new IMU sensor with explicit configuration
     */
    public native void enableIMUSensor(@ByVal IMUSensorConfig sensorConfig);

    /**
     * Enable a list of IMU sensors with explicit configuration
     */

    /**
     * Enable a new IMU sensor with default configuration
     */
    public native void enableIMUSensor(IMUSensor sensor, @Cast("uint32_t") int reportRate);
    public native void enableIMUSensor(@Cast("dai::IMUSensor") int sensor, @Cast("uint32_t") int reportRate);

    /**
     * Enable a list of IMU sensors with default configuration
     */
    public native void enableIMUSensor(@StdVector @Cast("dai::IMUSensor*") IntPointer sensors, @Cast("uint32_t") int reportRate);
    public native void enableIMUSensor(@StdVector @Cast("dai::IMUSensor*") IntBuffer sensors, @Cast("uint32_t") int reportRate);
    public native void enableIMUSensor(@StdVector @Cast("dai::IMUSensor*") int[] sensors, @Cast("uint32_t") int reportRate);

    /**
     * Above this packet threshold data will be sent to host, if queue is not blocked
     */
    public native void setBatchReportThreshold(@Cast("std::int32_t") int batchReportThreshold);

    /**
     * Above this packet threshold data will be sent to host, if queue is not blocked
     */
    public native @Cast("std::int32_t") int getBatchReportThreshold();

    /**
     * Maximum number of IMU packets in a batch report
     */
    public native void setMaxBatchReports(@Cast("std::int32_t") int maxBatchReports);

    /**
     * Maximum number of IMU packets in a batch report
     */
    public native @Cast("std::int32_t") int getMaxBatchReports();

    /*
     * Whether to perform firmware update or not.
     * Default value: false.
     */
    public native void enableFirmwareUpdate(@Cast("bool") boolean enable);
}
