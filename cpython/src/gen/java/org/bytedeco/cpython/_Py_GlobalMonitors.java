// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _Py_GlobalMonitors extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _Py_GlobalMonitors() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _Py_GlobalMonitors(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _Py_GlobalMonitors(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _Py_GlobalMonitors position(long position) {
        return (_Py_GlobalMonitors)super.position(position);
    }
    @Override public _Py_GlobalMonitors getPointer(long i) {
        return new _Py_GlobalMonitors((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint8_t") byte tools(int i); public native _Py_GlobalMonitors tools(int i, byte setter);
    @MemberGetter public native @Cast("uint8_t*") BytePointer tools();
}
