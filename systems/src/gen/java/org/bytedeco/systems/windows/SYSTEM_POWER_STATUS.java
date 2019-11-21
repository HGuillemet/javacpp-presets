// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_POWER_STATUS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_POWER_STATUS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_POWER_STATUS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_POWER_STATUS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_POWER_STATUS position(long position) {
        return (SYSTEM_POWER_STATUS)super.position(position);
    }

    public native @Cast("BYTE") byte ACLineStatus(); public native SYSTEM_POWER_STATUS ACLineStatus(byte setter);
    public native @Cast("BYTE") byte BatteryFlag(); public native SYSTEM_POWER_STATUS BatteryFlag(byte setter);
    public native @Cast("BYTE") byte BatteryLifePercent(); public native SYSTEM_POWER_STATUS BatteryLifePercent(byte setter);
    public native @Cast("BYTE") byte Reserved1(); public native SYSTEM_POWER_STATUS Reserved1(byte setter);
    public native @Cast("DWORD") int BatteryLifeTime(); public native SYSTEM_POWER_STATUS BatteryLifeTime(int setter);
    public native @Cast("DWORD") int BatteryFullLifeTime(); public native SYSTEM_POWER_STATUS BatteryFullLifeTime(int setter);
}
