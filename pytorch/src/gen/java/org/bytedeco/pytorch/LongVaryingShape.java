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


@Name("c10::VaryingShape<int64_t>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LongVaryingShape extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongVaryingShape(Pointer p) { super(p); }

  public LongVaryingShape(@Cast("const std::vector<int64_t>*") @ByRef LongVector vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@Cast("const std::vector<int64_t>*") @ByRef LongVector vec);

  public LongVaryingShape(@ByVal LongArrayRef vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@ByVal LongArrayRef vec);
  public LongVaryingShape(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... vec);

  public LongVaryingShape(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional size) { super((Pointer)null); allocate(size); }
  private native void allocate(@ByVal(nullValue = "c10::optional<size_t>(c10::nullopt)") SizeTOptional size);
  public LongVaryingShape() { super((Pointer)null); allocate(); }
  private native void allocate();

  public LongVaryingShape(@ByVal @Cast("c10::VaryingShape<int64_t>::ListOfOptionalElements*") LongOptionalVector dims) { super((Pointer)null); allocate(dims); }
  private native void allocate(@ByVal @Cast("c10::VaryingShape<int64_t>::ListOfOptionalElements*") LongOptionalVector dims);

  public LongVaryingShape(@Cast("size_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(@Cast("size_t") long size);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef LongVaryingShape other);

  public native @Const @ByRef @Name("operator []") LongOptional get(@Cast("size_t") long i);

  public native @ByVal SizeTOptional size();

  public native @Cast("const c10::optional<c10::VaryingShape<int64_t>::ListOfOptionalElements>*") @ByRef Pointer sizes();

  public native @ByVal LongVaryingShape merge(@Const @ByRef LongVaryingShape other);

  public native @ByVal LongVectorOptional concrete_sizes();

  public native @Cast("bool") boolean isComplete();
}
