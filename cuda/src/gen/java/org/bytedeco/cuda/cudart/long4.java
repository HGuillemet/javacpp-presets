// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class long4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public long4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public long4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public long4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public long4 position(long position) {
        return (long4)super.position(position);
    }
    @Override public long4 getPointer(long i) {
        return new long4((Pointer)this).offsetAddress(i);
    }

    public native long x(); public native long4 x(long setter);
    public native long y(); public native long4 y(long setter);
    public native long z(); public native long4 z(long setter);
    public native long w(); public native long4 w(long setter);
}
