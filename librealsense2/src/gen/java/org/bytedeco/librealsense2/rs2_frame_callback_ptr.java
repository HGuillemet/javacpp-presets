// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense2.global.realsense2.*;

@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class rs2_frame_callback_ptr extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    rs2_frame_callback_ptr(Pointer p) { super(p); }
    protected rs2_frame_callback_ptr() { allocate(); }
    private native void allocate();
    public native void call(rs2_frame arg0, Pointer arg1);
}
