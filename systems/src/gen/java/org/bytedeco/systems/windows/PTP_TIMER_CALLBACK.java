// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Convention("NTAPI") @Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PTP_TIMER_CALLBACK extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    PTP_TIMER_CALLBACK(Pointer p) { super(p); }
    protected PTP_TIMER_CALLBACK() { allocate(); }
    private native void allocate();
    public native void call(
    @Cast("PTP_CALLBACK_INSTANCE") TP_CALLBACK_INSTANCE Instance,
    @Cast("PVOID") Pointer Context,
    @Cast("PTP_TIMER") TP_TIMER Timer
    );
}
