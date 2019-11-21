// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Quantized Instance normalization.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * x: A 4D input Tensor.
 *  * x_min: The value represented by the lowest quantized input.
 *  * x_max: The value represented by the highest quantized input.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * output_range_given: If True, {@code given_y_min} and {@code given_y_min}
 *  and {@code given_y_max} are used as the output range. Otherwise,
 *  the implementation computes the output range.
 *  * given_y_min: Output in {@code y_min} if {@code output_range_given} is True.
 *  * given_y_max: Output in {@code y_max} if {@code output_range_given} is True.
 *  * variance_epsilon: A small float number to avoid dividing by 0.
 *  * min_separation: Minimum value of {@code y_max - y_min}
 * 
 *  Returns:
 *  * {@code Output} y: A 4D Tensor.
 *  * {@code Output} y_min: The value represented by the lowest quantized output.
 *  * {@code Output} y_max: The value represented by the highest quantized output. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedInstanceNorm extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedInstanceNorm(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedInstanceNorm */
  public static class Attrs extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public Attrs() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Attrs(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Attrs(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public Attrs position(long position) {
          return (Attrs)super.position(position);
      }
  
    /** If True, {@code given_y_min} and {@code given_y_min}
     *  and {@code given_y_max} are used as the output range. Otherwise,
     *  the implementation computes the output range.
     * 
     *  Defaults to false */
    
    ///
    public native @ByVal Attrs OutputRangeGiven(@Cast("bool") boolean x);

    /** Output in {@code y_min} if {@code output_range_given} is True.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs GivenYMin(float x);

    /** Output in {@code y_max} if {@code output_range_given} is True.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs GivenYMax(float x);

    /** A small float number to avoid dividing by 0.
     * 
     *  Defaults to 1e-05 */
    
    ///
    public native @ByVal Attrs VarianceEpsilon(float x);

    /** Minimum value of {@code y_max - y_min}
     * 
     *  Defaults to 0.001 */
    public native @ByVal Attrs MinSeparation(float x);

    public native @Cast("bool") boolean output_range_given_(); public native Attrs output_range_given_(boolean setter);
    public native float given_y_min_(); public native Attrs given_y_min_(float setter);
    public native float given_y_max_(); public native Attrs given_y_max_(float setter);
    public native float variance_epsilon_(); public native Attrs variance_epsilon_(float setter);
    public native float min_separation_(); public native Attrs min_separation_(float setter);
  }
  public QuantizedInstanceNorm(@Const @ByRef Scope scope, @ByVal Input x,
                        @ByVal Input x_min, @ByVal Input x_max) { super((Pointer)null); allocate(scope, x, x_min, x_max); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                        @ByVal Input x_min, @ByVal Input x_max);
  public QuantizedInstanceNorm(@Const @ByRef Scope scope, @ByVal Input x,
                        @ByVal Input x_min, @ByVal Input x_max,
                        @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, x_min, x_max, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
                        @ByVal Input x_min, @ByVal Input x_max,
                        @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs OutputRangeGiven(@Cast("bool") boolean x);
  public static native @ByVal Attrs GivenYMin(float x);
  public static native @ByVal Attrs GivenYMax(float x);
  public static native @ByVal Attrs VarianceEpsilon(float x);
  public static native @ByVal Attrs MinSeparation(float x);

  public native @ByRef Operation operation(); public native QuantizedInstanceNorm operation(Operation setter);
  public native @ByRef Output y(); public native QuantizedInstanceNorm y(Output setter);
  public native @ByRef Output y_min(); public native QuantizedInstanceNorm y_min(Output setter);
  public native @ByRef Output y_max(); public native QuantizedInstanceNorm y_max(Output setter);
}
