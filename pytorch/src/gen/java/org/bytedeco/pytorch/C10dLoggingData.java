// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// a generic logging data struct that holds different types of logging data.
// starting with key value pairs of strings and integers,
// It can be extended to more types as needed.
@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class C10dLoggingData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public C10dLoggingData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public C10dLoggingData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public C10dLoggingData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public C10dLoggingData position(long position) {
        return (C10dLoggingData)super.position(position);
    }
    @Override public C10dLoggingData getPointer(long i) {
        return new C10dLoggingData((Pointer)this).offsetAddress(i);
    }

  // logging fields that are string types.
  public native @ByRef @NoOffset StringStringMap strings(); public native C10dLoggingData strings(StringStringMap setter);
  // logging fields that are int64_t types.
  public native @ByRef @NoOffset StringLongMap integers(); public native C10dLoggingData integers(StringLongMap setter);
}
