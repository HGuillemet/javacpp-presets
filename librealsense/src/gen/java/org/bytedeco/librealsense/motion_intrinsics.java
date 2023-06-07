// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


    /** \brief Motion device intrinsics: scale, bias, and variances. */
    @Namespace("rs") @Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class motion_intrinsics extends rs_motion_intrinsics {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public motion_intrinsics(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public motion_intrinsics(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public motion_intrinsics position(long position) {
            return (motion_intrinsics)super.position(position);
        }
        @Override public motion_intrinsics getPointer(long i) {
            return new motion_intrinsics((Pointer)this).offsetAddress(i);
        }
    
        public motion_intrinsics() { super((Pointer)null); allocate(); }
        private native void allocate();
    }
