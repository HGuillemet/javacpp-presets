// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class NEARPROC extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    NEARPROC(Pointer p) { super(p); }
    protected NEARPROC() { allocate(); }
    private native void allocate();
    public native @Cast("INT_PTR") long call();
}
