// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Namespace("tensorflow") @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Fprint128 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Fprint128() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Fprint128(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Fprint128(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Fprint128 position(long position) {
        return (Fprint128)super.position(position);
    }

  public native @Cast("tensorflow::uint64") long low64(); public native Fprint128 low64(long setter);
  public native @Cast("tensorflow::uint64") long high64(); public native Fprint128 high64(long setter);
}
