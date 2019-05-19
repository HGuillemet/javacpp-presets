// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.gsl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.gsl.global.gsl.*;


@Properties(inherit = org.bytedeco.gsl.presets.gsl.class)
public class _gsl_vector_long_view extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _gsl_vector_long_view() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _gsl_vector_long_view(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _gsl_vector_long_view(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _gsl_vector_long_view position(long position) {
        return (_gsl_vector_long_view)super.position(position);
    }

  public native @ByRef gsl_vector_long vector(); public native _gsl_vector_long_view vector(gsl_vector_long setter);
}
