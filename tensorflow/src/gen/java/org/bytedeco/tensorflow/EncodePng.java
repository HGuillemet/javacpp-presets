// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** PNG-encode an image.
 * 
 *  {@code image} is a 3-D uint8 or uint16 Tensor of shape {@code [height, width, channels]}
 *  where {@code channels} is:
 * 
 *  *   1: for grayscale.
 *  *   2: for grayscale + alpha.
 *  *   3: for RGB.
 *  *   4: for RGBA.
 * 
 *  The ZLIB compression level, {@code compression}, can be -1 for the PNG-encoder
 *  default or a value from 0 to 9.  9 is the highest compression level, generating
 *  the smallest output, but is slower.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * image: 3-D with shape {@code [height, width, channels]}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * compression: Compression level.
 * 
 *  Returns:
 *  * {@code Output}: 0-D. PNG-encoded image. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class EncodePng extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EncodePng(Pointer p) { super(p); }

  /** Optional attribute setters for EncodePng */
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
  
    /** Compression level.
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs Compression(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long compression_(); public native Attrs compression_(long setter);
  }
  public EncodePng(@Const @ByRef Scope scope, @ByVal Input image) { super((Pointer)null); allocate(scope, image); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input image);
  public EncodePng(@Const @ByRef Scope scope, @ByVal Input image, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, image, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input image, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Compression(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native EncodePng operation(Operation setter);
  public native @ByRef Output contents(); public native EncodePng contents(Output setter);
}
