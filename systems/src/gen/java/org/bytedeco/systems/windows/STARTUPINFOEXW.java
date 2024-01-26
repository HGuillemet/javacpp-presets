// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class STARTUPINFOEXW extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STARTUPINFOEXW() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STARTUPINFOEXW(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STARTUPINFOEXW(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STARTUPINFOEXW position(long position) {
        return (STARTUPINFOEXW)super.position(position);
    }
    @Override public STARTUPINFOEXW getPointer(long i) {
        return new STARTUPINFOEXW((Pointer)this).offsetAddress(i);
    }

    public native @ByRef STARTUPINFOW StartupInfo(); public native STARTUPINFOEXW StartupInfo(STARTUPINFOW setter);
    public native _PROC_THREAD_ATTRIBUTE_LIST lpAttributeList(); public native STARTUPINFOEXW lpAttributeList(_PROC_THREAD_ATTRIBUTE_LIST setter);
}
