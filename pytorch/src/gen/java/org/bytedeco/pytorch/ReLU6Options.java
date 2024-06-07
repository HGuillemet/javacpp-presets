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
 // namespace functional

// ============================================================================

/** Options for the {@code ReLU6} module.
 * 
 *  Example:
 *  <pre>{@code
 *  ReLU6 model(ReLU6Options().inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReLU6Options extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReLU6Options(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ReLU6Options(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ReLU6Options position(long position) {
        return (ReLU6Options)super.position(position);
    }
    @Override public ReLU6Options getPointer(long i) {
        return new ReLU6Options((Pointer)this).offsetAddress(i);
    }

  /* implicit */ public ReLU6Options(@Cast("bool") boolean inplace/*=false*/) { super((Pointer)null); allocate(inplace); }
private native void allocate(@Cast("bool") boolean inplace/*=false*/);
public ReLU6Options() { super((Pointer)null); allocate(); }
private native void allocate();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
