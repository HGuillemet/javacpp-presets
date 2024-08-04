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

/**
 * class SchemaInfo
 *
 * FunctionSchema wrapper that publicizes argument value specific operator
 * behavior (mutation, aliasing, special cases, etc...)
 */

@Namespace("torch::utils") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SchemaInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SchemaInfo(Pointer p) { super(p); }

  public SchemaInfo(@ByVal FunctionSchema schema) { super((Pointer)null); allocate(schema); }
  private native void allocate(@ByVal FunctionSchema schema);
  public SchemaInfo(@Cast("const char*") BytePointer signature) { super((Pointer)null); allocate(signature); }
  private native void allocate(@Cast("const char*") BytePointer signature);
  public SchemaInfo(String signature) { super((Pointer)null); allocate(signature); }
  private native void allocate(String signature);

  public native @Cast("bool") boolean is_mutable();

  public native @Cast("bool") boolean is_mutable(@Const @ByRef SchemaArgument argument);

  public native @Cast("bool") boolean is_mutable(@StringView BytePointer name);
  public native @Cast("bool") boolean is_mutable(@StringView String name);

  public native @Cast("bool") boolean has_argument(@StringView BytePointer name);
  public native @Cast("bool") boolean has_argument(@StringView String name);

  public native @Cast("bool") boolean is_nondeterministic();

  // Returns whether lhs and rhs may alias directly.
  // This does not account for cases where lhs or rhs are a container that
  // may contain elements that alias the other argument.
  // Besides the checks already included in FunctionSchema::may_alias, this
  // method also accounts special aliasing cases causes by aliasing argument
  // values supplied from addArgumentValue.
  public native @Cast("bool") boolean may_alias(
        @Const @ByRef SchemaArgument lhs,
        @Const @ByRef SchemaArgument rhs);

  // Returns whether lhs and rhs may alias directly or whether lhs/rhs are a
  // container that may contain elements that alias the other argument. Besides
  // the checks already included in FunctionSchema::may_contain_alias, this
  // method also accounts for special aliasing cases causes by aliasing argument
  // values supplied from addArgumentValue. bidirectional = false only returns
  // whether lhs may contain an alias of rhs while bidirectional = true returns
  // both directions.
  public native @Cast("bool") boolean may_contain_alias(
        @Const @ByRef SchemaArgument lhs,
        @Const @ByRef SchemaArgument rhs,
        @Cast("bool") boolean bidirectional/*=true*/);
  public native @Cast("bool") boolean may_contain_alias(
        @Const @ByRef SchemaArgument lhs,
        @Const @ByRef SchemaArgument rhs);

  public native void addArgumentValue(@StdString BytePointer name, @Const @ByRef IValue value);
  public native void addArgumentValue(@StdString String name, @Const @ByRef IValue value);

  public native void addArgumentValues(
        @Const @ByRef IValueOptionalVector value_list);

  public native void addArgumentValues(
        @Const @ByRef StringIValueMap values);

  public native @Cast("bool") boolean hasInputArgumentNamed(@StdString BytePointer name);
  public native @Cast("bool") boolean hasInputArgumentNamed(@StdString String name);
}
