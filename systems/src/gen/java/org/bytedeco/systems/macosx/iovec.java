// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.macosx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.macosx.*;
 /* size_t */
@Properties(inherit = org.bytedeco.systems.presets.macosx.class)
public class iovec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public iovec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public iovec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public iovec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public iovec position(long position) {
        return (iovec)super.position(position);
    }
    @Override public iovec getPointer(long i) {
        return new iovec((Pointer)this).offsetAddress(i);
    }

	public native Pointer iov_base(); public native iovec iov_base(Pointer setter);      /* [XSI] Base address of I/O memory region */
	public native @Cast("size_t") long iov_len(); public native iovec iov_len(long setter);       /* [XSI] Size of region iov_base points to */
}
