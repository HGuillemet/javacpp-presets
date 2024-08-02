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
import static org.bytedeco.javacpp.chrono.Chrono.*;
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
public class RNNDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RNNDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RNNDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RNNDescriptor position(long position) {
        return (RNNDescriptor)super.position(position);
    }
    @Override public RNNDescriptor getPointer(long i) {
        return new RNNDescriptor((Pointer)this).offsetAddress(i);
    }

  
  public native void set(cudnnContext handle,
         int input_size,
         @Cast("bool") boolean packed,
         int hidden_size, int proj_size, int num_layers, @ByRef(true) DropoutDescriptor dropout_desc,
             @Cast("cudnnRNNInputMode_t") int input_mode, @Cast("cudnnDirectionMode_t") int bidirectional,
             @Cast("cudnnRNNMode_t") int mode, @Cast("cudnnDataType_t") int datatype, @Cast("cudnnDataType_t") int input_type, @Cast("cudnnRNNAlgo_t") int algo, @Cast("bool") boolean allow_tf32);
}
