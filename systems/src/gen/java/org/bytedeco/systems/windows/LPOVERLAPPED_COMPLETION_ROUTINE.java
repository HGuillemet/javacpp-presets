// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("__stdcall") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class LPOVERLAPPED_COMPLETION_ROUTINE extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    LPOVERLAPPED_COMPLETION_ROUTINE(Pointer p) { super(p); }
    protected LPOVERLAPPED_COMPLETION_ROUTINE() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("DWORD") int dwErrorCode,
    @Cast("DWORD") int dwNumberOfBytesTransfered,
    @Cast("LPOVERLAPPED") OVERLAPPED lpOverlapped
    );
}
