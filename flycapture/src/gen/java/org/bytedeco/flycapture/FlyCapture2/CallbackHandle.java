// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /**
     * Handle that is returned when registering a callback. It is required
     * when unregistering the callback.
     */
    @Namespace @Name("void") @Opaque @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class CallbackHandle extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public CallbackHandle() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public CallbackHandle(Pointer p) { super(p); }
    }
