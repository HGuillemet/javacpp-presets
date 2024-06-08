// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("torch::jit::generic_graph_node_list_iterator<torch::jit::Node>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class graph_node_list_iterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public graph_node_list_iterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public graph_node_list_iterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public graph_node_list_iterator position(long position) {
        return (graph_node_list_iterator)super.position(position);
    }
    @Override public graph_node_list_iterator getPointer(long i) {
        return new graph_node_list_iterator((Pointer)this).offsetAddress(i);
    }

  public graph_node_list_iterator() { super((Pointer)null); allocate(); }
  private native void allocate();
  public graph_node_list_iterator(JitNode cur, int d) { super((Pointer)null); allocate(cur, d); }
  private native void allocate(JitNode cur, int d);
  public graph_node_list_iterator(
        @Const @ByRef graph_node_list_iterator rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(
        @Const @ByRef graph_node_list_iterator rhs);
  public native @ByRef @Name("operator =") graph_node_list_iterator put(
        @Const @ByRef graph_node_list_iterator rhs);
  public native @Name("operator *") JitNode multiply();
  public native @Name("operator ->") JitNode access();
  public native @ByRef @Name("operator ++") graph_node_list_iterator increment();
  public native @ByVal @Name("operator ++") graph_node_list_iterator increment(int arg0);
  public native @ByRef @Name("operator --") graph_node_list_iterator decrement();
  public native @ByVal @Name("operator --") graph_node_list_iterator decrement(int arg0);

  // erase cur without invalidating this iterator
  // named differently from destroy so that ->/. bugs do not
  // silently cause the wrong one to be called.
  // iterator will point to the previous entry after call
  public native void destroyCurrent();
  public native @ByVal graph_node_list_iterator reverse();
}
