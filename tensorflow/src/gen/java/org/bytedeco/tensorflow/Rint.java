// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


/** Returns element-wise integer closest to x.
 * 
 *  If the result is midway between two representable values,
 *  the even representable is chosen.
 *  For example:
 * 
 *  <pre>{@code
 *  rint(-1.5) ==> -2.0
 *  rint(0.5000001) ==> 1.0
 *  rint([-1.7, -1.5, -0.2, 0.2, 1.5, 1.7, 2.0]) ==> [-2., -2., -0., 0., 2., 2., 2.]
 *  }</pre>
 * 
 *  Arguments:
 *  * scope: A Scope object
 * 
 *  Returns:
 *  * {@code Output}: The y tensor. */
@Namespace("tensorflow::ops") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class Rint extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rint(Pointer p) { super(p); }

  public Rint(@Const @ByRef Scope scope, @ByVal Input x) { super((Pointer)null); allocate(scope, x); }
  private native void allocate(@Const @ByRef Scope scope, @ByVal Input x);
  public native @ByVal @Name("operator tensorflow::Output") Output asOutput();
  public native @ByVal @Name("operator tensorflow::Input") Input asInput();
  public native Node node();

  public native @ByRef Operation operation(); public native Rint operation(Operation setter);
  public native @ByRef Output y(); public native Rint y(Output setter);
}
