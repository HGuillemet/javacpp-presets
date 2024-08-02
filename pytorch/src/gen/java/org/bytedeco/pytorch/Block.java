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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Block extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Block(Pointer p) { super(p); }


  
  
  public Block(Graph graph_, JitNode node_) { super((Pointer)null); allocate(graph_, node_); }
  private native void allocate(Graph graph_, JitNode node_);

  public native @ByVal ValueArrayRef inputs();
  public native @ByVal ValueArrayRef outputs();
  public native @ByVal graph_node_list nodes();
  public native JitNode return_node();
  public native JitNode param_node();
  /**
   * \warning NEVER pass raw pointer of smart pointer managed Graph to Python.
   * Check #87343 for details.
   */
  public native Graph owningGraph();
  public native JitNode owningNode();

  public native Value addInput(@StdString BytePointer name/*=""*/);
  public native Value addInput();
  public native Value addInput(@StdString String name/*=""*/);
  public native Value insertInput(@Cast("size_t") long i, @StdString BytePointer name/*=""*/);
  public native Value insertInput(@Cast("size_t") long i);
  public native Value insertInput(@Cast("size_t") long i, @StdString String name/*=""*/);
  public native void eraseInput(@Cast("size_t") long i);
  public native void removeAllInputs();
  public native @Cast("size_t") long registerOutput(Value v);
  public native @Cast("size_t") long insertOutput(@Cast("size_t") long i, Value n);
  public native void eraseOutput(@Cast("size_t") long i);
  public native void removeAllOutputs();

  public native void replaceOutput(@Cast("size_t") long i, Value n);
  public native void permuteOutputs(@Cast("const std::vector<size_t>*") @ByRef SizeTVector new_inputs);
  public native void permuteInputs(@Cast("const std::vector<size_t>*") @ByRef SizeTVector new_inputs);

  public native JitNode appendNode(JitNode n);
  public native JitNode prependNode(JitNode n);

  // clone all inputs, nodes, and outputs from src and append them
  // to the inputs, nodes, and outputs of this block
  // value_map is used whenever a node in src references a free variable
  // in src to look up its corresponding value
  public native void cloneFrom(Block src, @ByVal ValueMapper value_map);
  public native void remapTypes(@Const @ByRef TypeMapper type_map);

  public native @SharedPtr BlockWrap wrap();

  public native void clear();
}
