// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Name("gsl_odeiv2_control_struct") @Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_odeiv2_control extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_odeiv2_control() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_odeiv2_control(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_odeiv2_control(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_odeiv2_control position(long position) {
        return (gsl_odeiv2_control)super.position(position);
    }
    @Override public gsl_odeiv2_control getPointer(long i) {
        return new gsl_odeiv2_control((Pointer)this).offsetAddress(i);
    }

  public native @Const gsl_odeiv2_control_type type(); public native gsl_odeiv2_control type(gsl_odeiv2_control_type setter);
  public native Pointer state(); public native gsl_odeiv2_control state(Pointer setter);
}
