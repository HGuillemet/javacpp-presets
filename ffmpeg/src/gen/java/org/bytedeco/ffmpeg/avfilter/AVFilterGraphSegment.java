// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avfilter;

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
import org.bytedeco.ffmpeg.avformat.*;
import static org.bytedeco.ffmpeg.global.avformat.*;
import org.bytedeco.ffmpeg.postproc.*;
import static org.bytedeco.ffmpeg.global.postproc.*;
import org.bytedeco.ffmpeg.swscale.*;
import static org.bytedeco.ffmpeg.global.swscale.*;

import static org.bytedeco.ffmpeg.global.avfilter.*;


/**
 * A parsed representation of a filtergraph segment.
 *
 * A filtergraph segment is conceptually a list of filterchains, with some
 * supplementary information (e.g. format conversion flags).
 *
 * Created by avfilter_graph_segment_parse(). Must be freed with
 * avfilter_graph_segment_free().
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterGraphSegment extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterGraphSegment() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterGraphSegment(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterGraphSegment(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterGraphSegment position(long position) {
        return (AVFilterGraphSegment)super.position(position);
    }
    @Override public AVFilterGraphSegment getPointer(long i) {
        return new AVFilterGraphSegment((Pointer)this).offsetAddress(i);
    }

    /**
     * The filtergraph this segment is associated with.
     * Set by avfilter_graph_segment_parse().
     */
    public native AVFilterGraph graph(); public native AVFilterGraphSegment graph(AVFilterGraph setter);

    /**
     * A list of filter chain contained in this segment.
     * Set in avfilter_graph_segment_parse().
     */
    public native AVFilterChain chains(int i); public native AVFilterGraphSegment chains(int i, AVFilterChain setter);
    public native @Cast("AVFilterChain**") PointerPointer chains(); public native AVFilterGraphSegment chains(PointerPointer setter);
    public native @Cast("size_t") long nb_chains(); public native AVFilterGraphSegment nb_chains(long setter);

    /**
     * A string containing a colon-separated list of key=value options applied
     * to all scale filters in this segment.
     *
     * May be set by avfilter_graph_segment_parse().
     * The caller may free this string with av_free() and replace it with a
     * different av_malloc()'ed string.
     */
    public native @Cast("char*") BytePointer scale_sws_opts(); public native AVFilterGraphSegment scale_sws_opts(BytePointer setter);
}
