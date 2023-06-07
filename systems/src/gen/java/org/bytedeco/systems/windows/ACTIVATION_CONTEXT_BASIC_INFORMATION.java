// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;



// #if !defined(RC_INVOKED) /* RC complains about long symbols in #ifs */
// #if !defined(ACTIVATION_CONTEXT_BASIC_INFORMATION_DEFINED)

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ACTIVATION_CONTEXT_BASIC_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ACTIVATION_CONTEXT_BASIC_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ACTIVATION_CONTEXT_BASIC_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ACTIVATION_CONTEXT_BASIC_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ACTIVATION_CONTEXT_BASIC_INFORMATION position(long position) {
        return (ACTIVATION_CONTEXT_BASIC_INFORMATION)super.position(position);
    }
    @Override public ACTIVATION_CONTEXT_BASIC_INFORMATION getPointer(long i) {
        return new ACTIVATION_CONTEXT_BASIC_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("HANDLE") Pointer hActCtx(); public native ACTIVATION_CONTEXT_BASIC_INFORMATION hActCtx(Pointer setter);
    public native @Cast("DWORD") int dwFlags(); public native ACTIVATION_CONTEXT_BASIC_INFORMATION dwFlags(int setter);
}
