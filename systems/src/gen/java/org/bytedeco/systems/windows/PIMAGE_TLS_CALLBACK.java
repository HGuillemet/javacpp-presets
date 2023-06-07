// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Thread Local Storage
//

@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PIMAGE_TLS_CALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PIMAGE_TLS_CALLBACK(Pointer p) { super(p); }
    protected PIMAGE_TLS_CALLBACK() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("PVOID") Pointer DllHandle,
    @Cast("DWORD") int Reason,
    @Cast("PVOID") Pointer Reserved
    );
}
