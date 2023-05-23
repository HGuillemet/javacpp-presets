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


// Unfortunately, the definition of AutogradMeta lives in a separate
// compilation unit than TensorImpl (libtorch.so versus libc10.so)
// which means that we cannot construct an AutogradMeta from TensorImpl,
// not even from the cpp file.  So we have to indirect it through a factory
// function which will be initialized when we load libtorch.so.

@Namespace("c10::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutogradMetaFactory extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutogradMetaFactory(Pointer p) { super(p); }

  public native @UniquePtr AutogradMetaInterface make();
  // This method is the dumbest method.  But I don't have access
  // to Tensor (not TensorImpl) which is undefined in this header.
  public native @Const @ByRef Tensor undefined_tensor();
}
