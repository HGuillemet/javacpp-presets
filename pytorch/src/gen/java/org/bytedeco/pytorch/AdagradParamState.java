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


@Namespace("torch::optim") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdagradParamState extends OptimizerCloneableAdagradParamState {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdagradParamState(Pointer p) { super(p); }

  public native @ByRef @NoException(true) Tensor sum();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer step();
  public AdagradParamState() { super((Pointer)null); allocate(); }
  @UniquePtr @Name("std::make_unique<torch::optim::AdagradParamState>") private native void allocate();
  public AdagradParamState(@Const @ByRef AdagradParamState arg0) { super((Pointer)null); allocate(arg0); }
  @UniquePtr @Name("std::make_unique<torch::optim::AdagradParamState>") private native void allocate(@Const @ByRef AdagradParamState arg0);
  public native @ByRef @Name("operator =") AdagradParamState put(@Const @ByRef AdagradParamState arg0);
  
  
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef AdagradParamState lhs,
        @Const @ByRef AdagradParamState rhs);
  public boolean equals(AdagradParamState rhs) { return equals(this, rhs); }
}
