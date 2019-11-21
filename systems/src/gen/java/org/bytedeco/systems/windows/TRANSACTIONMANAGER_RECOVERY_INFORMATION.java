// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TRANSACTIONMANAGER_RECOVERY_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TRANSACTIONMANAGER_RECOVERY_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TRANSACTIONMANAGER_RECOVERY_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TRANSACTIONMANAGER_RECOVERY_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TRANSACTIONMANAGER_RECOVERY_INFORMATION position(long position) {
        return (TRANSACTIONMANAGER_RECOVERY_INFORMATION)super.position(position);
    }

    public native @Cast("ULONGLONG") long LastRecoveredLsn(); public native TRANSACTIONMANAGER_RECOVERY_INFORMATION LastRecoveredLsn(long setter);
}
