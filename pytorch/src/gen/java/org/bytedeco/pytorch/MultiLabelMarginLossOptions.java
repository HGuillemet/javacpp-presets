// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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
 // namespace functional

// ============================================================================

/** Options for the {@code MultiLabelMarginLoss} module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiLabelMarginLoss model(MultiLabelMarginLossOptions(torch::kNone));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiLabelMarginLossOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiLabelMarginLossOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MultiLabelMarginLossOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public MultiLabelMarginLossOptions position(long position) {
        return (MultiLabelMarginLossOptions)super.position(position);
    }
    @Override public MultiLabelMarginLossOptions getPointer(long i) {
        return new MultiLabelMarginLossOptions((Pointer)this).offsetAddress(i);
    }


  public MultiLabelMarginLossOptions() { super((Pointer)null); allocate(); }
  private native void allocate();
      
  public MultiLabelMarginLossOptions(@ByVal kNone reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kNone reduction);
      
  public MultiLabelMarginLossOptions(@ByVal kMean reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kMean reduction);
      
  public MultiLabelMarginLossOptions(@ByVal kSum reduction) { super((Pointer)null); allocate(reduction); }
  private native void allocate(@ByVal kSum reduction);
  public native @ByRef @NoException(true) loss_reduction_t reduction();
}
