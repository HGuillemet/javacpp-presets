// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_AUDIT_CALLBACK_ACE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_AUDIT_CALLBACK_ACE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_AUDIT_CALLBACK_ACE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_AUDIT_CALLBACK_ACE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_AUDIT_CALLBACK_ACE position(long position) {
        return (SYSTEM_AUDIT_CALLBACK_ACE)super.position(position);
    }

    public native @ByRef ACE_HEADER Header(); public native SYSTEM_AUDIT_CALLBACK_ACE Header(ACE_HEADER setter);
    public native @Cast("ACCESS_MASK") int Mask(); public native SYSTEM_AUDIT_CALLBACK_ACE Mask(int setter);
    public native @Cast("DWORD") int SidStart(); public native SYSTEM_AUDIT_CALLBACK_ACE SidStart(int setter);
    // Opaque resource manager specific data
}
