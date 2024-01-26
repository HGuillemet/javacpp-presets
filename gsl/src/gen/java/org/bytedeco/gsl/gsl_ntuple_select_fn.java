// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_ntuple_select_fn extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_ntuple_select_fn() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_ntuple_select_fn(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_ntuple_select_fn(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_ntuple_select_fn position(long position) {
        return (gsl_ntuple_select_fn)super.position(position);
    }
    @Override public gsl_ntuple_select_fn getPointer(long i) {
        return new gsl_ntuple_select_fn((Pointer)this).offsetAddress(i);
    }

  public static class Function_Pointer_Pointer extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Function_Pointer_Pointer(Pointer p) { super(p); }
      protected Function_Pointer_Pointer() { allocate(); }
      private native void allocate();
      public native int call(Pointer ntuple_data, Pointer params);
  }
  public native Function_Pointer_Pointer function(); public native gsl_ntuple_select_fn function(Function_Pointer_Pointer setter);
  public native Pointer params(); public native gsl_ntuple_select_fn params(Pointer setter);
}
