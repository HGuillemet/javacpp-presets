// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_fft_real_workspace_float extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_fft_real_workspace_float() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_fft_real_workspace_float(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_fft_real_workspace_float(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_fft_real_workspace_float position(long position) {
        return (gsl_fft_real_workspace_float)super.position(position);
    }

    public native @Cast("size_t") long n(); public native gsl_fft_real_workspace_float n(long setter);
    public native FloatPointer scratch(); public native gsl_fft_real_workspace_float scratch(FloatPointer setter);
  }
