// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /**
     * Image event callback function prototype. Defines the syntax of the
     * image callback function that is passed into StartCapture(). It is
     * possible for this function to be called simultaneously. Therefore,
     * users must make sure that code in the callback is thread safe.
     */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class ImageEventCallback extends FunctionPointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public    ImageEventCallback(Pointer p) { super(p); }
        protected ImageEventCallback() { allocate(); }
        private native void allocate();
        public native void call( Image pImage, @Const Pointer pCallbackData );
    }
