// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense2.global.realsense2.*;


/** \brief 3D coordinates with origin at topmost left corner of the lense,
     with positive Z pointing away from the camera, positive X pointing camera right and positive Y pointing camera down */
@Properties(inherit = org.bytedeco.librealsense2.presets.realsense2.class)
public class rs2_vertex extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rs2_vertex() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rs2_vertex(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs2_vertex(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rs2_vertex position(long position) {
        return (rs2_vertex)super.position(position);
    }
    @Override public rs2_vertex getPointer(long i) {
        return new rs2_vertex((Pointer)this).offsetAddress(i);
    }

    public native float xyz(int i); public native rs2_vertex xyz(int i, float setter);
    @MemberGetter public native FloatPointer xyz();
}
