// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("torch::jit::generic_graph_node_list<torch::jit::Node>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class graph_node_list extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public graph_node_list(Pointer p) { super(p); }

  public native @ByVal graph_node_list_iterator begin();
  public native @ByVal graph_node_list_iterator end();
  public native @ByVal graph_node_list_iterator rbegin();
  public native @ByVal graph_node_list_iterator rend();
  public native @ByVal graph_node_list reverse();
  public native JitNode front();
  public native JitNode back();
  public graph_node_list(JitNode head, int d) { super((Pointer)null); allocate(head, d); }
  private native void allocate(JitNode head, int d);
}
