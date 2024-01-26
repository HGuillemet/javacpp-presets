// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class FILE_STREAM_INFO extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FILE_STREAM_INFO() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FILE_STREAM_INFO(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FILE_STREAM_INFO(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FILE_STREAM_INFO position(long position) {
        return (FILE_STREAM_INFO)super.position(position);
    }
    @Override public FILE_STREAM_INFO getPointer(long i) {
        return new FILE_STREAM_INFO((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int NextEntryOffset(); public native FILE_STREAM_INFO NextEntryOffset(int setter);
    public native @Cast("DWORD") int StreamNameLength(); public native FILE_STREAM_INFO StreamNameLength(int setter);
    public native @ByRef LARGE_INTEGER StreamSize(); public native FILE_STREAM_INFO StreamSize(LARGE_INTEGER setter);
    public native @ByRef LARGE_INTEGER StreamAllocationSize(); public native FILE_STREAM_INFO StreamAllocationSize(LARGE_INTEGER setter);
    public native @Cast("WCHAR") char StreamName(int i); public native FILE_STREAM_INFO StreamName(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer StreamName();
}
