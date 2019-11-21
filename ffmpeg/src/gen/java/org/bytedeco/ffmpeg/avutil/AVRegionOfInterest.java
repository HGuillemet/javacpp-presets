// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.ffmpeg.avutil;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ffmpeg.global.avutil.*;


/**
 * Structure describing a single Region Of Interest.
 *
 * When multiple regions are defined in a single side-data block, they
 * should be ordered from most to least important - some encoders are only
 * capable of supporting a limited number of distinct regions, so will have
 * to truncate the list.
 *
 * When overlapping regions are defined, the first region containing a given
 * area of the frame applies.
 */
@Properties(inherit = org.bytedeco.ffmpeg.presets.avutil.class)
public class AVRegionOfInterest extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AVRegionOfInterest() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AVRegionOfInterest(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AVRegionOfInterest(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AVRegionOfInterest position(long position) {
        return (AVRegionOfInterest)super.position(position);
    }

    /**
     * Must be set to the size of this data structure (that is,
     * sizeof(AVRegionOfInterest)).
     */
    public native @Cast("uint32_t") int self_size(); public native AVRegionOfInterest self_size(int setter);
    /**
     * Distance in pixels from the top edge of the frame to the top and
     * bottom edges and from the left edge of the frame to the left and
     * right edges of the rectangle defining this region of interest.
     *
     * The constraints on a region are encoder dependent, so the region
     * actually affected may be slightly larger for alignment or other
     * reasons.
     */
    public native int top(); public native AVRegionOfInterest top(int setter);
    public native int bottom(); public native AVRegionOfInterest bottom(int setter);
    public native int left(); public native AVRegionOfInterest left(int setter);
    public native int right(); public native AVRegionOfInterest right(int setter);
    /**
     * Quantisation offset.
     *
     * Must be in the range -1 to +1.  A value of zero indicates no quality
     * change.  A negative value asks for better quality (less quantisation),
     * while a positive value asks for worse quality (greater quantisation).
     *
     * The range is calibrated so that the extreme values indicate the
     * largest possible offset - if the rest of the frame is encoded with the
     * worst possible quality, an offset of -1 indicates that this region
     * should be encoded with the best possible quality anyway.  Intermediate
     * values are then interpolated in some codec-dependent way.
     *
     * For example, in 10-bit H.264 the quantisation parameter varies between
     * -12 and 51.  A typical qoffset value of -1/10 therefore indicates that
     * this region should be encoded with a QP around one-tenth of the full
     * range better than the rest of the frame.  So, if most of the frame
     * were to be encoded with a QP of around 30, this region would get a QP
     * of around 24 (an offset of approximately -1/10 * (51 - -12) = -6.3).
     * An extreme value of -1 would indicate that this region should be
     * encoded with the best possible quality regardless of the treatment of
     * the rest of the frame - that is, should be encoded at a QP of -12.
     */
    public native @ByRef AVRational qoffset(); public native AVRegionOfInterest qoffset(AVRational setter);
}
