// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.libpostal;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libpostal.global.postal.*;


@Properties(inherit = org.bytedeco.libpostal.presets.postal.class)
public class libpostal_fuzzy_duplicate_status_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public libpostal_fuzzy_duplicate_status_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public libpostal_fuzzy_duplicate_status_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public libpostal_fuzzy_duplicate_status_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public libpostal_fuzzy_duplicate_status_t position(long position) {
        return (libpostal_fuzzy_duplicate_status_t)super.position(position);
    }

    public native @Cast("libpostal_duplicate_status_t") int status(); public native libpostal_fuzzy_duplicate_status_t status(int setter);
    public native double similarity(); public native libpostal_fuzzy_duplicate_status_t similarity(double setter);
}
