// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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

// This type represents an optional type. There is one `Optional` for
// each element type. `Optional[T]` can accept both `T` and
// `None`(`c10::nullopt` in C++)
// Subtype hierarchy for Optional:
//     - Optional[T] <: Optional[R] iff T <: R
//     - T <: Optional[R] if T <: R
//     - None <: Optional[T] for all T
//     - Optional[T] == Union[T, None] for all T
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptionalType extends UnionType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptionalType(Pointer p) { super(p); }

  public static native @SharedPtr OptionalType create(@ByVal Type.TypePtr contained);

  @MemberGetter public static native TypeKind Kind();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  public native @Const @ByRef Type.TypePtr getElementType();

  public native @ByVal TypeArrayRef containedTypes();

  public native @StdString BytePointer str();

  public native @ByVal Type.TypePtr createWithContained(
        @ByVal TypeVector contained_types);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  public native @Cast("bool") boolean isUnionType();

  // common cast Optional[Tensor] for undefined tensor type
  public static native @ByVal Type.TypePtr ofTensor();
  //
  // global singleton
  public static native @ByVal Type.TypePtr get(@ByVal Type.TypePtr inner);
}
