// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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


// ============================================================================

/** Options for the {@code Bilinear} module.
 * 
 *  Example:
 *  <pre>{@code
 *  Bilinear model(BilinearOptions(3, 2, 4).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BilinearOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BilinearOptions(Pointer p) { super(p); }

  public BilinearOptions(
        @Cast("int64_t") long in1_features,
        @Cast("int64_t") long in2_features,
        @Cast("int64_t") long out_features) { super((Pointer)null); allocate(in1_features, in2_features, out_features); }
  private native void allocate(
        @Cast("int64_t") long in1_features,
        @Cast("int64_t") long in2_features,
        @Cast("int64_t") long out_features);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer in1_features();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer in2_features();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer out_features();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
}
