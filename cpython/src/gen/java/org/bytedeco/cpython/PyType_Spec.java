// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyType_Spec extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyType_Spec() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyType_Spec(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyType_Spec(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyType_Spec position(long position) {
        return (PyType_Spec)super.position(position);
    }
    @Override public PyType_Spec getPointer(long i) {
        return new PyType_Spec((Pointer)this).offsetAddress(i);
    }

    public native @Cast("const char*") BytePointer name(); public native PyType_Spec name(BytePointer setter);
    public native int basicsize(); public native PyType_Spec basicsize(int setter);
    public native int itemsize(); public native PyType_Spec itemsize(int setter);
    public native @Cast("unsigned int") int flags(); public native PyType_Spec flags(int setter);
    public native PyType_Slot slots(); public native PyType_Spec slots(PyType_Slot setter); /* terminated by slot==0. */
}
