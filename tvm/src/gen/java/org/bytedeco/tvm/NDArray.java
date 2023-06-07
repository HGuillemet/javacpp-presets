// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.mkl.global.mkl_rt.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/**
 * \brief Managed NDArray.
 *  The array is backed by reference counted blocks.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class NDArray extends ObjectRef {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NDArray(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NDArray(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NDArray position(long position) {
        return (NDArray)super.position(position);
    }
    @Override public NDArray getPointer(long i) {
        return new NDArray((Pointer)this).offsetAddress(i);
    }

  /** \brief ContainerBase used to back the TVMArrayHandle */
  @Opaque public static class ContainerBase extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public ContainerBase() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public ContainerBase(Pointer p) { super(p); }
  }
  /** \brief NDArray internal container type */
  @Opaque public static class Container extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public Container() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Container(Pointer p) { super(p); }
  }
  /** \brief Container type for Object system. */
  /** \brief default constructor */
  public NDArray() { super((Pointer)null); allocate(); }
  private native void allocate();
  /**
   * \brief constructor.
   * @param data ObjectPtr to the data container.
   */
  public NDArray(@ByVal ObjectPtr data) { super((Pointer)null); allocate(data); }
  private native void allocate(@ByVal ObjectPtr data);

  /** \brief reset the content of NDArray to be nullptr */
  
  /**
   * @return the reference counter
   * \note this number is approximate in multi-threaded setting.
   */
  public native int use_count();
  /** @return Pointer to content of DLTensor */
  public native @Const @Name("operator ->") DLTensor accessDLTensor();
  /** @return Whether the tensor is contiguous */
  public native @Cast("bool") boolean IsContiguous();
  /**
   * \brief Copy data content from another array.
   * @param other The source array to be copied from.
   * \note The copy may happen asynchronously if it involves a GPU context.
   *       TVMSynchronize is necessary.
   */
  public native void CopyFrom(@Const DLTensor other);
  public native void CopyFrom(@Const @ByRef NDArray other);
  /**
   * \brief Copy data content from a byte buffer.
   * @param data The source bytes to be copied from.
   * @param nbytes The size of the buffer in bytes
   *        Must be equal to the size of the NDArray.
   * \note The copy always triggers a TVMSynchronize.
   */
  public native void CopyFromBytes(@Const Pointer data, @Cast("size_t") long nbytes);
  /**
   * \brief Copy data content into another array.
   * @param other The source array to be copied from.
   * \note The copy may happen asynchronously if it involves a GPU context.
   *       TVMSynchronize is necessary.
   */
  public native void CopyTo(DLTensor other);
  public native void CopyTo(@Const @ByRef NDArray other);
  /**
   * \brief Copy data content into another array.
   * @param data The source bytes to be copied from.
   * @param nbytes The size of the data buffer.
   *        Must be equal to the size of the NDArray.
   * \note The copy always triggers a TVMSynchronize.
   */
  public native void CopyToBytes(Pointer data, @Cast("size_t") long nbytes);
  /**
   * \brief Copy the data to another device.
   * @param dev The target device.
   * @return The array under another device.
   */
  public native @ByVal NDArray CopyTo(@Cast("const tvm::Device*") @ByRef DLDevice dev);
  /**
   * \brief Load NDArray from stream
   * @param stream The input data stream
   * @return Whether load is successful
   */
  public native @Cast("bool") boolean Load(Stream stream);
  /**
   * \brief Save NDArray to stream
   * @param stream The output data stream
   */
  public native void Save(Stream stream);
  /**
   * \brief Create a NDArray that shares the data memory with the current one.
   * @param shape The shape of the new array.
   * @param dtype The data type of the new array.
   * \note The memory size of new array must be smaller than the current one.
   */
  public native @ByVal NDArray CreateView(@ByVal ShapeTuple shape, @ByVal DLDataType dtype);
  /**
   * \brief Create a reference view of NDArray that
   *  represents as DLManagedTensor.
   * @return A DLManagedTensor
   */
  public native DLManagedTensor ToDLPack();
  /**
   * \brief Create an empty NDArray.
   * @param shape The shape of the new array.
   * @param dtype The data type of the new array.
   * @param dev The device of the array.
   * @param mem_scope The memory scope of the array.
   * @return The created Array
   */
  public static native @ByVal NDArray Empty(@ByVal ShapeTuple shape, @ByVal DLDataType dtype, @ByVal @Cast("tvm::Device*") DLDevice dev,
                                 @ByVal(nullValue = "tvm::runtime::Optional<tvm::runtime::String>(tvm::NullOpt)") TVMStringOptional mem_scope);
  public static native @ByVal NDArray Empty(@ByVal ShapeTuple shape, @ByVal DLDataType dtype, @ByVal @Cast("tvm::Device*") DLDevice dev);
  /**
   * \brief Create a NDArray backed by an external DLTensor without memory copying.
   *
   * If DLTensor is not contiguous or has bad aligned data, It fails.
   * This allows us to create a NDArray using the memory
   * allocated by an external source. Responsibility for memory
   * retaining lies with the external source.
   * @param dl_tensor The DLTensor for NDArray base.
   * @return The created NDArray view.
   */
  public static native @ByVal NDArray FromExternalDLTensor(@Const @ByRef DLTensor dl_tensor);
  /**
   * \brief Create new NDArray, data is copied from DLTensor.
   *
   * @param dl_tensor The DLTensor to copy from.
   * @param dev device location of the created NDArray.
   * @return The created NDArray view.
   */
  public static native @ByVal NDArray NewFromDLTensor(DLTensor dl_tensor, @Cast("const tvm::Device*") @ByRef DLDevice dev);
  /**
   * \brief Create a NDArray backed by a dlpack tensor.
   *
   * This allows us to create a NDArray using the memory
   * allocated by an external deep learning framework
   * that is DLPack compatible.
   *
   * The memory is retained until the NDArray went out of scope.
   * @param tensor The DLPack tensor to copy from.
   * @return The created NDArray view.
   */
  public static native @ByVal NDArray FromDLPack(DLManagedTensor tensor);
  /**
   * \brief Function to copy data from one array to another.
   * @param from The source array.
   * @param to The target array.
   * @param stream The stream used in copy.
   */
  public static native void CopyFromTo(@Const DLTensor from, DLTensor to,
                                   TVMStreamHandle stream/*=nullptr*/);
  public static native void CopyFromTo(@Const DLTensor from, DLTensor to);

  public native @ByVal ShapeTuple Shape();
  public native @ByVal DataType DataType();
  /**
   * \brief Check conditions for construction NDArray over DLTensor without copying.
   * There are three conditions to check:
   * 1. Destination device is the same as DLTensor device
   * 2. Destination device id is the same as DLTensor device id
   * 3. Memory in DLTensor is aligned as expected for NDArray
   * @param tensor the DLTensor.
   * @param dev destination device.
   * @return true if all conditions are satisfied.
   */
  public static native @Cast("bool") boolean AbilityOfZeroCopyForDLTensor(DLTensor tensor, @Cast("const tvm::Device*") @ByRef DLDevice dev);
  // internal namespace
  @Opaque public static class Internal extends Pointer {
      /** Empty constructor. Calls {@code super((Pointer)null)}. */
      public Internal() { super((Pointer)null); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Internal(Pointer p) { super(p); }
  }
}
