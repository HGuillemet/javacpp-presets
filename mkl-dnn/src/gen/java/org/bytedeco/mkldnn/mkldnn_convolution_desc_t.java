// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;


/** \} */

/** A descriptor of a convolution operation. */
@Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_convolution_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public mkldnn_convolution_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_convolution_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_convolution_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public mkldnn_convolution_desc_t position(long position) {
        return (mkldnn_convolution_desc_t)super.position(position);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     * descriptor. Must be #mkldnn_convolution. */
    public native @Cast("mkldnn_primitive_kind_t") int primitive_kind(); public native mkldnn_convolution_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #mkldnn_forward_training,
     * #mkldnn_forward_inference, #mkldnn_backward_data,
     * #mkldnn_backward_weights, and #mkldnn_backward_bias. */
    public native @Cast("mkldnn_prop_kind_t") int prop_kind(); public native mkldnn_convolution_desc_t prop_kind(int setter);
    /** The kind of the convolution algorithm. Possible values:
     * #mkldnn_convolution_direct. */
    public native @Cast("mkldnn_alg_kind_t") int alg_kind(); public native mkldnn_convolution_desc_t alg_kind(int setter);
    /** Source memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t src_desc(); public native mkldnn_convolution_desc_t src_desc(mkldnn_memory_desc_t setter);
    /** Source gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_src_desc(); public native mkldnn_convolution_desc_t diff_src_desc(mkldnn_memory_desc_t setter);
    /** Weights memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t weights_desc(); public native mkldnn_convolution_desc_t weights_desc(mkldnn_memory_desc_t setter);
    /** Weights gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_weights_desc(); public native mkldnn_convolution_desc_t diff_weights_desc(mkldnn_memory_desc_t setter);
    /** Bias memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t bias_desc(); public native mkldnn_convolution_desc_t bias_desc(mkldnn_memory_desc_t setter);
    /** Bias gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_bias_desc(); public native mkldnn_convolution_desc_t diff_bias_desc(mkldnn_memory_desc_t setter);
    /** Destination memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t dst_desc(); public native mkldnn_convolution_desc_t dst_desc(mkldnn_memory_desc_t setter);
    /** Destination gradient memory descriptor. */
    public native @ByRef mkldnn_memory_desc_t diff_dst_desc(); public native mkldnn_convolution_desc_t diff_dst_desc(mkldnn_memory_desc_t setter);
    /** Convolution strides in each spatial dimension. */
    @MemberGetter public native IntPointer strides();
    /** Convolution dilates in each spatial dimension. */
    @MemberGetter public native IntPointer dilates();
    /** Padding in each spatial dimension. padding[0] is a padding in the
     * beginning (\p padding_l), padding[1] is a padding in the end (\p
     * padding_r). */
    @MemberGetter public native IntPointer padding(int i);
    @MemberGetter public native @Cast("int**") PointerPointer padding();
    /** The kind of padding to use. */
    public native @Cast("mkldnn_padding_kind_t") int padding_kind(); public native mkldnn_convolution_desc_t padding_kind(int setter);
    /** The accumulator data type. Initialized automatically. */
    public native @Cast("mkldnn_data_type_t") int accum_data_type(); public native mkldnn_convolution_desc_t accum_data_type(int setter);
}
