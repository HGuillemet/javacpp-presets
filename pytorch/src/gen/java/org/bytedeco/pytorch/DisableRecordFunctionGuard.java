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


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DisableRecordFunctionGuard extends RecordFunctionGuard {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DisableRecordFunctionGuard(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DisableRecordFunctionGuard(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DisableRecordFunctionGuard position(long position) {
        return (DisableRecordFunctionGuard)super.position(position);
    }
    @Override public DisableRecordFunctionGuard getPointer(long i) {
        return new DisableRecordFunctionGuard((Pointer)this).offsetAddress(i);
    }

  public DisableRecordFunctionGuard() { super((Pointer)null); allocate(); }
  private native void allocate();
}
