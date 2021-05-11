// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _withitem extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _withitem() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _withitem(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _withitem(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _withitem position(long position) {
        return (_withitem)super.position(position);
    }
    @Override public _withitem getPointer(long i) {
        return new _withitem((Pointer)this).offsetAddress(i);
    }

    public native _expr context_expr(); public native _withitem context_expr(_expr setter);
    public native _expr optional_vars(); public native _withitem optional_vars(_expr setter);
}
