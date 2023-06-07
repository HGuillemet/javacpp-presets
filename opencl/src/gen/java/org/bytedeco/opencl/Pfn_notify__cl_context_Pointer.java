// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


// #ifdef CL_VERSION_3_0

@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class Pfn_notify__cl_context_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Pfn_notify__cl_context_Pointer(Pointer p) { super(p); }
    protected Pfn_notify__cl_context_Pointer() { allocate(); }
    private native void allocate();
    public native void call(_cl_context context,
                                                              Pointer user_data);
}
