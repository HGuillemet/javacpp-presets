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


/**
 * New fields can be added to the end with minor version bumps.
 * Removal, reordering and changes to existing fields require a major
 * version bump.
 * sizeof(AVProgram) must not be used outside libav*.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avformat.class)
public class AVProgram extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVProgram() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVProgram(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVProgram(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVProgram position(long position) {
        return (AVProgram)super.position(position);
    }
    @Override public AVProgram getPointer(long i) {
        return new AVProgram((Pointer)this).offsetAddress(i);
    }

    public native int id(); public native AVProgram id(int setter);
    public native int flags(); public native AVProgram flags(int setter);
    /** selects which program to discard and which to feed to the caller */
    public native @Cast("AVDiscard") int discard(); public native AVProgram discard(int setter);
    public native @Cast("unsigned int*") IntPointer stream_index(); public native AVProgram stream_index(IntPointer setter);
    public native @Cast("unsigned int") int nb_stream_indexes(); public native AVProgram nb_stream_indexes(int setter);
    public native AVDictionary metadata(); public native AVProgram metadata(AVDictionary setter);

    public native int program_num(); public native AVProgram program_num(int setter);
    public native int pmt_pid(); public native AVProgram pmt_pid(int setter);
    public native int pcr_pid(); public native AVProgram pcr_pid(int setter);
    public native int pmt_version(); public native AVProgram pmt_version(int setter);

    /*****************************************************************
     * All fields below this line are not part of the public API. They
     * may not be used outside of libavformat and can be changed and
     * removed at will.
     * New public fields should be added right above.
     *****************************************************************
     */
    public native @Cast("int64_t") long start_time(); public native AVProgram start_time(long setter);
    public native @Cast("int64_t") long end_time(); public native AVProgram end_time(long setter);

    /** reference dts for wrap detection */
    public native @Cast("int64_t") long pts_wrap_reference(); public native AVProgram pts_wrap_reference(long setter);
    /** behavior on wrap detection */
    public native int pts_wrap_behavior(); public native AVProgram pts_wrap_behavior(int setter);
}
