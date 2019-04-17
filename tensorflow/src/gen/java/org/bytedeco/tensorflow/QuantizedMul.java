// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns x * y element-wise, working on quantized buffers.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * min_x: The float value that the lowest quantized {@code x} value represents.
 *  * max_x: The float value that the highest quantized {@code x} value represents.
 *  * min_y: The float value that the lowest quantized {@code y} value represents.
 *  * max_y: The float value that the highest quantized {@code y} value represents.
 * 
 *  Returns:
 *  * {@code Output} z
 *  * {@code Output} min_z: The float value that the lowest quantized output value represents.
 *  * {@code Output} max_z: The float value that the highest quantized output value represents.
 * 
 *  *NOTE*: {@code QuantizedMul} supports limited forms of broadcasting. More about
 *  broadcasting [here](http://docs.scipy.org/doc/numpy/user/basics.broadcasting.html) */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class QuantizedMul extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QuantizedMul(Pointer p) { super(p); }

  /** Optional attribute setters for QuantizedMul */
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
  
    /** Defaults to DT_QINT32 */
    public native @ByVal Attrs Toutput(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int Toutput_(); public native Attrs Toutput_(int setter);
  }
  public QuantizedMul(@Const @ByRef Scope scope, @ByVal Input x,
               @ByVal Input y, @ByVal Input min_x,
               @ByVal Input max_x, @ByVal Input min_y,
               @ByVal Input max_y) { super((Pointer)null); allocate(scope, x, y, min_x, max_x, min_y, max_y); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
               @ByVal Input y, @ByVal Input min_x,
               @ByVal Input max_x, @ByVal Input min_y,
               @ByVal Input max_y);
  public QuantizedMul(@Const @ByRef Scope scope, @ByVal Input x,
               @ByVal Input y, @ByVal Input min_x,
               @ByVal Input max_x, @ByVal Input min_y,
               @ByVal Input max_y, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, x, y, min_x, max_x, min_y, max_y, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x,
               @ByVal Input y, @ByVal Input min_x,
               @ByVal Input max_x, @ByVal Input min_y,
               @ByVal Input max_y, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Toutput(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native QuantizedMul operation(Operation setter);
  public native @ByRef Output z(); public native QuantizedMul z(Output setter);
  public native @ByRef Output min_z(); public native QuantizedMul min_z(Output setter);
  public native @ByRef Output max_z(); public native QuantizedMul max_z(Output setter);
}
