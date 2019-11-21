// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** The backward operation for "BiasAdd" on the "bias" tensor.
 * 
 *  It accumulates all the values from out_backprop into the feature dimension.
 *  For NHWC data format, the feature dimension is the last. For NCHW data format,
 *  the feature dimension is the third-to-last.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * out_backprop: Any number of dimensions.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * data_format: Specify the data format of the input and output data. With the
 *  default format "NHWC", the bias tensor will be added to the last dimension
 *  of the value tensor.
 *  Alternatively, the format could be "NCHW", the data storage order of:
 *      [batch, in_channels, in_height, in_width].
 *  The tensor will be added to "in_channels", the third-to-the-last
 *      dimension.
 * 
 *  Returns:
 *  * {@code Output}: 1-D with size the feature dimension of {@code out_backprop}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class BiasAddGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BiasAddGrad(Pointer p) { super(p); }

  /** Optional attribute setters for BiasAddGrad */
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
  
    /** Specify the data format of the input and output data. With the
     *  default format "NHWC", the bias tensor will be added to the last dimension
     *  of the value tensor.
     *  Alternatively, the format could be "NCHW", the data storage order of:
     *      [batch, in_channels, in_height, in_width].
     *  The tensor will be added to "in_channels", the third-to-the-last
     *      dimension.
     * 
     *  Defaults to "NHWC" */
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
  }
  public BiasAddGrad(@Const @ByRef Scope scope, @ByVal Input out_backprop) { super((Pointer)null); allocate(scope, out_backprop); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input out_backprop);
  public BiasAddGrad(@Const @ByRef Scope scope, @ByVal Input out_backprop,
              @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, out_backprop, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input out_backprop,
              @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native BiasAddGrad operation(Operation setter);
  public native @ByRef Output output(); public native BiasAddGrad output(Output setter);
}
