// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.spinnaker.Spinnaker_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.spinnaker.global.Spinnaker_C.*;


/**
* \defgroup SpinnakerDefsC Spinnaker C Definitions
* \ingroup SpinnakerC
*
* Definitions for Spinnaker C
*/
/*@{*/

/**
* \defgroup ChunkDataDefC_h Chunk Data Structures
*/
/*@{*/

/**
* \brief The type of information that can be obtained from image chunk data.
*/

@Properties(inherit = org.bytedeco.spinnaker.presets.Spinnaker_C.class)
public class spinChunkData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public spinChunkData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public spinChunkData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public spinChunkData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public spinChunkData position(long position) {
        return (spinChunkData)super.position(position);
    }
    @Override public spinChunkData getPointer(long i) {
        return new spinChunkData((Pointer)this).offsetAddress(i);
    }

    public native double m_blackLevel(); public native spinChunkData m_blackLevel(double setter);
    public native @Cast("int64_t") long m_frameID(); public native spinChunkData m_frameID(long setter);
    public native double m_exposureTime(); public native spinChunkData m_exposureTime(double setter);
    public native @Cast("int64_t") long m_compressionMode(); public native spinChunkData m_compressionMode(long setter);
    public native double m_compressionRatio(); public native spinChunkData m_compressionRatio(double setter);
    public native @Cast("int64_t") long m_timestamp(); public native spinChunkData m_timestamp(long setter);
    public native @Cast("int64_t") long m_exposureEndLineStatusAll(); public native spinChunkData m_exposureEndLineStatusAll(long setter);
    public native @Cast("int64_t") long m_width(); public native spinChunkData m_width(long setter);
    public native @Cast("int64_t") long m_image(); public native spinChunkData m_image(long setter);
    public native @Cast("int64_t") long m_height(); public native spinChunkData m_height(long setter);
    public native double m_gain(); public native spinChunkData m_gain(double setter);
    public native @Cast("int64_t") long m_sequencerSetActive(); public native spinChunkData m_sequencerSetActive(long setter);
    public native @Cast("int64_t") long m_cRC(); public native spinChunkData m_cRC(long setter);
    public native @Cast("int64_t") long m_offsetX(); public native spinChunkData m_offsetX(long setter);
    public native @Cast("int64_t") long m_offsetY(); public native spinChunkData m_offsetY(long setter);
    public native @Cast("int64_t") long m_serialDataLength(); public native spinChunkData m_serialDataLength(long setter);
    public native @Cast("int64_t") long m_partSelector(); public native spinChunkData m_partSelector(long setter);
    public native @Cast("int64_t") long m_pixelDynamicRangeMin(); public native spinChunkData m_pixelDynamicRangeMin(long setter);
    public native @Cast("int64_t") long m_pixelDynamicRangeMax(); public native spinChunkData m_pixelDynamicRangeMax(long setter);
    public native @Cast("int64_t") long m_timestampLatchValue(); public native spinChunkData m_timestampLatchValue(long setter);
    public native @Cast("int64_t") long m_lineStatusAll(); public native spinChunkData m_lineStatusAll(long setter);
    public native @Cast("int64_t") long m_counterValue(); public native spinChunkData m_counterValue(long setter);
    public native double m_timerValue(); public native spinChunkData m_timerValue(double setter);
    public native @Cast("int64_t") long m_scanLineSelector(); public native spinChunkData m_scanLineSelector(long setter);
    public native @Cast("int64_t") long m_encoderValue(); public native spinChunkData m_encoderValue(long setter);
    public native @Cast("int64_t") long m_linePitch(); public native spinChunkData m_linePitch(long setter);
    public native @Cast("int64_t") long m_transferBlockID(); public native spinChunkData m_transferBlockID(long setter);
    public native @Cast("int64_t") long m_transferQueueCurrentBlockCount(); public native spinChunkData m_transferQueueCurrentBlockCount(long setter);
    public native @Cast("int64_t") long m_streamChannelID(); public native spinChunkData m_streamChannelID(long setter);
    public native double m_scan3dCoordinateScale(); public native spinChunkData m_scan3dCoordinateScale(double setter);
    public native double m_scan3dCoordinateOffset(); public native spinChunkData m_scan3dCoordinateOffset(double setter);
    public native double m_scan3dInvalidDataValue(); public native spinChunkData m_scan3dInvalidDataValue(double setter);
    public native double m_scan3dAxisMin(); public native spinChunkData m_scan3dAxisMin(double setter);
    public native double m_scan3dAxisMax(); public native spinChunkData m_scan3dAxisMax(double setter);
    public native double m_scan3dTransformValue(); public native spinChunkData m_scan3dTransformValue(double setter);
    public native double m_scan3dCoordinateReferenceValue(); public native spinChunkData m_scan3dCoordinateReferenceValue(double setter);
    public native @Cast("int64_t") long m_inferenceFrameId(); public native spinChunkData m_inferenceFrameId(long setter);
    public native @Cast("int64_t") long m_inferenceResult(); public native spinChunkData m_inferenceResult(long setter);
    public native double m_inferenceConfidence(); public native spinChunkData m_inferenceConfidence(double setter);
}
