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


/* Array Flags Object */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArrayFlagsObject extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PyArrayFlagsObject() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PyArrayFlagsObject(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyArrayFlagsObject(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PyArrayFlagsObject position(long position) {
        return (PyArrayFlagsObject)super.position(position);
    }

        public native @ByRef PyObject ob_base(); public native PyArrayFlagsObject ob_base(PyObject setter);
        public native PyObject arr(); public native PyArrayFlagsObject arr(PyObject setter);
        public native int flags(); public native PyArrayFlagsObject flags(int setter);
}
