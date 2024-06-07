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


@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AllreduceOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public AllreduceOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AllreduceOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AllreduceOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public AllreduceOptions position(long position) {
        return (AllreduceOptions)super.position(position);
    }
    @Override public AllreduceOptions getPointer(long i) {
        return new AllreduceOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoOffset ReduceOp reduceOp(); public native AllreduceOptions reduceOp(ReduceOp setter);
  public native @ByRef @NoOffset Milliseconds timeout(); public native AllreduceOptions timeout(Milliseconds setter);
  public native @ByRef @NoOffset TensorOptional sparseIndices(); public native AllreduceOptions sparseIndices(TensorOptional setter);
}
