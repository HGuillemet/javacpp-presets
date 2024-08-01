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


@Namespace("at::native") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class DropoutDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DropoutDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DropoutDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DropoutDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DropoutDescriptor position(long position) {
        return (DropoutDescriptor)super.position(position);
    }
    @Override public DropoutDescriptor getPointer(long i) {
        return new DropoutDescriptor((Pointer)this).offsetAddress(i);
    }

  public native @ByRef Tensor state(); public native DropoutDescriptor state(Tensor setter);

  // Initialize a dropout descriptor's RNG state.
  // WARNING: This function is very expensive, avoid calling this function!
  public native void initialize_rng(cudnnContext handle, float dropout, long seed, @Const @ByRef TensorOptions options);

  // Restore a dropout descriptor given a dropout probability and existing RNG state.
  public native void set(cudnnContext handle, float dropout, @ByVal Tensor state_);

  // Restore a dropout descriptor corresponding to no dropout
  public native void set_no_dropout(cudnnContext handle);
}
