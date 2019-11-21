// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Restores a tensor from checkpoint files.
 * 
 *  This is like {@code Restore} except that restored tensor can be listed as filling
 *  only a slice of a larger tensor.  {@code shape_and_slice} specifies the shape of the
 *  larger tensor and the slice that the restored tensor covers.
 * 
 *  The {@code shape_and_slice} input has the same format as the
 *  elements of the {@code shapes_and_slices} input of the {@code SaveSlices} op.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * file_pattern: Must have a single element. The pattern of the files from
 *  which we read the tensor.
 *  * tensor_name: Must have a single element. The name of the tensor to be
 *  restored.
 *  * shape_and_slice: Scalar. The shapes and slice specifications to use when
 *  restoring a tensors.
 *  * dt: The type of the tensor to be restored.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * preferred_shard: Index of file to open first if multiple files match
 *  {@code file_pattern}. See the documentation for {@code Restore}.
 * 
 *  Returns:
 *  * {@code Output}: The restored tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RestoreSlice extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RestoreSlice(Pointer p) { super(p); }

  /** Optional attribute setters for RestoreSlice */
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
  
    /** Index of file to open first if multiple files match
     *  {@code file_pattern}. See the documentation for {@code Restore}.
     * 
     *  Defaults to -1 */
    public native @ByVal Attrs PreferredShard(@Cast("tensorflow::int64") long x);

    public native @Cast("tensorflow::int64") long preferred_shard_(); public native Attrs preferred_shard_(long setter);
  }
  public RestoreSlice(@Const @ByRef Scope scope, @ByVal Input file_pattern, @ByVal Input tensor_name, @ByVal Input shape_and_slice, @Cast("tensorflow::DataType") int dt) { super((Pointer)null); allocate(scope, file_pattern, tensor_name, shape_and_slice, dt); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input file_pattern, @ByVal Input tensor_name, @ByVal Input shape_and_slice, @Cast("tensorflow::DataType") int dt);
  public RestoreSlice(@Const @ByRef Scope scope, @ByVal Input file_pattern, @ByVal Input tensor_name, @ByVal Input shape_and_slice, @Cast("tensorflow::DataType") int dt, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, file_pattern, tensor_name, shape_and_slice, dt, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input file_pattern, @ByVal Input tensor_name, @ByVal Input shape_and_slice, @Cast("tensorflow::DataType") int dt, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs PreferredShard(@Cast("tensorflow::int64") long x);

  public native @ByRef Operation operation(); public native RestoreSlice operation(Operation setter);
  public native @ByRef Output tensor(); public native RestoreSlice tensor(Output setter);
}
