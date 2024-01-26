// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyDatetimeScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyDatetimeScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyDatetimeScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyDatetimeScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyDatetimeScalarObject position(long position) {
        return (PyDatetimeScalarObject)super.position(position);
    }
    @Override public PyDatetimeScalarObject getPointer(long i) {
        return new PyDatetimeScalarObject((Pointer)this).offsetAddress(i);
    }

        public native @ByRef PyObject ob_base(); public native PyDatetimeScalarObject ob_base(PyObject setter);
        public native @Cast("npy_datetime") long obval(); public native PyDatetimeScalarObject obval(long setter);
        public native @ByRef PyArray_DatetimeMetaData obmeta(); public native PyDatetimeScalarObject obmeta(PyArray_DatetimeMetaData setter);
}
