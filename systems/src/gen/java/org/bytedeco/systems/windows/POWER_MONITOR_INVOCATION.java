// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
// Monitor invocation
//
@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class POWER_MONITOR_INVOCATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public POWER_MONITOR_INVOCATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public POWER_MONITOR_INVOCATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public POWER_MONITOR_INVOCATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public POWER_MONITOR_INVOCATION position(long position) {
        return (POWER_MONITOR_INVOCATION)super.position(position);
    }

    public native @Cast("BOOLEAN") boolean On(); public native POWER_MONITOR_INVOCATION On(boolean setter);
    public native @Cast("BOOLEAN") boolean Console(); public native POWER_MONITOR_INVOCATION Console(boolean setter);
    public native @Cast("POWER_MONITOR_REQUEST_REASON") int RequestReason(); public native POWER_MONITOR_INVOCATION RequestReason(int setter);
}
