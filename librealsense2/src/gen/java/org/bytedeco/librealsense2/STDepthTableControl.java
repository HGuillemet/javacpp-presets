// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class STDepthTableControl extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public STDepthTableControl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public STDepthTableControl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public STDepthTableControl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public STDepthTableControl position(long position) {
        return (STDepthTableControl)super.position(position);
    }
    @Override public STDepthTableControl getPointer(long i) {
        return new STDepthTableControl((Pointer)this).offsetAddress(i);
    }

    public native @Cast("uint32_t") int depthUnits(); public native STDepthTableControl depthUnits(int setter);
    public native int depthClampMin(); public native STDepthTableControl depthClampMin(int setter);
    public native int depthClampMax(); public native STDepthTableControl depthClampMax(int setter);
    public native @Cast("uint32_t") int disparityMode(); public native STDepthTableControl disparityMode(int setter);
    public native int disparityShift(); public native STDepthTableControl disparityShift(int setter);
}
