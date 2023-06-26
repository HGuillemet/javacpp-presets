// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyBaseExceptionGroupObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyBaseExceptionGroupObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyBaseExceptionGroupObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyBaseExceptionGroupObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyBaseExceptionGroupObject position(long position) {
        return (PyBaseExceptionGroupObject)super.position(position);
    }
    @Override public PyBaseExceptionGroupObject getPointer(long i) {
        return new PyBaseExceptionGroupObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyBaseExceptionGroupObject ob_base(PyObject setter); public native PyObject dict(); public native PyBaseExceptionGroupObject dict(PyObject setter);
             public native PyObject args(); public native PyBaseExceptionGroupObject args(PyObject setter); public native PyObject notes(); public native PyBaseExceptionGroupObject notes(PyObject setter); public native PyObject traceback(); public native PyBaseExceptionGroupObject traceback(PyObject setter);
             public native PyObject context(); public native PyBaseExceptionGroupObject context(PyObject setter); public native PyObject cause(); public native PyBaseExceptionGroupObject cause(PyObject setter);
             public native @Cast("char") byte suppress_context(); public native PyBaseExceptionGroupObject suppress_context(byte setter);
    public native PyObject msg(); public native PyBaseExceptionGroupObject msg(PyObject setter);
    public native PyObject excs(); public native PyBaseExceptionGroupObject excs(PyObject setter);
}
