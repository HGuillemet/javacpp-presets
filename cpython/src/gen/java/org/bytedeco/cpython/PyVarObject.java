// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyVarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyVarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyVarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyVarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyVarObject position(long position) {
        return (PyVarObject)super.position(position);
    }

    public native @ByRef PyObject ob_base(); public native PyVarObject ob_base(PyObject setter);
    public native @Cast("Py_ssize_t") long ob_size(); public native PyVarObject ob_size(long setter); /* Number of items in variable part */
}
