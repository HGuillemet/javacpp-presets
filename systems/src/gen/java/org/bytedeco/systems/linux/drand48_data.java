// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.linux.*;


// # ifdef __USE_MISC
/* Data structure for communication with thread safe versions.  This
   type is to be regarded as opaque.  It's only exported because users
   have to allocate objects of this type.  */
@Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class drand48_data extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public drand48_data() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public drand48_data(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public drand48_data(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public drand48_data position(long position) {
        return (drand48_data)super.position(position);
    }

    public native @Cast("unsigned short int") short __x(int i); public native drand48_data __x(int i, short setter);
    @MemberGetter public native @Cast("unsigned short int*") ShortPointer __x();	/* Current state.  */
    public native @Cast("unsigned short int") short __old_x(int i); public native drand48_data __old_x(int i, short setter);
    @MemberGetter public native @Cast("unsigned short int*") ShortPointer __old_x(); /* Old state.  */
    public native @Cast("unsigned short int") short __c(); public native drand48_data __c(short setter);	/* Additive const. in congruential formula.  */
    public native @Cast("unsigned short int") short __init(); public native drand48_data __init(short setter);	/* Flag for initializing.  */
    public native @Cast("unsigned long long int") long __a(); public native drand48_data __a(long setter);	/* Factor in congruential formula.  */
  }
