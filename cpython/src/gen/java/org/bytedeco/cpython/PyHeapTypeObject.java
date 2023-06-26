// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cpython.global.python.*;


/* The *real* layout of a type object when allocated on the heap */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class PyHeapTypeObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyHeapTypeObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyHeapTypeObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyHeapTypeObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyHeapTypeObject position(long position) {
        return (PyHeapTypeObject)super.position(position);
    }
    @Override public PyHeapTypeObject getPointer(long i) {
        return new PyHeapTypeObject((Pointer)this).offsetAddress(i);
    }

    /* Note: there's a dependency on the order of these members
       in slotptr() in typeobject.c . */
    public native @ByRef PyTypeObject ht_type(); public native PyHeapTypeObject ht_type(PyTypeObject setter);
    public native @ByRef PyAsyncMethods as_async(); public native PyHeapTypeObject as_async(PyAsyncMethods setter);
    public native @ByRef PyNumberMethods as_number(); public native PyHeapTypeObject as_number(PyNumberMethods setter);
    public native @ByRef PyMappingMethods as_mapping(); public native PyHeapTypeObject as_mapping(PyMappingMethods setter);
    public native @ByRef PySequenceMethods as_sequence(); public native PyHeapTypeObject as_sequence(PySequenceMethods setter); /* as_sequence comes after as_mapping,
                                      so that the mapping wins when both
                                      the mapping and the sequence define
                                      a given operator (e.g. __getitem__).
                                      see add_operators() in typeobject.c . */
    public native @ByRef PyBufferProcs as_buffer(); public native PyHeapTypeObject as_buffer(PyBufferProcs setter);
    public native PyObject ht_name(); public native PyHeapTypeObject ht_name(PyObject setter);
    public native PyObject ht_slots(); public native PyHeapTypeObject ht_slots(PyObject setter);
    public native PyObject ht_qualname(); public native PyHeapTypeObject ht_qualname(PyObject setter);
    public native @Cast("_dictkeysobject*") PyDictKeysObject ht_cached_keys(); public native PyHeapTypeObject ht_cached_keys(PyDictKeysObject setter);
    public native PyObject ht_module(); public native PyHeapTypeObject ht_module(PyObject setter);
    public native @Cast("char*") BytePointer _ht_tpname(); public native PyHeapTypeObject _ht_tpname(BytePointer setter);  // Storage for "tp_name"; see PyType_FromModuleAndSpec
    public native @ByRef _specialization_cache _spec_cache(); public native PyHeapTypeObject _spec_cache(_specialization_cache setter); // For use by the specializer.
    /* here are optional user slots, followed by the members. */
}
