// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// Notice that those structs don't manage lifetime of their members.
// They are only valid only right after you call getDebugState() and should
// never be used again once another GraphExecutor function is called.

// NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GraphExecutorState extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GraphExecutorState() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GraphExecutorState(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GraphExecutorState(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GraphExecutorState position(long position) {
        return (GraphExecutorState)super.position(position);
    }
    @Override public GraphExecutorState getPointer(long i) {
        return new GraphExecutorState((Pointer)this).offsetAddress(i);
    }

  public native @Const Graph graph(); public native GraphExecutorState graph(Graph setter);
  public native @ByRef ExecutionPlan fallback(); public native GraphExecutorState fallback(ExecutionPlan setter); // XXX: members of this field are optional
  public native @ByRef ArgumentSpecExecutionPlanMap execution_plans(); public native GraphExecutorState execution_plans(ArgumentSpecExecutionPlanMap setter);
}
