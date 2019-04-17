// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Extracts a glimpse from the input tensor.
 * 
 *  Returns a set of windows called glimpses extracted at location
 *  {@code offsets} from the input tensor. If the windows only partially
 *  overlaps the inputs, the non overlapping areas will be filled with
 *  random noise.
 * 
 *  The result is a 4-D tensor of shape {@code [batch_size, glimpse_height,
 *  glimpse_width, channels]}. The channels and batch dimensions are the
 *  same as that of the input tensor. The height and width of the output
 *  windows are specified in the {@code size} parameter.
 * 
 *  The argument {@code normalized} and {@code centered} controls how the windows are built:
 * 
 *  * If the coordinates are normalized but not centered, 0.0 and 1.0
 *    correspond to the minimum and maximum of each height and width
 *    dimension.
 *  * If the coordinates are both normalized and centered, they range from
 *    -1.0 to 1.0. The coordinates (-1.0, -1.0) correspond to the upper
 *    left corner, the lower right corner is located at (1.0, 1.0) and the
 *    center is at (0, 0).
 *  * If the coordinates are not normalized they are interpreted as
 *    numbers of pixels.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * input: A 4-D float tensor of shape {@code [batch_size, height, width, channels]}.
 *  * size: A 1-D tensor of 2 elements containing the size of the glimpses
 *  to extract.  The glimpse height must be specified first, following
 *  by the glimpse width.
 *  * offsets: A 2-D integer tensor of shape {@code [batch_size, 2]} containing
 *  the y, x locations of the center of each window.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * centered: indicates if the offset coordinates are centered relative to
 *  the image, in which case the (0, 0) offset is relative to the center
 *  of the input images. If false, the (0,0) offset corresponds to the
 *  upper left corner of the input images.
 *  * normalized: indicates if the offset coordinates are normalized.
 *  * uniform_noise: indicates if the noise should be generated using a
 *  uniform distribution or a Gaussian distribution.
 * 
 *  Returns:
 *  * {@code Output}: A tensor representing the glimpses {@code [batch_size,
 *  glimpse_height, glimpse_width, channels]}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ExtractGlimpse extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExtractGlimpse(Pointer p) { super(p); }

  /** Optional attribute setters for ExtractGlimpse */
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
  
    /** indicates if the offset coordinates are centered relative to
     *  the image, in which case the (0, 0) offset is relative to the center
     *  of the input images. If false, the (0,0) offset corresponds to the
     *  upper left corner of the input images.
     * 
     *  Defaults to true */
    
    ///
    public native @ByVal Attrs Centered(@Cast("bool") boolean x);

    /** indicates if the offset coordinates are normalized.
     * 
     *  Defaults to true */
    
    ///
    public native @ByVal Attrs Normalized(@Cast("bool") boolean x);

    /** indicates if the noise should be generated using a
     *  uniform distribution or a Gaussian distribution.
     * 
     *  Defaults to true */
    public native @ByVal Attrs UniformNoise(@Cast("bool") boolean x);

    public native @Cast("bool") boolean centered_(); public native Attrs centered_(boolean setter);
    public native @Cast("bool") boolean normalized_(); public native Attrs normalized_(boolean setter);
    public native @Cast("bool") boolean uniform_noise_(); public native Attrs uniform_noise_(boolean setter);
  }
  public ExtractGlimpse(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input size, @ByVal Input offsets) { super((Pointer)null); allocate(scope, input, size, offsets); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input size, @ByVal Input offsets);
  public ExtractGlimpse(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input size, @ByVal Input offsets, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, input, size, offsets, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input,
                 @ByVal Input size, @ByVal Input offsets, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs Centered(@Cast("bool") boolean x);
  public static native @ByVal Attrs Normalized(@Cast("bool") boolean x);
  public static native @ByVal Attrs UniformNoise(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ExtractGlimpse operation(Operation setter);
  public native @ByRef Output glimpse(); public native ExtractGlimpse glimpse(Output setter);
}
