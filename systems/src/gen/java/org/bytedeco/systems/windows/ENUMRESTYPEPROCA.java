// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

// #ifdef UNICODE
// #else
// #endif // !UNICODE

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENUMRESTYPEPROCA extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ENUMRESTYPEPROCA(Pointer p) { super(p); }
    protected ENUMRESTYPEPROCA() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(
    @Cast("HMODULE") Pointer hModule,
    @Cast("LPSTR") BytePointer lpType,
    @Cast("LONG_PTR") long lParam
    );
}
