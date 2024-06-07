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


@Namespace("at::native") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class ActivationDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ActivationDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ActivationDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ActivationDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ActivationDescriptor position(long position) {
        return (ActivationDescriptor)super.position(position);
    }
    @Override public ActivationDescriptor getPointer(long i) {
        return new ActivationDescriptor((Pointer)this).offsetAddress(i);
    }

  public native void set(@Cast("cudnnActivationMode_t") int mode);
}
