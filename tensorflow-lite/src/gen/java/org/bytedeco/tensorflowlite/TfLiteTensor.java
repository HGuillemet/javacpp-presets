// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflowlite;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflowlite.global.tensorflowlite.*;


// A tensor in the interpreter system which is a wrapper around a buffer of
// data including a dimensionality (or NULL if not currently defined).
// #ifndef TF_LITE_STATIC_MEMORY
@Properties(inherit = org.bytedeco.tensorflowlite.presets.tensorflowlite.class)
public class TfLiteTensor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TfLiteTensor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TfLiteTensor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TfLiteTensor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TfLiteTensor position(long position) {
        return (TfLiteTensor)super.position(position);
    }
    @Override public TfLiteTensor getPointer(long i) {
        return new TfLiteTensor((Pointer)this).offsetAddress(i);
    }

  // The data type specification for data stored in `data`. This affects
  // what member of `data` union should be used.
  public native @Cast("TfLiteType") int type(); public native TfLiteTensor type(int setter);
  // A union of data pointers. The appropriate type should be used for a typed
  // tensor based on `type`.
  public native @ByRef TfLitePtrUnion data(); public native TfLiteTensor data(TfLitePtrUnion setter);
  // A pointer to a structure representing the dimensionality interpretation
  // that the buffer should have. NOTE: the product of elements of `dims`
  // and the element datatype size should be equal to `bytes` below.
  public native TfLiteIntArray dims(); public native TfLiteTensor dims(TfLiteIntArray setter);
  // Quantization information.
  public native @ByRef TfLiteQuantizationParams params(); public native TfLiteTensor params(TfLiteQuantizationParams setter);
  // How memory is mapped
  //  kTfLiteMmapRo: Memory mapped read only.
  //  i.e. weights
  //  kTfLiteArenaRw: Arena allocated read write memory
  //  (i.e. temporaries, outputs).
  public native @Cast("TfLiteAllocationType") int allocation_type(); public native TfLiteTensor allocation_type(int setter);
  // The number of bytes required to store the data of this Tensor. I.e.
  // (bytes of each element) * dims[0] * ... * dims[n-1].  For example, if
  // type is kTfLiteFloat32 and dims = {3, 2} then
  // bytes = sizeof(float) * 3 * 2 = 4 * 3 * 2 = 24.
  public native @Cast("size_t") long bytes(); public native TfLiteTensor bytes(long setter);

  // An opaque pointer to a tflite::MMapAllocation
  public native @Const Pointer allocation(); public native TfLiteTensor allocation(Pointer setter);

  // Null-terminated name of this tensor.
  public native @Cast("const char*") BytePointer name(); public native TfLiteTensor name(BytePointer setter);

  // The delegate which knows how to handle `buffer_handle`.
  // WARNING: This is an experimental interface that is subject to change.
  public native TfLiteDelegate delegate(); public native TfLiteTensor delegate(TfLiteDelegate setter);

  // An integer buffer handle that can be handled by `delegate`.
  // The value is valid only when delegate is not null.
  // WARNING: This is an experimental interface that is subject to change.
  public native @Cast("TfLiteBufferHandle") int buffer_handle(); public native TfLiteTensor buffer_handle(int setter);

  // If the delegate uses its own buffer (e.g. GPU memory), the delegate is
  // responsible to set data_is_stale to true.
  // `delegate->CopyFromBufferHandle` can be called to copy the data from
  // delegate buffer.
  // WARNING: This is an // experimental interface that is subject to change.
  public native @Cast("bool") boolean data_is_stale(); public native TfLiteTensor data_is_stale(boolean setter);

  // True if the tensor is a variable.
  public native @Cast("bool") boolean is_variable(); public native TfLiteTensor is_variable(boolean setter);

  // Quantization information. Replaces params field above.
  public native @ByRef TfLiteQuantization quantization(); public native TfLiteTensor quantization(TfLiteQuantization setter);

  // Parameters used to encode a sparse tensor.
  // This is optional. The field is NULL if a tensor is dense.
  // WARNING: This is an experimental interface that is subject to change.
  public native TfLiteSparsity sparsity(); public native TfLiteTensor sparsity(TfLiteSparsity setter);

  // Optional. Encodes shapes with unknown dimensions with -1. This field is
  // only populated when unknown dimensions exist in a read-write tensor (i.e.
  // an input or output tensor). (e.g.  `dims` contains [1, 1, 1, 3] and
  // `dims_signature` contains [1, -1, -1, 3]).  If no unknown dimensions exist
  // then `dims_signature` is either null, or set to an empty array.  Note that
  // this field only exists when TF_LITE_STATIC_MEMORY is not defined.
  public native @Const TfLiteIntArray dims_signature(); public native TfLiteTensor dims_signature(TfLiteIntArray setter);
}
