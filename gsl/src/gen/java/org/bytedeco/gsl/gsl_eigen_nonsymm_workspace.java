// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_eigen_nonsymm_workspace extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_eigen_nonsymm_workspace() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_eigen_nonsymm_workspace(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_eigen_nonsymm_workspace(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_eigen_nonsymm_workspace position(long position) {
        return (gsl_eigen_nonsymm_workspace)super.position(position);
    }

  public native @Cast("size_t") long size(); public native gsl_eigen_nonsymm_workspace size(long setter);                 /* size of matrices */
  public native gsl_vector diag(); public native gsl_eigen_nonsymm_workspace diag(gsl_vector setter);            /* diagonal matrix elements from balancing */
  public native gsl_vector tau(); public native gsl_eigen_nonsymm_workspace tau(gsl_vector setter);             /* Householder coefficients */
  public native gsl_matrix Z(); public native gsl_eigen_nonsymm_workspace Z(gsl_matrix setter);               /* pointer to Z matrix */
  public native int do_balance(); public native gsl_eigen_nonsymm_workspace do_balance(int setter);              /* perform balancing transformation? */
  public native @Cast("size_t") long n_evals(); public native gsl_eigen_nonsymm_workspace n_evals(long setter);              /* number of eigenvalues found */

  public native gsl_eigen_francis_workspace francis_workspace_p(); public native gsl_eigen_nonsymm_workspace francis_workspace_p(gsl_eigen_francis_workspace setter);
}
