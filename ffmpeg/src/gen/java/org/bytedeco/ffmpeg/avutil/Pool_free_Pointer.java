// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class Pool_free_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Pool_free_Pointer(Pointer p) { super(p); }
    protected Pool_free_Pointer() { allocate(); }
    private native void allocate();
    public native void call(Pointer opaque);
}
