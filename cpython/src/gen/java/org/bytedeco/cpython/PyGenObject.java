// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyGenObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyGenObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyGenObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyGenObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyGenObject position(long position) {
        return (PyGenObject)super.position(position);
    }
    @Override public PyGenObject getPointer(long i) {
        return new PyGenObject((Pointer)this).offsetAddress(i);
    }

    /* The gi_ prefix is intended to remind of generator-iterator. */
    public native @ByRef PyObject ob_base(); public native PyGenObject ob_base(PyObject setter);
    /* The code object backing the generator */
    public native PyCodeObject gi_code(); public native PyGenObject gi_code(PyCodeObject setter);
    /* List of weak reference. */
    public native PyObject gi_weakreflist(); public native PyGenObject gi_weakreflist(PyObject setter);
    /* Name of the generator. */
    public native PyObject gi_name(); public native PyGenObject gi_name(PyObject setter);
    /* Qualified name of the generator. */
    public native PyObject gi_qualname(); public native PyGenObject gi_qualname(PyObject setter);
    public native @ByRef _PyErr_StackItem gi_exc_state(); public native PyGenObject gi_exc_state(_PyErr_StackItem setter);
    public native PyObject gi_origin_or_finalizer(); public native PyGenObject gi_origin_or_finalizer(PyObject setter);
    public native @Cast("char") byte gi_hooks_inited(); public native PyGenObject gi_hooks_inited(byte setter);
    public native @Cast("char") byte gi_closed(); public native PyGenObject gi_closed(byte setter);
    public native @Cast("char") byte gi_running_async(); public native PyGenObject gi_running_async(byte setter);
    /* The frame */
    public native byte gi_frame_state(); public native PyGenObject gi_frame_state(byte setter);
    public native PyObject gi_iframe(int i); public native PyGenObject gi_iframe(int i, PyObject setter);
    @MemberGetter public native @Cast("PyObject**") PointerPointer gi_iframe();
}
