// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;



/*
 * The main array object structure.
 *
 * It has been recommended to use the inline functions defined below
 * (PyArray_DATA and friends) to access fields here for a number of
 * releases. Direct access to the members themselves is deprecated.
 * To ensure that your code does not use deprecated access,
 * #define NPY_NO_DEPRECATED_API NPY_1_7_API_VERSION
 * (or NPY_1_8_API_VERSION or higher as required).
 */
/* This struct will be moved to a private header in a future release */
@Name("PyArrayObject_fields") @Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayObject extends PyObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayObject position(long position) {
        return (PyArrayObject)super.position(position);
    }
    @Override public PyArrayObject getPointer(long i) {
        return new PyArrayObject((Pointer)this).offsetAddress(i);
    }

    public native @ByRef PyObject ob_base(); public native PyArrayObject ob_base(PyObject setter);
    /* Pointer to the raw data buffer */
    public native @Cast("char*") BytePointer data(); public native PyArrayObject data(BytePointer setter);
    /* The number of dimensions, also called 'ndim' */
    public native int nd(); public native PyArrayObject nd(int setter);
    /* The size in each dimension, also called 'shape' */
    public native @Cast("npy_intp*") SizeTPointer dimensions(); public native PyArrayObject dimensions(SizeTPointer setter);
    /*
     * Number of bytes to jump to get to the
     * next element in each dimension
     */
    public native @Cast("npy_intp*") SizeTPointer strides(); public native PyArrayObject strides(SizeTPointer setter);
    /*
     * This object is decref'd upon
     * deletion of array. Except in the
     * case of WRITEBACKIFCOPY which has
     * special handling.
     *
     * For views it points to the original
     * array, collapsed so no chains of
     * views occur.
     *
     * For creation from buffer object it
     * points to an object that should be
     * decref'd on deletion
     *
     * For WRITEBACKIFCOPY flag this is an
     * array to-be-updated upon calling
     * PyArray_ResolveWritebackIfCopy
     */
    public native PyObject base(); public native PyArrayObject base(PyObject setter);
    /* Pointer to type structure */
    public native PyArray_Descr descr(); public native PyArrayObject descr(PyArray_Descr setter);
    /* Flags describing array -- see below */
    public native int flags(); public native PyArrayObject flags(int setter);
    /* For weak references */
    public native PyObject weakreflist(); public native PyArrayObject weakreflist(PyObject setter);
    public native Pointer _buffer_info(); public native PyArrayObject _buffer_info(Pointer setter);  /* private buffer info, tagged to allow warning */
    /*
     * For malloc/calloc/realloc/free per object
     */
    public native PyObject mem_handler(); public native PyArrayObject mem_handler(PyObject setter);
}
