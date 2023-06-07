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
public class gsl_splinalg_itersolve extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_splinalg_itersolve() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_splinalg_itersolve(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_splinalg_itersolve(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_splinalg_itersolve position(long position) {
        return (gsl_splinalg_itersolve)super.position(position);
    }
    @Override public gsl_splinalg_itersolve getPointer(long i) {
        return new gsl_splinalg_itersolve((Pointer)this).offsetAddress(i);
    }

  public native @Const gsl_splinalg_itersolve_type type(); public native gsl_splinalg_itersolve type(gsl_splinalg_itersolve_type setter);
  public native double normr(); public native gsl_splinalg_itersolve normr(double setter); /* current residual norm || b - A x || */
  public native Pointer state(); public native gsl_splinalg_itersolve state(Pointer setter);
}
