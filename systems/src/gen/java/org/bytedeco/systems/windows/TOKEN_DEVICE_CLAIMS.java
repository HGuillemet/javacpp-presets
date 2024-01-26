// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TOKEN_DEVICE_CLAIMS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TOKEN_DEVICE_CLAIMS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TOKEN_DEVICE_CLAIMS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TOKEN_DEVICE_CLAIMS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TOKEN_DEVICE_CLAIMS position(long position) {
        return (TOKEN_DEVICE_CLAIMS)super.position(position);
    }
    @Override public TOKEN_DEVICE_CLAIMS getPointer(long i) {
        return new TOKEN_DEVICE_CLAIMS((Pointer)this).offsetAddress(i);
    }

    public native @Cast("PCLAIMS_BLOB") Pointer DeviceClaims(); public native TOKEN_DEVICE_CLAIMS DeviceClaims(Pointer setter);
}
