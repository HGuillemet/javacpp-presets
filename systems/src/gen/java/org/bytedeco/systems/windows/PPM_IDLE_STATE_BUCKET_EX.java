// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_IDLE_STATE_BUCKET_EX extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_IDLE_STATE_BUCKET_EX() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_IDLE_STATE_BUCKET_EX(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_IDLE_STATE_BUCKET_EX(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_IDLE_STATE_BUCKET_EX position(long position) {
        return (PPM_IDLE_STATE_BUCKET_EX)super.position(position);
    }

    public native @Cast("DWORD64") long TotalTimeUs(); public native PPM_IDLE_STATE_BUCKET_EX TotalTimeUs(long setter);
    public native @Cast("DWORD") int MinTimeUs(); public native PPM_IDLE_STATE_BUCKET_EX MinTimeUs(int setter);
    public native @Cast("DWORD") int MaxTimeUs(); public native PPM_IDLE_STATE_BUCKET_EX MaxTimeUs(int setter);
    public native @Cast("DWORD") int Count(); public native PPM_IDLE_STATE_BUCKET_EX Count(int setter);
}
