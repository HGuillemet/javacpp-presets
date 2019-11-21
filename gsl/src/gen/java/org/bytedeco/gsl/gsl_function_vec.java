// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;



/* Definition of an arbitrary vector-valued function with parameters */

@Name("gsl_function_vec_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_function_vec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_function_vec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_function_vec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_function_vec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_function_vec position(long position) {
        return (gsl_function_vec)super.position(position);
    }

  public static class Function_double_DoublePointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Function_double_DoublePointer_Pointer(Pointer p) { super(p); }
      protected Function_double_DoublePointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(double x, DoublePointer y, Pointer params);
  }
  public native Function_double_DoublePointer_Pointer function(); public native gsl_function_vec function(Function_double_DoublePointer_Pointer setter);
  public native Pointer params(); public native gsl_function_vec params(Pointer setter);
}
