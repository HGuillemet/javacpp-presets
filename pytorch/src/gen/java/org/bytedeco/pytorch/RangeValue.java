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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// matched against for special handling of range expressions
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RangeValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RangeValue(Pointer p) { super(p); }

  public RangeValue(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @ByVal ValueVector input,
        @ByVal(nullValue = "std::optional<int64_t>(c10::nullopt)") LongOptional static_len) { super((Pointer)null); allocate(loc, m, input, static_len); }
  private native void allocate(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @ByVal ValueVector input,
        @ByVal(nullValue = "std::optional<int64_t>(c10::nullopt)") LongOptional static_len);
  public RangeValue(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @ByVal ValueVector input) { super((Pointer)null); allocate(loc, m, input); }
  private native void allocate(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @ByVal ValueVector input);

  public native @StdString BytePointer kind();
  public native Value len(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        Value idx,
        @ByVal(nullValue = "c10::TypePtr(nullptr)") Type.TypePtr type_hint);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue getitem(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        Value idx);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  // When Range is instantiated via enumerate(iterable_with_static_len),
  // then it takes the static length of the iterable
  public native @ByVal LongOptional staticLen();
}
