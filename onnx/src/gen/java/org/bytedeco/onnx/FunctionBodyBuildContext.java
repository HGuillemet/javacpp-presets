// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


@Namespace("onnx") @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FunctionBodyBuildContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FunctionBodyBuildContext(Pointer p) { super(p); }

  public native @Const AttributeProto getAttribute(@StdString BytePointer name);
  public native @Const AttributeProto getAttribute(@StdString String name);
  public native @Cast("bool") boolean hasInput(int inputIndex);
  public native @Cast("bool") boolean hasOutput(int inputIndex);
  // getInputType(i) should return null for missing optional inputs, or if
  // type-inference could not infer the input-type (erroneous model).
  public native @Const TypeProto getInputType(int inputIndex);
}
