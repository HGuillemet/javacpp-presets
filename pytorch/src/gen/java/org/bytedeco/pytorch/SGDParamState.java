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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SGDParamState extends OptimizerCloneableSGDParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public SGDParamState() { super((Pointer)null); allocate(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SGDParamState(Pointer p) { super(p); }
    @UniquePtr @Name("std::make_unique<torch::optim::SGDParamState>") private native void allocate();

  public native @ByRef @NoException(true) Tensor momentum_buffer();
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef SGDParamState lhs,
        @Const @ByRef SGDParamState rhs);
  public boolean equals(SGDParamState rhs) { return equals(this, rhs); }
}
