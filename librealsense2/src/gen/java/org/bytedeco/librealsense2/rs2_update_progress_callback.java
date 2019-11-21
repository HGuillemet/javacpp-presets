// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense2.global.realsense2.*;

@Opaque @Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class rs2_update_progress_callback extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public rs2_update_progress_callback() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs2_update_progress_callback(Pointer p) { super(p); }
}
