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


/** <summary>
 *  This class wraps a raw pointer OrtKernelContext* that is being passed
 *  to the custom kernel Compute() method. Use it to safely access context
 *  attributes, input and output parameters with exception safety guarantees.
 *  See usage example in onnxruntime/test/testdata/custom_op_library/custom_op_library.cc
 *  </summary> */
@Namespace("Ort") @NoOffset @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class KernelContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public KernelContext(Pointer p) { super(p); }

  public KernelContext(OrtKernelContext context) { super((Pointer)null); allocate(context); }
  private native void allocate(OrtKernelContext context);
  public native @Cast("size_t") long GetInputCount();
  public native @Cast("size_t") long GetOutputCount();
  public native @ByVal ConstValue GetInput(@Cast("size_t") long index);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("const int64_t*") LongPointer dim_values, @Cast("size_t") long dim_count);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("const int64_t*") LongBuffer dim_values, @Cast("size_t") long dim_count);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("const int64_t*") long[] dim_values, @Cast("size_t") long dim_count);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("int64_t*") @StdVector LongPointer dims);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("int64_t*") @StdVector LongBuffer dims);
  public native @ByVal @Cast("Ort::UnownedValue*") ValueImpl GetOutput(@Cast("size_t") long index, @Cast("int64_t*") @StdVector long[] dims);
  public native Pointer GetGPUComputeStream();
  public native @ByVal Logger GetLogger();
  public native OrtAllocator GetAllocator(@Const @ByRef OrtMemoryInfo memory_info);
}
