// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Reverses variable length slices.
 * 
 *  This op first slices {@code input} along the dimension {@code batch_dim}, and for each
 *  slice {@code i}, reverses the first {@code seq_lengths[i]} elements along
 *  the dimension {@code seq_dim}.
 * 
 *  The elements of {@code seq_lengths} must obey {@code seq_lengths[i] <= input.dims[seq_dim]},
 *  and {@code seq_lengths} must be a vector of length {@code input.dims[batch_dim]}.
 * 
 *  The output slice {@code i} along dimension {@code batch_dim} is then given by input
 *  slice {@code i}, with the first {@code seq_lengths[i]} slices along dimension
 *  {@code seq_dim} reversed.
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # Given this:
 *  batch_dim = 0
 *  seq_dim = 1
 *  input.dims = (4, 8, ...)
 *  seq_lengths = [7, 2, 3, 5]
 * 
 *  # then slices of input are reversed on seq_dim, but only up to seq_lengths:
 *  output[0, 0:7, :, ...] = input[0, 7:0:-1, :, ...]
 *  output[1, 0:2, :, ...] = input[1, 2:0:-1, :, ...]
 *  output[2, 0:3, :, ...] = input[2, 3:0:-1, :, ...]
 *  output[3, 0:5, :, ...] = input[3, 5:0:-1, :, ...]
 * 
 *  # while entries past seq_lens are copied through:
 *  output[0, 7:, :, ...] = input[0, 7:, :, ...]
 *  output[1, 2:, :, ...] = input[1, 2:, :, ...]
 *  output[2, 3:, :, ...] = input[2, 3:, :, ...]
 *  output[3, 2:, :, ...] = input[3, 2:, :, ...]
 *  }</pre>
 * 
 *  In contrast, if:
 * 
 *  <pre>{@code
 *  # Given this:
 *  batch_dim = 2
 *  seq_dim = 0
 *  input.dims = (8, ?, 4, ...)
 *  seq_lengths = [7, 2, 3, 5]
 * 
 *  # then slices of input are reversed on seq_dim, but only up to seq_lengths:
 *  output[0:7, :, 0, :, ...] = input[7:0:-1, :, 0, :, ...]
 *  output[0:2, :, 1, :, ...] = input[2:0:-1, :, 1, :, ...]
 *  output[0:3, :, 2, :, ...] = input[3:0:-1, :, 2, :, ...]
 *  output[0:5, :, 3, :, ...] = input[5:0:-1, :, 3, :, ...]
 * 
 *  # while entries past seq_lens are copied through:
 *  output[7:, :, 0, :, ...] = input[7:, :, 0, :, ...]
 *  output[2:, :, 1, :, ...] = input[2:, :, 1, :, ...]
 *  output[3:, :, 2, :, ...] = input[3:, :, 2, :, ...]
 *  output[2:, :, 3, :, ...] = input[2:, :, 3, :, ...]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: The input to reverse.
 *  * seq_lengths: 1-D with length {@code input.dims(batch_dim)} and
 *  {@code max(seq_lengths) <= input.dims(seq_dim)}
 *  * seq_dim: The dimension which is partially reversed.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * batch_dim: The dimension along which reversal is performed.
 * 
 *  Returns:
 *  * {@code Output}: The partially reversed input. It has the same shape as {@code input}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ReverseSequence extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReverseSequence(Pointer p) { super(p); }

  /** Optional attribute setters for ReverseSequence */
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
  
    /** The dimension along which reversal is performed.
     * 
     *  Defaults to 0 */
    public native @ByVal Attrs BatchDim(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long batch_dim_(); public native Attrs batch_dim_(long setter);
  }
  public ReverseSequence(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input seq_lengths, @Cast("tensorflow::int64") long seq_dim) { super((Pointer)null); allocate(scope, input, seq_lengths, seq_dim); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input seq_lengths, @Cast("tensorflow::int64") long seq_dim);
  public ReverseSequence(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input seq_lengths, @Cast("tensorflow::int64") long seq_dim, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, seq_lengths, seq_dim, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                  @ByVal Input seq_lengths, @Cast("tensorflow::int64") long seq_dim, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs BatchDim(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native ReverseSequence operation(Operation setter);
  public native @ByRef Output output(); public native ReverseSequence output(Output setter);
}
