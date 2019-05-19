// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;

// #ifdef UNICODE
// #else
// #endif // !UNICODE

@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENUMRESNAMEPROCA extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    ENUMRESNAMEPROCA(Pointer p) { super(p); }
    protected ENUMRESNAMEPROCA() { allocate(); }
    private native void allocate();
    public native @Cast("BOOL") boolean call(
    @Cast("HMODULE") Pointer hModule,
    @Cast("LPCSTR") BytePointer lpType,
    @Cast("LPSTR") BytePointer lpName,
    @Cast("LONG_PTR") long lParam);
}
