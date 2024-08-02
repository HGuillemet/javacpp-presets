// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ GRU ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A multi-layer gated recurrent unit (GRU) module.
 *  See https://pytorch.org/docs/main/generated/torch.nn.GRU.html to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::GRUOptions} class to learn what
 *  constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  GRU model(GRUOptions(2,
 *  4).num_layers(3).batch_first(false).bidirectional(true));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GRUImpl extends GRUImplBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRUImpl(Pointer p) { super(p); }

  public GRUImpl(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  @SharedPtr @Name("std::make_shared<torch::nn::GRUImpl>") private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public GRUImpl(@Const @ByRef GRUOptions options_) { super((Pointer)null); allocate(options_); }
  @SharedPtr @Name("std::make_shared<torch::nn::GRUImpl>") private native void allocate(@Const @ByRef GRUOptions options_);

  public native @ByVal T_TensorTensor_T forward(@Const @ByRef Tensor input, @ByVal(nullValue = "torch::Tensor{}") Tensor hx);
  public native @ByVal T_TensorTensor_T forward(@Const @ByRef Tensor input);
  public native @ByVal T_PackedSequenceTensor_T forward_with_packed_input(
        @Const @ByRef PackedSequence packed_input,
        @ByVal(nullValue = "torch::Tensor{}") Tensor hx);
  public native @ByVal T_PackedSequenceTensor_T forward_with_packed_input(
        @Const @ByRef PackedSequence packed_input);

  public native @ByRef GRUOptions options(); public native GRUImpl options(GRUOptions setter);
}
