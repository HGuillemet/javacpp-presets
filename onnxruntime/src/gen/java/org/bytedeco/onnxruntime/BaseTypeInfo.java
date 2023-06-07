// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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

@Name("Ort::detail::Base<OrtTypeInfo>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseTypeInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseTypeInfo(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseTypeInfo(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseTypeInfo position(long position) {
        return (BaseTypeInfo)super.position(position);
    }
    @Override public BaseTypeInfo getPointer(long i) {
        return new BaseTypeInfo((Pointer)this).offsetAddress(i);
    }


  public BaseTypeInfo() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseTypeInfo(@Cast("Ort::detail::Base<OrtTypeInfo>::contained_type*") OrtTypeInfo p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtTypeInfo>::contained_type*") OrtTypeInfo p);

  
  

  public BaseTypeInfo(@ByRef(true) BaseTypeInfo v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseTypeInfo v);
  public native @ByRef @Name("operator =") @NoException(true) BaseTypeInfo put(@ByRef(true) BaseTypeInfo v);

  public native @Cast("Ort::detail::Base<OrtTypeInfo>::contained_type*") @Name("operator Ort::detail::Base<OrtTypeInfo>::contained_type*") @NoException(true) OrtTypeInfo asOrtTypeInfo();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtTypeInfo>::contained_type*") OrtTypeInfo release();
}
