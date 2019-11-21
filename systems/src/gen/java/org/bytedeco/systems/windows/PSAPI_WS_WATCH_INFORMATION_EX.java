// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PSAPI_WS_WATCH_INFORMATION_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PSAPI_WS_WATCH_INFORMATION_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PSAPI_WS_WATCH_INFORMATION_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PSAPI_WS_WATCH_INFORMATION_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PSAPI_WS_WATCH_INFORMATION_EX position(long position) {
        return (PSAPI_WS_WATCH_INFORMATION_EX)super.position(position);
    }

    public native @ByRef PSAPI_WS_WATCH_INFORMATION BasicInfo(); public native PSAPI_WS_WATCH_INFORMATION_EX BasicInfo(PSAPI_WS_WATCH_INFORMATION setter);
    public native @Cast("ULONG_PTR") long FaultingThreadId(); public native PSAPI_WS_WATCH_INFORMATION_EX FaultingThreadId(long setter);
    public native @Cast("ULONG_PTR") long Flags(); public native PSAPI_WS_WATCH_INFORMATION_EX Flags(long setter);    // Reserved
}
