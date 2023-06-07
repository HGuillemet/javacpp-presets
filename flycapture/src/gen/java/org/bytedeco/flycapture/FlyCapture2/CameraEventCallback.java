// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /* Callback function typedef: a function accepting pointer-to-void input as its sole
     * argument, and returns void (ie: nothing).
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class CameraEventCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    CameraEventCallback(Pointer p) { super(p); }
        protected CameraEventCallback() { allocate(); }
        private native void allocate();
        public native void call(Pointer data);
    }
