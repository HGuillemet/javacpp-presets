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


// Identity in forward, Error in backward. Used to implement
// @once_differentiable
@Namespace("torch::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DelayedError extends Node {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DelayedError(Pointer p) { super(p); }

  public DelayedError(@StdString BytePointer msg, @Cast("int64_t") long num_inputs) { super((Pointer)null); allocate(msg, num_inputs); }
  private native void allocate(@StdString BytePointer msg, @Cast("int64_t") long num_inputs);
  public DelayedError(@StdString String msg, @Cast("int64_t") long num_inputs) { super((Pointer)null); allocate(msg, num_inputs); }
  private native void allocate(@StdString String msg, @Cast("int64_t") long num_inputs);

  public native @ByVal TensorVector apply(@ByRef(true) TensorVector inputs);

  public native @StdString BytePointer msg(); public native DelayedError msg(BytePointer setter);
}