// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdagradParamState extends OptimizerCloneableAdagradParamState {
    static { Loader.load(); }
    /** Default native constructor. */
    public AdagradParamState() { super((Pointer)null); allocate(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdagradParamState(Pointer p) { super(p); }
    @UniquePtr @Name("std::make_unique<torch::optim::AdagradParamState>") private native void allocate();

  public native @ByRef @NoException(true) Tensor sum();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer step();
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef AdagradParamState lhs,
        @Const @ByRef AdagradParamState rhs);
  public boolean equals(AdagradParamState rhs) { return equals(this, rhs); }
}
