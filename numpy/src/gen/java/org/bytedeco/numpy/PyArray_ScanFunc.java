// Targeted by JavaCPP version 1.5.6-SNAPSHOT: DO NOT EDIT THIS FILE

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
 * XXX the ignore argument should be removed next time the API version
 * is bumped. It used to be the separator.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyArray_ScanFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyArray_ScanFunc(Pointer p) { super(p); }
    protected PyArray_ScanFunc() { allocate(); }
    private native void allocate();
    public native int call(@Cast("FILE*") Pointer fp, Pointer dptr,
                               @Cast("char*") BytePointer ignore, _PyArray_Descr arg3);
}
