// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.cuda.cudart.*;
import org.bytedeco.cuda.cusparse.*;
import org.bytedeco.cuda.cublas.*;
import org.bytedeco.cuda.cusolver.*;
import org.bytedeco.cuda.cudnn.*;
import org.bytedeco.cuda.nccl.*;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.cuda.functions.*;
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

import static org.bytedeco.pytorch.global.torch_cuda.*;


/** A variant of StreamGuard that is specialized for CUDA.  See CUDAGuard
 *  for when you can use this. */
@Namespace("c10::cuda") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class CUDAStreamGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAStreamGuard(Pointer p) { super(p); }

  /** No default constructor, see Note [Omitted default constructor from RAII] */
  

  /** Set the current CUDA device to the device associated with the passed
   *  stream, and set the current CUDA stream on that device to the passed
   *  stream. Errors if the Stream is not a CUDA stream. */
  public CUDAStreamGuard(@ByVal Stream stream) { super((Pointer)null); allocate(stream); }
  private native void allocate(@ByVal Stream stream);

  /** Copy is disallowed */
  
  

  /** Move is disallowed, as CUDAStreamGuard does not have an uninitialized
   *  state, which is required for moves on types with nontrivial destructors. */
  
  

  /** Resets the currently set stream to the original stream and
   *  the currently set device to the original device.  Then,
   *  set the current device to the device associated with the passed stream,
   *  and set the current stream on that device to the passed stream.
   *  Errors if the stream passed is not a CUDA stream.
   * 
   *  NOTE: this implementation may skip some stream/device setting if
   *  it can prove that it is unnecessary.
   * 
   *  WARNING: reset_stream does NOT preserve previously set streams on
   *  different devices.  If you need to set streams on multiple devices
   *  on CUDA, use CUDAMultiStreamGuard instead. */
  public native void reset_stream(@ByVal Stream stream);

  /** Returns the CUDA stream that was set at the time the guard was
   *  constructed. */
  public native @ByVal CUDAStream original_stream();

  /** Returns the most recent CUDA stream that was set using this device guard,
   *  either from construction, or via set_stream. */
  public native @ByVal CUDAStream current_stream();

  /** Returns the most recent CUDA device that was set using this device guard,
   *  either from construction, or via set_device/reset_device/set_index. */
  public native @ByVal Device current_device();

  /** Returns the CUDA device that was set at the most recent reset_stream(),
   *  or otherwise the device at construction time. */
  public native @ByVal Device original_device();
}
