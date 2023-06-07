// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class uchar1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public uchar1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public uchar1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public uchar1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public uchar1 position(long position) {
        return (uchar1)super.position(position);
    }
    @Override public uchar1 getPointer(long i) {
        return new uchar1((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned char") byte x(); public native uchar1 x(byte setter);
}
