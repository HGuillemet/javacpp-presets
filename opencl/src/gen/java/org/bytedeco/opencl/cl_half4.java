// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.opencl.global.OpenCL.*;


@Properties(inherit = org.bytedeco.opencl.presets.OpenCL.class)
public class cl_half4 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cl_half4() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cl_half4(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cl_half4(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cl_half4 position(long position) {
        return (cl_half4)super.position(position);
    }
    @Override public cl_half4 getPointer(long i) {
        return new cl_half4((Pointer)this).offsetAddress(i);
    }

    public native @Cast("cl_half") short s(int i); public native cl_half4 s(int i, short setter);
    @MemberGetter public native @Cast("cl_half*") ShortPointer s();
// #if __CL_HAS_ANON_STRUCT__
// #endif
// #if defined( __CL_HALF2__)
// #endif
// #if defined( __CL_HALF4__)
// #endif
}
