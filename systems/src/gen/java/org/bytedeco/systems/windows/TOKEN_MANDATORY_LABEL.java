// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_MANDATORY_LABEL extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_MANDATORY_LABEL() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_MANDATORY_LABEL(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_MANDATORY_LABEL(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_MANDATORY_LABEL position(long position) {
        return (TOKEN_MANDATORY_LABEL)super.position(position);
    }
    @Override public TOKEN_MANDATORY_LABEL getPointer(long i) {
        return new TOKEN_MANDATORY_LABEL((Pointer)this).offsetAddress(i);
    }

    public native @ByRef SID_AND_ATTRIBUTES Label(); public native TOKEN_MANDATORY_LABEL Label(SID_AND_ATTRIBUTES setter);
}
