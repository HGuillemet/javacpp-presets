// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class XSTATE_CONFIGURATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public XSTATE_CONFIGURATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public XSTATE_CONFIGURATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public XSTATE_CONFIGURATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public XSTATE_CONFIGURATION position(long position) {
        return (XSTATE_CONFIGURATION)super.position(position);
    }

    // Mask of all enabled features
    public native @Cast("DWORD64") long EnabledFeatures(); public native XSTATE_CONFIGURATION EnabledFeatures(long setter);

    // Mask of volatile enabled features
    public native @Cast("DWORD64") long EnabledVolatileFeatures(); public native XSTATE_CONFIGURATION EnabledVolatileFeatures(long setter);

    // Total size of the save area
    public native @Cast("DWORD") int Size(); public native XSTATE_CONFIGURATION Size(int setter);

    public native @Cast("DWORD") @NoOffset int OptimizedSave(); public native XSTATE_CONFIGURATION OptimizedSave(int setter);

    // List of features (
    public native @ByRef XSTATE_FEATURE Features(int i); public native XSTATE_CONFIGURATION Features(int i, XSTATE_FEATURE setter);
    @MemberGetter public native XSTATE_FEATURE Features();

}
