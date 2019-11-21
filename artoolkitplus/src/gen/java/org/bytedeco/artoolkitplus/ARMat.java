// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.artoolkitplus;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.artoolkitplus.global.ARToolKitPlus.*;


/* === matrix definition ===

 <---- clm --->
 [ 10  20  30 ] ^
 [ 20  10  15 ] |
 [ 12  23  13 ] row
 [ 20  10  15 ] |
 [ 13  14  15 ] v

 =========================== */

@Namespace("ARToolKitPlus") @Properties(inherit = org.bytedeco.artoolkitplus.presets.ARToolKitPlus.class)
public class ARMat extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ARMat() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ARMat(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ARMat(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ARMat position(long position) {
        return (ARMat)super.position(position);
    }

    public native @Cast("ARFloat*") FloatPointer m(); public native ARMat m(FloatPointer setter);
    public native int row(); public native ARMat row(int setter);
    public native int clm(); public native ARMat clm(int setter);
}
