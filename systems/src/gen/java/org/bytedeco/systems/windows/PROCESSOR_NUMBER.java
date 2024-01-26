// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


//
// Structure to represent a system wide processor number. It contains a
// group number and relative processor number within the group.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESSOR_NUMBER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESSOR_NUMBER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESSOR_NUMBER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESSOR_NUMBER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESSOR_NUMBER position(long position) {
        return (PROCESSOR_NUMBER)super.position(position);
    }
    @Override public PROCESSOR_NUMBER getPointer(long i) {
        return new PROCESSOR_NUMBER((Pointer)this).offsetAddress(i);
    }

    public native @Cast("WORD") short Group(); public native PROCESSOR_NUMBER Group(short setter);
    public native @Cast("BYTE") byte Number(); public native PROCESSOR_NUMBER Number(byte setter);
    public native @Cast("BYTE") byte Reserved(); public native PROCESSOR_NUMBER Reserved(byte setter);
}
