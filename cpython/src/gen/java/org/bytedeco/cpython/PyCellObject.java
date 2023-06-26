// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;

// #endif

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyCellObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyCellObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyCellObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyCellObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyCellObject position(long position) {
        return (PyCellObject)super.position(position);
    }
    @Override public PyCellObject getPointer(long i) {
        return new PyCellObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyCellObject ob_base(PyObject setter);
    /* Content of the cell or NULL when empty */
    public native PyObject ob_ref(); public native PyCellObject ob_ref(PyObject setter);
}
