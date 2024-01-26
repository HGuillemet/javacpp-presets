// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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
public class EnumType extends NamedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnumType(Pointer p) { super(p); }

  @MemberGetter public static native TypeKind Kind();

  public native @StdString BytePointer str();

  public native @StdString BytePointer repr_str();

  public native @Const @ByRef Type.TypePtr getValueType();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);

  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  public native @SharedPtr("const torch::jit::CompilationUnit") @ByVal CompilationUnit compilation_unit();

  public native @Const @ByVal QualifiedName qualifiedClassName();

  public native @ByVal TypeArrayRef containedTypes();

  public native @Const @ByVal EnumNameValueArrayRef enumNamesValues();
}
