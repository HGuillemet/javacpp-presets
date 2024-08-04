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

/** Options for the {@code SoftMarginLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  SoftMarginLoss model(SoftMarginLossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SoftMarginLossOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SoftMarginLossOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SoftMarginLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SoftMarginLossOptions position(long position) {
        return (SoftMarginLossOptions)super.position(position);
    }
    @Override public SoftMarginLossOptions getPointer(long i) {
        return new SoftMarginLossOptions((Pointer)this).offsetAddress(i);
    }


  public SoftMarginLossOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
      
  public SoftMarginLossOptions(@ByVal kNone reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kNone reduction);
      
  public SoftMarginLossOptions(@ByVal kMean reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kMean reduction);
      
  public SoftMarginLossOptions(@ByVal kSum reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kSum reduction);
  public native @ByRef @NoException(true) LossReduction reduction();
}
