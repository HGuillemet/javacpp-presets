// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.libdc1394.global.dc1394.*;


/**
 * A struct containing the list of Format_7 modes.
 * FIXME: this may become very big if format_7 pages are used in IIDC 1.32. It would be better to use a "num" and an allocated list.
 */
@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class dc1394format7modeset_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public dc1394format7modeset_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public dc1394format7modeset_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dc1394format7modeset_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public dc1394format7modeset_t position(long position) {
        return (dc1394format7modeset_t)super.position(position);
    }
    @Override public dc1394format7modeset_t getPointer(long i) {
        return new dc1394format7modeset_t((Pointer)this).offsetAddress(i);
    }

    public native @ByRef dc1394format7mode_t mode(int i); public native dc1394format7modeset_t mode(int i, dc1394format7mode_t setter);
    @MemberGetter public native dc1394format7mode_t mode();
}
