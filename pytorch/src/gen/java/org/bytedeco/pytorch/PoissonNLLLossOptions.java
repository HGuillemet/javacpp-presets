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

/** Options for the {@code PoissonNLLLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  PoissonNLLLoss
 *  model(PoissonNLLLossOptions().log_input(false).full(true).eps(0.42).reduction(torch::kSum));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PoissonNLLLossOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public PoissonNLLLossOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public PoissonNLLLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PoissonNLLLossOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public PoissonNLLLossOptions position(long position) {
        return (PoissonNLLLossOptions)super.position(position);
    }
    @Override public PoissonNLLLossOptions getPointer(long i) {
        return new PoissonNLLLossOptions((Pointer)this).offsetAddress(i);
    }

  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer log_input();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer full();
  public native @ByRef @NoException(true) DoublePointer eps();
  public native @ByRef @NoException(true) LossReduction reduction();
}
