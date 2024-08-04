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
public class NodeCall extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeCall(Pointer p) { super(p); }

  public NodeCall(@Cast("uint32_t") int id_, @SharedPtr Node node_) { super((Pointer)null); allocate(id_, node_); }
  private native void allocate(@Cast("uint32_t") int id_, @SharedPtr Node node_);

  public native void mark_output(int input_nr, int output_idx);

  public native @Cast("uint32_t") int id(); public native NodeCall id(int setter);
  public native @SharedPtr Node node(); public native NodeCall node(Node setter);
  public native @StdVector IntPair tensor_pre_hooks(); public native NodeCall tensor_pre_hooks(IntPair setter);
  public native @StdVector IntPointer pre_hooks(); public native NodeCall pre_hooks(IntPointer setter);
  public native @StdVector IntPointer post_hooks(); public native NodeCall post_hooks(IntPointer setter);
  public native @StdVector IntPointer post_acc_grad_hooks(); public native NodeCall post_acc_grad_hooks(IntPointer setter);
  public native @StdVector IntPair graph_output(); public native NodeCall graph_output(IntPair setter);
  public native @Cast("bool") boolean needed(); public native NodeCall needed(boolean setter);
}
