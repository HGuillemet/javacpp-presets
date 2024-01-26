// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("Ort::detail::Base<Ort::detail::Unowned<const OrtTensorTypeAndShapeInfo> >") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseConstTensorTypeAndShapeInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseConstTensorTypeAndShapeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseConstTensorTypeAndShapeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseConstTensorTypeAndShapeInfo position(long position) {
        return (BaseConstTensorTypeAndShapeInfo)super.position(position);
    }
    @Override public BaseConstTensorTypeAndShapeInfo getPointer(long i) {
        return new BaseConstTensorTypeAndShapeInfo((Pointer)this).offsetAddress(i);
    }


  public BaseConstTensorTypeAndShapeInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseConstTensorTypeAndShapeInfo(@Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtTensorTypeAndShapeInfo> >::contained_type*") UnownedAllocator p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtTensorTypeAndShapeInfo> >::contained_type*") UnownedAllocator p);

  
  

  public BaseConstTensorTypeAndShapeInfo(@ByRef(true) BaseConstTensorTypeAndShapeInfo v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseConstTensorTypeAndShapeInfo v);
  public native @ByRef @Name("operator =") @NoException(true) BaseConstTensorTypeAndShapeInfo put(@ByRef(true) BaseConstTensorTypeAndShapeInfo v);

  public native @Cast("Ort::detail::Base<Ort::detail::Unowned<const OrtTensorTypeAndShapeInfo> >::contained_type*") @Name("operator Ort::detail::Base<Ort::detail::Unowned<const OrtTensorTypeAndShapeInfo> >::contained_type*") @NoException(true) UnownedAllocator asUnownedAllocator();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  
}
