// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;

import static org.bytedeco.dnnl.global.dnnl.*;


/** AUGRU backward propagation primitive. */
@Namespace("dnnl") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class augru_backward extends primitive {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public augru_backward(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public augru_backward(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public augru_backward position(long position) {
        return (augru_backward)super.position(position);
    }
    @Override public augru_backward getPointer(long i) {
        return new augru_backward((Pointer)this).offsetAddress(i);
    }

    /** Descriptor for an AUGRU backward propagation primitive.
     *  Primitive descriptor for an AUGRU backward propagation primitive. */
    public static class primitive_desc extends rnn_primitive_desc_base {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public primitive_desc(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public primitive_desc(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public primitive_desc position(long position) {
            return (primitive_desc)super.position(position);
        }
        @Override public primitive_desc getPointer(long i) {
            return new primitive_desc((Pointer)this).offsetAddress(i);
        }
    
        /** Default constructor. Produces an empty object. */
        
        ///
        ///
        ///
        ///
        public primitive_desc() { super((Pointer)null); allocate(); }
        private native void allocate();

        /** Constructs a primitive descriptor for an AUGRU backward propagation
         *      primitive.
         * 
         *  The following arguments may point to a zero memory descriptor:
         *  - \p src_iter_desc together with \p diff_src_iter_desc,
         *  - \p bias_desc together with \p diff_bias_desc,
         *  - \p dst_iter_desc together with \p diff_dst_iter_desc.
         * 
         *  This would then indicate that the AUGRU backward propagation
         *  primitive should not use them and should default to zero values
         *  instead.
         * 
         *  \note
         *      All memory descriptors may be initialized with
         *      #dnnl::memory::format_tag::any value of \p format_tag.
         * 
         *  @param aengine Engine to use.
         *  @param aprop_kind Propagation kind. Must be
         *      #dnnl::prop_kind::backward.
         *  @param direction RNN direction. See \ref dnnl::rnn_direction for
         *      more info.
         *  @param src_layer_desc Memory descriptor for the input vector.
         *  @param src_iter_desc Memory descriptor for the input recurrent
         *      hidden state vector.
         *  @param attention_desc Memory descriptor for the attention vector.
         *  @param weights_layer_desc Memory descriptor for the weights
         *      applied to the layer input.
         *  @param weights_iter_desc Memory descriptor for the weights applied
         *      to the recurrent input.
         *  @param bias_desc Bias memory descriptor.
         *  @param dst_layer_desc Memory descriptor for the output vector.
         *  @param dst_iter_desc Memory descriptor for the output recurrent
         *      hidden state vector.
         *  @param diff_src_layer_desc Memory descriptor for the diff of input
         *      vector.
         *  @param diff_src_iter_desc Memory descriptor for the diff of input
         *      recurrent hidden state vector.
         *  @param diff_attention_desc Memory descriptor for the diff of
         *      attention vector.
         *  @param diff_weights_layer_desc Memory descriptor for the diff of
         *      weights applied to the layer input.
         *  @param diff_weights_iter_desc Memory descriptor for the diff of
         *      weights applied to the recurrent input.
         *  @param diff_bias_desc Diff bias memory descriptor.
         *  @param diff_dst_layer_desc Memory descriptor for the diff of
         *      output vector.
         *  @param diff_dst_iter_desc Memory descriptor for the diff of output
         *      recurrent hidden state vector.
         *  @param hint_fwd_pd Primitive descriptor for an AUGRU
         *      forward propagation primitive. It is used as a hint for
         *      deciding which memory format to use.
         *  @param attr Primitive attributes to use. Attributes are optional
         *      and default to empty attributes.
         *  @param allow_empty A flag signifying whether construction is
         *      allowed to fail without throwing an exception. In this case an
         *      empty object will be produced. This flag is optional and
         *      defaults to false. */
        
        ///
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        rnn_direction direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, direction, src_layer_desc, src_iter_desc, attention_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_attention_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        rnn_direction direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        rnn_direction direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aprop_kind, direction, src_layer_desc, src_iter_desc, attention_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_attention_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, prop_kind aprop_kind,
                        rnn_direction direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/) { super((Pointer)null); allocate(aengine, aprop_kind, direction, src_layer_desc, src_iter_desc, attention_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_attention_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, hint_fwd_pd, attr, allow_empty); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd,
                        @Const @ByRef(nullValue = "dnnl::primitive_attr()") primitive_attr attr,
                        @Cast("bool") boolean allow_empty/*=false*/);
        public primitive_desc(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd) { super((Pointer)null); allocate(aengine, aprop_kind, direction, src_layer_desc, src_iter_desc, attention_desc, weights_layer_desc, weights_iter_desc, bias_desc, dst_layer_desc, dst_iter_desc, diff_src_layer_desc, diff_src_iter_desc, diff_attention_desc, diff_weights_layer_desc, diff_weights_iter_desc, diff_bias_desc, diff_dst_layer_desc, diff_dst_iter_desc, hint_fwd_pd); }
        private native void allocate(@Const @ByRef engine aengine, @Cast("dnnl::prop_kind") int aprop_kind,
                        @Cast("dnnl::rnn_direction") int direction, @Const @ByRef org.bytedeco.dnnl.memory.desc src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc dst_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_src_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_attention_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_weights_iter_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_bias_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_layer_desc,
                        @Const @ByRef org.bytedeco.dnnl.memory.desc diff_dst_iter_desc,
                        @Const @ByRef augru_forward.primitive_desc hint_fwd_pd);

        /** Constructs a primitive descriptor for an AUGRU backward propagation
         *  primitive from a C API primitive descriptor that must have a
         *  matching kind.
         * 
         *  @param pd C API primitive descriptor for an AUGRU backward
         *      propagation primitive. */
        public primitive_desc(dnnl_primitive_desc pd) { super((Pointer)null); allocate(pd); }
        private native void allocate(dnnl_primitive_desc pd);

        /** \copydoc dnnl::rnn_primitive_desc_base::src_layer_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::src_iter_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc src_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::augru_attention_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc attention_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_layer_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc weights_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::weights_iter_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc weights_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::bias_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc bias_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_layer_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::dst_iter_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc dst_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::workspace_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc workspace_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_src_layer_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_src_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_src_iter_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_src_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_augru_attention_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_attention_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_weights_layer_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_weights_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_weights_iter_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_weights_iter_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_bias_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_bias_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_dst_layer_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_layer_desc();

        /** \copydoc dnnl::rnn_primitive_desc_base::diff_dst_iter_desc()const */
        public native @ByVal org.bytedeco.dnnl.memory.desc diff_dst_iter_desc();

        /** \copydoc dnnl::primitive_desc_base::get_cell_kind()const */
        public native algorithm get_cell_kind();

        /** \copydoc dnnl::primitive_desc_base::get_prop_kind()const */
        public native prop_kind get_prop_kind();

        /** \copydoc dnnl::primitive_desc_base::get_direction()const */
        public native rnn_direction get_direction();
    }

    /** Default constructor. Produces an empty object. */
    public augru_backward() { super((Pointer)null); allocate(); }
    private native void allocate();

    /** Constructs an AUGRU backward propagation primitive.
     *  @param pd Primitive descriptor for an AUGRU backward propagation
     *      primitive. */
    public augru_backward(@Const @ByRef primitive_desc pd) { super((Pointer)null); allocate(pd); }
    private native void allocate(@Const @ByRef primitive_desc pd);

    /** Constructs an AUGRU backward propagation primitive from a cache blob.
     *  @param pd Primitive descriptor for an AUGRU backward propagation
     *      primitive.
     *  @param cache_blob Cache blob. */
    public augru_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector BytePointer cache_blob);
    public augru_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector ByteBuffer cache_blob);
    public augru_backward(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob) { super((Pointer)null); allocate(pd, cache_blob); }
    private native void allocate(
                @Const @ByRef primitive_desc pd, @Cast("uint8_t*") @StdVector byte[] cache_blob);
}
