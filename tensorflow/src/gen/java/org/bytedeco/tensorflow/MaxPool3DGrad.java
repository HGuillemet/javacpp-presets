// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes gradients of max pooling function.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * orig_input: The original input tensor.
 *  * orig_output: The original output tensor.
 *  * grad: Output backprop of shape {@code [batch, depth, rows, cols, channels]}.
 *  * ksize: 1-D tensor of length 5. The size of the window for each dimension of
 *  the input tensor. Must have {@code ksize[0] = ksize[4] = 1}.
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
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MaxPool3DGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MaxPool3DGrad(Pointer p) { super(p); }

  /** Optional attribute setters for MaxPool3DGrad */
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
    public native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
    public native @ByVal Attrs DataFormat(@StringPiece String x);

    public native @StringPiece BytePointer data_format_(); public native Attrs data_format_(BytePointer setter);
  }
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece BytePointer padding);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece String padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece String padding);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece BytePointer padding);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece String padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece String padding);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece BytePointer padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece BytePointer padding);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece String padding) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece String padding);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece String padding, @Const @ByRef Attrs attrs);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntPointer ksize, @ArraySlice IntPointer strides,
                @StringPiece String padding, @Const @ByRef Attrs attrs);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece BytePointer padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice IntBuffer ksize, @ArraySlice IntBuffer strides,
                @StringPiece BytePointer padding, @Const @ByRef Attrs attrs);
  public MaxPool3DGrad(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece String padding, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, orig_input, orig_output, grad, ksize, strides, padding, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input orig_input,
                @ByVal Input orig_output, @ByVal Input grad, @ArraySlice int[] ksize, @ArraySlice int[] strides,
                @StringPiece String padding, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs DataFormat(@StringPiece BytePointer x);
  public static native @ByVal Attrs DataFormat(@StringPiece String x);

  public native @ByRef Operation operation(); public native MaxPool3DGrad operation(Operation setter);
  public native @ByRef Output output(); public native MaxPool3DGrad output(Output setter);
}
