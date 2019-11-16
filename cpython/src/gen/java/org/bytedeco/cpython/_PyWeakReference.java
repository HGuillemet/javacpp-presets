// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;


/* PyWeakReference is the base struct for the Python ReferenceType, ProxyType,
 * and CallableProxyType.
 */
// #ifndef Py_LIMITED_API
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class _PyWeakReference extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public _PyWeakReference() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public _PyWeakReference(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public _PyWeakReference(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public _PyWeakReference position(long position) {
        return (_PyWeakReference)super.position(position);
    }

    public native @ByRef PyObject ob_base(); public native _PyWeakReference ob_base(PyObject setter);

    /* The object to which this is a weak reference, or Py_None if none.
     * Note that this is a stealth reference:  wr_object's refcount is
     * not incremented to reflect this pointer.
     */
    public native PyObject wr_object(); public native _PyWeakReference wr_object(PyObject setter);

    /* A callable to invoke when wr_object dies, or NULL if none. */
    public native PyObject wr_callback(); public native _PyWeakReference wr_callback(PyObject setter);

    /* A cache for wr_object's hash code.  As usual for hashes, this is -1
     * if the hash code isn't known yet.
     */
    public native @Cast("Py_hash_t") long hash(); public native _PyWeakReference hash(long setter);

    /* If wr_object is weakly referenced, wr_object has a doubly-linked NULL-
     * terminated list of weak references to it.  These are the list pointers.
     * If wr_object goes away, wr_object is set to Py_None, and these pointers
     * have no meaning then.
     */
    public native PyWeakReference wr_prev(); public native _PyWeakReference wr_prev(PyWeakReference setter);
    public native PyWeakReference wr_next(); public native _PyWeakReference wr_next(PyWeakReference setter);
}
