// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns the complex conjugate of a complex number.
 * 
 *  Given a tensor {@code input} of complex numbers, this operation returns a tensor of
 *  complex numbers that are the complex conjugate of each element in {@code input}. The
 *  complex numbers in {@code input} must be of the form \(a + bj\), where *a* is the
 *  real part and *b* is the imaginary part.
 * 
 *  The complex conjugate returned by this operation is of the form \(a - bj\).
 * 
 *  For example:
 * 
 *  <pre>{@code
 *  # tensor 'input' is [-2.25 + 4.75j, 3.25 + 5.75j]
 *  tf.conj(input) ==> [-2.25 - 4.75j, 3.25 - 5.75j]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The output tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Conj extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conj(Pointer p) { super(p); }

  public Conj(@Const @ByRef Scope scope, @ByVal Input input) { super((Pointer)null); allocate(scope, input); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input input);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Conj operation(Operation setter);
  public native @ByRef Output output(); public native Conj output(Output setter);
}
