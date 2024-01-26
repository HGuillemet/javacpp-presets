// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class EXCEPTION_RECORD32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public EXCEPTION_RECORD32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public EXCEPTION_RECORD32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EXCEPTION_RECORD32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public EXCEPTION_RECORD32 position(long position) {
        return (EXCEPTION_RECORD32)super.position(position);
    }
    @Override public EXCEPTION_RECORD32 getPointer(long i) {
        return new EXCEPTION_RECORD32((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int ExceptionCode(); public native EXCEPTION_RECORD32 ExceptionCode(int setter);
    public native @Cast("DWORD") int ExceptionFlags(); public native EXCEPTION_RECORD32 ExceptionFlags(int setter);
    public native @Cast("DWORD") int ExceptionRecord(); public native EXCEPTION_RECORD32 ExceptionRecord(int setter);
    public native @Cast("DWORD") int ExceptionAddress(); public native EXCEPTION_RECORD32 ExceptionAddress(int setter);
    public native @Cast("DWORD") int NumberParameters(); public native EXCEPTION_RECORD32 NumberParameters(int setter);
    public native @Cast("DWORD") int ExceptionInformation(int i); public native EXCEPTION_RECORD32 ExceptionInformation(int i, int setter);
    @MemberGetter public native @Cast("DWORD*") IntPointer ExceptionInformation();
}
