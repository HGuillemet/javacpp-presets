// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvcuvid;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.nvcodec.global.nvcuvid.*;


/************************************************************/
/** \struct CUVIDH264MVCEXT
/** H.264 MVC picture parameters ext
/** This structure is used in CUVIDH264PICPARAMS structure
/************************************************************/
@Properties(inherit = org.bytedeco.nvcodec.presets.nvcuvid.class)
public class CUVIDH264MVCEXT extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CUVIDH264MVCEXT() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUVIDH264MVCEXT(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUVIDH264MVCEXT(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CUVIDH264MVCEXT position(long position) {
        return (CUVIDH264MVCEXT)super.position(position);
    }
    @Override public CUVIDH264MVCEXT getPointer(long i) {
        return new CUVIDH264MVCEXT((Pointer)this).offsetAddress(i);
    }

    /** Max number of coded views minus 1 in video : Range - 0 to 1023              */
    public native int num_views_minus1(); public native CUVIDH264MVCEXT num_views_minus1(int setter);
    /** view identifier                                                             */
    public native int view_id(); public native CUVIDH264MVCEXT view_id(int setter);
    /** 1 if used for inter-view prediction, 0 if not                               */
    public native @Cast("unsigned char") byte inter_view_flag(); public native CUVIDH264MVCEXT inter_view_flag(byte setter);
    /** number of inter-view ref pics in RefPicList0                                */
    public native @Cast("unsigned char") byte num_inter_view_refs_l0(); public native CUVIDH264MVCEXT num_inter_view_refs_l0(byte setter);
    /** number of inter-view ref pics in RefPicList1                                */
    public native @Cast("unsigned char") byte num_inter_view_refs_l1(); public native CUVIDH264MVCEXT num_inter_view_refs_l1(byte setter);
    /** Reserved bits                                                               */
    public native @Cast("unsigned char") byte MVCReserved8Bits(); public native CUVIDH264MVCEXT MVCReserved8Bits(byte setter);
    /** view id of the i-th view component for inter-view prediction in RefPicList0 */
    public native int InterViewRefsL0(int i); public native CUVIDH264MVCEXT InterViewRefsL0(int i, int setter);
    @MemberGetter public native IntPointer InterViewRefsL0();
    /** view id of the i-th view component for inter-view prediction in RefPicList1 */
    public native int InterViewRefsL1(int i); public native CUVIDH264MVCEXT InterViewRefsL1(int i, int setter);
    @MemberGetter public native IntPointer InterViewRefsL1();
}
