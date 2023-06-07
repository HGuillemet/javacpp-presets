// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.hdf5.global.hdf5.*;

/** <!-- [hdset_reg_ref_t_snip] -->
 <p>
 *  <!-- [H5R_ref_t_snip] -->
/**
 * Opaque reference type. The same reference type is used for object,
 * dataset region and attribute references. This is the type that
 * should always be used with the current reference API.
 */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5R_ref_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public H5R_ref_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public H5R_ref_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public H5R_ref_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public H5R_ref_t position(long position) {
        return (H5R_ref_t)super.position(position);
    }
    @Override public H5R_ref_t getPointer(long i) {
        return new H5R_ref_t((Pointer)this).offsetAddress(i);
    }

        /** opaque data */
        @Name("u.__data") public native @Cast("uint8_t") byte u___data(int i); public native H5R_ref_t u___data(int i, byte setter);
        @Name("u.__data") @MemberGetter public native @Cast("uint8_t*") BytePointer u___data();
        /** ensures alignment */
        @Name("u.align") public native @Cast("int64_t") long u_align(); public native H5R_ref_t u_align(long setter);
}
