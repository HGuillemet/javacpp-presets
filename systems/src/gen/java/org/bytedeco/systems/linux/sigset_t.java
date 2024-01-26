// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.linux;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.linux.*;

@Name("__sigset_t") @Properties(inherit = org.bytedeco.systems.presets.linux.class)
public class sigset_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public sigset_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public sigset_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public sigset_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public sigset_t position(long position) {
        return (sigset_t)super.position(position);
    }
    @Override public sigset_t getPointer(long i) {
        return new sigset_t((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned long int") long __val(int i); public native sigset_t __val(int i, long setter);
    @MemberGetter public native @Cast("unsigned long int*") CLongPointer __val();
  }
