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
public class LBFGSParamState extends OptimizerCloneableLBFGSParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public LBFGSParamState() { super((Pointer)null); allocate(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LBFGSParamState(Pointer p) { super(p); }
    @UniquePtr @Name("std::make_unique<torch::optim::LBFGSParamState>") private native void allocate();

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer func_evals();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer n_iter();
  public native @ByRef @NoException(true) DoublePointer t();
  public native @ByRef @NoException(true) DoublePointer prev_loss();
  public native @ByRef @NoException(true) Tensor d();
  public native @ByRef @NoException(true) Tensor H_diag();
  public native @ByRef @NoException(true) Tensor prev_flat_grad();
  public native @ByRef @NoException(true) TensorDeque old_dirs();
  public native @ByRef @NoException(true) TensorDeque old_stps();
  public native @ByRef @NoException(true) TensorDeque ro();
  public native @ByRef @NoException(true) TensorVectorOptional al();
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef LBFGSParamState lhs,
        @Const @ByRef LBFGSParamState rhs);
  public boolean equals(LBFGSParamState rhs) { return equals(this, rhs); }
}
