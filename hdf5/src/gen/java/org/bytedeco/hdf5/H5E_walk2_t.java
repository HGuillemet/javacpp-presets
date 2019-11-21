// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.hdf5;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.hdf5.global.hdf5.*;

// #endif

/* Error stack traversal callback function pointers */
@Properties(inherit = org.bytedeco.hdf5.presets.hdf5.class)
public class H5E_walk2_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    H5E_walk2_t(Pointer p) { super(p); }
    protected H5E_walk2_t() { allocate(); }
    private native void allocate();
    public native @Cast("herr_t") int call(@Cast("unsigned") int n, @Const H5E_error2_t err_desc,
    Pointer client_data);
}
