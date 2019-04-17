// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Read {@code SparseTensors} from a {@code SparseTensorsMap} and concatenate them.
 * 
 *  The input {@code sparse_handles} must be an {@code int64} matrix of shape {@code [N, 1]} where
 *  {@code N} is the minibatch size and the rows correspond to the output handles of
 *  {@code AddSparseToTensorsMap} or {@code AddManySparseToTensorsMap}.  The ranks of the
 *  original {@code SparseTensor} objects that went into the given input ops must all
 *  match.  When the final {@code SparseTensor} is created, it has rank one
 *  higher than the ranks of the incoming {@code SparseTensor} objects
 *  (they have been concatenated along a new row dimension on the left).
 * 
 *  The output {@code SparseTensor} object's shape values for all dimensions but the
 *  first are the max across the input {@code SparseTensor} objects' shape values
 *  for the corresponding dimensions.  Its first shape value is {@code N}, the minibatch
 *  size.
 * 
 *  The input {@code SparseTensor} objects' indices are assumed ordered in
 *  standard lexicographic order.  If this is not the case, after this
 *  step run {@code SparseReorder} to restore index ordering.
 * 
 *  For example, if the handles represent an input, which is a {@code [2, 3]} matrix
 *  representing two original {@code SparseTensor} objects:
 * 
 *  <pre>{@code
 *      index = [ 0]
 *              [10]
 *              [20]
 *      values = [1, 2, 3]
 *      shape = [50]
 *  }</pre>
 * 
 *  and
 * 
 *  <pre>{@code
 *      index = [ 2]
 *              [10]
 *      values = [4, 5]
 *      shape = [30]
 *  }</pre>
 * 
 *  then the final {@code SparseTensor} will be:
 * 
 *  <pre>{@code
 *      index = [0  0]
 *              [0 10]
 *              [0 20]
 *              [1  2]
 *              [1 10]
 *      values = [1, 2, 3, 4, 5]
 *      shape = [2 50]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * sparse_handles: 1-D, The {@code N} serialized {@code SparseTensor} objects.
 *  Shape: {@code [N]}.
 *  * dtype: The {@code dtype} of the {@code SparseTensor} objects stored in the
 *  {@code SparseTensorsMap}.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * container: The container name for the {@code SparseTensorsMap} read by this op.
 *  * shared_name: The shared name for the {@code SparseTensorsMap} read by this op.
 *  It should not be blank; rather the {@code shared_name} or unique Operation name
 *  of the Op that created the original {@code SparseTensorsMap} should be used.
 * 
 *  Returns:
 *  * {@code Output} sparse_indices: 2-D.  The {@code indices} of the minibatch {@code SparseTensor}.
 *  * {@code Output} sparse_values: 1-D.  The {@code values} of the minibatch {@code SparseTensor}.
 *  * {@code Output} sparse_shape: 1-D.  The {@code shape} of the minibatch {@code SparseTensor}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class TakeManySparseFromTensorsMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TakeManySparseFromTensorsMap(Pointer p) { super(p); }

  /** Optional attribute setters for TakeManySparseFromTensorsMap */
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
  
    /** The container name for the {@code SparseTensorsMap} read by this op.
     * 
     *  Defaults to "" */
    
    ///
    public native @ByVal Attrs Container(@StringPiece BytePointer x);
    public native @ByVal Attrs Container(@StringPiece String x);

    /** The shared name for the {@code SparseTensorsMap} read by this op.
     *  It should not be blank; rather the {@code shared_name} or unique Operation name
     *  of the Op that created the original {@code SparseTensorsMap} should be used.
     * 
     *  Defaults to "" */
    public native @ByVal Attrs SharedName(@StringPiece BytePointer x);
    public native @ByVal Attrs SharedName(@StringPiece String x);

    public native @StringPiece BytePointer container_(); public native Attrs container_(BytePointer setter);
    public native @StringPiece BytePointer shared_name_(); public native Attrs shared_name_(BytePointer setter);
  }
  public TakeManySparseFromTensorsMap(@Const @ByRef Scope scope,
                               @ByVal Input sparse_handles, @Cast("tensorflow::DataType") int dtype) { super((Pointer)null); allocate(scope, sparse_handles, dtype); }
  private native void allocate(@Const @ByRef Scope scope,
                               @ByVal Input sparse_handles, @Cast("tensorflow::DataType") int dtype);
  public TakeManySparseFromTensorsMap(@Const @ByRef Scope scope,
                               @ByVal Input sparse_handles, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, sparse_handles, dtype, attrs); }
  private native void allocate(@Const @ByRef Scope scope,
                               @ByVal Input sparse_handles, @Cast("tensorflow::DataType") int dtype, @Const @ByRef Attrs attrs);

  public static native @ByVal Attrs Container(@StringPiece BytePointer x);
  public static native @ByVal Attrs Container(@StringPiece String x);
  public static native @ByVal Attrs SharedName(@StringPiece BytePointer x);
  public static native @ByVal Attrs SharedName(@StringPiece String x);

  public native @ByRef Operation operation(); public native TakeManySparseFromTensorsMap operation(Operation setter);
  public native @ByRef Output sparse_indices(); public native TakeManySparseFromTensorsMap sparse_indices(Output setter);
  public native @ByRef Output sparse_values(); public native TakeManySparseFromTensorsMap sparse_values(Output setter);
  public native @ByRef Output sparse_shape(); public native TakeManySparseFromTensorsMap sparse_shape(Output setter);
}
