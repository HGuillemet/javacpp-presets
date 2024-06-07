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


@Name("c10::complex<float>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FloatComplex extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatComplex(Pointer p) { super(p); }


  public native float real_(); public native FloatComplex real_(float setter);
  public native float imag_(); public native FloatComplex imag_(float setter);

  public FloatComplex() { super((Pointer)null); allocate(); }
  private native void allocate();
  public FloatComplex(float re, float im/*=float()*/) { super((Pointer)null); allocate(re, im); }
  private native void allocate(float re, float im/*=float()*/);
  public FloatComplex(float re) { super((Pointer)null); allocate(re); }
  private native void allocate(float re);
// #if defined(__CUDACC__) || defined(__HIPCC__)
// #endif

  // Use SFINAE to specialize casting constructor for c10::complex<float> and
  // c10::complex<double>

  public native @Const @ByRef @Name("operator =") FloatComplex put(float re);

  public native @Const @ByRef @Name("operator +=") FloatComplex addPut(float re);

  public native @Const @ByRef @Name("operator -=") FloatComplex subtractPut(float re);

  public native @Const @ByRef @Name("operator *=") FloatComplex multiplyPut(float re);

  public native @Const @ByRef @Name("operator /=") FloatComplex dividePut(float re);

// #ifdef __APPLE__
// #define FORCE_INLINE_APPLE __attribute__((always_inline))
// #else
// #define FORCE_INLINE_APPLE
// #endif
// #undef FORCE_INLINE_APPLE

// #if defined(__CUDACC__) || defined(__HIPCC__)
// #endif

// #if defined(__CUDACC__) || defined(__HIPCC__)
// #endif

  // consistent with NumPy behavior
  public native @Cast("bool") @Name("operator bool") boolean asBoolean();

  public native @org.bytedeco.javacpp.annotation.Function float real();
  public native @org.bytedeco.javacpp.annotation.Function void real(float value);
  public native @org.bytedeco.javacpp.annotation.Function float imag();
  public native @org.bytedeco.javacpp.annotation.Function void imag(float value);
}
