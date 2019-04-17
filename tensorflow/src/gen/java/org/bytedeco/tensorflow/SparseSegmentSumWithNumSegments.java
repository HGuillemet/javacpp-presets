// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes the sum along sparse segments of a tensor.
 * 
 *  Like {@code SparseSegmentSum}, but allows missing ids in {@code segment_ids}. If an id is
 *  misisng, the {@code output} tensor at that position will be zeroed.
 * 
 *  Read
 *  [the section on segmentation](https://tensorflow.org/api_guides/python/math_ops#Segmentation)
 *  for an explanation of segments.
 * 
 *  For example:
 * 
 *  <pre>{@code python
 *  c = tf.constant([[1,2,3,4], [-1,-2,-3,-4], [5,6,7,8]])
 * 
 *  tf.sparse_segment_sum_with_num_segments(
 *      c, tf.constant([0, 1]), tf.constant([0, 0]), num_segments=3)
 *  # => [[0 0 0 0]
 *  #     [0 0 0 0]
 *  #     [0 0 0 0]]
 * 
 *  tf.sparse_segment_sum_with_num_segments(c,
 *                                          tf.constant([0, 1]),
 *                                          tf.constant([0, 2],
 *                                          num_segments=4))
 *  # => [[ 1  2  3  4]
 *  #     [ 0  0  0  0]
 *  #     [-1 -2 -3 -4]
 *  #     [ 0  0  0  0]]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * indices: A 1-D tensor. Has same rank as {@code segment_ids}.
 *  * segment_ids: A 1-D tensor. Values should be sorted and can be repeated.
 *  * num_segments: Should equal the number of distinct segment IDs.
 * 
 *  Returns:
 *  * {@code Output}: Has same shape as data, except for dimension 0 which
 *  has size {@code num_segments}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SparseSegmentSumWithNumSegments extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SparseSegmentSumWithNumSegments(Pointer p) { super(p); }

  public SparseSegmentSumWithNumSegments(@Const @ByRef Scope scope,
                                  @ByVal Input data, @ByVal Input indices, @ByVal Input segment_ids,
                                  @ByVal Input num_segments) { super((Pointer)null); allocate(scope, data, indices, segment_ids, num_segments); }
  private native void allocate(@Const @ByRef Scope scope,
                                  @ByVal Input data, @ByVal Input indices, @ByVal Input segment_ids,
                                  @ByVal Input num_segments);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SparseSegmentSumWithNumSegments operation(Operation setter);
  public native @ByRef Output output(); public native SparseSegmentSumWithNumSegments output(Output setter);
}
