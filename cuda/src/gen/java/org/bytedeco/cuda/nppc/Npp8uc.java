// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nppc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nppc.*;



/**
 * Complex Number
 * This struct represents an unsigned char complex number.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nppc.class)
public class Npp8uc extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Npp8uc() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Npp8uc(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Npp8uc(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Npp8uc position(long position) {
        return (Npp8uc)super.position(position);
    }
    @Override public Npp8uc getPointer(long i) {
        return new Npp8uc((Pointer)this).offsetAddress(i);
    }

    /**  Real part */
    public native @Cast("Npp8u") byte re(); public native Npp8uc re(byte setter);
    /**  Imaginary part */
    public native @Cast("Npp8u") byte im(); public native Npp8uc im(byte setter);
}
