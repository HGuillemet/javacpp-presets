// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_rstat_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_rstat_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_rstat_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_rstat_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_rstat_workspace position(long position) {
        return (gsl_rstat_workspace)super.position(position);
    }

  public native double min(); public native gsl_rstat_workspace min(double setter);      /* minimum value added */
  public native double max(); public native gsl_rstat_workspace max(double setter);      /* maximum value added */
  public native double mean(); public native gsl_rstat_workspace mean(double setter);     /* current mean */
  public native double M2(); public native gsl_rstat_workspace M2(double setter);       /* M_k = sum_{i=1..n} [ x_i - mean_n ]^k */
  public native double M3(); public native gsl_rstat_workspace M3(double setter);
  public native double M4(); public native gsl_rstat_workspace M4(double setter);
  public native @Cast("size_t") long n(); public native gsl_rstat_workspace n(long setter);        /* number of data points added */
  public native gsl_rstat_quantile_workspace median_workspace_p(); public native gsl_rstat_workspace median_workspace_p(gsl_rstat_quantile_workspace setter); /* median workspace */
}
