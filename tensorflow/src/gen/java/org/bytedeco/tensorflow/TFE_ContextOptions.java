// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


@Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TFE_ContextOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TFE_ContextOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TFE_ContextOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TFE_ContextOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TFE_ContextOptions position(long position) {
        return (TFE_ContextOptions)super.position(position);
    }

  public native @ByRef TF_SessionOptions session_options(); public native TFE_ContextOptions session_options(TF_SessionOptions setter);
  // true if async execution is enabled.
  public native @Cast("bool") boolean async(); public native TFE_ContextOptions async(boolean setter);
  public native @Cast("TFE_ContextDevicePlacementPolicy") int policy(); public native TFE_ContextOptions policy(int setter);
}
