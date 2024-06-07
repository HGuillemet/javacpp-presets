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


// c10::complex is an implementation of complex numbers that aims
// to work on all devices supported by PyTorch
//
// Most of the APIs duplicates std::complex
// Reference: https://en.cppreference.com/w/cpp/numeric/complex
//
// [NOTE: Complex Operator Unification]
// Operators currently use a mix of std::complex, thrust::complex, and
// c10::complex internally. The end state is that all operators will use
// c10::complex internally.  Until then, there may be some hacks to support all
// variants.
//
//
// [Note on Constructors]
//
// The APIs of constructors are mostly copied from C++ standard:
//   https://en.cppreference.com/w/cpp/numeric/complex/complex
//
// Since C++14, all constructors are constexpr in std::complex
//
// There are three types of constructors:
// - initializing from real and imag:
//     `constexpr complex( const T& re = T(), const T& im = T() );`
// - implicitly-declared copy constructor
// - converting constructors
//
// Converting constructors:
// - std::complex defines converting constructor between float/double/long
// double,
//   while we define converting constructor between float/double.
// - For these converting constructors, upcasting is implicit, downcasting is
//   explicit.
// - We also define explicit casting from std::complex/thrust::complex
//   - Note that the conversion from thrust is not constexpr, because
//     thrust does not define them as constexpr ????
//
//
// [Operator =]
//
// The APIs of operator = are mostly copied from C++ standard:
//   https://en.cppreference.com/w/cpp/numeric/complex/operator%3D
//
// Since C++20, all operator= are constexpr. Although we are not building with
// C++20, we also obey this behavior.
//
// There are three types of assign operator:
// - Assign a real value from the same scalar type
//   - In std, this is templated as complex& operator=(const T& x)
//     with specialization `complex& operator=(T x)` for float/double/long
//     double Since we only support float and double, on will use `complex&
//     operator=(T x)`
// - Copy assignment operator and converting assignment operator
//   - There is no specialization of converting assignment operators, which type
//   is
//     convertible is solely dependent on whether the scalar type is convertible
//
// In addition to the standard assignment, we also provide assignment operators
// with std and thrust
//
//
// [Casting operators]
//
// std::complex does not have casting operators. We define casting operators
// casting to std::complex and thrust::complex
//
//
// [Operator ""]
//
// std::complex has custom literals `i`, `if` and `il` defined in namespace
// `std::literals::complex_literals`. We define our own custom literals in the
// namespace `c10::complex_literals`. Our custom literals does not follow the
// same behavior as in std::complex, instead, we define _if, _id to construct
// float/double complex literals.
//
//
// [real() and imag()]
//
// In C++20, there are two overload of these functions, one it to return the
// real/imag, another is to set real/imag, they are both constexpr. We follow
// this design.
//
//
// [Operator +=,-=,*=,/=]
//
// Since C++20, these operators become constexpr. In our implementation, they
// are also constexpr.
//
// There are two types of such operators: operating with a real number, or
// operating with another complex number. For the operating with a real number,
// the generic template form has argument type `const T &`, while the overload
// for float/double/long double has `T`. We will follow the same type as
// float/double/long double in std.
//
// [Unary operator +-]
//
// Since C++20, they are constexpr. We also make them expr
//
// [Binary operators +-*/]
//
// Each operator has three versions (taking + as example):
// - complex + complex
// - complex + real
// - real + complex
//
// [Operator ==, !=]
//
// Each operator has three versions (taking == as example):
// - complex == complex
// - complex == real
// - real == complex
//
// Some of them are removed on C++20, but we decide to keep them
//
// [Operator <<, >>]
//
// These are implemented by casting to std::complex
//
//
//
// TODO(@zasdfgbnm): c10::complex<c10::Half> is not currently supported,
// because:
//  - lots of members and functions of c10::Half are not constexpr
//  - thrust::complex only support float and double

@Name("c10::complex<double>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleComplex extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleComplex(Pointer p) { super(p); }


  public native double real_(); public native DoubleComplex real_(double setter);
  public native double imag_(); public native DoubleComplex imag_(double setter);

  public DoubleComplex() { super((Pointer)null); allocate(); }
  private native void allocate();
  public DoubleComplex(double re, double im/*=double()*/) { super((Pointer)null); allocate(re, im); }
  private native void allocate(double re, double im/*=double()*/);
  public DoubleComplex(double re) { super((Pointer)null); allocate(re); }
  private native void allocate(double re);
// #if defined(__CUDACC__) || defined(__HIPCC__)
// #endif

  // Use SFINAE to specialize casting constructor for c10::complex<float> and
  // c10::complex<double>

  public native @Const @ByRef @Name("operator =") DoubleComplex put(double re);

  public native @Const @ByRef @Name("operator +=") DoubleComplex addPut(double re);

  public native @Const @ByRef @Name("operator -=") DoubleComplex subtractPut(double re);

  public native @Const @ByRef @Name("operator *=") DoubleComplex multiplyPut(double re);

  public native @Const @ByRef @Name("operator /=") DoubleComplex dividePut(double re);

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

  public native @org.bytedeco.javacpp.annotation.Function double real();
  public native @org.bytedeco.javacpp.annotation.Function void real(double value);
  public native @org.bytedeco.javacpp.annotation.Function double imag();
  public native @org.bytedeco.javacpp.annotation.Function void imag(double value);
}
