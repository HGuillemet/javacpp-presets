// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RecordFunctionGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordFunctionGuard(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecordFunctionGuard(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecordFunctionGuard position(long position) {
        return (RecordFunctionGuard)super.position(position);
    }
    @Override public RecordFunctionGuard getPointer(long i) {
        return new RecordFunctionGuard((Pointer)this).offsetAddress(i);
    }

  public RecordFunctionGuard(@Cast("bool") boolean is_enabled/*=true*/) { super((Pointer)null); allocate(is_enabled); }
  private native void allocate(@Cast("bool") boolean is_enabled/*=true*/);
  public RecordFunctionGuard() { super((Pointer)null); allocate(); }
  private native void allocate();
}
