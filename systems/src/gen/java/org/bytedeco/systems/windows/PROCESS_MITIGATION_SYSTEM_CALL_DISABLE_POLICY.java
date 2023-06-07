// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY position(long position) {
        return (PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY)super.position(position);
    }
    @Override public PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY getPointer(long i) {
        return new PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY((Pointer)this).offsetAddress(i);
    }

        public native @Cast("DWORD") int Flags(); public native PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY Flags(int setter);
            public native @Cast("DWORD") @NoOffset int DisallowWin32kSystemCalls(); public native PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY DisallowWin32kSystemCalls(int setter);
            public native @Cast("DWORD") @NoOffset int ReservedFlags(); public native PROCESS_MITIGATION_SYSTEM_CALL_DISABLE_POLICY ReservedFlags(int setter);
}
