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
 * Parameters describing a filter to be created in a filtergraph.
 *
 * Created as a child of AVFilterGraphSegment by avfilter_graph_segment_parse().
 * Freed in avfilter_graph_segment_free().
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avfilter.class)
public class AVFilterParams extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFilterParams() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFilterParams(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFilterParams(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFilterParams position(long position) {
        return (AVFilterParams)super.position(position);
    }
    @Override public AVFilterParams getPointer(long i) {
        return new AVFilterParams((Pointer)this).offsetAddress(i);
    }

    /**
     * The filter context.
     *
     * Created by avfilter_graph_segment_create_filters() based on
     * AVFilterParams.filter_name and instance_name.
     *
     * Callers may also create the filter context manually, then they should
     * av_free() filter_name and set it to NULL. Such AVFilterParams instances
     * are then skipped by avfilter_graph_segment_create_filters().
     */
    public native AVFilterContext filter(); public native AVFilterParams filter(AVFilterContext setter);

    /**
     * Name of the AVFilter to be used.
     *
     * An av_malloc()'ed string, set by avfilter_graph_segment_parse(). Will be
     * passed to avfilter_get_by_name() by
     * avfilter_graph_segment_create_filters().
     *
     * Callers may av_free() this string and replace it with another one or
     * NULL. If the caller creates the filter instance manually, this string
     * MUST be set to NULL.
     *
     * When both AVFilterParams.filter an AVFilterParams.filter_name are NULL,
     * this AVFilterParams instance is skipped by avfilter_graph_segment_*()
     * functions.
     */
    public native @Cast("char*") BytePointer filter_name(); public native AVFilterParams filter_name(BytePointer setter);
    /**
     * Name to be used for this filter instance.
     *
     * An av_malloc()'ed string, may be set by avfilter_graph_segment_parse() or
     * left NULL. The caller may av_free() this string and replace with another
     * one or NULL.
     *
     * Will be used by avfilter_graph_segment_create_filters() - passed as the
     * third argument to avfilter_graph_alloc_filter(), then freed and set to
     * NULL.
     */
    public native @Cast("char*") BytePointer instance_name(); public native AVFilterParams instance_name(BytePointer setter);

    /**
     * Options to be apllied to the filter.
     *
     * Filled by avfilter_graph_segment_parse(). Afterwards may be freely
     * modified by the caller.
     *
     * Will be applied to the filter by avfilter_graph_segment_apply_opts()
     * with an equivalent of av_opt_set_dict2(filter, &opts, AV_OPT_SEARCH_CHILDREN),
     * i.e. any unapplied options will be left in this dictionary.
     */
    public native AVDictionary opts(); public native AVFilterParams opts(AVDictionary setter);

    public native AVFilterPadParams inputs(int i); public native AVFilterParams inputs(int i, AVFilterPadParams setter);
    public native @Cast("AVFilterPadParams**") PointerPointer inputs(); public native AVFilterParams inputs(PointerPointer setter);
    public native @Cast("unsigned") int nb_inputs(); public native AVFilterParams nb_inputs(int setter);

    public native AVFilterPadParams outputs(int i); public native AVFilterParams outputs(int i, AVFilterPadParams setter);
    public native @Cast("AVFilterPadParams**") PointerPointer outputs(); public native AVFilterParams outputs(PointerPointer setter);
    public native @Cast("unsigned") int nb_outputs(); public native AVFilterParams nb_outputs(int setter);
}
