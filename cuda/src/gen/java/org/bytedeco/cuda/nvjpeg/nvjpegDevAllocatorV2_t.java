// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvjpeg;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvjpeg.*;


@Properties(inherit = org.bytedeco.cuda.presets.nvjpeg.class)
public class nvjpegDevAllocatorV2_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvjpegDevAllocatorV2_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvjpegDevAllocatorV2_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvjpegDevAllocatorV2_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvjpegDevAllocatorV2_t position(long position) {
        return (nvjpegDevAllocatorV2_t)super.position(position);
    }
    @Override public nvjpegDevAllocatorV2_t getPointer(long i) {
        return new nvjpegDevAllocatorV2_t((Pointer)this).offsetAddress(i);
    }

    public native tDevMallocV2 dev_malloc(); public native nvjpegDevAllocatorV2_t dev_malloc(tDevMallocV2 setter);
    public native tDevFreeV2 dev_free(); public native nvjpegDevAllocatorV2_t dev_free(tDevFreeV2 setter);
    public native Pointer dev_ctx(); public native nvjpegDevAllocatorV2_t dev_ctx(Pointer setter);
}
