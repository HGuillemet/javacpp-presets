// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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

@Name("torch::nn::functional::ConvFuncOptions<3>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv3dFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Conv3dFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Conv3dFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv3dFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Conv3dFuncOptions position(long position) {
        return (Conv3dFuncOptions)super.position(position);
    }
    @Override public Conv3dFuncOptions getPointer(long i) {
        return new Conv3dFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) Tensor bias();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer stride();
  public native @ByRef @NoException(true) conv_padding_t3 padding();
  public native @Cast("torch::ExpandingArray<3>*") @ByRef @NoException(true) LongPointer dilation();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer groups();
}
