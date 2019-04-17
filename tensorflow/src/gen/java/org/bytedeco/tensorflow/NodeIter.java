// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// Iterator for stepping through the nodes of a graph.
@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class NodeIter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeIter(Pointer p) { super(p); }

  public NodeIter(@Const Graph graph, int id) { super((Pointer)null); allocate(graph, id); }
  private native void allocate(@Const Graph graph, int id);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef NodeIter rhs);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef NodeIter rhs);
  public native @Name("operator ++") void increment();
  public native @Name("operator *") Node multiply();
  public native @Name("operator ->") Node access();
}
