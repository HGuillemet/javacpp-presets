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


// most things in the environment are just simple value types
// and not special python syntax sugar types
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SimpleValue extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleValue(Pointer p) { super(p); }

  public SimpleValue(Value value) { super((Pointer)null); allocate(value); }
  private native void allocate(Value value);
  public native @StdString BytePointer kind();
  public native Value asValue(@Const @ByRef SourceRange range, @ByRef GraphFunction m);
  public native @ByVal SharedSugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @Const @ByRef(nullValue = "std::optional<size_t>{}") SizeTOptional size_hint);
  public native @ByVal SharedSugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString BytePointer field);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue attr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString String field);

  public native @Cast("bool") boolean hasAttr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString BytePointer field);
  public native @Cast("bool") boolean hasAttr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString String field);

  public native void setAttr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString BytePointer field,
        Value newValue);
  public native void setAttr(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @StdString String field,
        Value newValue);

  

  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue iter(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  public native Value getValue();

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
}
