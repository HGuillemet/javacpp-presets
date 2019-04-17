// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Greedily selects a subset of bounding boxes in descending order of score,
 * 
 *  pruning away boxes that have high intersection-over-union (IOU) overlap
 *  with previously selected boxes.  Bounding boxes are supplied as
 *  [y1, x1, y2, x2], where (y1, x1) and (y2, x2) are the coordinates of any
 *  diagonal pair of box corners and the coordinates can be provided as normalized
 *  (i.e., lying in the interval [0, 1]) or absolute.  Note that this algorithm
 *  is agnostic to where the origin is in the coordinate system.  Note that this
 *  algorithm is invariant to orthogonal transformations and translations
 *  of the coordinate system; thus translating or reflections of the coordinate
 *  system result in the same boxes being selected by the algorithm.
 *  The output of this operation is a set of integers indexing into the input
 *  collection of bounding boxes representing the selected boxes.  The bounding
 *  box coordinates corresponding to the selected indices can then be obtained
 *  using the {@code tf.gather operation}.  For example:
 *    selected_indices = tf.image.non_max_suppression(
 *        boxes, scores, max_output_size, iou_threshold)
 *    selected_boxes = tf.gather(boxes, selected_indices)
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * boxes: A 2-D float tensor of shape {@code [num_boxes, 4]}.
 *  * scores: A 1-D float tensor of shape {@code [num_boxes]} representing a single
 *  score corresponding to each box (each row of boxes).
 *  * max_output_size: A scalar integer tensor representing the maximum number of
 *  boxes to be selected by non max suppression.
 * 
 *  Optional attributes (see {@code Attrs}):
 *  * iou_threshold: A float representing the threshold for deciding whether boxes
 *  overlap too much with respect to IOU.
 * 
 *  Returns:
 *  * {@code Output}: A 1-D integer tensor of shape {@code [M]} representing the selected
 *  indices from the boxes tensor, where {@code M <= max_output_size}. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NonMaxSuppression extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NonMaxSuppression(Pointer p) { super(p); }

  /** Optional attribute setters for NonMaxSuppression */
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
  
    /** A float representing the threshold for deciding whether boxes
     *  overlap too much with respect to IOU.
     * 
     *  Defaults to 0.5 */
    public native @ByVal Attrs IouThreshold(float x);

    public native float iou_threshold_(); public native Attrs iou_threshold_(float setter);
  }
  public NonMaxSuppression(@Const @ByRef Scope scope, @ByVal Input boxes,
                    @ByVal Input scores, @ByVal Input max_output_size) { super((Pointer)null); allocate(scope, boxes, scores, max_output_size); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input boxes,
                    @ByVal Input scores, @ByVal Input max_output_size);
  public NonMaxSuppression(@Const @ByRef Scope scope, @ByVal Input boxes,
                    @ByVal Input scores, @ByVal Input max_output_size, @Const @ByRef Attrs attrs) { super((Pointer)null); allocate(scope, boxes, scores, max_output_size, attrs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input boxes,
                    @ByVal Input scores, @ByVal Input max_output_size, @Const @ByRef Attrs attrs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public static native @ByVal Attrs IouThreshold(float x);

  public native @ByRef Operation operation(); public native NonMaxSuppression operation(Operation setter);
  public native @ByRef Output selected_indices(); public native NonMaxSuppression selected_indices(Output setter);
}
