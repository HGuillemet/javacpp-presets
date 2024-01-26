// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Feed data at specific position from an AVFifoBuffer to a user-supplied callback.
 * Similar as av_fifo_gereric_read but without discarding data.
 * @param f AVFifoBuffer to read from
 * @param offset offset from current read position
 * @param buf_size number of bytes to read
 * @param func generic read function
 * @param dest data destination
 *
 * @return a non-negative number on success, a negative error code on failure
 *
 * @deprecated use the new AVFifo-API with av_fifo_peek() when func == NULL,
 *             av_fifo_peek_to_cb() otherwise
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Func_Pointer_Pointer_int extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Func_Pointer_Pointer_int(Pointer p) { super(p); }
    protected Func_Pointer_Pointer_int() { allocate(); }
    private native void allocate();
    public native void call(Pointer arg0, Pointer arg1, int arg2);
}
