// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class COMMCONFIG extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public COMMCONFIG() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public COMMCONFIG(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public COMMCONFIG(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public COMMCONFIG position(long position) {
        return (COMMCONFIG)super.position(position);
    }
    @Override public COMMCONFIG getPointer(long i) {
        return new COMMCONFIG((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int dwSize(); public native COMMCONFIG dwSize(int setter);               /* Size of the entire struct */
    public native @Cast("WORD") short wVersion(); public native COMMCONFIG wVersion(short setter);              /* version of the structure */
    public native @Cast("WORD") short wReserved(); public native COMMCONFIG wReserved(short setter);             /* alignment */
    public native @ByRef DCB dcb(); public native COMMCONFIG dcb(DCB setter);                    /* device control block */
    public native @Cast("DWORD") int dwProviderSubType(); public native COMMCONFIG dwProviderSubType(int setter);    /* ordinal value for identifying
                                   provider-defined data structure format*/
    public native @Cast("DWORD") int dwProviderOffset(); public native COMMCONFIG dwProviderOffset(int setter);     /* Specifies the offset of provider specific
                                   data field in bytes from the start */
    public native @Cast("DWORD") int dwProviderSize(); public native COMMCONFIG dwProviderSize(int setter);       /* size of the provider-specific data field */
    public native @Cast("WCHAR") char wcProviderData(int i); public native COMMCONFIG wcProviderData(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer wcProviderData();    /* provider-specific data */
}
