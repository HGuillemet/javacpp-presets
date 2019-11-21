// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;



/*-------------------------------------------------------------------------*
 *                              Array of Pta                               *
 *-------------------------------------------------------------------------*/

/** Array of Pta */
@Name("Ptaa") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PTAA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PTAA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PTAA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PTAA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PTAA position(long position) {
        return (PTAA)super.position(position);
    }

    /** number of pta in ptr array        */
    public native @Cast("l_int32") int n(); public native PTAA n(int setter);
    /** number of pta ptrs allocated      */
    public native @Cast("l_int32") int nalloc(); public native PTAA nalloc(int setter);
    /** pta ptr array                     */
    public native PTA pta(int i); public native PTAA pta(int i, PTA setter);
    public native @Cast("Pta**") PointerPointer pta(); public native PTAA pta(PointerPointer setter);
}
