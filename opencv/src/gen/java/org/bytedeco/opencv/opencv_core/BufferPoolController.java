// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \addtogroup core
 *  \{ */

@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class BufferPoolController extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BufferPoolController(Pointer p) { super(p); }

    public native @Cast("size_t") long getReservedSize();
    public native @Cast("size_t") long getMaxReservedSize();
    public native void setMaxReservedSize(@Cast("size_t") long size);
    public native void freeAllReservedBuffers();
}
