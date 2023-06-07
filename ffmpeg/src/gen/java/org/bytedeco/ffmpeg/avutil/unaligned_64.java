// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;

// #   endif

// #endif /* !AV_HAVE_BIGENDIAN */

/*
 * Define AV_[RW]N helper macros to simplify definitions not provided
 * by per-arch headers.
 */

// #if defined(__GNUC__)

@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class unaligned_64 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public unaligned_64() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public unaligned_64(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public unaligned_64(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public unaligned_64 position(long position) {
        return (unaligned_64)super.position(position);
    }
    @Override public unaligned_64 getPointer(long i) {
        return new unaligned_64((Pointer)this).offsetAddress(i);
    }
 public native @Cast("uint64_t") long l(); public native unaligned_64 l(long setter); }
