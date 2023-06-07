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


@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutogradMetaInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutogradMetaInterface(Pointer p) { super(p); }

  public native void set_requires_grad(
        @Cast("bool") boolean requires_grad,
        TensorImpl self_impl);
  public native @Cast("bool") boolean requires_grad();
  public native @ByRef Tensor mutable_grad();
  public native @Const @ByRef Tensor grad();
  public native @Const @ByRef Tensor fw_grad(@Cast("uint64_t") long level, @Const @ByRef TensorBase self);
  public native void set_fw_grad(
        @Const @ByRef TensorBase new_grad,
        @Const @ByRef TensorBase self,
        @Cast("uint64_t") long level,
        @Cast("bool") boolean is_inplace_op);
}
