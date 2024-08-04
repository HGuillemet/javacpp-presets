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


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorIterator extends TensorIteratorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorIterator(Pointer p) { super(p); }

  public TensorIterator() { super((Pointer)null); allocate(); }
  @UniquePtr @Name("std::make_unique<at::TensorIterator>") private native void allocate();
  // Slicing is OK, TensorIterator guaranteed NOT to have any fields
  public TensorIterator(@Const @ByRef TensorIteratorBase iter) { super((Pointer)null); allocate(iter); }
  @UniquePtr @Name("std::make_unique<at::TensorIterator>") private native void allocate(@Const @ByRef TensorIteratorBase iter);

// #define TORCH_DISALLOW_TEMPORARIES(methodname)
//   TORCH_DISALLOW_TEMPORARIES_IMPL(methodname, static)

  public static native @ByVal TensorIterator binary_float_op(
        @ByRef TensorBase out,
        @Const @ByRef TensorBase a,
        @Const @ByRef TensorBase b);
  public static native @ByVal TensorIterator binary_op(
        @ByRef TensorBase out,
        @Const @ByRef TensorBase a,
        @Const @ByRef TensorBase b);
  public static native @ByVal TensorIterator borrowing_binary_op(
        @Const @ByRef TensorBase out,
        @Const @ByRef TensorBase a,
        @Const @ByRef TensorBase b);
  public static native @ByVal TensorIterator comparison_op(
        @ByRef TensorBase out,
        @Const @ByRef TensorBase a,
        @Const @ByRef TensorBase b);
  public static native @ByVal TensorIterator unary_op(@ByRef TensorBase out, @Const @ByRef TensorBase a);
  public static native @ByVal TensorIterator unary_float_op(@ByRef TensorBase out, @Const @ByRef TensorBase a);
  public static native @ByVal TensorIterator nullary_op(@ByRef TensorBase out);
  public static native @ByVal TensorIterator borrowing_nullary_op(@Const @ByRef TensorBase out);
  
  public static native @ByVal TensorIterator reduce_op(@ByRef TensorBase out, @Const @ByRef TensorBase a);
  public static native @ByVal TensorIterator reduce_op(
        @ByRef TensorBase out1,
        @ByRef TensorBase out2,
        @Const @ByRef TensorBase a);
// #undef TORCH_DISALLOW_TEMPORARIES
// #undef TORCH_DISALLOW_TEMPORARIES_IMPL

  public native @Const @ByRef Tensor maybe_get_output(@Cast("int64_t") long output_idx);
  public native void set_output_raw_strided(
        @Cast("int64_t") long output_idx,
        @ByVal LongArrayRef sizes,
        @ByVal LongArrayRef strides,
        @ByVal TensorOptions options,
        @ByVal DimnameArrayRef names);
  public native void set_output_raw_strided(
        @Cast("int64_t") long output_idx,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long[] sizes,
        @ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long[] strides,
        @ByVal TensorOptions options,
        @ByVal DimnameVector names);
}
