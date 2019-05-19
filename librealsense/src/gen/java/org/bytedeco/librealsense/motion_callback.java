// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.librealsense.global.RealSense.*;
  

    @Namespace("rs") @NoOffset @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class motion_callback extends rs_motion_callback {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public motion_callback(Pointer p) { super(p); }
    
        public motion_callback(@ByVal MotionFunction on_event) { super((Pointer)null); allocate(on_event); }
        private native void allocate(@ByVal MotionFunction on_event);

        public native void on_event(@ByVal rs_motion_data e);

        public native void release();
    }
