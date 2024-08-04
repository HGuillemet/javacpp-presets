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


@Namespace("torch::autograd") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PostAccumulateGradHook extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PostAccumulateGradHook(Pointer p) { super(p); }

  public native @Name("operator ()") void apply(@Const @ByRef Tensor tensor);
  // only implemented for python hooks on nodes, registers hook with compiled
  // autograd
  public native void compiled_args(@ByRef CompiledNodeArgs args);

  public native void apply_with_saved(
        @ByRef Tensor arg0,
        @ByRef SwapSavedVariables arg1);
}
