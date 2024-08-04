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


/**
 * TypeMeta is a thin class that allows us to store the type of a container such
 * as a blob, or the data type of a tensor, with a unique run-time id. It also
 * stores some additional data such as the item size and the name of the type
 * for run-time inspection.
 */
@Namespace("caffe2") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TypeMeta extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeMeta(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TypeMeta(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TypeMeta position(long position) {
        return (TypeMeta)super.position(position);
    }
    @Override public TypeMeta getPointer(long i) {
        return new TypeMeta((Pointer)this).offsetAddress(i);
    }


  /** Create a dummy TypeMeta object. To create a TypeMeta object for a specific
   * type, use TypeMeta::Make<T>().
   */
  public TypeMeta() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  /**
   * Copy constructor.
   */
  public TypeMeta(@Const @ByRef TypeMeta src) { super((Pointer)null); allocate(src); }
  @NoException(true) private native void allocate(@Const @ByRef TypeMeta src);

  /**
   * Assignment operators.
   */
  public native @ByRef @Name("operator =") @NoException(true) TypeMeta put(@Const @ByRef TypeMeta src);

  public native @ByRef @Name("operator =") @NoException(true) TypeMeta put(ScalarType scalar_type);
  /**
   * Returns the type id.
   */
  public native @ByVal @NoException(true) TypeIdentifier id();
  /**
   * true if we represent some ScalarType type
   */
  public native @Cast("bool") @NoException(true) boolean isScalarType();
  /**
   * true if we represent ScalarType scalar_type
   */
  public native @Cast("bool") @NoException(true) boolean isScalarType(ScalarType scalar_type);
  /**
   * Returns the size of the item.
   */
  public native @Cast("size_t") @NoException(true) long itemsize();
  /**
   * Returns the new function pointer for individual items.
   */
  public native @NoException(true) PointerSupplier newFn();
  /**
   * Returns the placement new function pointer for individual items.
   */
  public native @NoException(true) PlacementConsumer placementNew();
  /**
   * Returns the typed copy function pointer for individual iterms.
   */
  public native @NoException(true) PlacementCopier copy();
  /**
   * Returns the destructor function pointer for individual items.
   */
  public native @NoException(true) PlacementConsumer placementDelete();
  public native @NoException(true) PointerConsumer deleteFn();
  /**
   * Returns a printable name for the type.
   */
  public native @StringView @NoException(true) BytePointer name();

  private static native @Namespace @Cast("bool") @Name("operator ==") @NoException(true) boolean equals(@Const @ByRef TypeMeta lhs, @Const @ByRef TypeMeta rhs);
  public boolean equals(TypeMeta rhs) { return equals(this, rhs); }

  // Below are static functions that can be called by passing a specific type.

  /**
   * Returns a TypeMeta object that corresponds to the typename T.
   */

  /**
   * convert ScalarType enum values to TypeMeta handles
   */
  public static native @ByVal TypeMeta fromScalarType(ScalarType scalar_type);

  /**
   * convert TypeMeta handles to ScalarType enum values
   */
  public native ScalarType toScalarType();
// #ifdef __CUDACC__
  // NOTE [ TypeIdentifier::Get nvcc/clang discrepancy]
  // nvcc and clang do not produce identical results for
  // TypeIdentifier::Get, because TypeIdentifier::Get relies on
  // __PRETTY_FUNCTION__ and they don't agree on the canonical names
  // of types (e.g., nvcc normalizes to `short unsigned int`, but clang
  // calls it `unsigned short`). Hide the implementation of this function
  // from nvcc so that we always use clang (or whatever host C++ compiler)
  // for TypeIdentifier::Get.
// #else
  // specializations return indexes into typeMetaDataInstances()
}
