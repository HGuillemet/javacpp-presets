// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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
public class PyUnicodeScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyUnicodeScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyUnicodeScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyUnicodeScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyUnicodeScalarObject position(long position) {
        return (PyUnicodeScalarObject)super.position(position);
    }
    @Override public PyUnicodeScalarObject getPointer(long i) {
        return new PyUnicodeScalarObject((Pointer)this).offsetAddress(i);
    }

        /* note that the PyObject_HEAD macro lives right here */
        public native @ByRef PyUnicodeObject base(); public native PyUnicodeScalarObject base(PyUnicodeObject setter);
        public native @Cast("Py_UCS4*") IntPointer obval(); public native PyUnicodeScalarObject obval(IntPointer setter);
//     #if NPY_FEATURE_VERSION >= NPY_1_20_API_VERSION
//     #endif
}
