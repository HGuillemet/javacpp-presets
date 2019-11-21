// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #endif   /* !Py_LIMITED_API */


/* State unique per thread */

// #ifndef Py_LIMITED_API
/* Py_tracefunc return -1 when raising an exception, or 0 for success. */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class Py_tracefunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Py_tracefunc(Pointer p) { super(p); }
    protected Py_tracefunc() { allocate(); }
    private native void allocate();
    public native int call(PyObject arg0, _frame arg1, int arg2, PyObject arg3);
}
