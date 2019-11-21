// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* The following functions perform the same calculation without
   estimating the errors. They require O(N) storage instead of O(N^2).
   This may be useful for summing many similar series where the size
   of the error has already been estimated reliably and is not
   expected to change.  */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_sum_levin_utrunc_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_sum_levin_utrunc_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_sum_levin_utrunc_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_sum_levin_utrunc_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_sum_levin_utrunc_workspace position(long position) {
        return (gsl_sum_levin_utrunc_workspace)super.position(position);
    }

  public native @Cast("size_t") long size(); public native gsl_sum_levin_utrunc_workspace size(long setter);
  public native @Cast("size_t") long i(); public native gsl_sum_levin_utrunc_workspace i(long setter);                     /* position in array */
  public native @Cast("size_t") long terms_used(); public native gsl_sum_levin_utrunc_workspace terms_used(long setter);            /* number of calls */
  public native double sum_plain(); public native gsl_sum_levin_utrunc_workspace sum_plain(double setter);
  public native DoublePointer q_num(); public native gsl_sum_levin_utrunc_workspace q_num(DoublePointer setter);
  public native DoublePointer q_den(); public native gsl_sum_levin_utrunc_workspace q_den(DoublePointer setter);
  public native DoublePointer dsum(); public native gsl_sum_levin_utrunc_workspace dsum(DoublePointer setter);
}
