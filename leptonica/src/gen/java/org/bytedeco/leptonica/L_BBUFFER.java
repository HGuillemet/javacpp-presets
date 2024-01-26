// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.leptonica;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.leptonica.global.leptonica.*;


/**
 * \file bbuffer.h
 *
 * <pre>
 *      Expandable byte buffer for reading data in from memory and
 *      writing data out to other memory.
 *
 *      This implements a queue of bytes, so data read in is put
 *      on the "back" of the queue (i.e., the end of the byte array)
 *      and data written out is taken from the "front" of the queue
 *      (i.e., from an index marker "nwritten" that is initially set at
 *      the beginning of the array.)  As usual with expandable
 *      arrays, we keep the size of the allocated array and the
 *      number of bytes that have been read into the array.
 *
 *      For implementation details, see bbuffer.c.
 * </pre>
 */

/** Expandable byte buffer for memory read/write operations */
@Name("L_ByteBuffer") @Properties(inherit = org.bytedeco.leptonica.presets.leptonica.class)
public class L_BBUFFER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public L_BBUFFER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public L_BBUFFER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public L_BBUFFER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public L_BBUFFER position(long position) {
        return (L_BBUFFER)super.position(position);
    }
    @Override public L_BBUFFER getPointer(long i) {
        return new L_BBUFFER((Pointer)this).offsetAddress(i);
    }

    /** size of allocated byte array            */
    public native @Cast("l_int32") int nalloc(); public native L_BBUFFER nalloc(int setter);
    /** number of bytes read into to the array  */
    public native @Cast("l_int32") int n(); public native L_BBUFFER n(int setter);
    /** number of bytes written from the array  */
    public native @Cast("l_int32") int nwritten(); public native L_BBUFFER nwritten(int setter);
    /** byte array                              */
    public native @Cast("l_uint8*") BytePointer array(); public native L_BBUFFER array(BytePointer setter);
}
