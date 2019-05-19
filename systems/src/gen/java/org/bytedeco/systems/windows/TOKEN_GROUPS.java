// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_GROUPS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_GROUPS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_GROUPS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_GROUPS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_GROUPS position(long position) {
        return (TOKEN_GROUPS)super.position(position);
    }

    public native @Cast("DWORD") int GroupCount(); public native TOKEN_GROUPS GroupCount(int setter);
// #ifdef MIDL_PASS
// #else // MIDL_PASS
    public native @ByRef SID_AND_ATTRIBUTES Groups(int i); public native TOKEN_GROUPS Groups(int i, SID_AND_ATTRIBUTES setter);
    @MemberGetter public native SID_AND_ATTRIBUTES Groups();
// #endif // MIDL_PASS
}
