// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



/** Data structure to hold bitmap fonts and related data */
@Name("L_Bmf") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class L_BMF extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_BMF() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_BMF(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_BMF(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_BMF position(long position) {
        return (L_BMF)super.position(position);
    }

    /** pixa of bitmaps for 93 characters        */
    public native PIXA pixa(); public native L_BMF pixa(PIXA setter);
    /** font size (in points at 300 ppi)         */
    public native @Cast("l_int32") int size(); public native L_BMF size(int setter);
    /** directory containing font bitmaps        */
    public native @Cast("char*") BytePointer directory(); public native L_BMF directory(BytePointer setter);
    /** baseline offset for ascii 33 - 57        */
    public native @Cast("l_int32") int baseline1(); public native L_BMF baseline1(int setter);
    /** baseline offset for ascii 58 - 91        */
    public native @Cast("l_int32") int baseline2(); public native L_BMF baseline2(int setter);
    /** baseline offset for ascii 93 - 126       */
    public native @Cast("l_int32") int baseline3(); public native L_BMF baseline3(int setter);
    /** max height of line of chars              */
    public native @Cast("l_int32") int lineheight(); public native L_BMF lineheight(int setter);
    /** pixel dist between char bitmaps          */
    public native @Cast("l_int32") int kernwidth(); public native L_BMF kernwidth(int setter);
    /** pixel dist between word bitmaps          */
    public native @Cast("l_int32") int spacewidth(); public native L_BMF spacewidth(int setter);
    /** extra vertical space between text lines  */
    public native @Cast("l_int32") int vertlinesep(); public native L_BMF vertlinesep(int setter);
    /** table mapping ascii --> font index       */
    public native @Cast("l_int32*") IntPointer fonttab(); public native L_BMF fonttab(IntPointer setter);
    /** table mapping ascii --> baseline offset  */
    public native @Cast("l_int32*") IntPointer baselinetab(); public native L_BMF baselinetab(IntPointer setter);
    /** table mapping ascii --> char width       */
    public native @Cast("l_int32*") IntPointer widthtab(); public native L_BMF widthtab(IntPointer setter);
}
