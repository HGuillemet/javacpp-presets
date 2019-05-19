// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// N.B.  High entropy mode is read only and can only be set at creation time
//       and not via the ProcessMitigationPolicy APIs.
//

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PROCESS_MITIGATION_ASLR_POLICY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PROCESS_MITIGATION_ASLR_POLICY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PROCESS_MITIGATION_ASLR_POLICY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PROCESS_MITIGATION_ASLR_POLICY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PROCESS_MITIGATION_ASLR_POLICY position(long position) {
        return (PROCESS_MITIGATION_ASLR_POLICY)super.position(position);
    }

        public native @Cast("DWORD") int Flags(); public native PROCESS_MITIGATION_ASLR_POLICY Flags(int setter);
            public native @Cast("DWORD") @NoOffset int EnableBottomUpRandomization(); public native PROCESS_MITIGATION_ASLR_POLICY EnableBottomUpRandomization(int setter);
            public native @Cast("DWORD") @NoOffset int EnableForceRelocateImages(); public native PROCESS_MITIGATION_ASLR_POLICY EnableForceRelocateImages(int setter);
            public native @Cast("DWORD") @NoOffset int EnableHighEntropy(); public native PROCESS_MITIGATION_ASLR_POLICY EnableHighEntropy(int setter);
            public native @Cast("DWORD") @NoOffset int DisallowStrippedImages(); public native PROCESS_MITIGATION_ASLR_POLICY DisallowStrippedImages(int setter);
            public native @Cast("DWORD") @NoOffset int ReservedFlags(); public native PROCESS_MITIGATION_ASLR_POLICY ReservedFlags(int setter);
}
