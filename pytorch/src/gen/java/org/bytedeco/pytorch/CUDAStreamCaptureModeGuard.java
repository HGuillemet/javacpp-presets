// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// RAII guard for "cudaStreamCaptureMode", a thread-local value
// that controls the error-checking strictness of a capture.
// #if !defined(USE_ROCM) || ROCM_VERSION >= 50300
@Namespace("c10::cuda") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CUDAStreamCaptureModeGuard extends Pointer {
    static { Loader.load(); }

  public CUDAStreamCaptureModeGuard(@ByVal @Cast("cudaStreamCaptureMode*") Pointer desired) { super((Pointer)null); allocate(desired); }
  private native void allocate(@ByVal @Cast("cudaStreamCaptureMode*") Pointer desired);
}
