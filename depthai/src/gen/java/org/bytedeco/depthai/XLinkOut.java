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
 * \brief XLinkOut node. Sends messages over XLink.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class XLinkOut extends XLinkOutPropertiesNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XLinkOut(Pointer p) { super(p); }

    @MemberGetter public static native @Cast("const char*") BytePointer NAME();
    public XLinkOut(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);
    public XLinkOut(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr XLinkOutProperties props) { super((Pointer)null); allocate(par, nodeId, props); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId, @UniquePtr XLinkOutProperties props);

    /**
     * Input for any type of messages to be transferred over XLink stream
     *
     * Default queue is blocking with size 8
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Specifies XLink stream name to use.
     *
     * The name should not start with double underscores '__',
     * as those are reserved for internal use.
     * @param name Stream name
     */
    public native void setStreamName(@StdString BytePointer name);
    public native void setStreamName(@StdString ByteBuffer name);
    public native void setStreamName(@StdString String name);

    /**
     * Specifies a message sending limit. It's approximated from specified rate.
     *
     * @param fps Approximate rate limit in messages per second
     */
    public native void setFpsLimit(float fps);

    /**
     * Specify whether to transfer only messages attributes and not buffer data
     */
    public native void setMetadataOnly(@Cast("bool") boolean metadataOnly);

    /** Get stream name */
    public native @StdString BytePointer getStreamName();
    /** Get rate limit in messages per second */
    public native float getFpsLimit();
    /** Get whether to transfer only messages attributes and not buffer data */
    public native @Cast("bool") boolean getMetadataOnly();
}
