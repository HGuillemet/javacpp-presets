// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BroadcastOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public BroadcastOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BroadcastOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BroadcastOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public BroadcastOptions position(long position) {
        return (BroadcastOptions)super.position(position);
    }
    @Override public BroadcastOptions getPointer(long i) {
        return new BroadcastOptions((Pointer)this).offsetAddress(i);
    }

  public native @Cast("int64_t") long rootRank(); public native BroadcastOptions rootRank(long setter);
  public native @Cast("int64_t") long rootTensor(); public native BroadcastOptions rootTensor(long setter);
  public native @ByRef Milliseconds timeout(); public native BroadcastOptions timeout(Milliseconds setter);
  public native @Cast("bool") boolean asyncOp(); public native BroadcastOptions asyncOp(boolean setter);
}
