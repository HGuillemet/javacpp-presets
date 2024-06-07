// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;
 // namespace detail

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BFloat16 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BFloat16(Pointer p) { super(p); }

  public native @Cast("uint16_t") short x(); public native BFloat16 x(short setter);

  // HIP wants __host__ __device__ tag, CUDA does not
// #if defined(USE_ROCM)
// #else
  public BFloat16() { super((Pointer)null); allocate(); }
  private native void allocate();
// #endif

  @Opaque public static class from_bits_t extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public from_bits_t() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public from_bits_t(Pointer p) { super(p); }
  }
  public static native @Const @ByVal from_bits_t from_bits();

  public BFloat16(@Cast("unsigned short") short bits, @ByVal from_bits_t arg1) { super((Pointer)null); allocate(bits, arg1); }
  private native void allocate(@Cast("unsigned short") short bits, @ByVal from_bits_t arg1);
  public BFloat16(float value) { super((Pointer)null); allocate(value); }
  private native void allocate(float value);
  public native @Name("operator float") float asFloat();

// #if defined(__CUDACC__) && !defined(USE_ROCM)
// #endif

// #if defined(SYCL_EXT_ONEAPI_BFLOAT16_MATH_FUNCTIONS)
// #endif
}
