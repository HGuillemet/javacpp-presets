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


// RAII guard for "cudaStreamCaptureMode", a thread-local value
// that controls the error-checking strictness of a capture.
// #if !defined(USE_ROCM) || ROCM_VERSION >= 50300
@Namespace("c10::cuda") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class CUDAStreamCaptureModeGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAStreamCaptureModeGuard(Pointer p) { super(p); }

  public CUDAStreamCaptureModeGuard(@Cast("cudaStreamCaptureMode") int desired) { super((Pointer)null); allocate(desired); }
  private native void allocate(@Cast("cudaStreamCaptureMode") int desired);
}
