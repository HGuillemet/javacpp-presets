// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Forwards the {@code index}th element of {@code inputs} to {@code output}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * index: A scalar that determines the input that gets selected.
 *  * inputs: A list of ref tensors, one of which will be forwarded to {@code output}.
 * 
 *  Returns:
 *  * {@code Output}: The forwarded tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RefSelect extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RefSelect(Pointer p) { super(p); }

  public RefSelect(@Const @ByRef Scope scope, @ByVal Input index,
            @ByVal InputList inputs) { super((Pointer)null); allocate(scope, index, inputs); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input index,
            @ByVal InputList inputs);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native RefSelect operation(Operation setter);
  public native @ByRef Output output(); public native RefSelect output(Output setter);
}
