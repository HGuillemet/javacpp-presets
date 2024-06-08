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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExecutionPlan extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExecutionPlan(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExecutionPlan(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExecutionPlan position(long position) {
        return (ExecutionPlan)super.position(position);
    }
    @Override public ExecutionPlan getPointer(long i) {
        return new ExecutionPlan((Pointer)this).offsetAddress(i);
    }

  public ExecutionPlan() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ExecutionPlan(@SharedPtr("torch::jit::Graph") @ByVal Graph graph, @StdString BytePointer function_name) { super((Pointer)null); allocate(graph, function_name); }
  private native void allocate(@SharedPtr("torch::jit::Graph") @ByVal Graph graph, @StdString BytePointer function_name);
  public ExecutionPlan(@SharedPtr("torch::jit::Graph") @ByVal Graph graph, @StdString String function_name) { super((Pointer)null); allocate(graph, function_name); }
  private native void allocate(@SharedPtr("torch::jit::Graph") @ByVal Graph graph, @StdString String function_name);

  public native @Cast("bool") @Name("operator bool") boolean asBoolean();

  public native @ByRef Code code(); public native ExecutionPlan code(Code setter);
  public native @SharedPtr("torch::jit::Graph") @ByRef Graph graph(); public native ExecutionPlan graph(Graph setter);
}
