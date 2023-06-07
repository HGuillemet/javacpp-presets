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


// The AST can contain nodes like `self`, `self.b` or `python_fn` that
// are not first-class values in the graph representation, but instead
// will be desugared based on how they are used in the AST.

// SugaredValue is used to temporarily represent these values in a way
// that separates their behavior from the AST -> IR converter itself.
// This allows us to keep dependencies on python minimal.

@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SugaredValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SugaredValue(Pointer p) { super(p); }

  // what is this node? for error reporting (e.g. Module, python function)
  public native @StdString BytePointer kind();

  // what can we do with this thing?
  // use it as a value e.g.  `this + 4`
  public native Value asValue(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  // select an attribute on it, e.g. `this.field`
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

  // assign an attribute on it, e.g. `this.field = newValue`
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

  // use it as a vector of values, e.g. a tuple of values as return value from
  // a method invocation
  public native @ByVal SharedSugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m,
        @Const @ByRef(nullValue = "c10::optional<size_t>{}") SizeTOptional size_hint);
  public native @ByVal SharedSugaredValueVector asTuple(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m);

  // TODO @wconstab refactor to use ModuleValue::asTuple instead of new API
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue asTupleValue(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m);

  public native @ByVal SharedSugaredValueVector asType(
        @Const @ByRef SourceRange loc,
        @ByRef Method m);

  // call it like a function, e.g. `outputs = this(inputs)`
  

  // This function is called when to convert a SugaredValue to its iterator.
  // For example, when iterating through a Dict we iterate over its keys
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue iter(
        @Const @ByRef SourceRange loc,
        @ByRef GraphFunction m);

  // If we are iterating over a Sugared Value and it returns a value from this
  // function, then we emit an unrolled loop over the variable. This allows us
  // to support containers of Heterogenous types, like Module Containers &
  // Tuples
  public native @ByVal LongOptional staticLen();

  // When iterating over this SugaredValue, should we emit the for loop as an
  // unrolled loop.
  public native @Cast("bool") boolean shouldEmitUnrolled();

  // return length of this thing, if not then it can't be iterated.
  // If it does not have a statically-determinable length, then it cannot
  // be iterated over with a modulelist. If it does it must return a constant
  // Value *
  public native Value len(@Const @ByRef SourceRange loc, @ByRef GraphFunction m);

  // expression for ith elemement for iterable value
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
