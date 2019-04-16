// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyCoroObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyCoroObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyCoroObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyCoroObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyCoroObject position(long position) {
        return (PyCoroObject)super.position(position);
    }

    public native @ByRef PyObject ob_base(); public native PyCoroObject ob_base(PyObject setter);
    /* Note: gi_frame can be NULL if the generator is "finished" */
    public native _frame cr_frame(); public native PyCoroObject cr_frame(_frame setter);
    /* True if generator is being executed. */
    public native @Cast("char") byte cr_running(); public native PyCoroObject cr_running(byte setter);
    /* The code object backing the generator */
    public native PyObject cr_code(); public native PyCoroObject cr_code(PyObject setter);
    /* List of weak reference. */
    public native PyObject cr_weakreflist(); public native PyCoroObject cr_weakreflist(PyObject setter);
    /* Name of the generator. */
    public native PyObject cr_name(); public native PyCoroObject cr_name(PyObject setter);
    /* Qualified name of the generator. */
    public native PyObject cr_qualname(); public native PyCoroObject cr_qualname(PyObject setter);
}
