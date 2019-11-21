// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Computes gradients for the scaled exponential linear (Selu) operation.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * gradients: The backpropagated gradients to the corresponding Selu operation.
 *  * outputs: The outputs of the corresponding Selu operation.
 * 
 *  Returns:
 *  * {@code Output}: The gradients: {@code gradients * (outputs + scale * alpha)}
 *  if outputs < 0, {@code scale * gradients} otherwise. */
@Namespace("tensorflow::ops::internal") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class SeluGrad extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SeluGrad(Pointer p) { super(p); }

  public SeluGrad(@Const @ByRef Scope scope, @ByVal Input gradients,
           @ByVal Input outputs) { super((Pointer)null); allocate(scope, gradients, outputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input gradients,
           @ByVal Input outputs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native SeluGrad operation(Operation setter);
  public native @ByRef Output backprops(); public native SeluGrad backprops(Output setter);
}
