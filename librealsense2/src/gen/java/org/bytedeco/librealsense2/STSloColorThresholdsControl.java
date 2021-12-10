// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STSloColorThresholdsControl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STSloColorThresholdsControl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STSloColorThresholdsControl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STSloColorThresholdsControl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STSloColorThresholdsControl position(long position) {
        return (STSloColorThresholdsControl)super.position(position);
    }
    @Override public STSloColorThresholdsControl getPointer(long i) {
        return new STSloColorThresholdsControl((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int diffThresholdRed(); public native STSloColorThresholdsControl diffThresholdRed(int setter);
    public native @Cast("uint32_t") int diffThresholdGreen(); public native STSloColorThresholdsControl diffThresholdGreen(int setter);
    public native @Cast("uint32_t") int diffThresholdBlue(); public native STSloColorThresholdsControl diffThresholdBlue(int setter);
}
