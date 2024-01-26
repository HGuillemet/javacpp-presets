// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * \ingroup CUDA_MATH_INTRINSIC_HALF
 * \brief __half data type
 * \details This structure implements the datatype for storing 
 * half-precision floating-point numbers. The structure implements 
 * assignment, arithmetic and comparison operators, and type conversions. 
 * 16 bits are being used in total: 1 sign bit, 5 bits for the exponent, 
 * and the significand is being stored in 10 bits. 
 * The total precision is 11 bits. There are 15361 representable 
 * numbers within the interval [0.0, 1.0], endpoints included. 
 * On average we have log10(2**11) ~ 3.311 decimal digits. 
 * 
 * The objective here is to provide IEEE754-compliant implementation
 * of \p binary16 type and arithmetic with limitations due to
 * device HW not supporting floating-point exceptions.
 */
@NoOffset @Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class __half extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public __half(Pointer p) { super(p); }

    /**
     * Constructor by default.
     */
// #if defined(__CPP_VERSION_AT_LEAST_11_FP16)
    public __half() { super((Pointer)null); allocate(); }
    private native void allocate();
// #else
// #endif /* defined(__CPP_VERSION_AT_LEAST_11_FP16) */

    /* Convert to/from __half_raw */
    /**
     * Constructor from \p __half_raw.
     */
    public __half(@Const @ByRef __half_raw hr) { super((Pointer)null); allocate(hr); }
    private native void allocate(@Const @ByRef __half_raw hr);
    /**
     * Assignment operator from \p __half_raw.
     */
    public native @ByRef @Name("operator =") __half put(@Const @ByRef __half_raw hr);
    /**
     * Assignment operator from \p __half_raw to \p volatile \p __half.
     */
    /**
     * Assignment operator from \p volatile \p __half_raw to \p volatile \p __half.
     */
    /**
     * Type cast to \p __half_raw operator.
     */
    public native @ByVal @Name("operator __half_raw") __half_raw as__half_raw();
    /**
     * Type cast to \p __half_raw operator with \p volatile input.
     */
// #if !defined(__CUDA_NO_HALF_CONVERSIONS__)
// #if defined(__CPP_VERSION_AT_LEAST_11_FP16)
    /**
     * Construct \p __half from \p __nv_bfloat16 input using default round-to-nearest-even rounding mode.
     * Need to include the header file \p cuda_bf16.h
     */
    public __half(@Const @ByVal __nv_bfloat16 f) { super((Pointer)null); allocate(f); }
    private native void allocate(@Const @ByVal __nv_bfloat16 f); //forward declaration only, implemented in cuda_bf16.hpp
// #endif /* #if defined(__CPP_VERSION_AT_LEAST_11_FP16) */
    /* Construct from float/double */
    /**
     * Construct \p __half from \p float input using default round-to-nearest-even rounding mode.
     */
    public __half(float f) { super((Pointer)null); allocate(f); }
    private native void allocate(float f);
    /**
     * Construct \p __half from \p double input using default round-to-nearest-even rounding mode.
     */
    public __half(double f) { super((Pointer)null); allocate(f); }
    private native void allocate(double f);
    /**
     * Type cast to \p float operator.
     */
    public native @Name("operator float") float asFloat();
    /**
     * Type cast to \p __half assignment operator from \p float input using default round-to-nearest-even rounding mode.
     */
    public native @ByRef @Name("operator =") __half put(float f);

    /* We omit "cast to double" operator, so as to not be ambiguous about up-cast */
    /**
     * Type cast to \p __half assignment operator from \p double input using default round-to-nearest-even rounding mode.
     */
    public native @ByRef @Name("operator =") __half put(double f);

    /* Allow automatic construction from types supported natively in hardware */
    /* Note we do avoid constructor init-list because of special host/device compilation rules */

/*
 * Implicit type conversions to/from integer types were only available to nvcc compilation.
 * Introducing them for all compilers is a potentially breaking change that may affect
 * overloads resolution and will require users to update their code.
 * Define __CUDA_FP16_DISABLE_IMPLICIT_INTEGER_CONVERTS_FOR_HOST_COMPILERS__ to opt-out.
 */
