// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ TransformerDecoder
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** TransformerDecoder is a stack of N decoder layers.
 *  See
 *  https://pytorch.org/docs/master/generated/torch.nn.TransformerDecoder.html
 *  to learn abouut the exact behavior of this decoder module
 * 
 *  See the documentation for {@code torch::nn::TransformerDecoderOptions} class to
 *  learn what constructor arguments are supported for this decoder module
 * 
 *  Example:
 *  <pre>{@code
 *  TransformerDecoderLayer decoder_layer(TransformerDecoderLayerOptions(512,
 *  8).dropout(0.1)); TransformerDecoder
 *  transformer_decoder(TransformerDecoderOptions(decoder_layer,
 *  6).norm(LayerNorm(LayerNormOptions({2})))); const auto memory =
 *  torch::rand({10, 32, 512}); const auto tgt = torch::rand({20, 32, 512});
 *  auto out = transformer_decoder(tgt, memory);
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TransformerDecoderImpl extends TransformerDecoderImplCloneable {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TransformerDecoderImpl(Pointer p) { super(p); }
    /** Downcast constructor. */
    public TransformerDecoderImpl(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::TransformerDecoderImpl, torch::nn::Module>") void allocate(@SharedPtr Module pointer);

  public TransformerDecoderImpl(@ByVal TransformerDecoderOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::TransformerDecoderImpl>") private native void allocate(@ByVal TransformerDecoderOptions options_);

  public native void reset();

  public native void reset_parameters();

  /** Pass the inputs (and mask) through the decoder layer in turn.
   *  Args:
   *        tgt: the sequence to the decoder layer (required).
   *        memory: the sequence from the last layer of the encoder (required).
   *        tgt_mask: the mask for the tgt sequence (optional).
   *        memory_mask: the mask for the memory sequence (optional).
   *        tgt_key_padding_mask: the mask for the tgt keys per batch
   *        (optional). memory_key_padding_mask: the mask for the memory keys
   *        per batch (optional). */
  public native @ByVal Tensor forward(
        @Const @ByRef Tensor tgt,
        @Const @ByRef Tensor memory,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor tgt_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor memory_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor tgt_key_padding_mask,
        @Const @ByRef(nullValue = "torch::Tensor{}") Tensor memory_key_padding_mask);
  public native @ByVal Tensor forward(
        @Const @ByRef Tensor tgt,
        @Const @ByRef Tensor memory);

  /** The options used to configure this module. */
  public native @ByRef TransformerDecoderOptions options(); public native TransformerDecoderImpl options(TransformerDecoderOptions setter);

  /** Cloned layers of decoder layers */

  /** optional layer normalization module */
  public native @ByRef AnyModule norm(); public native TransformerDecoderImpl norm(AnyModule setter);
}
