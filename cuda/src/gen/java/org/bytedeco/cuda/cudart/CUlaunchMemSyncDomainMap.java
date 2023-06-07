// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class CUlaunchMemSyncDomainMap extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUlaunchMemSyncDomainMap() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUlaunchMemSyncDomainMap(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUlaunchMemSyncDomainMap(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUlaunchMemSyncDomainMap position(long position) {
        return (CUlaunchMemSyncDomainMap)super.position(position);
    }
    @Override public CUlaunchMemSyncDomainMap getPointer(long i) {
        return new CUlaunchMemSyncDomainMap((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned char") byte default_(); public native CUlaunchMemSyncDomainMap default_(byte setter);
    public native @Cast("unsigned char") byte remote(); public native CUlaunchMemSyncDomainMap remote(byte setter);
}
