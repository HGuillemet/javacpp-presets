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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LSTM ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A multi-layer long-short-term-memory (LSTM) module.
 *  See https://pytorch.org/docs/master/generated/torch.nn.LSTM.html to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LSTMOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LSTM model(LSTMOptions(2,
 *  4).num_layers(3).batch_first(false).bidirectional(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LSTMImpl extends LSTMImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LSTMImpl(Pointer p) { super(p); }

  public LSTMImpl(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  @SharedPtr private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public LSTMImpl(@Const @ByRef LSTMOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr private native void allocate(@Const @ByRef LSTMOptions options_);

  public native @ByVal T_TensorT_TensorTensor_T_T forward(
        @Const @ByRef Tensor input,
        @ByVal(nullValue = "torch::optional<std::tuple<torch::Tensor,torch::Tensor> >{}") T_TensorTensor_TOptional hx_opt);
  public native @ByVal T_TensorT_TensorTensor_T_T forward(
        @Const @ByRef Tensor input);
  public native @ByVal T_PackedSequenceT_TensorTensor_T_T forward_with_packed_input(
        @Const @ByRef PackedSequence packed_input,
        @ByVal(nullValue = "torch::optional<std::tuple<torch::Tensor,torch::Tensor> >{}") T_TensorTensor_TOptional hx_opt);
  public native @ByVal T_PackedSequenceT_TensorTensor_T_T forward_with_packed_input(
        @Const @ByRef PackedSequence packed_input);

  public native @ByRef LSTMOptions options(); public native LSTMImpl options(LSTMOptions setter);
}
