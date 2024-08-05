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
 // namespace functional

// ============================================================================

/** Options for the {@code Unfold} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Unfold model(UnfoldOptions({2, 4}).dilation(2).padding({2, 1}).stride(2));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UnfoldOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UnfoldOptions(Pointer p) { super(p); }

  public UnfoldOptions(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer kernel_size();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer dilation();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer padding();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer stride();
}
