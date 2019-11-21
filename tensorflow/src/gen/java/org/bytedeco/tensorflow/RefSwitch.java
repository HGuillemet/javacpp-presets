// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Forwards the ref tensor {@code data} to the output port determined by {@code pred}.
 * 
 *  If {@code pred} is true, the {@code data} input is forwarded to {@code output_true}. Otherwise,
 *  the data goes to {@code output_false}.
 * 
 *  See also {@code Switch} and {@code Merge}.
 * 
 *  Arguments:
 *  * scope: A Scope object
 *  * data: The ref tensor to be forwarded to the appropriate output.
 *  * pred: A scalar that specifies which output port will receive data.
 * 
 *  Returns:
 *  * {@code Output} output_false: If {@code pred} is false, data will be forwarded to this output.
 *  * {@code Output} output_true: If {@code pred} is true, data will be forwarded to this output. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class RefSwitch extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RefSwitch(Pointer p) { super(p); }

  public RefSwitch(@Const @ByRef Scope scope, @ByVal Input data,
            @ByVal Input pred) { super((Pointer)null); allocate(scope, data, pred); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input data,
            @ByVal Input pred);

  public native @ByRef Operation operation(); public native RefSwitch operation(Operation setter);
  public native @ByRef Output output_false(); public native RefSwitch output_false(Output setter);
  public native @ByRef Output output_true(); public native RefSwitch output_true(Output setter);
}
