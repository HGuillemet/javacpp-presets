// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
/** \struct HEVCTIMECODESET
/** Used to store Time code extracted from Time code SEI in HEVC codec
/************************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class HEVCTIMECODESET extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HEVCTIMECODESET() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HEVCTIMECODESET(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HEVCTIMECODESET(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HEVCTIMECODESET position(long position) {
        return (HEVCTIMECODESET)super.position(position);
    }
    @Override public HEVCTIMECODESET getPointer(long i) {
        return new HEVCTIMECODESET((Pointer)this).offsetAddress(i);
    }

    public native @Cast("unsigned int") int time_offset_value(); public native HEVCTIMECODESET time_offset_value(int setter);
    public native @Cast("unsigned short") short n_frames(); public native HEVCTIMECODESET n_frames(short setter);                 
    public native @Cast("unsigned char") byte clock_timestamp_flag(); public native HEVCTIMECODESET clock_timestamp_flag(byte setter);
    public native @Cast("unsigned char") byte units_field_based_flag(); public native HEVCTIMECODESET units_field_based_flag(byte setter);
    public native @Cast("unsigned char") byte counting_type(); public native HEVCTIMECODESET counting_type(byte setter);
    public native @Cast("unsigned char") byte full_timestamp_flag(); public native HEVCTIMECODESET full_timestamp_flag(byte setter);
    public native @Cast("unsigned char") byte discontinuity_flag(); public native HEVCTIMECODESET discontinuity_flag(byte setter);
    public native @Cast("unsigned char") byte cnt_dropped_flag(); public native HEVCTIMECODESET cnt_dropped_flag(byte setter);
    public native @Cast("unsigned char") byte seconds_value(); public native HEVCTIMECODESET seconds_value(byte setter);
    public native @Cast("unsigned char") byte minutes_value(); public native HEVCTIMECODESET minutes_value(byte setter);
    public native @Cast("unsigned char") byte hours_value(); public native HEVCTIMECODESET hours_value(byte setter);
    public native @Cast("unsigned char") byte seconds_flag(); public native HEVCTIMECODESET seconds_flag(byte setter);
    public native @Cast("unsigned char") byte minutes_flag(); public native HEVCTIMECODESET minutes_flag(byte setter);
    public native @Cast("unsigned char") byte hours_flag(); public native HEVCTIMECODESET hours_flag(byte setter);
    public native @Cast("unsigned char") byte time_offset_length(); public native HEVCTIMECODESET time_offset_length(byte setter);
    public native @Cast("unsigned char") byte reserved(); public native HEVCTIMECODESET reserved(byte setter);
}
