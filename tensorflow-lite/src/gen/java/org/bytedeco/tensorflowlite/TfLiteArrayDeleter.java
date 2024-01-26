// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// Function object used as a deleter for unique_ptr holding TFLite*Array
// objects.
@Namespace("tflite::array_internal") @Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteArrayDeleter extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteArrayDeleter() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteArrayDeleter(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteArrayDeleter(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteArrayDeleter position(long position) {
        return (TfLiteArrayDeleter)super.position(position);
    }
    @Override public TfLiteArrayDeleter getPointer(long i) {
        return new TfLiteArrayDeleter((Pointer)this).offsetAddress(i);
    }

  public native @Name("operator ()") void apply(TfLiteIntArray a);
  public native @Name("operator ()") void apply(TfLiteFloatArray a);
}
