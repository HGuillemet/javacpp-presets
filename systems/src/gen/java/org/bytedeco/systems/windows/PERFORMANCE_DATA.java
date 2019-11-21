// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PERFORMANCE_DATA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PERFORMANCE_DATA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PERFORMANCE_DATA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PERFORMANCE_DATA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PERFORMANCE_DATA position(long position) {
        return (PERFORMANCE_DATA)super.position(position);
    }

    public native @Cast("WORD") short Size(); public native PERFORMANCE_DATA Size(short setter);
    public native @Cast("BYTE") byte Version(); public native PERFORMANCE_DATA Version(byte setter);
    public native @Cast("BYTE") byte HwCountersCount(); public native PERFORMANCE_DATA HwCountersCount(byte setter);
    public native @Cast("DWORD") int ContextSwitchCount(); public native PERFORMANCE_DATA ContextSwitchCount(int setter);
    public native @Cast("DWORD64") long WaitReasonBitMap(); public native PERFORMANCE_DATA WaitReasonBitMap(long setter);
    public native @Cast("DWORD64") long CycleTime(); public native PERFORMANCE_DATA CycleTime(long setter);
    public native @Cast("DWORD") int RetryCount(); public native PERFORMANCE_DATA RetryCount(int setter);
    public native @Cast("DWORD") int Reserved(); public native PERFORMANCE_DATA Reserved(int setter);
    public native @ByRef HARDWARE_COUNTER_DATA HwCounters(int i); public native PERFORMANCE_DATA HwCounters(int i, HARDWARE_COUNTER_DATA setter);
    @MemberGetter public native HARDWARE_COUNTER_DATA HwCounters();
}
