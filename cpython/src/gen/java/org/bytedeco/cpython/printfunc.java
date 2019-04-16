// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.cpython;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cpython.global.python.*;

// #ifndef Py_LIMITED_API
/* We can't provide a full compile-time check that limited-API
   users won't implement tp_print. However, not defining printfunc
   and making tp_print of a different function pointer type
   should at least cause a warning in most cases. */
@Properties(inherit = org.bytedeco.cpython.presets.python.class)
public class printfunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    printfunc(Pointer p) { super(p); }
    protected printfunc() { allocate(); }
    private native void allocate();
    public native int call(PyObject arg0, @Cast("FILE*") Pointer arg1, int arg2);
}
