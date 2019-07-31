// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

// #endif

// #ifdef __cplusplus

@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class float16_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public float16_t(Pointer p) { super(p); }

// #if CV_FP16_TYPE

// #else
    public float16_t() { super((Pointer)null); allocate(); }
    private native void allocate();
    public float16_t(float x) { super((Pointer)null); allocate(x); }
    private native void allocate(float x);

    public native @Name("operator float") float asFloat();

    public static native @ByVal float16_t fromBits(@Cast("ushort") short b);
    public static native @ByVal @Name("zero") float16_t _zero();
    public native @Cast("ushort") short bits();
}
