// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// Base class for all structured kernel classes.  The set_output virtual
// method is varied depending whether or not the operator is
// functional/out/inplace, and could also be specialized for CPU/CUDA/etc
// (although presently it isn't).
//
// A notable subclass of this interface is TensorIteratorBase.
@Namespace("at::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MetaBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MetaBase(Pointer p) { super(p); }

  public native @Const @ByRef Tensor maybe_get_output(@Cast("int64_t") long output_idx);

  // Note: [set_output_*]
  // See: https://github.com/pytorch/pytorch/issues/69813
  // Whenever defining the output properties in the META function of a
  // structured kernel (what was usually done with `set_output`), use one of
  // these 3 variants, instead. In order to decide which variant to use, check
  // the following decision tree:
  //
  // - Can the kernel you are going to implement support output tensors
  //   with arbitrary strides?
  //     |
  //     -- YES: `set_output_raw_strided`
  //     |
  //     -- NO: Should the output tensor strides be contiguous?
  //         |
  //         -- YES: `set_output_contiguous`
  //         |
  //         -- NO: `set_output_strided`
  //
  // Use this function whenever the kernel requires specific strides for the
  // output. If `strides` does not match the given output strides, proxy outputs
  // will be created and passed to the IMPL function.
  public native void set_output_strided(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal LongArrayRef strides,
        @ByVal TensorOptions options,
        @ByVal(nullValue = "at::DimnameList{}") DimnameArrayRef names);
  public native void set_output_strided(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal LongArrayRef strides,
        @ByVal TensorOptions options);
  public native void set_output_strided(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] strides,
        @ByVal TensorOptions options,
        @ByVal(nullValue = "at::DimnameList{}") DimnameArrayRef names);
  public native void set_output_strided(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] strides,
        @ByVal TensorOptions options);

  // Use this function whenever the kernel knows how to handle arbitrary strided
  // outputs. This function has the same behavior as the old `set_output`: it
  // will only re-stride if the given output was resized.
  public native void set_output_raw_strided(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal LongArrayRef strides_hint,
        @ByVal TensorOptions options,
        @ByVal(nullValue = "at::DimnameList{}") DimnameArrayRef names);
  public native void set_output_raw_strided(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal LongArrayRef strides_hint,
        @ByVal TensorOptions options);
  public native void set_output_raw_strided(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] strides_hint,
        @ByVal TensorOptions options,
        @ByVal(nullValue = "at::DimnameList{}") DimnameArrayRef names);
  public native void set_output_raw_strided(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] strides_hint,
        @ByVal TensorOptions options);

  // Use this function if the kernel requires contiguous strides.
  // Alias for `set_output_strided`, but with contiguous strides.
  public native void set_output_contiguous(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal TensorOptions options,
        @ByVal(nullValue = "at::DimnameList{}") DimnameArrayRef names);
  public native void set_output_contiguous(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal TensorOptions options);
  public native void set_output_contiguous(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal TensorOptions options,
        @ByVal(nullValue = "at::DimnameList{}") DimnameArrayRef names);
  public native void set_output_contiguous(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector long[] sizes,
        @ByVal TensorOptions options);

  // Returns a reference to an undefined tensor if there is no presupplied
  // output
  public native @Const @ByRef Tensor maybe_get_output();
}
