// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avformat;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;
import org.bytedeco.ffmpeg.avcodec.*;
import static org.bytedeco.ffmpeg.global.avcodec.*;

import static org.bytedeco.ffmpeg.global.avformat.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVChapter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVChapter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVChapter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVChapter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVChapter position(long position) {
        return (AVChapter)super.position(position);
    }
    @Override public AVChapter getPointer(long i) {
        return new AVChapter((Pointer)this).offsetAddress(i);
    }

    /** unique ID to identify the chapter */
    public native @Cast("int64_t") long id(); public native AVChapter id(long setter);
    /** time base in which the start/end timestamps are specified */
    public native @ByRef AVRational time_base(); public native AVChapter time_base(AVRational setter);
    /** chapter start/end time in time_base units */
    public native @Cast("int64_t") long start(); public native AVChapter start(long setter);
    public native @Cast("int64_t") long end(); public native AVChapter end(long setter);
    public native AVDictionary metadata(); public native AVChapter metadata(AVDictionary setter);
}
