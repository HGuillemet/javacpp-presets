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


@Namespace("c10::ivalue") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Tuple extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Tuple(Pointer p) { super(p); }

  // named tuples have additional type information, so we
  // directly create them tagged
  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple createNamed(
        @ByVal IValueVector elements_,
        @ByVal Type.TypePtr type_);

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple createNamed(
        @ByVal TupleElements elements_,
        @SharedPtr TupleType type_);

  // MSVC apparently can't disambiguate the other two overloads of
  // create when passed an initializer_list without this.

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple create(@ByVal IValueVector elements_);

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple create(@ByVal TupleElements elements_);

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple create(@ByVal IValueArrayRef elements_);

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple create(@ByVal IValue e1);

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple create(@ByVal IValue e1, @ByVal IValue e2);

  public static native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple create(@ByVal IValue e1, @ByVal IValue e2, @ByVal IValue e3);

  // Again, it would be nice to make this noncopyable, but there's a
  // lot of extant code that copies Tuples.
  // Tuple(const Tuple& rhs) = delete;

  public native @Const @ByRef TupleElements elements();

  

  public native void setElements(@ByRef(true) IValueVector elements);

  public native void setElements(@ByRef(true) TupleElements elements);

  public native void unsafeSetElement(@Cast("size_t") long idx, @Const @ByRef IValue element);

  public native @Cast("size_t") long size();

  public static native @Cast("size_t") long hash(@Const @ByRef Tuple t);

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(
        @Const @ByRef Tuple lhs,
        @Const @ByRef Tuple rhs);
  public boolean equals(Tuple rhs) { return equals(this, rhs); }
}
