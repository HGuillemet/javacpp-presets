// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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
public class gsl_matrix_char extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_matrix_char() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_matrix_char(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_matrix_char(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_matrix_char position(long position) {
        return (gsl_matrix_char)super.position(position);
    }
    @Override public gsl_matrix_char getPointer(long i) {
        return new gsl_matrix_char((Pointer)this).offsetAddress(i);
    }

  public native @Cast("size_t") long size1(); public native gsl_matrix_char size1(long setter);
  public native @Cast("size_t") long size2(); public native gsl_matrix_char size2(long setter);
  public native @Cast("size_t") long tda(); public native gsl_matrix_char tda(long setter);
  public native @Cast("char*") BytePointer data(); public native gsl_matrix_char data(BytePointer setter);
  public native gsl_block_char block(); public native gsl_matrix_char block(gsl_block_char setter);
  public native int owner(); public native gsl_matrix_char owner(int setter);
}
