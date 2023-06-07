// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class TP_POOL_STACK_INFORMATION extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TP_POOL_STACK_INFORMATION() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TP_POOL_STACK_INFORMATION(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TP_POOL_STACK_INFORMATION(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TP_POOL_STACK_INFORMATION position(long position) {
        return (TP_POOL_STACK_INFORMATION)super.position(position);
    }
    @Override public TP_POOL_STACK_INFORMATION getPointer(long i) {
        return new TP_POOL_STACK_INFORMATION((Pointer)this).offsetAddress(i);
    }

    public native @Cast("SIZE_T") long StackReserve(); public native TP_POOL_STACK_INFORMATION StackReserve(long setter);
    public native @Cast("SIZE_T") long StackCommit(); public native TP_POOL_STACK_INFORMATION StackCommit(long setter);
}
