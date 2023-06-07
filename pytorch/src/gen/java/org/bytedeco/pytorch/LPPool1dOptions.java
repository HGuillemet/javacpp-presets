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
 // namespace functional

// ============================================================================

/** Options for a {@code D}-dimensional lppool module. */
@Name("torch::nn::LPPoolOptions<1>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LPPool1dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LPPool1dOptions(Pointer p) { super(p); }

  public LPPool1dOptions(double norm_type, @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size) { super((Pointer)null); allocate(norm_type, kernel_size); }
  private native void allocate(double norm_type, @ByVal @Cast("torch::ExpandingArray<1>*") LongPointer kernel_size);
  public native @ByRef @NoException(true) DoublePointer norm_type();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException(true) LongPointer kernel_size();
  public native @Cast("torch::ExpandingArray<1>*") @ByRef @NoException(true) LongPointer stride();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer ceil_mode();
}
