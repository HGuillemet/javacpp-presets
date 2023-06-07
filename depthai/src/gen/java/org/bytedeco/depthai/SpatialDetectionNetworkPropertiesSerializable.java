// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.depthai;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.depthai.global.depthai.*;

@Name("dai::PropertiesSerializable<dai::DetectionNetworkProperties,dai::SpatialDetectionNetworkProperties>") @Properties(inherit = org.bytedeco.depthai.presets.depthai.class)
public class SpatialDetectionNetworkPropertiesSerializable extends DetectionNetworkProperties {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpatialDetectionNetworkPropertiesSerializable() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialDetectionNetworkPropertiesSerializable(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialDetectionNetworkPropertiesSerializable(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpatialDetectionNetworkPropertiesSerializable position(long position) {
        return (SpatialDetectionNetworkPropertiesSerializable)super.position(position);
    }
    @Override public SpatialDetectionNetworkPropertiesSerializable getPointer(long i) {
        return new SpatialDetectionNetworkPropertiesSerializable((Pointer)this).offsetAddress(i);
    }

    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer data, SerializationType type/*=dai::SerializationType::LIBNOP*/);
    public native void serialize(@Cast("std::uint8_t*") @StdVector BytePointer data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer data, @Cast("dai::SerializationType") int type/*=dai::SerializationType::LIBNOP*/);
    public native void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] data, SerializationType type/*=dai::SerializationType::LIBNOP*/);
    public native void serialize(@Cast("std::uint8_t*") @StdVector byte[] data);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector BytePointer data, @Cast("dai::SerializationType") int type/*=dai::SerializationType::LIBNOP*/);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector ByteBuffer data, SerializationType type/*=dai::SerializationType::LIBNOP*/);
    public native @Override void serialize(@Cast("std::uint8_t*") @StdVector byte[] data, @Cast("dai::SerializationType") int type/*=dai::SerializationType::LIBNOP*/);

    public native @UniquePtr @Override DaiProperties clone();
}
