// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;
  /* PIL-style layout */

@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyMemoryViewObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyMemoryViewObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyMemoryViewObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyMemoryViewObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyMemoryViewObject position(long position) {
        return (PyMemoryViewObject)super.position(position);
    }
    @Override public PyMemoryViewObject getPointer(long i) {
        return new PyMemoryViewObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyVarObject ob_base(); public native PyMemoryViewObject ob_base(PyVarObject setter);
    public native _PyManagedBufferObject mbuf(); public native PyMemoryViewObject mbuf(_PyManagedBufferObject setter); /* managed buffer */
    public native @Cast("Py_hash_t") long hash(); public native PyMemoryViewObject hash(long setter);               /* hash value for read-only views */
    public native int flags(); public native PyMemoryViewObject flags(int setter);                    /* state flags */
    public native @Cast("Py_ssize_t") long exports(); public native PyMemoryViewObject exports(long setter);           /* number of buffer re-exports */
    public native @ByRef Py_buffer view(); public native PyMemoryViewObject view(Py_buffer setter);               /* private copy of the exporter's view */
    public native PyObject weakreflist(); public native PyMemoryViewObject weakreflist(PyObject setter);
    public native @Cast("Py_ssize_t") long ob_array(int i); public native PyMemoryViewObject ob_array(int i, long setter);
    @MemberGetter public native @Cast("Py_ssize_t*") SizeTPointer ob_array();       /* shape, strides, suboffsets */
}
