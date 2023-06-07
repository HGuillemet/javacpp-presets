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

@Name("Ort::detail::Base<OrtValue>") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class BaseValue extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BaseValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BaseValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BaseValue position(long position) {
        return (BaseValue)super.position(position);
    }
    @Override public BaseValue getPointer(long i) {
        return new BaseValue((Pointer)this).offsetAddress(i);
    }


  public BaseValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  public BaseValue(@Cast("Ort::detail::Base<OrtValue>::contained_type*") OrtValue p) { super((Pointer)null); allocate(p); }
  @NoException(true) private native void allocate(@Cast("Ort::detail::Base<OrtValue>::contained_type*") OrtValue p);

  
  

  public BaseValue(@ByRef(true) BaseValue v) { super((Pointer)null); allocate(v); }
  @NoException(true) private native void allocate(@ByRef(true) BaseValue v);
  public native @ByRef @Name("operator =") @NoException(true) BaseValue put(@ByRef(true) BaseValue v);

  public native @Cast("Ort::detail::Base<OrtValue>::contained_type*") @Name("operator Ort::detail::Base<OrtValue>::contained_type*") @NoException(true) OrtValue asOrtValue();

  /** \brief Relinquishes ownership of the contained C object pointer
   *  The underlying object is not destroyed */
  public native @Cast("Ort::detail::Base<OrtValue>::contained_type*") OrtValue release();
}
