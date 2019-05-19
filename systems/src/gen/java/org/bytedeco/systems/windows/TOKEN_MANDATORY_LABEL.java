// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

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

    public native @ByRef SID_AND_ATTRIBUTES Label(); public native TOKEN_MANDATORY_LABEL Label(SID_AND_ATTRIBUTES setter);
}
