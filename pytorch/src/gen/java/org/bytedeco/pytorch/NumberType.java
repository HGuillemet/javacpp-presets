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

// This type represents a Python number
// Subtype hierarchy for Number Types (NumberType as the base type):
// IntType <: NumberType
// FloatType <: NumberType
// ComplexType <:NumberType
//
// WARNING: if you add a new subtype of NumberType that is not
// represented by a global singleton, you need to change NumberTypePtr
// to a SingletonOrSharedTypePtr and deal with NumberType needing to
// both inherit and not inherit from SharedType!
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NumberType extends Type {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NumberType(Pointer p) { super(p); }

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  public native @StdString BytePointer str();
  @MemberGetter public static native TypeKind Kind();
  // global singleton
  public static native @ByVal @Name("get") NumberTypePtr getNumberIntTypePtr();
}
