// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Options for the {@code LayerNorm} module.
 * 
 *  Example:
 *  <pre>{@code
 *  LayerNorm model(LayerNormOptions({2,
 *  2}).elementwise_affine(false).eps(2e-5));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LayerNormOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LayerNormOptions(Pointer p) { super(p); }

  /* implicit */ public LayerNormOptions(@ByVal @Cast("std::vector<int64_t>*") LongVector normalized_shape) { super((Pointer)null); allocate(normalized_shape); }
private native void allocate(@ByVal @Cast("std::vector<int64_t>*") LongVector normalized_shape);
  public native @Cast("std::vector<int64_t>*") @ByRef @NoException(true) LongVector normalized_shape();
  public native @ByRef @NoException(true) DoublePointer eps();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer elementwise_affine();
}
