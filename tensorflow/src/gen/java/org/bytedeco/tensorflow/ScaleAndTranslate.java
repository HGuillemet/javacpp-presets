// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** TODO: add doc.
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The resized_images tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ScaleAndTranslate extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScaleAndTranslate(Pointer p) { super(p); }

  /** Optional attribute setters for ScaleAndTranslate */
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
  
    /** Defaults to "lanczos3" */
    public native @ByVal Attrs KernelType(@StringPiece BytePointer x);
    public native @ByVal Attrs KernelType(@StringPiece String x);

    /** Defaults to true */
    public native @ByVal Attrs Antialias(@Cast("bool") boolean x);

    public native @StringPiece BytePointer kernel_type_(); public native Attrs kernel_type_(BytePointer setter);
    public native @Cast("bool") boolean antialias_(); public native Attrs antialias_(boolean setter);
  }
  public ScaleAndTranslate(@Const @ByRef Scope scope, @ByVal Input images,
                    @ByVal Input size, @ByVal Input scale,
                    @ByVal Input translation) { super((Pointer)null); allocate(scope, images, size, scale, translation); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images,
                    @ByVal Input size, @ByVal Input scale,
                    @ByVal Input translation);
  public ScaleAndTranslate(@Const @ByRef Scope scope, @ByVal Input images,
                    @ByVal Input size, @ByVal Input scale,
                    @ByVal Input translation, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, images, size, scale, translation, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input images,
                    @ByVal Input size, @ByVal Input scale,
                    @ByVal Input translation, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs KernelType(@StringPiece BytePointer x);
  public static native @ByVal Attrs KernelType(@StringPiece String x);
  public static native @ByVal Attrs Antialias(@Cast("bool") boolean x);

  public native @ByRef Operation operation(); public native ScaleAndTranslate operation(Operation setter);
  public native @ByRef Output resized_images(); public native ScaleAndTranslate resized_images(Output setter);
}
