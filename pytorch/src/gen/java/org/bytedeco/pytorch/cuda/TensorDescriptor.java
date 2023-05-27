// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


// A generic class for wrapping cuDNN descriptor types.  All you need
// is to give the underlying type the Descriptor_t points to (usually,
// if it's cudnnTensorDescriptor_t it points to cudnnTensorStruct),
// the constructor and the destructor.  Subclasses are responsible
// for defining a set() function to actually set the descriptor.
//
// Descriptors default construct to a nullptr, and have a descriptor
// initialized the first time you call set() or any other initializing
// function.

@Namespace("at::native") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class TensorDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorDescriptor(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorDescriptor position(long position) {
        return (TensorDescriptor)super.position(position);
    }
    @Override public TensorDescriptor getPointer(long i) {
        return new TensorDescriptor((Pointer)this).offsetAddress(i);
    }

  public TensorDescriptor() { super((Pointer)null); allocate(); }
  private native void allocate();
  public TensorDescriptor(@Const @ByRef Tensor t, @Cast("size_t") long pad/*=0*/) { super((Pointer)null); allocate(t, pad); }
  private native void allocate(@Const @ByRef Tensor t, @Cast("size_t") long pad/*=0*/);
  public TensorDescriptor(@Const @ByRef Tensor t) { super((Pointer)null); allocate(t); }
  private native void allocate(@Const @ByRef Tensor t);

  // Note [CuDNN broadcast padding]
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
  // pad specifies the minimum dimensionality of the tensor descriptor
  // we produce (it doesn't have anything to do with, e.g., convolution
  // padding).  If 't' is lower-dimensional than 'pad', the remaining
  // dimensions (on the right) are padded with ones.  This doesn't
  // affect the underlying data layout.  This is particularly useful for
  // dealing with a pecularity of the CuDNN API, which is that broadcasting in CuDNN is
  // done in two steps: first, the client code is expected to pad out
  // (the dimensions) input tensors to be the same dimension as the
  // target broadcast, and then second, CuDNN takes of actually
  // broadcasting size 1 dimensions.

  public native void set(@Const @ByRef Tensor t, @Cast("size_t") long pad/*=0*/);
  public native void set(@Const @ByRef Tensor t);
  public native void set(@Const @ByRef Tensor t, @ByVal MemoryFormat memory_format, @Cast("size_t") long pad/*=0*/);
  public native void set(@Const @ByRef Tensor t, @ByVal MemoryFormat memory_format);
  public native void set(@Cast("cudnnDataType_t") int dataType, @ByVal LongArrayRef sizes, @ByVal LongArrayRef strides, @Cast("size_t") long pad/*=0*/);
  public native void set(@Cast("cudnnDataType_t") int dataType, @ByVal LongArrayRef sizes, @ByVal LongArrayRef strides);

  public native void print();
}
