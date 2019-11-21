// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Counts the number of occurrences of each value in an integer array.
 * 
 *  Outputs a vector with length {@code size} and the same dtype as {@code weights}. If
 *  {@code weights} are empty, then index {@code i} stores the number of times the value {@code i} is
 *  counted in {@code arr}. If {@code weights} are non-empty, then index {@code i} stores the sum of
 *  the value in {@code weights} at each index where the corresponding value in {@code arr} is
 *  {@code i}.
 * 
 *  Values in {@code arr} outside of the range [0, size) are ignored.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * arr: int32 {@code Tensor}.
 *  * size: non-negative int32 scalar {@code Tensor}.
 *  * weights: is an int32, int64, float32, or float64 {@code Tensor} with the same
 *  shape as {@code arr}, or a length-0 {@code Tensor}, in which case it acts as all weights
 *  equal to 1.
 * 
 *  Returns:
 *  * {@code Output}: 1D {@code Tensor} with length equal to {@code size}. The counts or summed weights for
 *  each value in the range [0, size). */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Bincount extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Bincount(Pointer p) { super(p); }

  public Bincount(@Const @ByRef Scope scope, @ByVal Input arr,
           @ByVal Input size, @ByVal Input weights) { super((Pointer)null); allocate(scope, arr, size, weights); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input arr,
           @ByVal Input size, @ByVal Input weights);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Bincount operation(Operation setter);
  public native @ByRef Output bins(); public native Bincount bins(Output setter);
}
