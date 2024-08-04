// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
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
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;
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


@Namespace("at::native") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class ConvolutionDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ConvolutionDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConvolutionDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvolutionDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ConvolutionDescriptor position(long position) {
        return (ConvolutionDescriptor)super.position(position);
    }
    @Override public ConvolutionDescriptor getPointer(long i) {
        return new ConvolutionDescriptor((Pointer)this).offsetAddress(i);
    }

  public native void set(@Cast("cudnnDataType_t") int dataType, int dim, IntPointer pad, IntPointer stride, IntPointer upscale, int groups, @Cast("bool") boolean allow_tf32);
  public native void set(@Cast("cudnnDataType_t") int dataType, int dim, IntBuffer pad, IntBuffer stride, IntBuffer upscale, int groups, @Cast("bool") boolean allow_tf32);
  public native void set(@Cast("cudnnDataType_t") int dataType, int dim, int[] pad, int[] stride, int[] upscale, int groups, @Cast("bool") boolean allow_tf32);
}
