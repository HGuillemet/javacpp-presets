// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


// end_wdm end_ntminiport

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION position(long position) {
        return (SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION)super.position(position);
    }
    @Override public SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION getPointer(long i) {
        return new SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD64") long CycleTime(); public native SYSTEM_PROCESSOR_CYCLE_TIME_INFORMATION CycleTime(long setter);
}
