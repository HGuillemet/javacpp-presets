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
 // namespace functional

// ============================================================================

/** Options for the {@code RReLU} module.
 * 
 *  Example:
 *  <pre>{@code
 *  RReLU model(RReLUOptions().lower(0.24).upper(0.42).inplace(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RReLUOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RReLUOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RReLUOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RReLUOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RReLUOptions position(long position) {
        return (RReLUOptions)super.position(position);
    }
    @Override public RReLUOptions getPointer(long i) {
        return new RReLUOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer lower();
  public native @ByRef @NoException(true) DoublePointer upper();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
