// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.libdc1394;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.libdc1394.global.dc1394.*;

@Properties(inherit = org.bytedeco.libdc1394.presets.dc1394.class)
public class Log_handler_int_String_Pointer extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Log_handler_int_String_Pointer(Pointer p) { super(p); }
    protected Log_handler_int_String_Pointer() { allocate(); }
    private native void allocate();
    public native void call(@Cast("dc1394log_t") int type,
                                          String message, Pointer user);
}
