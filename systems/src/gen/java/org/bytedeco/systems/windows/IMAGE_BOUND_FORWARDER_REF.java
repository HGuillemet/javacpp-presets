// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_BOUND_FORWARDER_REF extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_BOUND_FORWARDER_REF() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_BOUND_FORWARDER_REF(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_BOUND_FORWARDER_REF(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_BOUND_FORWARDER_REF position(long position) {
        return (IMAGE_BOUND_FORWARDER_REF)super.position(position);
    }
    @Override public IMAGE_BOUND_FORWARDER_REF getPointer(long i) {
        return new IMAGE_BOUND_FORWARDER_REF((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int TimeDateStamp(); public native IMAGE_BOUND_FORWARDER_REF TimeDateStamp(int setter);
    public native @Cast("WORD") short OffsetModuleName(); public native IMAGE_BOUND_FORWARDER_REF OffsetModuleName(short setter);
    public native @Cast("WORD") short Reserved(); public native IMAGE_BOUND_FORWARDER_REF Reserved(short setter);
}
