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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Transformer ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A transformer model. User is able to modify the attributes as needed. The
 *  architecture is based on the paper "Attention Is All You Need". Ashish
 *  Vaswani, Noam Shazeer, Niki Parmar, Jakob Uszkoreit, Llion Jones, Aidan N
 *  Gomez, Lukasz Kaiser, and Illia Polosukhin. 2017. Attention is all you need.
 *  In Advances in Neural Information Processing Systems, pages 6000-6010.
 * 
 *  See https://pytorch.org/docs/stable/generated/torch.nn.Transformer.html to
 *  learn about the exact behavior of this transformer model
 * 
 *  See the documentation for {@code torch::nn::Transformer} class to learn what
 *  constructor arguments are supported for this encoder layer model
 * 
 *  Example:
 *  <pre>{@code
 *  Transformer trans(TransformerOptions(512, 8));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerImpl extends TransformerImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerImpl(Pointer p) { super(p); }

  
  ///
  ///
  ///
  ///
  ///
  ///
  public TransformerImpl(@ByVal TransformerOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::TransformerImpl>") private native void allocate(@ByVal TransformerOptions options_);

  /** forward function for Transformer Module
   *  Args:
   *    src: the sequence to the encoder (required).
   *    tgt: the sequence to the decoder (required).
   *    src_mask: the additive mask for the src sequence (optional).
   *    tgt_mask: the additive mask for the tgt sequence (optional).
   *    memory_mask: the additive mask for the encoder output (optional).
   *    src_key_padding_mask: the ByteTensor mask for src keys per batch
   *    (optional). tgt_key_padding_mask: the ByteTensor mask for tgt keys per
   *    batch (optional). memory_key_padding_mask: the ByteTensor mask for
   *    memory keys per batch (optional).
   * 
   *  Shape:
   *    src: {@code (S, N, E)}
   *    tgt: {@code (T, N, E)}
   *    src_mask: {@code (S, S)}
   *    tgt_mask: {@code (T, T)}
   *    memory_mask: {@code (T, S)}
   *    src_key_padding_mask: {@code (N, S)}
   *    tgt_key_padding_mask: {@code (N, T)}
   *    memory_key_padding_mask: {@code (N, S)}
   * 
   *    Note:
   *      [src/tgt/memory]_mask ensures that position i is allowed to attend the
   *      unmasked positions. If a ByteTensor is provided, the non-zero
   *      positions are not allowed to attend while the zero positions will be
   *      unchanged. If a BoolTensor is provided, positions with {@code True} are not
   *      allowed to attend while {@code False} values will be unchanged. If a
   *      FloatTensor is provided, it will be added to the attention weight.
   * 
   *      [src/tgt/memory]_key_padding_mask provides specified elements in the
   *      key to be ignored by the attention. If a ByteTensor is provided, the
   *      non-zero positions will be ignored while the zero positions will be
   *      unchanged. If a BoolTensor is provided, the positions with the value
   *      of {@code True} will be ignored while the position with the value of {@code False}
   *      will be unchanged.
   * 
   *    output: {@code (T, N, E)}
   * 
   *    Note:
   *      Due to the multi-head attention architecture in the transformer model,
   *      the output sequence length of a transformer is same as the input
   *      sequence (i.e. target) length of the decode.
   * 
   *    where
   *    S is the source sequence length,
   *    T is the target sequence length,
   *    N is the batch size,
   *    E is the feature number. */
  public native @ByVal Tensor forward(
        @Const @ByRef Tensor src,
        @Const @ByRef Tensor tgt,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor src_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor tgt_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor memory_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor src_key_padding_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor tgt_key_padding_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor memory_key_padding_mask);
  public native @ByVal Tensor forward(
        @Const @ByRef Tensor src,
        @Const @ByRef Tensor tgt);

  public native void reset();

  public native void reset_parameters();

  /** Generate a square mask for the sequence.
   *  The masked positions are filled with {@code -inf} in float type.
   *  Unmasked positions are filled with {@code 0.0} in float type.
   *  Note:
   *    1. This function will always return a CPU tensor.
   *    2. This function requires the platform support IEEE754, since {@code -inf} is
   *    guaranteed to
   *       be valid only when IEEE754 is supported. If the platform doesn't
   *       support IEEE754, this function will fill the mask with the smallest
   *       float number instead of {@code -inf}, a one time warning will pop up as
   *       well. */
  public static native @ByVal Tensor generate_square_subsequent_mask(@Cast("int64_t") long sz);
  /** options with which this {@code Transformer} was constructed */
  public native @ByRef TransformerOptions options(); public native TransformerImpl options(TransformerOptions setter);

  /** encoder module */
  public native @ByRef AnyModule encoder(); public native TransformerImpl encoder(AnyModule setter);

  /** decoder module */
  public native @ByRef AnyModule decoder(); public native TransformerImpl decoder(AnyModule setter);
}
