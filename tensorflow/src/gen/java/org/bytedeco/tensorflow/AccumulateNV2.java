// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the element-wise sum of a list of tensors.
 * 
 *  {@code tf.accumulate_n_v2} performs the same operation as {@code tf.add_n}, but does not
 *  wait for all of its inputs to be ready before beginning to sum. This can
 *  save memory if inputs are ready at different times, since minimum temporary
 *  storage is proportional to the output size rather than the inputs size.
 * 
 *  Unlike the original {@code accumulate_n}, {@code accumulate_n_v2} is differentiable.
 * 
 *  Returns a {@code Tensor} of same shape and type as the elements of {@code inputs}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * inputs: A list of {@code Tensor} objects, each with same shape and type.
 *  * shape: Shape of elements of {@code inputs}.
 * 
 *  Returns:
 *  * {@code Output}: The sum tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class AccumulateNV2 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AccumulateNV2(Pointer p) { super(p); }

  public AccumulateNV2(@Const @ByRef Scope scope, @ByVal InputList inputs,
                @ByVal PartialTensorShape shape) { super((Pointer)null); allocate(scope, inputs, shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal InputList inputs,
                @ByVal PartialTensorShape shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native AccumulateNV2 operation(Operation setter);
  public native @ByRef Output sum(); public native AccumulateNV2 sum(Output setter);
}
