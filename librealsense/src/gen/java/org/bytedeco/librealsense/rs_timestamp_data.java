// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.librealsense;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.librealsense.global.RealSense.*;


/** \brief Timestamp data from the motion microcontroller */
@Properties(inherit = org.bytedeco.librealsense.presets.RealSense.class)
public class rs_timestamp_data extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public rs_timestamp_data() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public rs_timestamp_data(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public rs_timestamp_data(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public rs_timestamp_data position(long position) {
        return (rs_timestamp_data)super.position(position);
    }
    @Override public rs_timestamp_data getPointer(long i) {
        return new rs_timestamp_data((Pointer)this).offsetAddress(i);
    }

    /** Timestamp in milliseconds */
    public native double timestamp(); public native rs_timestamp_data timestamp(double setter);
    /** Physical commponent that originated the event */
    public native @Cast("rs_event_source") int source_id(); public native rs_timestamp_data source_id(int setter);
    /** Relevant frame number, required to join timestamp data with the relevant frame */
    public native @Cast("unsigned long long") long frame_number(); public native rs_timestamp_data frame_number(long setter);
}
