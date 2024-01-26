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


/*
 * This is a function for hooking into the PyDataMem_NEW/FREE/RENEW functions.
 * See the documentation for PyDataMem_SetEventHook.
 */
@Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class PyDataMem_EventHookFunc extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PyDataMem_EventHookFunc(Pointer p) { super(p); }
    protected PyDataMem_EventHookFunc() { allocate(); }
    private native void allocate();
    public native void call(Pointer inp, Pointer outp, @Cast("size_t") long size,
                                       Pointer user_data);
}
