// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;



@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyCFloatScalarObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyCFloatScalarObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyCFloatScalarObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyCFloatScalarObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyCFloatScalarObject position(long position) {
        return (PyCFloatScalarObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyCFloatScalarObject ob_base(PyObject setter);
        public native @ByRef npy_cfloat obval(); public native PyCFloatScalarObject obval(npy_cfloat setter);
}
