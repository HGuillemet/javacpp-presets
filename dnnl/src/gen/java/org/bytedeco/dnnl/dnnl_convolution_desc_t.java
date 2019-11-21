// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** A descriptor of a convolution operation. */
@Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_convolution_desc_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dnnl_convolution_desc_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dnnl_convolution_desc_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_convolution_desc_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dnnl_convolution_desc_t position(long position) {
        return (dnnl_convolution_desc_t)super.position(position);
    }

    /** The kind of primitive. Used for self-identifying the primitive
     *  descriptor. Must be #dnnl_convolution. */
    public native @Cast("dnnl_primitive_kind_t") int primitive_kind(); public native dnnl_convolution_desc_t primitive_kind(int setter);
    /** The kind of propagation. Possible values: #dnnl_forward_training,
     *  #dnnl_forward_inference, #dnnl_backward_data,
     *  #dnnl_backward_weights, and #dnnl_backward_bias. */
    public native @Cast("dnnl_prop_kind_t") int prop_kind(); public native dnnl_convolution_desc_t prop_kind(int setter);
    /** The kind of the convolution algorithm. Possible values:
     *  #dnnl_convolution_direct. */
    public native @Cast("dnnl_alg_kind_t") int alg_kind(); public native dnnl_convolution_desc_t alg_kind(int setter);
    /** Source memory descriptor. */
    public native @ByRef dnnl_memory_desc_t src_desc(); public native dnnl_convolution_desc_t src_desc(dnnl_memory_desc_t setter);
    /** Source gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_src_desc(); public native dnnl_convolution_desc_t diff_src_desc(dnnl_memory_desc_t setter);
    /** Weights memory descriptor. */
    public native @ByRef dnnl_memory_desc_t weights_desc(); public native dnnl_convolution_desc_t weights_desc(dnnl_memory_desc_t setter);
    /** Weights gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_weights_desc(); public native dnnl_convolution_desc_t diff_weights_desc(dnnl_memory_desc_t setter);
    /** Bias memory descriptor. */
    public native @ByRef dnnl_memory_desc_t bias_desc(); public native dnnl_convolution_desc_t bias_desc(dnnl_memory_desc_t setter);
    /** Bias gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_bias_desc(); public native dnnl_convolution_desc_t diff_bias_desc(dnnl_memory_desc_t setter);
    /** Destination memory descriptor. */
    public native @ByRef dnnl_memory_desc_t dst_desc(); public native dnnl_convolution_desc_t dst_desc(dnnl_memory_desc_t setter);
    /** Destination gradient memory descriptor. */
    public native @ByRef dnnl_memory_desc_t diff_dst_desc(); public native dnnl_convolution_desc_t diff_dst_desc(dnnl_memory_desc_t setter);
    /** Convolution strides in each spatial dimension. */
    @MemberGetter public native @Cast("int64_t*") LongPointer strides();
    /** Convolution dilates in each spatial dimension. */
    @MemberGetter public native @Cast("int64_t*") LongPointer dilates();
    /** Padding in each spatial dimension. padding[0] is a padding in the
     *  beginning (\p padding_l), padding[1] is a padding in the end (\p
     *  padding_r). */
    @MemberGetter public native @Cast("int64_t*") LongPointer padding(int i);
    @MemberGetter public native @Cast("int64_t**") PointerPointer padding();
    /** The accumulator data type. Initialized automatically. */
    public native @Cast("dnnl_data_type_t") int accum_data_type(); public native dnnl_convolution_desc_t accum_data_type(int setter);
}
