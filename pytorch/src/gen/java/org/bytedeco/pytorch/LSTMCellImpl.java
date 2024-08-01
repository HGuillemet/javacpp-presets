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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ LSTMCell
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A long short-term memory (LSTM) cell.
 *  See https://pytorch.org/docs/main/nn.html#torch.nn.LSTMCell to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::LSTMCellOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  LSTMCell model(LSTMCellOptions(20, 10).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LSTMCellImpl extends LSTMCellImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LSTMCellImpl(Pointer p) { super(p); }

  public LSTMCellImpl(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  @SharedPtr @Name("std::make_shared<torch::nn::LSTMCellImpl>") private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public LSTMCellImpl(@Const @ByRef LSTMCellOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::LSTMCellImpl>") private native void allocate(@Const @ByRef LSTMCellOptions options_);

  public native @ByVal T_TensorTensor_T forward(
        @Const @ByRef Tensor input,
        @ByVal(nullValue = "torch::optional<std::tuple<torch::Tensor,torch::Tensor> >{}") T_TensorTensor_TOptional hx_opt);
  public native @ByVal T_TensorTensor_T forward(
        @Const @ByRef Tensor input);
  public native @ByRef LSTMCellOptions options(); public native LSTMCellImpl options(LSTMCellOptions setter);
}
