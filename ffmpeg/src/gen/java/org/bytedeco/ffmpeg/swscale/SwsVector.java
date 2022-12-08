// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.swscale;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.ffmpeg.avutil.*;
import static org.bytedeco.ffmpeg.global.avutil.*;

import static org.bytedeco.ffmpeg.global.swscale.*;


// when used for filters they must have an odd number of elements
// coeffs cannot be shared between vectors
@Properties(inherit = org.bytedeco.ffmpeg.presets.swscale.class)
public class SwsVector extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SwsVector() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SwsVector(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SwsVector(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SwsVector position(long position) {
        return (SwsVector)super.position(position);
    }
    @Override public SwsVector getPointer(long i) {
        return new SwsVector((Pointer)this).offsetAddress(i);
    }

    /** pointer to the list of coefficients */
    public native DoublePointer coeff(); public native SwsVector coeff(DoublePointer setter);
    /** number of coefficients in the vector */
    public native int length(); public native SwsVector length(int setter);
}
