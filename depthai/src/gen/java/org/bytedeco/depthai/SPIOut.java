// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * \brief SPIOut node. Sends messages over SPI.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SPIOut extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SPIOut(Pointer p) { super(p); }

    public native @StdString BytePointer getName();

    public SPIOut(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);

    /**
     * Input for any type of messages to be transfered over SPI stream
     *
     * Default queue is blocking with size 8
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Specifies stream name over which the node will send data
     *
     * @param name Stream name
     */
    public native void setStreamName(@StdString BytePointer name);
    public native void setStreamName(@StdString String name);

    /**
     * Specifies SPI Bus number to use
     * @param id SPI Bus id
     */
    public native void setBusId(int id);
}
