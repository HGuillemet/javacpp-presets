// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACCESS_ALLOWED_CALLBACK_OBJECT_ACE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACCESS_ALLOWED_CALLBACK_OBJECT_ACE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACCESS_ALLOWED_CALLBACK_OBJECT_ACE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACCESS_ALLOWED_CALLBACK_OBJECT_ACE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACCESS_ALLOWED_CALLBACK_OBJECT_ACE position(long position) {
        return (ACCESS_ALLOWED_CALLBACK_OBJECT_ACE)super.position(position);
    }

    public native @ByRef ACE_HEADER Header(); public native ACCESS_ALLOWED_CALLBACK_OBJECT_ACE Header(ACE_HEADER setter);
    public native @Cast("ACCESS_MASK") int Mask(); public native ACCESS_ALLOWED_CALLBACK_OBJECT_ACE Mask(int setter);
    public native @Cast("DWORD") int Flags(); public native ACCESS_ALLOWED_CALLBACK_OBJECT_ACE Flags(int setter);
    public native @ByRef GUID ObjectType(); public native ACCESS_ALLOWED_CALLBACK_OBJECT_ACE ObjectType(GUID setter);
    public native @ByRef GUID InheritedObjectType(); public native ACCESS_ALLOWED_CALLBACK_OBJECT_ACE InheritedObjectType(GUID setter);
    public native @Cast("DWORD") int SidStart(); public native ACCESS_ALLOWED_CALLBACK_OBJECT_ACE SidStart(int setter);
    // Opaque resource manager specific data
}
