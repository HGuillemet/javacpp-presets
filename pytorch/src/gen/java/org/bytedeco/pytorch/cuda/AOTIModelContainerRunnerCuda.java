// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.cusparse.*;
import static org.bytedeco.cuda.global.cusparse.*;
import org.bytedeco.cuda.cusolver.*;
import static org.bytedeco.cuda.global.cusolver.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


// NOTICE: Following APIs are subject to change due to active development
// We provide NO BC guarantee for these APIs
@Namespace("torch::inductor") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class AOTIModelContainerRunnerCuda extends AOTIModelContainerRunner {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AOTIModelContainerRunnerCuda(Pointer p) { super(p); }

  // @param device_str: cuda device string, e.g. "cuda", "cuda:0"
  public AOTIModelContainerRunnerCuda(
        @StdString BytePointer model_so_path,
        @Cast("size_t") long num_models/*=1*/,
        @StdString BytePointer device_str/*="cuda"*/,
        @StdString BytePointer cubin_dir/*=""*/) { super((Pointer)null); allocate(model_so_path, num_models, device_str, cubin_dir); }
  private native void allocate(
        @StdString BytePointer model_so_path,
        @Cast("size_t") long num_models/*=1*/,
        @StdString BytePointer device_str/*="cuda"*/,
        @StdString BytePointer cubin_dir/*=""*/);
  public AOTIModelContainerRunnerCuda(
        @StdString BytePointer model_so_path) { super((Pointer)null); allocate(model_so_path); }
  private native void allocate(
        @StdString BytePointer model_so_path);
  public AOTIModelContainerRunnerCuda(
        @StdString String model_so_path,
        @Cast("size_t") long num_models/*=1*/,
        @StdString String device_str/*="cuda"*/,
        @StdString String cubin_dir/*=""*/) { super((Pointer)null); allocate(model_so_path, num_models, device_str, cubin_dir); }
  private native void allocate(
        @StdString String model_so_path,
        @Cast("size_t") long num_models/*=1*/,
        @StdString String device_str/*="cuda"*/,
        @StdString String cubin_dir/*=""*/);
  public AOTIModelContainerRunnerCuda(
        @StdString String model_so_path) { super((Pointer)null); allocate(model_so_path); }
  private native void allocate(
        @StdString String model_so_path);

  public native @ByVal TensorVector run(@ByRef TensorVector inputs);

  public native @ByVal TensorVector run_with_cuda_stream(
        @ByRef TensorVector inputs,
        @ByVal CUDAStream cuda_stream);
}
