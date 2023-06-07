// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
public class gsl_rng_type extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public gsl_rng_type() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public gsl_rng_type(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public gsl_rng_type(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public gsl_rng_type position(long position) {
        return (gsl_rng_type)super.position(position);
    }
    @Override public gsl_rng_type getPointer(long i) {
        return new gsl_rng_type((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native gsl_rng_type name(BytePointer setter);
    public native @Cast("unsigned long int") long max(); public native gsl_rng_type max(long setter);
    public native @Cast("unsigned long int") long min(); public native gsl_rng_type min(long setter);
    public native @Cast("size_t") long size(); public native gsl_rng_type size(long setter);
    public static class Set_Pointer_long extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Set_Pointer_long(Pointer p) { super(p); }
        protected Set_Pointer_long() { allocate(); }
        private native void allocate();
        public native void call(Pointer state, @Cast("unsigned long int") long seed);
    }
    public native Set_Pointer_long set(); public native gsl_rng_type set(Set_Pointer_long setter);
    public static class Get_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_Pointer(Pointer p) { super(p); }
        protected Get_Pointer() { allocate(); }
        private native void allocate();
        public native @Cast("unsigned long int") long call(Pointer state);
    }
    public native Get_Pointer get(); public native gsl_rng_type get(Get_Pointer setter);
    public static class Get_double_Pointer extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    Get_double_Pointer(Pointer p) { super(p); }
        protected Get_double_Pointer() { allocate(); }
        private native void allocate();
        public native double call(Pointer state);
    }
    public native Get_double_Pointer get_double(); public native gsl_rng_type get_double(Get_double_Pointer setter);
  }
