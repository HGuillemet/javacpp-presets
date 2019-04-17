// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns a batched diagonal tensor with a given batched diagonal values.
 * 
 *  Given a {@code diagonal}, this operation returns a tensor with the {@code diagonal} and
 *  everything else padded with zeros. The diagonal is computed as follows:
 * 
 *  Assume {@code diagonal} has {@code k} dimensions {@code [I, J, K, ..., N]}, then the output is a
 *  tensor of rank {@code k+1} with dimensions [I, J, K, ..., N, N]{@code  where:
 * 
 *  }output[i, j, k, ..., m, n] = 1{m=n} * diagonal[i, j, k, ..., n]{@code .
 * 
 *  For example:
 * 
 *  }{@code }
 *  # 'diagonal' is [[1, 2, 3, 4], [5, 6, 7, 8]]
 * 
 *  and diagonal.shape = (2, 4)
 * 
 *  tf.matrix_diag(diagonal) ==> [[[1, 0, 0, 0]
 *                                       [0, 2, 0, 0]
 *                                       [0, 0, 3, 0]
 *                                       [0, 0, 0, 4]],
 *                                      [[5, 0, 0, 0]
 *                                       [0, 6, 0, 0]
 *                                       [0, 0, 7, 0]
 *                                       [0, 0, 0, 8]]]
 * 
 *  which has shape (2, 4, 4)
 *  <pre>{@code
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * diagonal: Rank `k`, where `k >= 1`.
 * 
 *  Returns:
 *  * `Output`: Rank `k+1`, with `output.shape = diagonal.shape + [diagonal.shape[-1]]`. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class MatrixDiag extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatrixDiag(Pointer p) { super(p); }

  public MatrixDiag(@Const @ByRef Scope scope, @ByVal Input diagonal) { super((Pointer)null); allocate(scope, diagonal); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input diagonal);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native MatrixDiag operation(Operation setter);
  public native @ByRef Output output(); public native MatrixDiag output(Output setter);
}
