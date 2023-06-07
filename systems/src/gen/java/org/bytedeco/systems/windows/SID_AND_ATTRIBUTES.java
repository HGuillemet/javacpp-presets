// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SID_AND_ATTRIBUTES extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SID_AND_ATTRIBUTES() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SID_AND_ATTRIBUTES(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SID_AND_ATTRIBUTES(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SID_AND_ATTRIBUTES position(long position) {
        return (SID_AND_ATTRIBUTES)super.position(position);
    }
    @Override public SID_AND_ATTRIBUTES getPointer(long i) {
        return new SID_AND_ATTRIBUTES((Pointer)this).offsetAddress(i);
    }

// #ifdef MIDL_PASS
// #else // MIDL_PASS
    public native @Cast("PSID") Pointer Sid(); public native SID_AND_ATTRIBUTES Sid(Pointer setter);
// #endif // MIDL_PASS
    public native @Cast("DWORD") int Attributes(); public native SID_AND_ATTRIBUTES Attributes(int setter);
    }
