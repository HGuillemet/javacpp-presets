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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SugaredTupleValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SugaredTupleValue(Pointer p) { super(p); }

  public SugaredTupleValue(@ByVal SharedSugaredValueVector tup) { super((Pointer)null); allocate(tup); }
  private native void allocate(@ByVal SharedSugaredValueVector tup);

  public native @ByVal SharedSugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @Const @ByRef(nullValue = "c10::optional<size_t>{}") SizeTOptional size_hint);
  public native @ByVal SharedSugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m);

  public native Value asValue(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  public native @StdString BytePointer kind();

  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        Value idx,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type_hint);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        Value idx);

  // This function is called when a SugaredValue is used to convert a
  // SugaredValue to its iterator. For example, when iterating through a Dict we
  // iterate over its keys
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  // Because this is used to contain SugaredValues of Heterogenous types,
  // we define staticLen() so that when this is iterated over it is emitted
  // as an unrolled loop.
  public native @ByVal LongOptional staticLen();

  public native @ByRef SharedSugaredValueVector tup_(); public native SugaredTupleValue tup_(SharedSugaredValueVector setter);
}
