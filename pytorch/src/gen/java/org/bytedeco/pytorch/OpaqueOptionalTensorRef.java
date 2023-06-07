// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


// Storage for a non-owning Tensor, without needing to include Tensor.h
@Namespace("at::internal") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OpaqueOptionalTensorRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpaqueOptionalTensorRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpaqueOptionalTensorRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpaqueOptionalTensorRef position(long position) {
        return (OpaqueOptionalTensorRef)super.position(position);
    }
    @Override public OpaqueOptionalTensorRef getPointer(long i) {
        return new OpaqueOptionalTensorRef((Pointer)this).offsetAddress(i);
    }

  public OpaqueOptionalTensorRef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native OptionalTensorRef get();

  public native @ByRef @Name("operator *") OptionalTensorRef multiply();
  public native @Name("operator ->") OptionalTensorRef access();

  public native @Const @ByRef Tensor getTensor();
}
