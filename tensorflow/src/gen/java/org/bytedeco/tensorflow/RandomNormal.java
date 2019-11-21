// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Outputs random values from a normal distribution.
 * 
 *  The generated values will have mean 0 and standard deviation 1.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * shape: The shape of the output tensor.
 *  * dtype: The type of the output.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * seed: If either {@code seed} or {@code seed2} are set to be non-zero, the random number
 *  generator is seeded by the given seed.  Otherwise, it is seeded by a
 *  random seed.
 *  * seed2: A second seed to avoid seed collision.
 * 
 *  Returns:
 *  * {@code Output}: A tensor of the specified shape filled with random normal values. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RandomNormal extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RandomNormal(Pointer p) { super(p); }

  /** Optional attribute setters for RandomNormal */
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
  
    /** If either {@code seed} or {@code seed2} are set to be non-zero, the random number
     *  generator is seeded by the given seed.  Otherwise, it is seeded by a
     *  random seed.
     * 
     *  Defaults to 0 */
    
    ///
    public native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);

    /** A second seed to avoid seed collision.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long seed_(); public native Attrs seed_(long setter);
    public native @Cast("tensorflow::int64") long seed2_(); public native Attrs seed2_(long setter);
  }
  public RandomNormal(@Const @ByRef Scope scope, @ByVal Input shape,
               @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, shape, dtype); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
               @Cast("tensorflow::DataType") int dtype);
  public RandomNormal(@Const @ByRef Scope scope, @ByVal Input shape,
               @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, shape, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input shape,
               @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Seed(@Cast("tensorflow::int64") long x);
  public static native @ByVal Attrs Seed2(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native RandomNormal operation(Operation setter);
  public native @ByRef Output output(); public native RandomNormal output(Output setter);
}
