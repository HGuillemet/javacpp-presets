// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STRsm extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STRsm() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STRsm(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STRsm(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STRsm position(long position) {
        return (STRsm)super.position(position);
    }
    @Override public STRsm getPointer(long i) {
        return new STRsm((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int rsmBypass(); public native STRsm rsmBypass(int setter);
    public native float diffThresh(); public native STRsm diffThresh(float setter);
    public native float sloRauDiffThresh(); public native STRsm sloRauDiffThresh(float setter);
    public native @Cast("uint32_t") int removeThresh(); public native STRsm removeThresh(int setter);
}
