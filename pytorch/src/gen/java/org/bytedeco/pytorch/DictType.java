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

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DictType extends SharedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DictType(Pointer p) { super(p); }

  @MemberGetter public static native TypeKind Kind();

  public static native @SharedPtr DictType create(@ByVal Type.TypePtr key, @ByVal Type.TypePtr value);

  // aligned with the format in FunctionSchema
  public native @StdString BytePointer str();

  public native @ByVal Type.TypePtr createWithContained(
        @ByVal TypeVector contained_types);

  public native @Const @ByRef Type.TypePtr getKeyType();

  public native @Const @ByRef Type.TypePtr getValueType();

  public native @Cast("bool") boolean hasFreeVariables();

  public native @ByVal TypeArrayRef containedTypes();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  // global singleton
  // Given an inner type T and an identifier,
  // this function wil return the global singleton type pointer
  // the type List<T>.
  // The extra "identifier" argument is needed beccause we have multiple container types
  // that all re-use this function (Dict<K, V> and unordered_map<K, V>)
  public static native @ByVal Type.TypePtr get(@StdString BytePointer identifier, @ByVal Type.TypePtr key, @ByVal Type.TypePtr val);
  public static native @ByVal Type.TypePtr get(@StdString String identifier, @ByVal Type.TypePtr key, @ByVal Type.TypePtr val);
}
