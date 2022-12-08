// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avcodec;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;
import org.bytedeco.ffmpeg.swresample.*;
import static org.bytedeco.ffmpeg.global.swresample.*;

import static org.bytedeco.ffmpeg.global.avcodec.*;


@Properties(inherit = org.bytedeco.ffmpeg.presets.avcodec.class)
public class AVBitStreamFilter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVBitStreamFilter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVBitStreamFilter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVBitStreamFilter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVBitStreamFilter position(long position) {
        return (AVBitStreamFilter)super.position(position);
    }
    @Override public AVBitStreamFilter getPointer(long i) {
        return new AVBitStreamFilter((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native AVBitStreamFilter name(BytePointer setter);

    /**
     * A list of codec ids supported by the filter, terminated by
     * AV_CODEC_ID_NONE.
     * May be NULL, in that case the bitstream filter works with any codec id.
     */
    public native @Cast("const AVCodecID*") IntPointer codec_ids(); public native AVBitStreamFilter codec_ids(IntPointer setter);

    /**
     * A class for the private data, used to declare bitstream filter private
     * AVOptions. This field is NULL for bitstream filters that do not declare
     * any options.
     *
     * If this field is non-NULL, the first member of the filter private data
     * must be a pointer to AVClass, which will be set by libavcodec generic
     * code to this class.
     */
    public native @Const AVClass priv_class(); public native AVBitStreamFilter priv_class(AVClass setter);
}
