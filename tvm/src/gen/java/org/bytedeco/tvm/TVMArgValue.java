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
 * \brief A single argument value to PackedFunc.
 *  Containing both type_code and TVMValue
 *
 *  Provides utilities to do type cast into other types.
 */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class TVMArgValue extends TVMPODValue_ {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TVMArgValue(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TVMArgValue(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TVMArgValue position(long position) {
        return (TVMArgValue)super.position(position);
    }
    @Override public TVMArgValue getPointer(long i) {
        return new TVMArgValue((Pointer)this).offsetAddress(i);
    }

  /** \brief default constructor */
  public TVMArgValue() { super((Pointer)null); allocate(); }
  private native void allocate();
  /**
   * \brief constructor
   * @param value of the function
   * @param type_code The type code.
   */
  public TVMArgValue(@ByVal TVMValue value, int type_code) { super((Pointer)null); allocate(value, type_code); }
  private native void allocate(@ByVal TVMValue value, int type_code);
  // reuse converter from parent

  // conversion operator.
  public native @Name("operator std::string") @StdString BytePointer asBytePointer();
  public native @Const @ByRef TVMValue value();
  public native @ByVal @Name("operator DLDataType") DLDataType asDLDataType();
  public native @ByVal @Name("operator tvm::runtime::DataType") DataType asDataType();
}
