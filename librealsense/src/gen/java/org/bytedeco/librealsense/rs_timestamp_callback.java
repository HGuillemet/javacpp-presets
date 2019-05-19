// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;


@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_timestamp_callback extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_timestamp_callback(Pointer p) { super(p); }

    public native void on_event(@ByVal rs_timestamp_data data);
    public native void release();
}
