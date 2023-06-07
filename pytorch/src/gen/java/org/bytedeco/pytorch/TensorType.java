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

// This type represents a single Tensor with a specific size
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorType extends SharedType {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorType(Pointer p) { super(p); }

  public static native @SharedPtr("c10::TensorType") @ByVal TensorType create(@Const @ByRef Tensor t);

  // used by TensorType::create(size_t dim) which in turn used by
  // shape_analysis.cpp
  public static native @SharedPtr("c10::TensorType") @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef LongVaryingShape sizes,
        @Const @ByRef LongVaryingShape strides,
        @ByVal BoolOptional requires_grad,
        @ByVal(nullValue = "c10::optional<bool>(false)") BoolOptional undefined,
        @Cast("bool") boolean tensor_contiguity/*=false*/);
  public static native @SharedPtr("c10::TensorType") @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef LongVaryingShape sizes,
        @Const @ByRef LongVaryingShape strides,
        @ByVal BoolOptional requires_grad);

  public static native @SharedPtr("c10::TensorType") @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef SymbolicShape sizes,
        @Const @ByRef StrideVaryingShape stride_,
        @ByVal BoolOptional requires_grad,
        @ByVal(nullValue = "c10::optional<bool>(false)") BoolOptional undefined);
  public static native @SharedPtr("c10::TensorType") @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @Const @ByRef SymbolicShape sizes,
        @Const @ByRef StrideVaryingShape stride_,
        @ByVal BoolOptional requires_grad);

  public static native @SharedPtr("c10::TensorType") @ByVal TensorType create(
        @ByVal ScalarTypeOptional scalar_type,
        @ByVal DeviceOptional device,
        @ByVal SizeTOptional dim,
        @ByVal BoolOptional requires_grad);

  // overloaded create variadic template argument as it could not distinguish
  // initializer list
  public static native @SharedPtr("c10::TensorType") @ByVal TensorType createContiguous(
        ScalarType scalar_type,
        @ByVal Device device,
        @ByVal LongArrayRef sizes);
  public static native @SharedPtr("c10::TensorType") @ByVal TensorType createContiguous(
        ScalarType scalar_type,
        @ByVal Device device,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... sizes);

  public static native @ByVal Type.TypePtr fromNumberType(@Const @ByRef Type typ);
  public static native @ByVal Type.TypePtr fromBoolType();

  public native @ByVal SizeTOptional dim();

  public native @ByVal LongVaryingShape sizes();

  public native @ByVal LongVaryingShape strides();

  public native @Const @ByRef StrideVaryingShape stride_properties();

  public native @ByVal DeviceOptional device();
  public native @ByVal ScalarTypeOptional scalarType();
  public native @ByVal BoolOptional requiresGrad();
  public native @Cast("bool") boolean requires_grad();

  public native @Cast("bool") boolean equals(@Const @ByRef Type rhs);
  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);

  public native @StdString BytePointer str();

  public native @StdString BytePointer repr_str();

  public native @ByVal SizeTOptional numel();

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withRequiresGrad(@ByVal BoolOptional s);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withScalarType(@ByVal ScalarTypeOptional st);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withDim(@ByVal SizeTOptional d);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withStrides(@ByVal StrideVaryingShape sstrides);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withSizesStrides(
        @ByVal LongArrayRef sizes,
        @ByVal LongArrayRef strides);
  public native @SharedPtr("c10::TensorType") @ByVal TensorType withSizesStrides(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... strides);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withSymbolicShapes(@ByVal SymbolicShape ssizes);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withSizes(@ByVal LongArrayRef sizes);
  public native @SharedPtr("c10::TensorType") @ByVal TensorType withSizes(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... sizes);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withDevice(@Const @ByVal DeviceOptional device);

  public native @SharedPtr("c10::TensorType") @ByVal TensorType dimensionedOnly();

  public native @SharedPtr("c10::TensorType") @ByVal TensorType contiguous();

  public native @Const @ByRef SymbolicShape symbolic_sizes();

  public native @SharedPtr("c10::TensorType") @ByVal TensorType merge(@Const @ByRef TensorType other, @Cast("bool") boolean merge_sizes/*=true*/);
  public native @SharedPtr("c10::TensorType") @ByVal TensorType merge(@Const @ByRef TensorType other);

  public native @Cast("bool") boolean matchTensor(@Const @ByRef Tensor t);

  // is all information about the type specified except for autograd?
  // This replaces the notion of a 'CompleteTensorType' that used to exist
  // in the type-hierarchy. Excluding require_grad and undefined allows
  // this to match the old behavior.
  public native @Cast("bool") boolean isComplete();

  public native @Cast("bool") boolean isInferredType();

  public static native @SharedPtr("c10::TensorType") @ByVal TensorType getInferred();

  // this property is used by GuardElimination
  // please see `checkInputs` for more details
  public native @Cast("bool") boolean isSummarized();

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withUndefined();

  public native @SharedPtr("c10::TensorType") @ByVal TensorType withPossiblyUndefined();

  public native @ByVal BoolOptional undefined();

  public static native @Const @SharedPtr("c10::TensorType") @ByRef TensorType get();

  @MemberGetter public static native TypeKind Kind();

  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal LongArrayRef in_sizes,
        @ByVal(nullValue = "at::MemoryFormat(c10::MemoryFormat::Contiguous)") MemoryFormat memory_format);
  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal LongArrayRef in_sizes);
  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] in_sizes,
        @ByVal(nullValue = "at::MemoryFormat(c10::MemoryFormat::Contiguous)") MemoryFormat memory_format);
  public static native @ByVal @Cast("std::vector<int64_t>*") LongVector contiguousStridesOf(
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long... in_sizes);
}
