// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// We special case Graph attributes like this because we want to ensure that
// Graph::copy() is called when we clone() these attributes.
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GraphAttr extends AttributeValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphAttr(Pointer p) { super(p); }

  public GraphAttr(@ByVal Symbol name, @SharedPtr("torch::jit::Graph") @ByVal Graph value_) { super((Pointer)null); allocate(name, value_); }
  @UniquePtr @Name("std::make_unique<torch::jit::GraphAttr>") private native void allocate(@ByVal Symbol name, @SharedPtr("torch::jit::Graph") @ByVal Graph value_);
  public native @SharedPtr("torch::jit::Graph") @ByRef Graph value();
  public native @UniquePtr @ByVal AttributeValue clone();
  public native JitAttributeKind kind();
}
