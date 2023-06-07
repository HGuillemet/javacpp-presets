// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_wavelet extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_wavelet() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_wavelet(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_wavelet(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_wavelet position(long position) {
        return (gsl_wavelet)super.position(position);
    }
    @Override public gsl_wavelet getPointer(long i) {
        return new gsl_wavelet((Pointer)this).offsetAddress(i);
    }

  public native @Const gsl_wavelet_type type(); public native gsl_wavelet type(gsl_wavelet_type setter);
  public native @Const DoublePointer h1(); public native gsl_wavelet h1(DoublePointer setter);
  public native @Const DoublePointer g1(); public native gsl_wavelet g1(DoublePointer setter);
  public native @Const DoublePointer h2(); public native gsl_wavelet h2(DoublePointer setter);
  public native @Const DoublePointer g2(); public native gsl_wavelet g2(DoublePointer setter);
  public native @Cast("size_t") long nc(); public native gsl_wavelet nc(long setter);
  public native @Cast("size_t") long offset(); public native gsl_wavelet offset(long setter);
}
