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
 // namespace functional

// ============================================================================

/** Options for the {@code MultiheadAttention} module.
 * 
 *  Example:
 *  <pre>{@code
 *  MultiheadAttention model(MultiheadAttentionOptions(20, 10).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MultiheadAttentionOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MultiheadAttentionOptions(Pointer p) { super(p); }

  public MultiheadAttentionOptions(@Cast("int64_t") long embed_dim, @Cast("int64_t") long num_heads) { super((Pointer)null); allocate(embed_dim, num_heads); }
  private native void allocate(@Cast("int64_t") long embed_dim, @Cast("int64_t") long num_heads);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer embed_dim();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer num_heads();
  public native @ByRef @NoException(true) DoublePointer dropout();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer add_bias_kv();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer add_zero_attn();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer kdim();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer vdim();
}