// #if !(defined __CUDA_FP16_DISABLE_IMPLICIT_INTEGER_CONVERTS_FOR_HOST_COMPILERS__) || (defined __CUDACC__)
    /**
     * Construct \p __half from \p short integer input using default round-to-nearest-even rounding mode.
     */
    public __half(short val) { super((Pointer)null); allocate(val); }
    private native void allocate(short val);
    /**
     * Construct \p __half from \p unsigned \p short integer input using default round-to-nearest-even rounding mode.
     */
    /**
     * Construct \p __half from \p int input using default round-to-nearest-even rounding mode.
     */
    public __half(int val) { super((Pointer)null); allocate(val); }
    private native void allocate(int val);
    /**
     * Construct \p __half from \p unsigned \p int input using default round-to-nearest-even rounding mode.
     */
    /**
     * Construct \p __half from \p long input using default round-to-nearest-even rounding mode.
     */
    public __half(long val) { super((Pointer)null); allocate(val); }
    private native void allocate(long val);
    /**
     * Construct \p __half from \p unsigned \p long input using default round-to-nearest-even rounding mode.
     */

    /**
     * Construct \p __half from \p long \p long input using default round-to-nearest-even rounding mode.
     */
    /**
     * Construct \p __half from \p unsigned \p long \p long input using default round-to-nearest-even rounding mode.
     */

    /* Allow automatic casts to supported builtin types, matching all that are permitted with float */

    /**
     * Conversion operator to \p signed \p char data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2char_rz(__half) for further details
     */
    public native @Name("operator signed char") byte asByte();
    /**
     * Conversion operator to \p unsigned \p char data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2uchar_rz(__half) for further details
     */
    /**
     * Conversion operator to an implementation defined \p char data type.
     * Using round-toward-zero rounding mode.
     * 
     * Detects signedness of the \p char type and proceeds accordingly, see
     * further details in signed and unsigned char operators.
     */
    /**
     * Conversion operator to \p short data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2short_rz(__half) for further details
     */
    public native @Name("operator short") short asShort();
    /**
     * Conversion operator to \p unsigned \p short data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2ushort_rz(__half) for further details
     */
    /**
     * Conversion operator to \p int data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2int_rz(__half) for further details
     */
    public native @Name("operator int") int asInt();
    /**
     * Conversion operator to \p unsigned \p int data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2uint_rz(__half) for further details
     */
    /**
     * Conversion operator to \p long data type.
     * Using round-toward-zero rounding mode.
     */
    public native @Name("operator long") long asLong();
    /**
     * Conversion operator to \p unsigned \p long data type.
     * Using round-toward-zero rounding mode.
     */
    /**
     * Conversion operator to \p long \p long data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2ll_rz(__half) for further details
     */
    /**
     * Conversion operator to \p unsigned \p long \p long data type.
     * Using round-toward-zero rounding mode.
     * 
     * See __half2ull_rz(__half) for further details
     */
    /**
     * Type cast from \p short assignment operator, using default round-to-nearest-even rounding mode.
     */
    public native @ByRef @Name("operator =") __half put(short val);
    /**
     * Type cast from \p unsigned \p short assignment operator, using default round-to-nearest-even rounding mode.
     */
    /**
     * Type cast from \p int assignment operator, using default round-to-nearest-even rounding mode.
     */
    public native @ByRef @Name("operator =") __half put(int val);
    /**
     * Type cast from \p unsigned \p int assignment operator, using default round-to-nearest-even rounding mode.
     */
    /**
     * Type cast from \p long \p long assignment operator, using default round-to-nearest-even rounding mode.
     */
    public native @ByRef @Name("operator =") __half put(long val);
    /**
     * Type cast from \p unsigned \p long \p long assignment operator, using default round-to-nearest-even rounding mode.
     */
    /**
     * Conversion operator to \p bool data type.
     * +0 and -0 inputs convert to \p false.
     * Non-zero inputs convert to \p true.
     */
    public native @Cast("bool") @Name("operator bool") boolean asBoolean();
// #endif /* #if !(defined __CUDA_FP16_DISABLE_IMPLICIT_INTEGER_CONVERTS_FOR_HOST_COMPILERS__) || (defined __CUDACC__) */
// #endif /* !defined(__CUDA_NO_HALF_CONVERSIONS__) */
}
