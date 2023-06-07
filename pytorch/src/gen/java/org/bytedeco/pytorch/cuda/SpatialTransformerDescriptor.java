// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


@Namespace("at::native") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class SpatialTransformerDescriptor extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SpatialTransformerDescriptor() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SpatialTransformerDescriptor(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SpatialTransformerDescriptor(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public SpatialTransformerDescriptor position(long position) {
        return (SpatialTransformerDescriptor)super.position(position);
    }
    @Override public SpatialTransformerDescriptor getPointer(long i) {
        return new SpatialTransformerDescriptor((Pointer)this).offsetAddress(i);
    }

  public native void set(@Cast("cudnnDataType_t") int dataType, int dim, IntPointer size);
  public native void set(@Cast("cudnnDataType_t") int dataType, int dim, IntBuffer size);
  public native void set(@Cast("cudnnDataType_t") int dataType, int dim, int[] size);
}
