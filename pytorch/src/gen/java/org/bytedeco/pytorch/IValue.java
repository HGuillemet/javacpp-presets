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


// [doxygen private]
// These methods are not actually private but we don't want to document them, so
// they are marked `@private`, which hides them on the doxygen documentation for
// this page.

/** IValue (Interpreter Value) is a tagged union over the types
 *  supported by the TorchScript interpreter. IValues contain their
 *  values as an {@code IValue::Payload}, which holds primitive types
 *  ({@code int64_t}, {@code bool}, {@code double}, {@code Device}) and {@code Tensor} as values,
 *  and all other types as a {@code c10::intrusive_ptr}. In order to
 *  optimize performance of the destructor and related operations by
 *  making the {@code Tensor} and {@code c10::intrusive_ptr} paths generate the
 *  same code, we represent a null {@code c10::intrusive_ptr} as
 *  {@code UndefinedTensorImpl::singleton()}, *not* {@code nullptr}.
 * 
 *  IValues are used as inputs to and outputs from the TorchScript interpreter.
 *  To retrieve the value contained within an IValue, use the {@code .toX()} methods,
 *  where {@code X} is the type you are trying to get. Note that neither the {@code .toX()}
 *  methods nor the templated {@code .to<T>} functions do any kind of casting, they
 *  only unwrap the contained value. For example:
 * 
 *  \rst
 *  .. code-block:: cpp
 * 
 *    // Make the IValue
 *    torch::IValue my_ivalue(26);
 *    std::cout << my_ivalue << "\n";
 * 
 *    // Unwrap the IValue
 *    int64_t my_int = my_ivalue.toInt();
 *    std::cout << my_int << "\n";
 * 
 *    // This will throw an error!
 *    // {@code my_ivalue} is tagged as an int and cannot be used as another type
 *    torch::Tensor my_tensor = my_ivalue.toTensor();
 *  \endrst */
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IValue extends Pointer {
    static { Loader.load(); }

  public IValue(@Const @ByRef IValue rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(@Const @ByRef IValue rhs);

  /** \private [doxygen private] */

  public native @ByRef @Name("operator =") @NoException(true) IValue put(@ByRef(true) IValue rhs);

  public native void dump();

  /**
   * Equality comparison. The semantics are the same as Python's {@code ==}:
   * 1. Numerical types are compared by value.
   * 2. Tensors compute element-wise equality, returning a BoolTensor (see:
   * {@code torch.eq()})
   * 3. Strings are compared by value.
   * 4. Sequence types (list, tuple) are compared lexicographically by
   *    comparing their elements. Different sequence types never compare equal.
   * 5. Mappings (dict) must have equal (key, value) pairs.
   * 6. If not listed above, the default behavior for is to test identity
   * equality (e.g. pointer equality).
   *
   * Why does this return an IValue instead of a bool? Because in PyTorch,
   * {@code tensor1 == tensor2} returns a {@code BoolTensor}, not a bool.
   *
   * NOTE: we (like Python) assume that identity equality implies value equality
   * for efficiency.
   * TODO: need to support customizing equality
   */
  /**
   * This implements the same semantics as {@code bool(lhs == rhs)} in Python. which
   * is the same as {@code equals()} except for Tensor types.
   */
  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef IValue lhs, @Const @ByRef IValue rhs);
  public boolean equals(IValue rhs) { return equals(this, rhs); }
  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef IValue lhs, @Const @ByRef IValue rhs);
  public boolean notEquals(IValue rhs) { return notEquals(this, rhs); }

  /**
   * Identity comparison. Checks if {@code this} is the same object as {@code rhs}. The
   * semantics are the same as Python's {@code is} operator.
   *
   * NOTE: Like in Python, this operation is poorly defined for primitive types
   * like numbers and strings. Prefer to use {@code ==} unless you really want to
   * check identity equality.
   */
  public native @Cast("bool") boolean is(@Const @ByRef IValue rhs);

  /**
   * Hashing for IValues. Returns an IValue-boxed int.
   *
   * Some notes:
   * - Like eager, Tensors are hashed by looking at the pointer. This is not
   *   strictly correct because two value-equal tensors with different tensor
   *   pointers will hash differently, but we choose to reproduce the eager
   *   semantics.
   * - Hashing is not defined on all built-in IValue types (e.g. list and
   *   dict), following Python. Calling {@code hash()} on these types will throw.
   */
  public native @ByVal IValue hash();
  // This is defined because `c10::hash` dispatches to a function of this
  // signature. See the member function `hash()`.
  public static native @Cast("size_t") long hash(@Const @ByRef IValue iv);

  /**
   * \private [doxygen private]
   * [container equality]
   * This is an equality implementation that assumes objects with the same
   * identity equal themselves, for efficiency reasons. We primarily have this
   * for consistency, because Python does the same thing. This actually
   * provokes user-visible changes in behavior due to quirks in torch:
   *      [tensor1] == [tensor1] -> True (because container equality will first
   * compare identity) [tensor1] == [tensor1_copy] -> RuntimeError:
   * Boolean value of Tensor with more than one value is ambiguous
   */
  private static native @Namespace @Cast("bool") boolean _fastEqualsForContainer(
        @Const @ByRef IValue lhs,
        @Const @ByRef IValue rhs);
  public boolean _fastEqualsForContainer(IValue rhs) { return _fastEqualsForContainer(this, rhs); }
  public native @Cast("bool") boolean isAliasOf(@Const @ByRef IValue rhs);

  /** \private [doxygen private] */
  public native @Cast("size_t") @NoException(true) long use_count();

  /** \private [doxygen private] */
  public native @NoException(true) void swap(@ByRef IValue rhs);

  // Accessors for subtypes are arranged together below
  // While some of these accessors could be generated through templates,
  // we prefer to write them manually for clarity

  public IValue(@ByVal TensorBase t) { super((Pointer)null); allocate(t); }
  private native void allocate(@ByVal TensorBase t);
  public native @Cast("bool") boolean isTensor();
  
  public native @ByRef Tensor toTensor();
  public native TensorImpl unsafeToTensorImpl();

  public IValue(@ByVal Storage s) { super((Pointer)null); allocate(s); }
  private native void allocate(@ByVal Storage s);
  public native @Cast("bool") boolean isStorage();
  
  public native @ByVal Storage toStorage();
  public native @ByRef IValue toIValue();

  /** \private [doxygen private] */
  public IValue(@ByVal @Cast("c10::intrusive_ptr<caffe2::Blob>*") Pointer blob) { super((Pointer)null); allocate(blob); }
  private native void allocate(@ByVal @Cast("c10::intrusive_ptr<caffe2::Blob>*") Pointer blob);

  /** \private [doxygen private] */
  public native @Cast("bool") boolean isBlob();

  /** \private [doxygen private] */
  

  /** \private [doxygen private] */
  public native @ByVal @Cast("c10::intrusive_ptr<caffe2::Blob>*") Pointer toBlob();

  // Capsule. No new callsites of these APIs should
  // be introduced.
  public static native @ByVal IValue make_capsule(
        @ByVal @Cast("c10::intrusive_ptr<torch::CustomClassHolder>*") Pointer blob);
  public native @Cast("bool") boolean isCapsule();
  
  public native @ByVal @Cast("c10::intrusive_ptr<torch::CustomClassHolder>*") Pointer toCapsule();

  // Custom C++ classes
  public native @Cast("bool") boolean isCustomClass();
  

  // Tuple
  public IValue(@IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple v);
  public native @Cast("bool") boolean isTuple();
  
  public native @IntrusivePtr("c10::ivalue::Tuple") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Tuple>&"}) Tuple toTuple();
  public native @ByRef Tuple toTupleRef();

  // Double
  public IValue(double d) { super((Pointer)null); allocate(d); }
  private native void allocate(double d);
  public native @Cast("bool") boolean isDouble();
  public native double toDouble();

  // ComplexDouble
  public native @Cast("bool") boolean isComplexDouble();
  public native @ByVal DoubleComplex toComplexDouble();

  // Future
  public IValue(@IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future v);
  public native @Cast("bool") boolean isFuture();
  
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future toFuture();

  public IValue(@IntrusivePtr("c10::ivalue::Await") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Await>&"}) Await v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::Await") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Await>&"}) Await v);
  public native @Cast("bool") boolean isAwait();
  
  public native @IntrusivePtr("c10::ivalue::Await") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Await>&"}) Await toAwait();

  // RRef
  public IValue(@IntrusivePtr("c10::RRefInterface") @Cast({"", "c10::intrusive_ptr<c10::RRefInterface>&"}) RRefInterface v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::RRefInterface") @Cast({"", "c10::intrusive_ptr<c10::RRefInterface>&"}) RRefInterface v);
  public native @Cast("bool") boolean isRRef();
  
  public native @IntrusivePtr("c10::RRefInterface") @Cast({"", "c10::intrusive_ptr<c10::RRefInterface>&"}) RRefInterface toRRef();

  // Quantizer
  public IValue(@IntrusivePtr("at::Quantizer") @Cast({"", "c10::intrusive_ptr<at::Quantizer>&"}) Quantizer v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("at::Quantizer") @Cast({"", "c10::intrusive_ptr<at::Quantizer>&"}) Quantizer v);
  public native @Cast("bool") boolean isQuantizer();
  
  public native @IntrusivePtr("at::Quantizer") @Cast({"", "c10::intrusive_ptr<at::Quantizer>&"}) Quantizer toQuantizer();

  // Int
  public IValue(@Cast("int64_t") long i) { super((Pointer)null); allocate(i); }
  private native void allocate(@Cast("int64_t") long i);

  public IValue(@Const @ByRef SymInt i) { super((Pointer)null); allocate(i); }
  private native void allocate(@Const @ByRef SymInt i);

  public native @Cast("bool") boolean isSymInt();

  
  public native @ByVal SymInt toSymInt();

  public IValue(@Const @ByRef SymFloat i) { super((Pointer)null); allocate(i); }
  private native void allocate(@Const @ByRef SymFloat i);

  public native @Cast("bool") boolean isSymFloat();

  
  public native @ByVal SymFloat toSymFloat();

  public IValue(@Const @ByRef SymBool i) { super((Pointer)null); allocate(i); }
  private native void allocate(@Const @ByRef SymBool i);

  public native @Cast("bool") boolean isSymBool();

  
  public native @ByVal SymBool toSymBool();

  // allow you to pass literals (3, 4) without ambiguity
  public IValue(int i) { super((Pointer)null); allocate(i); }
  private native void allocate(int i);

  public native @Cast("bool") boolean isInt();

  public native @Cast("int64_t") long toInt();

  // Bool
  public IValue(@Cast("bool") boolean b) { super((Pointer)null); allocate(b); }
  private native void allocate(@Cast("bool") boolean b);
  public native @Cast("bool") boolean isBool();
  public native @Cast("bool") boolean toBool();

  // IntList
  public native @Cast("bool") boolean isIntList();
  public native @Cast("bool") boolean isSymIntList();
  
  public native @ByVal LongList toIntList();
  public native @ByVal @Cast("std::vector<int64_t>*") LongVector toIntVector();
  public native @ByVal SymIntVector toSymIntVector();
  public native @ByVal DimVector toDimVector();

  // ConstantString
  public IValue(@IntrusivePtr("c10::ivalue::ConstantString") @Cast({"", "c10::intrusive_ptr<c10::ivalue::ConstantString>&"}) ConstantString v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::ConstantString") @Cast({"", "c10::intrusive_ptr<c10::ivalue::ConstantString>&"}) ConstantString v);
  public IValue(@StdString BytePointer v) { super((Pointer)null); allocate(v); }
  private native void allocate(@StdString BytePointer v);
  public IValue(@StdString String v) { super((Pointer)null); allocate(v); }
  private native void allocate(@StdString String v);
  public native @Cast("bool") boolean isString();
  
  public native @IntrusivePtr("c10::ivalue::ConstantString") @Name("toString") @Cast({"", "c10::intrusive_ptr<c10::ivalue::ConstantString>&"}) ConstantString toConstantString();
  public native @StdString BytePointer toStringRef();
  public native @ByVal @Cast("std::optional<std::reference_wrapper<const std::string> >*") Pointer toOptionalStringRef();
  public native @StringView BytePointer toStringView();

  // DoubleList
  public native @Cast("bool") boolean isDoubleList();
  
  public native @ByVal DoubleList toDoubleList();
  public native @ByVal @Cast("std::vector<double>*") DoubleVector toDoubleVector();

  // ComplexDoubleList
  public native @Cast("bool") boolean isComplexDoubleList();
  
  public native @ByVal DoubleComplexList toComplexDoubleList();
  public native @StdVector DoubleComplex toComplexDoubleVector();

  // BoolList
  public native @Cast("bool") boolean isBoolList();
  
  public native @ByVal BooleanList toBoolList();

  // TensorList
  public native @Cast("bool") boolean isTensorList();
  
  public native @ByVal TensorList toTensorList();
  public native @ByVal TensorVector toTensorVector();

  // OptionalTensorList
  public native @Cast("bool") boolean isOptionalTensorList();
  
  public native @ByVal TensorOptionalList toOptionalTensorList();
  public native @StdVector TensorOptional toOptionalTensorVector();

  // GenericList
  public IValue(@ByVal GenericList v) { super((Pointer)null); allocate(v); }
  private native void allocate(@ByVal GenericList v);
  public native @Cast("bool") boolean isList();
  
  public native @ByVal GenericList toList();
  public native @ByVal IValueArrayRef toListRef();

  // Some template constructors of IValue calls another constructor recursively.
  // This SFINAEs the called constructor exists.

  // The rule for lists is more complicated; the generic constructor is only
  // acceptable if your element isn't SymInt.  If you do have a SymInt element,
  // then you must also, at construction time, check if you can decay the list
  // into an int list (this is MANDATORY, as at a use site we may expect
  // toIntList to work even if at the call site you had a SymIntArrayRef
  // argument).  In practice, only SymIntArrayRef is used this way, so we
  // didn't bother making it work for the other constructors, we just make sure
  // they're not selectable.

  // Manual constructors for lists of symints, which decay to int list if
  // possible.  To avoid ambiguous overload situations, we template them
  // to prevent implicit conversions

  // GenericDict
  public IValue(@ByVal GenericDict v) { super((Pointer)null); allocate(v); }
  private native void allocate(@ByVal GenericDict v);
  public native @Cast("bool") boolean isGenericDict();
  
  public native @ByVal GenericDict toGenericDict();

  // ClassType
  public IValue(@IntrusivePtr("c10::ivalue::Object") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Object>&"}) Obj v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::Object") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Object>&"}) Obj v);
  public native @Cast("bool") boolean isObject();
  
  public native @IntrusivePtr("c10::ivalue::Object") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Object>&"}) Obj toObject();
  public native @ByRef Obj toObjectRef();

  
  public native @Cast("bool") boolean isModule();

  // PyObject
  public IValue(@IntrusivePtr("c10::ivalue::PyObjectHolder") @Cast({"", "c10::intrusive_ptr<c10::ivalue::PyObjectHolder>&"}) PyObjectHolder v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::PyObjectHolder") @Cast({"", "c10::intrusive_ptr<c10::ivalue::PyObjectHolder>&"}) PyObjectHolder v);
  public native @Cast("bool") boolean isPyObject();
  
  public native @IntrusivePtr("c10::ivalue::PyObjectHolder") @Cast({"", "c10::intrusive_ptr<c10::ivalue::PyObjectHolder>&"}) PyObjectHolder toPyObjectHolder();
  public native @Cast("PyObject*") Pointer toPyObject();

  // Enum
  public IValue(@IntrusivePtr("c10::ivalue::EnumHolder") @Cast({"", "c10::intrusive_ptr<c10::ivalue::EnumHolder>&"}) EnumHolder v) { super((Pointer)null); allocate(v); }
  private native void allocate(@IntrusivePtr("c10::ivalue::EnumHolder") @Cast({"", "c10::intrusive_ptr<c10::ivalue::EnumHolder>&"}) EnumHolder v);
  public native @Cast("bool") boolean isEnum();
  
  public native @IntrusivePtr("c10::ivalue::EnumHolder") @Cast({"", "c10::intrusive_ptr<c10::ivalue::EnumHolder>&"}) EnumHolder toEnumHolder();

  // None
  public IValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @Cast("bool") boolean isNone();
  public native @StdString BytePointer toNone();

  public static native @ByVal IValue uninitialized();

  // Scalar, which gets encoded as either an Int, a Double or a ComplexDouble
  public IValue(@Const @ByRef Scalar s) { super((Pointer)null); allocate(s); }
  private native void allocate(@Const @ByRef Scalar s);

  public native @Cast("bool") boolean isScalar();

  public native @ByVal Scalar toScalar();

  // Device
  public IValue(@ByVal Device d) { super((Pointer)null); allocate(d); }
  private native void allocate(@ByVal Device d);
  public native @Cast("bool") boolean isDevice();
  public native @ByVal Device toDevice();

  // Stream
  public IValue(@ByVal Stream s) { super((Pointer)null); allocate(s); }
  private native void allocate(@ByVal Stream s);
  
  public native @ByVal Stream toStream();
  public native @Cast("bool") boolean isStream();

  // ScalarType
  public IValue(ScalarType t) { super((Pointer)null); allocate(t); }
  private native void allocate(ScalarType t);
  public native ScalarType toScalarType();

  // Layout
  public IValue(Layout l) { super((Pointer)null); allocate(l); }
  private native void allocate(Layout l);
  public IValue(@Cast("c10::Layout") byte l) { super((Pointer)null); allocate(l); }
  private native void allocate(@Cast("c10::Layout") byte l);
  public native @ByVal Layout toLayout();

  // MemoryFormat
  public IValue(MemoryFormat m) { super((Pointer)null); allocate(m); }
  private native void allocate(MemoryFormat m);
  public native @ByVal MemoryFormat toMemoryFormat();

  // QScheme
  public IValue(@ByVal QScheme qscheme) { super((Pointer)null); allocate(qscheme); }
  private native void allocate(@ByVal QScheme qscheme);

  public native @ByVal QScheme toQScheme();

  // Dimname
  public IValue(@ByVal Dimname dimname) { super((Pointer)null); allocate(dimname); }
  private native void allocate(@ByVal Dimname dimname);

  public native @ByVal Dimname toDimname();

  // Generator
  public IValue(@ByVal Generator g) { super((Pointer)null); allocate(g); }
  private native void allocate(@ByVal Generator g);
  public native @Cast("bool") boolean isGenerator();
  
  public native @ByVal Generator toGenerator();

  // for debugging
  public native @StdString BytePointer tagKind();

  // generic v.to<at::Tensor>() implementations
  // that can be used in special functions like pop/push
  // that use template meta-programming.
  // prefer the directly named methods when you can,
  // since they are simpler to understand

  // Note: if you get linker errors saying one of these is missing,
  // change it to ... && = delete; and you will see better error messages for
  // why However, we cannot commit this because some compiler versions barf on
  // it.
  

  // ToOptional: convert a IValue to the Optional obj that accepts both T and
  // None

  /** \private [doxygen private]
   *  this is a shallow comparison of two IValues to test the object identity */
  public native @Cast("bool") boolean isSameIdentity(@Const @ByRef IValue rhs);

  // Computes the "official" string representation of an IValue. This produces a
  // TorchScript expression that can be used to recreate an IValue with the same
  // value (e.g. when we are printing constants in the serializer).
  //
  // Callers can use `customFormatter` to override how `repr()` prints out an
  // IValue. This is useful if you have some other environment where you can
  // look up values, and you want to print a reference to that environment (like
  // the serializer's constant table).
  //
  // repr() is not necessarily defined on all objects!
  

  // Computes an "informal" string representation of an IValue. This should be
  // used for debugging, or servicing `print()`-like functions.
  // This is different from `repr()` in that there is no expectation that we can
  // exactly reconstruct an IValue from the output; feel free to use a
  // concise/pretty form
  private static native @Namespace @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer out, @Const @ByRef IValue v);
  public Pointer shiftLeft(Pointer out) { return shiftLeft(out, this); }

  public native @Cast("bool") boolean isPtrType();

  /** \private [doxygen private] */
  public native @Const Pointer internalToPointer();

  // Detect aliased tensors.

  public static class HashIdentityIValue extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public HashIdentityIValue() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public HashIdentityIValue(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public HashIdentityIValue(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public HashIdentityIValue position(long position) {
          return (HashIdentityIValue)super.position(position);
      }
      @Override public HashIdentityIValue getPointer(long i) {
          return new HashIdentityIValue((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("size_t") @Name("operator ()") long apply(@Const @ByRef IValue val);
  }

  public static class CompIdentityIValues extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public CompIdentityIValues() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public CompIdentityIValues(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public CompIdentityIValues(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public CompIdentityIValues position(long position) {
          return (CompIdentityIValues)super.position(position);
      }
      @Override public CompIdentityIValues getPointer(long i) {
          return new CompIdentityIValues((Pointer)this).offsetAddress(i);
      }
  
    public native @Cast("bool") @Name("operator ()") boolean apply(@Const @ByRef IValue lhs, @Const @ByRef IValue rhs);
  }

  // Chechs if this and rhs has a subvalues in common.
  // [t1,t2] and [t2, t3] returns true.
  public native @Cast("bool") boolean overlaps(@Const @ByRef IValue rhs);

  // Inserts all subvalues of this in subValues.
  public native void getSubValues(@ByRef HashAliasedIValues subValues);

  // Apply visitor to every subvalue.
  // TODO: There are several places that recurse over IValue. This is fragile.
  // This visitor should be used to recurse over ivalues.
  
  public native @ByVal IValue deepcopy(@ByVal(nullValue = "std::optional<at::Device>(c10::nullopt)") DeviceOptional device);
  public native @ByVal IValue deepcopy();
  public native @ByVal IValue deepcopy(
        @ByRef HashIdentityIValueMap memo,
        @ByVal(nullValue = "std::optional<at::Device>(c10::nullopt)") DeviceOptional device);
  public native @ByVal IValue deepcopy(
        @ByRef HashIdentityIValueMap memo);
  // Don't edit this just to add results for new tags; edit
  // isIntrusivePtrConstexpr above.
  public native @Cast("bool") boolean isIntrusivePtr();

  // Storage and Generator were treated specially when
  // is_intrusive_ptr was stored as explicit state. This getter
  // preserves the old behavior for use with WeakIValue for now.
  public native @Cast("bool") boolean isIntrusivePtrLegacyBehavior();
}
