// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;



// system power policies
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class SYSTEM_POWER_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SYSTEM_POWER_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SYSTEM_POWER_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SYSTEM_POWER_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SYSTEM_POWER_POLICY position(long position) {
        return (SYSTEM_POWER_POLICY)super.position(position);
    }

    public native @Cast("DWORD") int Revision(); public native SYSTEM_POWER_POLICY Revision(int setter);       // 1

    // events
    public native @ByRef POWER_ACTION_POLICY PowerButton(); public native SYSTEM_POWER_POLICY PowerButton(POWER_ACTION_POLICY setter);
    public native @ByRef POWER_ACTION_POLICY SleepButton(); public native SYSTEM_POWER_POLICY SleepButton(POWER_ACTION_POLICY setter);
    public native @ByRef POWER_ACTION_POLICY LidClose(); public native SYSTEM_POWER_POLICY LidClose(POWER_ACTION_POLICY setter);
    public native @Cast("SYSTEM_POWER_STATE") int LidOpenWake(); public native SYSTEM_POWER_POLICY LidOpenWake(int setter);
    public native @Cast("DWORD") int Reserved(); public native SYSTEM_POWER_POLICY Reserved(int setter);

    // "system idle" detection
    public native @ByRef POWER_ACTION_POLICY Idle(); public native SYSTEM_POWER_POLICY Idle(POWER_ACTION_POLICY setter);
    public native @Cast("DWORD") int IdleTimeout(); public native SYSTEM_POWER_POLICY IdleTimeout(int setter);
    public native @Cast("BYTE") byte IdleSensitivity(); public native SYSTEM_POWER_POLICY IdleSensitivity(byte setter);

    public native @Cast("BYTE") byte DynamicThrottle(); public native SYSTEM_POWER_POLICY DynamicThrottle(byte setter);
    public native @Cast("BYTE") byte Spare2(int i); public native SYSTEM_POWER_POLICY Spare2(int i, byte setter);
    @MemberGetter public native @Cast("BYTE*") BytePointer Spare2();

    // meaning of power action "sleep"
    public native @Cast("SYSTEM_POWER_STATE") int MinSleep(); public native SYSTEM_POWER_POLICY MinSleep(int setter);
    public native @Cast("SYSTEM_POWER_STATE") int MaxSleep(); public native SYSTEM_POWER_POLICY MaxSleep(int setter);
    public native @Cast("SYSTEM_POWER_STATE") int ReducedLatencySleep(); public native SYSTEM_POWER_POLICY ReducedLatencySleep(int setter);
    public native @Cast("DWORD") int WinLogonFlags(); public native SYSTEM_POWER_POLICY WinLogonFlags(int setter);

    public native @Cast("DWORD") int Spare3(); public native SYSTEM_POWER_POLICY Spare3(int setter);

    // parameters for dozing
    //
    public native @Cast("DWORD") int DozeS4Timeout(); public native SYSTEM_POWER_POLICY DozeS4Timeout(int setter);

    // battery policies
    public native @Cast("DWORD") int BroadcastCapacityResolution(); public native SYSTEM_POWER_POLICY BroadcastCapacityResolution(int setter);
    public native @ByRef SYSTEM_POWER_LEVEL DischargePolicy(int i); public native SYSTEM_POWER_POLICY DischargePolicy(int i, SYSTEM_POWER_LEVEL setter);
    @MemberGetter public native SYSTEM_POWER_LEVEL DischargePolicy();

    // video policies
    public native @Cast("DWORD") int VideoTimeout(); public native SYSTEM_POWER_POLICY VideoTimeout(int setter);
    public native @Cast("BOOLEAN") boolean VideoDimDisplay(); public native SYSTEM_POWER_POLICY VideoDimDisplay(boolean setter);
    public native @Cast("DWORD") int VideoReserved(int i); public native SYSTEM_POWER_POLICY VideoReserved(int i, int setter);
    @MemberGetter public native @Cast("DWORD*") IntPointer VideoReserved();

    // hard disk policies
    public native @Cast("DWORD") int SpindownTimeout(); public native SYSTEM_POWER_POLICY SpindownTimeout(int setter);

    // processor policies
    public native @Cast("BOOLEAN") boolean OptimizeForPower(); public native SYSTEM_POWER_POLICY OptimizeForPower(boolean setter);
    public native @Cast("BYTE") byte FanThrottleTolerance(); public native SYSTEM_POWER_POLICY FanThrottleTolerance(byte setter);
    public native @Cast("BYTE") byte ForcedThrottle(); public native SYSTEM_POWER_POLICY ForcedThrottle(byte setter);
    public native @Cast("BYTE") byte MinThrottle(); public native SYSTEM_POWER_POLICY MinThrottle(byte setter);
    public native @ByRef POWER_ACTION_POLICY OverThrottled(); public native SYSTEM_POWER_POLICY OverThrottled(POWER_ACTION_POLICY setter);

}
