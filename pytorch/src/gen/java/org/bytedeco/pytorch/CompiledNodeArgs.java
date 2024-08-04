// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::dynamo::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CompiledNodeArgs extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CompiledNodeArgs(Pointer p) { super(p); }

  public native void collect(@Const @ByRef DynamoTensorArg t);

  public native void collect(@Const @ByRef Tensor t);
  public native void collect(@Const @ByRef SymInt t);
  public native void collect(@Const @ByRef IValue iv);
  public native void collect(@Const @ByRef Scalar t);
  public native void collect(@Const @ByRef TensorOptions t);
  public native void collect(@Const @ByRef TensorGeometry t);
  public native void collect(@Const @ByRef Device t);
  public native void collect(@StdString BytePointer t);
  public native void collect(@StdString String t);
  public native void collect(@Const @ByRef TypeMeta t);
  public native void collect(@Cast({"", "const std::shared_ptr<torch::autograd::Node>"}) @SharedPtr Node t);
  public native void collect(@Const @ByRef NodeCall t);
  public native void collect(@Const @ByRef Edge t);
  public native void collect(@Const @ByRef VariableInfo t);
  public native @Cast("bool") boolean cond(@Cast("bool") boolean cond);

// #define COLLECT_AS_BYTES(T)
//   void collect(T t) {
//     specialize_on_bytes(t);
//   }
  public native void collect(ScalarType t);
  public native void collect(DeviceType t);
  public native void collect(@Cast("c10::DeviceType") byte t);
  public native void collect(Layout t);
  public native void collect(MemoryFormat t);
  public native void collect(short t);
  public native void collect(int t);
  public native void collect(@Cast("int64_t") long t);
  public native void collect(@Cast("bool") boolean t);
  public native void collect(float t);
  public native void collect(double t);
// #undef COLLECT_AS_BYTES

  public native void collect_hooks_from(Node fn);

  public native @ByVal CacheKey key();

  public native @Cast("size_t") long add_backward(@ByRef(true) SafePyObject obj);

  public native @Cast("size_t") long add_backward_state(@ByRef(true) SafePyObject obj);

  public native void add_tensor_pre_hook(@ByRef(true) SafePyObject obj, int index);

  public native void add_pre_hook(@ByRef(true) SafePyObject obj);

  public native void add_post_hook(@ByRef(true) SafePyObject obj);

  public native void add_post_acc_grad_hook(@ByRef(true) SafePyObject obj);

  // Need to template the size_t to silence internal 32-bit build errors due to
  // a mix of -Werror, -Wtautological-type-limit-compare and
  // -Wunknown-pragmas

  public native SizeInput.DynType set_default_dyn_type(SizeInput.DynType default_dyn_type);
  public native @Cast("torch::dynamo::autograd::SizeInput::DynType") byte set_default_dyn_type(@Cast("torch::dynamo::autograd::SizeInput::DynType") byte default_dyn_type);

  public CompiledNodeArgs(@ByRef AutogradCompilerCall compiler, @ByRef NodeCall node_call) { super((Pointer)null); allocate(compiler, node_call); }
  private native void allocate(@ByRef AutogradCompilerCall compiler, @ByRef NodeCall node_call);
  
}
