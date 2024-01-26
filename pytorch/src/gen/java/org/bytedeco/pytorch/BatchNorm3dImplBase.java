// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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

@Name("torch::nn::BatchNormImplBase<3,torch::nn::BatchNorm3dImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchNorm3dImplBase extends BatchNorm3dImplBaseBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNorm3dImplBase(Pointer p) { super(p); }
    /** Downcast constructor. */
    public BatchNorm3dImplBase(Module pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @SharedPtr @Name("SHARED_PTR_NAMESPACE::dynamic_pointer_cast<torch::nn::BatchNormImplBase<3,torch::nn::BatchNorm3dImpl>, torch::nn::Module>") void allocate(@SharedPtr Module pointer);


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code BatchNorm{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
