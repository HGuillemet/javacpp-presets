// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StreamData3 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public StreamData3() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public StreamData3(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StreamData3(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public StreamData3 position(long position) {
        return (StreamData3)super.position(position);
    }
    @Override public StreamData3 getPointer(long i) {
        return new StreamData3((Pointer)this).offsetAddress(i);
    }

  public native @Cast("c10::StreamId") long stream_id(); public native StreamData3 stream_id(long setter);
  public native @Cast("c10::DeviceIndex") byte device_index(); public native StreamData3 device_index(byte setter);
  public native DeviceType device_type(); public native StreamData3 device_type(DeviceType setter);
}
