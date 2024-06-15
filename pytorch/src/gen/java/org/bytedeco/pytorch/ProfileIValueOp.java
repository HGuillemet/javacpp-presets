// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ProfileIValueOp extends JitNode {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProfileIValueOp(Pointer p) { super(p); }

  @MemberGetter public static native @Const @ByRef Symbol Kind();
  public ProfileIValueOp(
        Graph graph,
        @ByVal IValueVectorConsumer callback) { super((Pointer)null); allocate(graph, callback); }
  private native void allocate(
        Graph graph,
        @ByVal IValueVectorConsumer callback);

  public native void cloneFrom(JitNode other_);
  public native JitNode allocNewInstance(Graph g);

  public native @ByVal @Cast("std::function<void(std::vector<c10::IValue>&)>*") Pointer getCallback();

  public native void setCallback(@ByVal IValueVectorConsumer callback);
}
