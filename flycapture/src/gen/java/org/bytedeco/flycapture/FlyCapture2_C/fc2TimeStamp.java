// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /** Timestamp information. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2TimeStamp extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2TimeStamp() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2TimeStamp(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2TimeStamp(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2TimeStamp position(long position) {
            return (fc2TimeStamp)super.position(position);
        }
    
        /** Seconds. */
        public native long seconds(); public native fc2TimeStamp seconds(long setter);
        /** Microseconds. */
        public native @Cast("unsigned int") int microSeconds(); public native fc2TimeStamp microSeconds(int setter);
        /** 1394 cycle time seconds. */
        public native @Cast("unsigned int") int cycleSeconds(); public native fc2TimeStamp cycleSeconds(int setter);
        /** 1394 cycle time count. */
        public native @Cast("unsigned int") int cycleCount(); public native fc2TimeStamp cycleCount(int setter);
        /** 1394 cycle time offset. */
        public native @Cast("unsigned int") int cycleOffset(); public native fc2TimeStamp cycleOffset(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2TimeStamp reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
