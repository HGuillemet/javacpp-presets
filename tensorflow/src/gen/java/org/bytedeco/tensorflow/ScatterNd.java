// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Scatter {@code updates} into a new tensor according to {@code indices}.
 * 
 *  Creates a new tensor by applying sparse {@code updates} to individual values or
 *  slices within a tensor (initially zero for numeric, empty for string) of
 *  the given {@code shape} according to indices.  This operator is the inverse of the
 *  {@code tf.gather_nd} operator which extracts values or slices from a given tensor.
 * 
 *  This operation is similar to tensor_scatter_add, except that the tensor is
 *  zero-initialized. Calling {@code tf.scatter_nd(indices, values, shape)} is identical
 *  to {@code tensor_scatter_add(tf.zeros(shape, values.dtype), indices, values)}
 * 
 *  If {@code indices} contains duplicates, then their updates are accumulated (summed).
 * 
 *  **WARNING**: The order in which updates are applied is nondeterministic, so the
 *  output will be nondeterministic if {@code indices} contains duplicates -- because
 *  of some numerical approximation issues, numbers summed in different order
 *  may yield different results.
 * 
 *  {@code indices} is an integer tensor containing indices into a new tensor of shape
 *  {@code shape}.  The last dimension of {@code indices} can be at most the rank of {@code shape}:
 * 
 *      indices.shape[-1] <= shape.rank
 * 
 *  The last dimension of {@code indices} corresponds to indices into elements
 *  (if {@code indices.shape[-1] = shape.rank}) or slices
 *  (if {@code indices.shape[-1] < shape.rank}) along dimension {@code indices.shape[-1]} of
 *  {@code shape}.  {@code updates} is a tensor with shape
 * 
 *      indices.shape[:-1] + shape[indices.shape[-1]:]
 * 
 *  The simplest form of scatter is to insert individual elements in a tensor by
 *  index. For example, say we want to insert 4 scattered elements in a rank-1
 *  tensor with 8 elements.
 * 
 *  <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 *  <img style="width:100%" src="https://www.tensorflow.org/images/ScatterNd1.png" alt>
 *  </div>
 * 
 *  In Python, this scatter operation would look like this:
 * 
 *  <pre>{@code python
 *      indices = tf.constant([[4], [3], [1], [7]])
 *      updates = tf.constant([9, 10, 11, 12])
 *      shape = tf.constant([8])
 *      scatter = tf.scatter_nd(indices, updates, shape)
 *      with tf.Session() as sess:
 *        print(sess.run(scatter))
 *  }</pre>
 * 
 *  The resulting tensor would look like this:
 * 
 *      [0, 11, 0, 10, 9, 0, 0, 12]
 * 
 *  We can also, insert entire slices of a higher rank tensor all at once. For
 *  example, if we wanted to insert two slices in the first dimension of a
 *  rank-3 tensor with two matrices of new values.
 * 
 *  <div style="width:70%; margin:auto; margin-bottom:10px; margin-top:20px;">
 *  <img style="width:100%" src="https://www.tensorflow.org/images/ScatterNd2.png" alt>
 *  </div>
 * 
 *  In Python, this scatter operation would look like this:
 * 
 *  <pre>{@code python
 *      indices = tf.constant([[0], [2]])
 *      updates = tf.constant([[[5, 5, 5, 5], [6, 6, 6, 6],
 *                              [7, 7, 7, 7], [8, 8, 8, 8]],
 *                             [[5, 5, 5, 5], [6, 6, 6, 6],
 *                              [7, 7, 7, 7], [8, 8, 8, 8]]])
 *      shape = tf.constant([4, 4, 4])
 *      scatter = tf.scatter_nd(indices, updates, shape)
 *      with tf.Session() as sess:
 *        print(sess.run(scatter))
 *  }</pre>
 * 
 *  The resulting tensor would look like this:
 * 
 *      [[[5, 5, 5, 5], [6, 6, 6, 6], [7, 7, 7, 7], [8, 8, 8, 8]],
 *       [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]],
 *       [[5, 5, 5, 5], [6, 6, 6, 6], [7, 7, 7, 7], [8, 8, 8, 8]],
 *       [[0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0], [0, 0, 0, 0]]]
 * 
 *  Note that on CPU, if an out of bound index is found, an error is returned.
 *  On GPU, if an out of bound index is found, the index is ignored.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: Index tensor.
 *  * updates: Updates to scatter into output.
 *  * shape: 1-D. The shape of the resulting tensor.
 * 
 *  Returns:
 *  * {@code Output}: A new tensor with the given shape and updates applied according
 *  to the indices. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class ScatterNd extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScatterNd(Pointer p) { super(p); }

  public ScatterNd(@Const @ByRef Scope scope, @ByVal Input indices,
            @ByVal Input updates, @ByVal Input shape) { super((Pointer)null); allocate(scope, indices, updates, shape); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input indices,
            @ByVal Input updates, @ByVal Input shape);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native ScatterNd operation(Operation setter);
  public native @ByRef Output output(); public native ScatterNd output(Output setter);
}
