// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;



/**
 * \struct _NV_ENC_LOCK_BITSTREAM
 * Bitstream buffer lock parameters.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_LOCK_BITSTREAM extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_LOCK_BITSTREAM() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_LOCK_BITSTREAM(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_LOCK_BITSTREAM(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_LOCK_BITSTREAM position(long position) {
        return (NV_ENC_LOCK_BITSTREAM)super.position(position);
    }
    @Override public NV_ENC_LOCK_BITSTREAM getPointer(long i) {
        return new NV_ENC_LOCK_BITSTREAM((Pointer)this).offsetAddress(i);
    }
 
    /** [in]: Struct version. Must be set to ::NV_ENC_LOCK_BITSTREAM_VER. */
    public native @Cast("uint32_t") int version(); public native NV_ENC_LOCK_BITSTREAM version(int setter);
    /** [in]: If this flag is set, the NvEncodeAPI interface will return buffer pointer even if operation is not completed. If not set, the call will block until operation completes. */
    public native @Cast("uint32_t") @NoOffset int doNotWait(); public native NV_ENC_LOCK_BITSTREAM doNotWait(int setter);
    /** [out]: Flag indicating this frame is marked as LTR frame */
    public native @Cast("uint32_t") @NoOffset int ltrFrame(); public native NV_ENC_LOCK_BITSTREAM ltrFrame(int setter);
    /** [in]: If this flag is set then lockBitstream call will add additional intra-inter MB count and average MVX, MVY */
    public native @Cast("uint32_t") @NoOffset int getRCStats(); public native NV_ENC_LOCK_BITSTREAM getRCStats(int setter);
    /** [in]: Reserved bit fields and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reservedBitFields(); public native NV_ENC_LOCK_BITSTREAM reservedBitFields(int setter);
    /** [in]: Pointer to the bitstream buffer being locked. */
    public native Pointer outputBitstream(); public native NV_ENC_LOCK_BITSTREAM outputBitstream(Pointer setter);
    /** [in, out]: Array which receives the slice offsets. This is not supported if NV_ENC_CONFIG_H264::sliceMode is 1 on Kepler GPUs. Array size must be equal to size of frame in MBs. */
    public native @Cast("uint32_t*") IntPointer sliceOffsets(); public native NV_ENC_LOCK_BITSTREAM sliceOffsets(IntPointer setter);
    /** [out]: Frame no. for which the bitstream is being retrieved. */
    public native @Cast("uint32_t") int frameIdx(); public native NV_ENC_LOCK_BITSTREAM frameIdx(int setter); 
    /** [out]: The NvEncodeAPI interface status for the locked picture. */
    public native @Cast("uint32_t") int hwEncodeStatus(); public native NV_ENC_LOCK_BITSTREAM hwEncodeStatus(int setter);
    /** [out]: Number of slices in the encoded picture. Will be reported only if NV_ENC_INITIALIZE_PARAMS::reportSliceOffsets set to 1. */
    public native @Cast("uint32_t") int numSlices(); public native NV_ENC_LOCK_BITSTREAM numSlices(int setter);
    /** [out]: Actual number of bytes generated and copied to the memory pointed by bitstreamBufferPtr. 
                                                                         When HEVC alpha layer encoding is enabled, this field reports the total encoded size in bytes i.e it is the encoded size of the base plus the alpha layer. */
    public native @Cast("uint32_t") int bitstreamSizeInBytes(); public native NV_ENC_LOCK_BITSTREAM bitstreamSizeInBytes(int setter);
    /** [out]: Presentation timestamp associated with the encoded output. */
    public native @Cast("uint64_t") int outputTimeStamp(); public native NV_ENC_LOCK_BITSTREAM outputTimeStamp(int setter);
    /** [out]: Presentation duration associates with the encoded output. */
    public native @Cast("uint64_t") int outputDuration(); public native NV_ENC_LOCK_BITSTREAM outputDuration(int setter);
    /** [out]: Pointer to the generated output bitstream. 
                                                                         For MEOnly mode _NV_ENC_LOCK_BITSTREAM::bitstreamBufferPtr should be typecast to
                                                                         NV_ENC_H264_MV_DATA/NV_ENC_HEVC_MV_DATA pointer respectively for H264/HEVC  */
    public native Pointer bitstreamBufferPtr(); public native NV_ENC_LOCK_BITSTREAM bitstreamBufferPtr(Pointer setter);
    /** [out]: Picture type of the encoded picture. */
    public native @Cast("NV_ENC_PIC_TYPE") int pictureType(); public native NV_ENC_LOCK_BITSTREAM pictureType(int setter);
    /** [out]: Structure of the generated output picture. */
    public native @Cast("NV_ENC_PIC_STRUCT") int pictureStruct(); public native NV_ENC_LOCK_BITSTREAM pictureStruct(int setter);
    /** [out]: Average QP of the frame. */
    public native @Cast("uint32_t") int frameAvgQP(); public native NV_ENC_LOCK_BITSTREAM frameAvgQP(int setter);
    /** [out]: Total SATD cost for whole frame. */
    public native @Cast("uint32_t") int frameSatd(); public native NV_ENC_LOCK_BITSTREAM frameSatd(int setter);
    /** [out]: Frame index associated with this LTR frame. */
    public native @Cast("uint32_t") int ltrFrameIdx(); public native NV_ENC_LOCK_BITSTREAM ltrFrameIdx(int setter);
    /** [out]: Bitmap of LTR frames indices which were used for encoding this frame. Value of 0 if no LTR frames were used. */
    public native @Cast("uint32_t") int ltrFrameBitmap(); public native NV_ENC_LOCK_BITSTREAM ltrFrameBitmap(int setter);
    /** [out]: TemporalId value of the frame when using temporalSVC encoding */
    public native @Cast("uint32_t") int temporalId(); public native NV_ENC_LOCK_BITSTREAM temporalId(int setter);
    /** [in]:  Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved(int i); public native NV_ENC_LOCK_BITSTREAM reserved(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved();
    /** [out]: For H264, Number of Intra MBs in the encoded frame. For HEVC, Number of Intra CTBs in the encoded frame. Supported only if _NV_ENC_LOCK_BITSTREAM::getRCStats set to 1. */
    public native @Cast("uint32_t") int intraMBCount(); public native NV_ENC_LOCK_BITSTREAM intraMBCount(int setter);
    /** [out]: For H264, Number of Inter MBs in the encoded frame, includes skip MBs. For HEVC, Number of Inter CTBs in the encoded frame. Supported only if _NV_ENC_LOCK_BITSTREAM::getRCStats set to 1. */
    public native @Cast("uint32_t") int interMBCount(); public native NV_ENC_LOCK_BITSTREAM interMBCount(int setter);
    /** [out]: Average Motion Vector in X direction for the encoded frame. Supported only if _NV_ENC_LOCK_BITSTREAM::getRCStats set to 1. */
    public native @Cast("int32_t") int averageMVX(); public native NV_ENC_LOCK_BITSTREAM averageMVX(int setter);
    /** [out]: Average Motion Vector in y direction for the encoded frame. Supported only if _NV_ENC_LOCK_BITSTREAM::getRCStats set to 1. */
    public native @Cast("int32_t") int averageMVY(); public native NV_ENC_LOCK_BITSTREAM averageMVY(int setter);
    /** [out]: Number of bytes generated for the alpha layer in the encoded output. Applicable only when HEVC with alpha encoding is enabled. */
    public native @Cast("uint32_t") int alphaLayerSizeInBytes(); public native NV_ENC_LOCK_BITSTREAM alphaLayerSizeInBytes(int setter); 

    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_LOCK_BITSTREAM reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_LOCK_BITSTREAM reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
