// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;

// #else
// #endif

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_vector extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_vector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_vector(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_vector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_vector position(long position) {
        return (gsl_vector)super.position(position);
    }
    @Override public gsl_vector getPointer(long i) {
        return new gsl_vector((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size(); public native gsl_vector size(long setter);
  public native @Cast("size_t") long stride(); public native gsl_vector stride(long setter);
  public native DoublePointer data(); public native gsl_vector data(DoublePointer setter);
  public native gsl_block block(); public native gsl_vector block(gsl_block setter);
  public native int owner(); public native gsl_vector owner(int setter);
}
