// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.ffmpeg.global.avutil.*;



/**
 * Structure to hold side data for an AVFrame.
 *
 * sizeof(AVFrameSideData) is not a part of the public ABI, so new fields may be added
 * to the end with a minor bump.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVFrameSideData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVFrameSideData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVFrameSideData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVFrameSideData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVFrameSideData position(long position) {
        return (AVFrameSideData)super.position(position);
    }
    @Override public AVFrameSideData getPointer(long i) {
        return new AVFrameSideData((Pointer)this).offsetAddress(i);
    }

    public native @Cast("AVFrameSideDataType") int type(); public native AVFrameSideData type(int setter);
    public native @Cast("uint8_t*") BytePointer data(); public native AVFrameSideData data(BytePointer setter);
    public native @Cast("size_t") long size(); public native AVFrameSideData size(long setter);
    public native AVDictionary metadata(); public native AVFrameSideData metadata(AVDictionary setter);
    public native AVBufferRef buf(); public native AVFrameSideData buf(AVBufferRef setter);
}
