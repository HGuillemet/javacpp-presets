// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


/* types for the function pointers passed to gsl_siman_solve */

@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class gsl_siman_Efunc_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    gsl_siman_Efunc_t(Pointer p) { super(p); }
    protected gsl_siman_Efunc_t() { allocate(); }
    private native void allocate();
    public native double call(Pointer xp);
}
