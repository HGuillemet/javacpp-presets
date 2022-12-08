// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class av_alias16 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public av_alias16() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public av_alias16(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public av_alias16(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public av_alias16 position(long position) {
        return (av_alias16)super.position(position);
    }
    @Override public av_alias16 getPointer(long i) {
        return new av_alias16((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint16_t") short u16(); public native av_alias16 u16(short setter);
    public native @Cast("uint8_t") byte u8(int i); public native av_alias16 u8(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer u8();
}
