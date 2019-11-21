// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes a 3-D convolution given 5-D {@code input} and {@code filter} tensors.
 * 
 *  In signal processing, cross-correlation is a measure of similarity of
 *  two waveforms as a function of a time-lag applied to one of them. This
 *  is also known as a sliding dot product or sliding inner-product.
 * 
 *  Our Conv3D implements a form of cross-correlation.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: Shape {@code [batch, in_depth, in_height, in_width, in_channels]}.
 *  * filter: Shape {@code [filter_depth, filter_height, filter_width, in_channels,
 *  out_channels]}. {@code in_channels} must match between {@code input} and {@code filter}.
 *  * strides: 1-D tensor of length 5. The stride of the sliding window for each
 *  dimension of {@code input}. Must have {@code strides[0] = strides[4] = 1}.
 *  * padding: The type of padding algorithm to use.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * data_format: The data format of the input and output data. With the
 *  default format "NDHWC", the data is stored in the order of:
 *      [batch, in_depth, in_height, in_width, in_channels].
 *  Alternatively, the format could be "NCDHW", the data storage order is:
 *      [batch, in_channels, in_depth, in_height, in_width].
 *  * dilations: 1-D tensor of length 5.  The dilation factor for each dimension of
 *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each
 *  filter element on that dimension. The dimension order is determined by the
 *  value of {@code data_format}, see above for details. Dilations in the batch and
 *  depth dimensions must be 1.
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Conv3D extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv3D(Pointer p) { super(p); }

  /** Optional attribute setters for Conv3D */
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
  
    /** The data format of the input and output data. With the
     *  default format "NDHWC", the data is stored in the order of:
     *      [batch, in_depth, in_height, in_width, in_channels].
     *  Alternatively, the format could be "NCDHW", the data storage order is:
     *      [batch, in_channels, in_depth, in_height, in_width].
     * 
     *  Defaults to "NDHWC" */
    
    ///
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    /** 1-D tensor of length 5.  The dilation factor for each dimension of
     *  {@code input}. If set to k > 1, there will be k-1 skipped cells between each
     *  filter element on that dimension. The dimension order is determined by the
     *  value of {@code data_format}, see above for details. Dilations in the batch and
     *  depth dimensions must be 1.
     * 
     *  Defaults to [1, 1, 1, 1, 1] */
    public native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
    public native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
    public native @ByVal Attrs Dilations(@ArraySlice int... x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
    public native @ArraySlice IntPointer dilations_(); public native Attrs dilations_(IntPointer setter);
  }
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece BytePointer padding);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece String padding);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece BytePointer padding);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece String padding);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, input, filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece BytePointer padding);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece String padding) { super((Pointer)null); allocate(scope, input, filter, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece String padding);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece String padding, @Const @ByRef Attrs attrs);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntPointer strides,
         @StringPiece String padding, @Const @ByRef Attrs attrs);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice IntBuffer strides,
         @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public Conv3D(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, filter, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
         @ByVal Input filter, @ArraySlice int[] strides,
         @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntPointer x);
  public static native @ByVal Attrs Dilations(@ArraySlice IntBuffer x);
  public static native @ByVal Attrs Dilations(@ArraySlice int... x);

  public native @ByRef Operation operation(); public native Conv3D operation(Operation setter);
  public native @ByRef Output output(); public native Conv3D output(Output setter);
}
