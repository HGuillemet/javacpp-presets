// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class PPM_IDLE_STATE_ACCOUNTING extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PPM_IDLE_STATE_ACCOUNTING() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PPM_IDLE_STATE_ACCOUNTING(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PPM_IDLE_STATE_ACCOUNTING(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PPM_IDLE_STATE_ACCOUNTING position(long position) {
        return (PPM_IDLE_STATE_ACCOUNTING)super.position(position);
    }
    @Override public PPM_IDLE_STATE_ACCOUNTING getPointer(long i) {
        return new PPM_IDLE_STATE_ACCOUNTING((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int IdleTransitions(); public native PPM_IDLE_STATE_ACCOUNTING IdleTransitions(int setter);
    public native @Cast("DWORD") int FailedTransitions(); public native PPM_IDLE_STATE_ACCOUNTING FailedTransitions(int setter);
    public native @Cast("DWORD") int InvalidBucketIndex(); public native PPM_IDLE_STATE_ACCOUNTING InvalidBucketIndex(int setter);
    public native @Cast("DWORD64") long TotalTime(); public native PPM_IDLE_STATE_ACCOUNTING TotalTime(long setter);
    public native @Cast("DWORD") int IdleTimeBuckets(int i); public native PPM_IDLE_STATE_ACCOUNTING IdleTimeBuckets(int i, int setter);
    @MemberGetter public native @Cast("DWORD*") IntPointer IdleTimeBuckets();
}
