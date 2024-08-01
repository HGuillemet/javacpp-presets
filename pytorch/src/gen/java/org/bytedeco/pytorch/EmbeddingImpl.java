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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Embedding
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Performs a lookup in a fixed size embedding table.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.Embedding to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::EmbeddingOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  Embedding model(EmbeddingOptions(10,
 *  2).padding_idx(3).max_norm(2).norm_type(2.5).scale_grad_by_freq(true).sparse(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EmbeddingImpl extends EmbeddingImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EmbeddingImpl(Pointer p) { super(p); }

  public EmbeddingImpl(@Cast("int64_t") long num_embeddings, @Cast("int64_t") long embedding_dim) { super((Pointer)null); allocate(num_embeddings, embedding_dim); }
  @SharedPtr @Name("std::make_shared<torch::nn::EmbeddingImpl>") private native void allocate(@Cast("int64_t") long num_embeddings, @Cast("int64_t") long embedding_dim);
  public EmbeddingImpl(@ByVal EmbeddingOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::EmbeddingImpl>") private native void allocate(@ByVal EmbeddingOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pretty prints the {@code Embedding} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  /** Performs a lookup on the embedding table stored in {@code weight} using the
   *  {@code indices} supplied and returns the result. */
  public native @ByVal Tensor forward(@Const @ByRef Tensor indices);

  /** The {@code Options} used to configure this {@code Embedding} module.
   *  Changes to {@code EmbeddingOptions} *after construction* have no effect. */
  public native @ByRef EmbeddingOptions options(); public native EmbeddingImpl options(EmbeddingOptions setter);

  /** The embedding table. */
  public native @ByRef Tensor weight(); public native EmbeddingImpl weight(Tensor setter);
}
