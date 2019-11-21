// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.mkldnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.mkldnn.global.mklml.*;

import static org.bytedeco.mkldnn.global.mkldnn.*;

@Name("mkldnn::handle<mkldnn_primitive_attr_t>") @NoOffset @Properties(inherit = org.bytedeco.mkldnn.presets.mkldnn.class)
public class mkldnn_primitive_attr_handle extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public mkldnn_primitive_attr_handle(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public mkldnn_primitive_attr_handle(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public mkldnn_primitive_attr_handle position(long position) {
        return (mkldnn_primitive_attr_handle)super.position(position);
    }

    /** Constructs a C handle wrapper.
     *  @param t The C handle to wrap.
     *  @param weak A flag to specify whether to construct a weak wrapper. */
    public mkldnn_primitive_attr_handle(mkldnn_primitive_attr t/*=0*/, @Cast("bool") boolean weak/*=false*/) { super((Pointer)null); allocate(t, weak); }
    private native void allocate(mkldnn_primitive_attr t/*=0*/, @Cast("bool") boolean weak/*=false*/);
    public mkldnn_primitive_attr_handle() { super((Pointer)null); allocate(); }
    private native void allocate();

    public mkldnn_primitive_attr_handle(@Const @ByRef mkldnn_primitive_attr_handle other) { super((Pointer)null); allocate(other); }
    private native void allocate(@Const @ByRef mkldnn_primitive_attr_handle other);
    public native @ByRef @Name("operator =") mkldnn_primitive_attr_handle put(@Const @ByRef mkldnn_primitive_attr_handle other);
    /** Resets the value of a C handle.
     *  @param t The new value of the C handle.
     *  @param weak A flag to specify whether the wrapper should be weak. */
    public native void reset(mkldnn_primitive_attr t, @Cast("bool") boolean weak/*=false*/);
    public native void reset(mkldnn_primitive_attr t);

    /** Returns the value of the underlying C handle. */
    public native mkldnn_primitive_attr get();

    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef mkldnn_primitive_attr_handle other);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef mkldnn_primitive_attr_handle other);
}
