// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ENUMUILANG extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ENUMUILANG() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ENUMUILANG(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ENUMUILANG(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ENUMUILANG position(long position) {
        return (ENUMUILANG)super.position(position);
    }
    @Override public ENUMUILANG getPointer(long i) {
        return new ENUMUILANG((Pointer)this).offsetAddress(i);
    }

    public native @Cast("ULONG") long NumOfEnumUILang(); public native ENUMUILANG NumOfEnumUILang(long setter);    // Acutall number of enumerated languages
    public native @Cast("ULONG") long SizeOfEnumUIBuffer(); public native ENUMUILANG SizeOfEnumUIBuffer(long setter); // Buffer size of pMUIEnumUILanguages
    public native @Cast("LANGID*") ShortPointer pEnumUIBuffer(); public native ENUMUILANG pEnumUIBuffer(ShortPointer setter);
}
