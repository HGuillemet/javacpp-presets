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
 * \brief VideoEncoder node. Encodes frames into MJPEG, H264 or H265.
 */
@Namespace("dai::node") @NoOffset @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class VideoEncoder extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public VideoEncoder(Pointer p) { super(p); }

    public native @StdString @Override BytePointer getName();

    public VideoEncoder(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId) { super((Pointer)null); allocate(par, nodeId); }
    private native void allocate(@SharedPtr PipelineImpl par, @Cast("int64_t") long nodeId);

    /**
     * Input for NV12 ImgFrame to be encoded
     * Default queue is blocking with size set by 'setNumFramesPool' (4).
     */
    @MemberGetter public native @ByRef Input input();

    /**
     * Outputs ImgFrame message that carries BITSTREAM encoded (MJPEG, H264 or H265) frame data.
     */
    @MemberGetter public native @ByRef Output bitstream();

    // Sets default options for a specified size and profile
    /**
     * Sets a default preset based on specified input size, frame rate and profile
     * @param width Input frame width
     * @param height Input frame height
     * @param fps Frame rate in frames per second
     * @param profile Encoding profile
     */
    public native void setDefaultProfilePreset(int width, int height, float fps, @ByVal VideoEncoderProperties.Profile profile);

    /**
     * Sets a default preset based on specified input size, frame rate and profile
     * @param size Input frame size
     * @param fps Frame rate in frames per second
     * @param profile Encoding profile
     */
    public native void setDefaultProfilePreset(@ByVal @Cast("std::tuple<int,int>*") Pointer size, float fps, @ByVal VideoEncoderProperties.Profile profile);

    // node properties
    /**
     * Set number of frames in pool
     * @param frames Number of pool frames
     */
    public native void setNumFramesPool(int frames);

    /**
     * Get number of frames in pool
     * @return Number of pool frames
     */
    public native int getNumFramesPool();

    // encoder properties
    /** Set rate control mode */
    public native void setRateControlMode(@ByVal VideoEncoderProperties.RateControlMode mode);
    /** Set encoding profile */
    public native void setProfile(@ByVal @Cast("std::tuple<int,int>*") Pointer size, @ByVal VideoEncoderProperties.Profile profile);
    /** Set encoding profile */
    public native void setProfile(int width, int height, @ByVal VideoEncoderProperties.Profile profile);
    /** Set output bitrate in bps. Final bitrate depends on rate control mode */
    public native void setBitrate(int bitrate);
    /** Set output bitrate in kbps. Final bitrate depends on rate control mode */
    public native void setBitrateKbps(int bitrateKbps);

    /**
     * Set keyframe frequency. Every Nth frame a keyframe is inserted.
     *
     * Applicable only to H264 and H265 profiles
     *
     * Examples:
     *
     *  - 30 FPS video, keyframe frequency: 30. Every 1s a keyframe will be inserted
     *
     *  - 60 FPS video, keyframe frequency: 180. Every 3s a keyframe will be inserted
     *
     */
    public native void setKeyframeFrequency(int freq);

    /** Set number of B frames to be inserted */
    public native void setNumBFrames(int numBFrames);

    /**
     * Set quality
     * @param quality Value between 0-100%. Approximates quality
     */
    public native void setQuality(int quality);

    /**
     * Set lossless mode. Applies only to [M]JPEG profile
     * @param lossless True to enable lossless jpeg encoding, false otherwise
     */
    public native void setLossless(@Cast("bool") boolean lossless);

    /**
     * Sets expected frame rate
     * @param frameRate Frame rate in frames per second
     */
    public native void setFrameRate(float frameRate);

    /** Get rate control mode */
    public native @ByVal VideoEncoderProperties.RateControlMode getRateControlMode();
    /** Get profile */
    public native @ByVal VideoEncoderProperties.Profile getProfile();
    /** Get bitrate in bps */
    public native int getBitrate();
    /** Get bitrate in kbps */
    public native int getBitrateKbps();
    /** Get keyframe frequency */
    public native int getKeyframeFrequency();
    // int getMaxBitrate() const;
    /** Get number of B frames */
    public native int getNumBFrames();
    /** Get quality */
    public native int getQuality();
    /** Get input size */
    public native @ByVal @Cast("std::tuple<int,int>*") Pointer getSize();
    /** Get input width */
    public native int getWidth();
    /** Get input height */
    public native int getHeight();
    /** Get frame rate */
    public native float getFrameRate();
    /** Get lossless mode. Applies only when using [M]JPEG profile. */
    public native @Cast("bool") boolean getLossless();
}
