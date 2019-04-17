// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Serialize a {@code SparseTensor} into a {@code [3]} {@code Tensor} object.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * sparse_indices: 2-D.  The {@code indices} of the {@code SparseTensor}.
 *  * sparse_values: 1-D.  The {@code values} of the {@code SparseTensor}.
 *  * sparse_shape: 1-D.  The {@code shape} of the {@code SparseTensor}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * out_type: The {@code dtype} to use for serialization; the supported types are {@code string}
 *  (default) and {@code variant}.
 * 
 *  Returns:
 *  * {@code Output}: The serialized_sparse tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SerializeSparse extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SerializeSparse(Pointer p) { super(p); }

  /** Optional attribute setters for SerializeSparse */
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
  
    /** The {@code dtype} to use for serialization; the supported types are {@code string}
     *  (default) and {@code variant}.
     * 
     *  Defaults to DT_STRING */
    public native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

    public native @Cast("tensorflow::DataType") int out_type_(); public native Attrs out_type_(int setter);
  }
  public SerializeSparse(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                  @ByVal Input sparse_shape) { super((Pointer)null); allocate(scope, sparse_indices, sparse_values, sparse_shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                  @ByVal Input sparse_shape);
  public SerializeSparse(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                  @ByVal Input sparse_shape, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, sparse_indices, sparse_values, sparse_shape, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input sparse_indices, @ByVal Input sparse_values,
                  @ByVal Input sparse_shape, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs OutType(@Cast("tensorflow::DataType") int x);

  public native @ByRef Operation operation(); public native SerializeSparse operation(Operation setter);
  public native @ByRef Output serialized_sparse(); public native SerializeSparse serialized_sparse(Output setter);
}
