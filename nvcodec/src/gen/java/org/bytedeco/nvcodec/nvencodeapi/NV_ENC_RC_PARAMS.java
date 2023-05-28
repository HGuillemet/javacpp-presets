// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * Rate Control Configuration Parameters
 */
 @Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_RC_PARAMS extends Pointer {
     static { Loader.load(); }
     /** Default native constructor. */
     public NV_ENC_RC_PARAMS() { super((Pointer)null); allocate(); }
     /** Native array allocator. Access with {@link Pointer#position(long)}. */
     public NV_ENC_RC_PARAMS(long size) { super((Pointer)null); allocateArray(size); }
     /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
     public NV_ENC_RC_PARAMS(Pointer p) { super(p); }
     private native void allocate();
     private native void allocateArray(long size);
     @Override public NV_ENC_RC_PARAMS position(long position) {
         return (NV_ENC_RC_PARAMS)super.position(position);
     }
     @Override public NV_ENC_RC_PARAMS getPointer(long i) {
         return new NV_ENC_RC_PARAMS((Pointer)this).offsetAddress(i);
     }
 
    public native @Cast("uint32_t") int version(); public native NV_ENC_RC_PARAMS version(int setter);
    /** [in]: Specifies the rate control mode. Check support for various rate control modes using ::NV_ENC_CAPS_SUPPORTED_RATECONTROL_MODES caps. */
    public native @Cast("NV_ENC_PARAMS_RC_MODE") int rateControlMode(); public native NV_ENC_RC_PARAMS rateControlMode(int setter);
    /** [in]: Specifies the initial QP to be used for encoding, these values would be used for all frames if in Constant QP mode. */
    public native @ByRef NV_ENC_QP constQP(); public native NV_ENC_RC_PARAMS constQP(NV_ENC_QP setter);
    /** [in]: Specifies the average bitrate(in bits/sec) used for encoding. */
    public native @Cast("uint32_t") int averageBitRate(); public native NV_ENC_RC_PARAMS averageBitRate(int setter);
    /** [in]: Specifies the maximum bitrate for the encoded output. This is used for VBR and ignored for CBR mode. */
    public native @Cast("uint32_t") int maxBitRate(); public native NV_ENC_RC_PARAMS maxBitRate(int setter);
    /** [in]: Specifies the VBV(HRD) buffer size. in bits. Set 0 to use the default VBV  buffer size. */
    public native @Cast("uint32_t") int vbvBufferSize(); public native NV_ENC_RC_PARAMS vbvBufferSize(int setter);
    /** [in]: Specifies the VBV(HRD) initial delay in bits. Set 0 to use the default VBV  initial delay .*/
    public native @Cast("uint32_t") int vbvInitialDelay(); public native NV_ENC_RC_PARAMS vbvInitialDelay(int setter);
    /** [in]: Set this to 1 if minimum QP used for rate control. */
    public native @Cast("uint32_t") @NoOffset int enableMinQP(); public native NV_ENC_RC_PARAMS enableMinQP(int setter);
    /** [in]: Set this to 1 if maximum QP used for rate control. */
    public native @Cast("uint32_t") @NoOffset int enableMaxQP(); public native NV_ENC_RC_PARAMS enableMaxQP(int setter);
    /** [in]: Set this to 1 if user supplied initial QP is used for rate control. */
    public native @Cast("uint32_t") @NoOffset int enableInitialRCQP(); public native NV_ENC_RC_PARAMS enableInitialRCQP(int setter);
    /** [in]: Set this to 1 to enable adaptive quantization (Spatial). */
    public native @Cast("uint32_t") @NoOffset int enableAQ(); public native NV_ENC_RC_PARAMS enableAQ(int setter);
    /** [in]: Reserved bitfields and must be set to 0. */
    public native @Cast("uint32_t") @NoOffset int reservedBitField1(); public native NV_ENC_RC_PARAMS reservedBitField1(int setter);
    /** [in]: Set this to 1 to enable lookahead with depth <lookaheadDepth> (if lookahead is enabled, input frames must remain available to the encoder until encode completion) */
    public native @Cast("uint32_t") @NoOffset int enableLookahead(); public native NV_ENC_RC_PARAMS enableLookahead(int setter);
    /** [in]: Set this to 1 to disable adaptive I-frame insertion at scene cuts (only has an effect when lookahead is enabled) */
    public native @Cast("uint32_t") @NoOffset int disableIadapt(); public native NV_ENC_RC_PARAMS disableIadapt(int setter);
    /** [in]: Set this to 1 to disable adaptive B-frame decision (only has an effect when lookahead is enabled) */
    public native @Cast("uint32_t") @NoOffset int disableBadapt(); public native NV_ENC_RC_PARAMS disableBadapt(int setter);
    /** [in]: Set this to 1 to enable temporal AQ */
    public native @Cast("uint32_t") @NoOffset int enableTemporalAQ(); public native NV_ENC_RC_PARAMS enableTemporalAQ(int setter);
    /** [in]: Set this to 1 to indicate zero latency operation (no reordering delay, num_reorder_frames=0) */
    public native @Cast("uint32_t") @NoOffset int zeroReorderDelay(); public native NV_ENC_RC_PARAMS zeroReorderDelay(int setter);
    /** [in]: Set this to 1 to enable automatic insertion of non-reference P-frames (no effect if enablePTD=0) */
    public native @Cast("uint32_t") @NoOffset int enableNonRefP(); public native NV_ENC_RC_PARAMS enableNonRefP(int setter);
    /** [in]: Set this to 1 to minimize GOP-to-GOP rate fluctuations */
    public native @Cast("uint32_t") @NoOffset int strictGOPTarget(); public native NV_ENC_RC_PARAMS strictGOPTarget(int setter);
    /** [in]: When AQ (Spatial) is enabled (i.e. NV_ENC_RC_PARAMS::enableAQ is set), this field is used to specify AQ strength. AQ strength scale is from 1 (low) - 15 (aggressive).
                                                                                                If not set, strength is auto selected by driver. */
    public native @Cast("uint32_t") @NoOffset int aqStrength(); public native NV_ENC_RC_PARAMS aqStrength(int setter);
    /** [in]: Set this to 1 to enable lookahead externally. 
                                                                                                Application must call NvEncLookahead() for NV_ENC_RC_PARAMS::lookaheadDepth number of frames,
                                                                                                before calling NvEncEncodePicture() for the first frame */
    public native @Cast("uint32_t") @NoOffset int enableExtLookahead(); public native NV_ENC_RC_PARAMS enableExtLookahead(int setter);
    /** [in]: Reserved bitfields and must be set to 0 */
    public native @Cast("uint32_t") @NoOffset int reservedBitFields(); public native NV_ENC_RC_PARAMS reservedBitFields(int setter);
    /** [in]: Specifies the minimum QP used for rate control. Client must set NV_ENC_CONFIG::enableMinQP to 1. */
    public native @ByRef NV_ENC_QP minQP(); public native NV_ENC_RC_PARAMS minQP(NV_ENC_QP setter);
    /** [in]: Specifies the maximum QP used for rate control. Client must set NV_ENC_CONFIG::enableMaxQP to 1. */
    public native @ByRef NV_ENC_QP maxQP(); public native NV_ENC_RC_PARAMS maxQP(NV_ENC_QP setter);
    /** [in]: Specifies the initial QP hint used for rate control. The parameter is just used as hint to influence the QP difference between I,P and B frames.
                                                                                                Client must set NV_ENC_CONFIG::enableInitialRCQP to 1. */
    public native @ByRef NV_ENC_QP initialRCQP(); public native NV_ENC_RC_PARAMS initialRCQP(NV_ENC_QP setter);
    /** [in]: Specifies the temporal layers (as a bitmask) whose QPs have changed. Valid max bitmask is [2^NV_ENC_CAPS_NUM_MAX_TEMPORAL_LAYERS - 1].
                                                                                                Applicable only for constant QP mode (NV_ENC_RC_PARAMS::rateControlMode = NV_ENC_PARAMS_RC_CONSTQP). */
    public native @Cast("uint32_t") int temporallayerIdxMask(); public native NV_ENC_RC_PARAMS temporallayerIdxMask(int setter);
    /** [in]: Specifies the temporal layer QPs used for rate control. Temporal layer index is used as the array index.
                                                                                                Applicable only for constant QP mode (NV_ENC_RC_PARAMS::rateControlMode = NV_ENC_PARAMS_RC_CONSTQP). */
    public native @Cast("uint8_t") byte temporalLayerQP(int i); public native NV_ENC_RC_PARAMS temporalLayerQP(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer temporalLayerQP();
    /** [in]: Target CQ (Constant Quality) level for VBR mode (range 0-51 with 0-automatic)  */
    public native @Cast("uint8_t") byte targetQuality(); public native NV_ENC_RC_PARAMS targetQuality(byte setter);
    /** [in]: Fractional part of target quality (as 8.8 fixed point format) */
    public native @Cast("uint8_t") byte targetQualityLSB(); public native NV_ENC_RC_PARAMS targetQualityLSB(byte setter);
    /** [in]: Maximum depth of lookahead with range 0-(31 - number of B frames).
                                                                                                lookaheadDepth is only used if enableLookahead=1.*/
    public native @Cast("uint16_t") short lookaheadDepth(); public native NV_ENC_RC_PARAMS lookaheadDepth(short setter);
    /** [in]: Specifies the ratio of I frame bits to P frame bits in case of single frame VBV and CBR rate control mode,
                                                                                                is set to 2 by default for low latency tuning info and 1 by default for ultra low latency tuning info  */
    public native @Cast("uint8_t") byte lowDelayKeyFrameScale(); public native NV_ENC_RC_PARAMS lowDelayKeyFrameScale(byte setter);
    /** [in]: Specifies the value of 'deltaQ_y_dc' in AV1.*/
    public native @Cast("int8_t") byte yDcQPIndexOffset(); public native NV_ENC_RC_PARAMS yDcQPIndexOffset(byte setter);
    /** [in]: Specifies the value of 'deltaQ_u_dc' in AV1.*/
    public native @Cast("int8_t") byte uDcQPIndexOffset(); public native NV_ENC_RC_PARAMS uDcQPIndexOffset(byte setter);
    /** [in]: Specifies the value of 'deltaQ_v_dc' in AV1 (for future use only - deltaQ_v_dc is currently always internally set to same value as deltaQ_u_dc). */
    public native @Cast("int8_t") byte vDcQPIndexOffset(); public native NV_ENC_RC_PARAMS vDcQPIndexOffset(byte setter);
    /** [in]: This flag is used to interpret values in array specified by NV_ENC_PIC_PARAMS::qpDeltaMap.
                                                                                                Set this to NV_ENC_QP_MAP_EMPHASIS to treat values specified by NV_ENC_PIC_PARAMS::qpDeltaMap as Emphasis Level Map.
                                                                                                Emphasis Level can be assigned any value specified in enum NV_ENC_EMPHASIS_MAP_LEVEL.
                                                                                                Emphasis Level Map is used to specify regions to be encoded at varying levels of quality.
                                                                                                The hardware encoder adjusts the quantization within the image as per the provided emphasis map,
                                                                                                by adjusting the quantization parameter (QP) assigned to each macroblock. This adjustment is commonly called "Delta QP".
                                                                                                The adjustment depends on the absolute QP decided by the rate control algorithm, and is applied after the rate control has decided each macroblock's QP.
                                                                                                Since the Delta QP overrides rate control, enabling Emphasis Level Map may violate bitrate and VBV buffer size constraints.
                                                                                                Emphasis Level Map is useful in situations where client has a priori knowledge of the image complexity (e.g. via use of NVFBC's Classification feature) and encoding those high-complexity areas at higher quality (lower QP) is important, even at the possible cost of violating bitrate/VBV buffer size constraints
                                                                                                This feature is not supported when AQ( Spatial/Temporal) is enabled.
                                                                                                This feature is only supported for H264 codec currently.
                                                                                                <p>
                                                                                                Set this to NV_ENC_QP_MAP_DELTA to treat values specified by NV_ENC_PIC_PARAMS::qpDeltaMap as QP Delta. This specifies QP modifier to be applied on top of the QP chosen by rate control
                                                                                                <p>
                                                                                                Set this to NV_ENC_QP_MAP_DISABLED to ignore NV_ENC_PIC_PARAMS::qpDeltaMap values. In this case, qpDeltaMap should be set to NULL.
                                                                                                <p>
                                                                                                Other values are reserved for future use.*/
    public native @Cast("NV_ENC_QP_MAP_MODE") int qpMapMode(); public native NV_ENC_RC_PARAMS qpMapMode(int setter);
    /** [in]: This flag is used to enable multi-pass encoding for a given ::NV_ENC_PARAMS_RC_MODE. This flag is not valid for H264 and HEVC MEOnly mode */
    public native @Cast("NV_ENC_MULTI_PASS") int multiPass(); public native NV_ENC_RC_PARAMS multiPass(int setter);
    /** [in]: Specifies the ratio in which bitrate should be split between base and alpha layer. A value 'x' for this field will split the target bitrate in a ratio of x : 1 between base and alpha layer.
                                                                                                 The default split ratio is 15.*/
    public native @Cast("uint32_t") int alphaLayerBitrateRatio(); public native NV_ENC_RC_PARAMS alphaLayerBitrateRatio(int setter);
    /** [in]: Specifies the value of 'chroma_qp_index_offset' in H264 / 'pps_cb_qp_offset' in HEVC / 'deltaQ_u_ac' in AV1.*/
    public native @Cast("int8_t") byte cbQPIndexOffset(); public native NV_ENC_RC_PARAMS cbQPIndexOffset(byte setter);
    /** [in]: Specifies the value of 'second_chroma_qp_index_offset' in H264 / 'pps_cr_qp_offset' in HEVC / 'deltaQ_v_ac' in AV1 (for future use only - deltaQ_v_ac is currently always internally set to same value as deltaQ_u_ac). */
    public native @Cast("int8_t") byte crQPIndexOffset(); public native NV_ENC_RC_PARAMS crQPIndexOffset(byte setter);
    public native @Cast("uint16_t") short reserved2(); public native NV_ENC_RC_PARAMS reserved2(short setter);
    public native @Cast("uint32_t") int reserved(int i); public native NV_ENC_RC_PARAMS reserved(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved();
 }
