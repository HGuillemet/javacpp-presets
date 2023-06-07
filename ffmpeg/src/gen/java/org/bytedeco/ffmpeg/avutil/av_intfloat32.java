// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class av_intfloat32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public av_intfloat32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public av_intfloat32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public av_intfloat32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public av_intfloat32 position(long position) {
        return (av_intfloat32)super.position(position);
    }
    @Override public av_intfloat32 getPointer(long i) {
        return new av_intfloat32((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int i(); public native av_intfloat32 i(int setter);
    public native float f(); public native av_intfloat32 f(float setter);
}
