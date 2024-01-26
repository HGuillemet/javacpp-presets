// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/************************************************************************/
/** \ingroup STRUCTS
/** \struct HEVCSEITIMECODE
/** Used to extract Time code SEI in HEVC codec
/************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class HEVCSEITIMECODE extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HEVCSEITIMECODE() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HEVCSEITIMECODE(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HEVCSEITIMECODE(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HEVCSEITIMECODE position(long position) {
        return (HEVCSEITIMECODE)super.position(position);
    }
    @Override public HEVCSEITIMECODE getPointer(long i) {
        return new HEVCSEITIMECODE((Pointer)this).offsetAddress(i);
    }

    public native @ByRef HEVCTIMECODESET time_code_set(int i); public native HEVCSEITIMECODE time_code_set(int i, HEVCTIMECODESET setter);
    @MemberGetter public native HEVCTIMECODESET time_code_set();
    public native @Cast("unsigned char") byte num_clock_ts(); public native HEVCSEITIMECODE num_clock_ts(byte setter);
}
