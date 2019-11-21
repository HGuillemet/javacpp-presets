// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.leptonica.global.lept.*;


/** Array of points */
@Name("Pta") @Properties(inherit = org.bytedeco.leptonica.presets.lept.class)
public class PTA extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PTA() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PTA(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PTA(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PTA position(long position) {
        return (PTA)super.position(position);
    }

    /** actual number of pts              */
    public native @Cast("l_int32") int n(); public native PTA n(int setter);
    /** size of allocated arrays          */
    public native @Cast("l_int32") int nalloc(); public native PTA nalloc(int setter);
    /** reference count (1 if no clones)  */
    public native @Cast("l_uint32") int refcount(); public native PTA refcount(int setter);
    /** arrays of floats                  */
    public native @Cast("l_float32*") FloatPointer x(); public native PTA x(FloatPointer setter);
    public native @Cast("l_float32*") FloatPointer y(); public native PTA y(FloatPointer setter);
}
