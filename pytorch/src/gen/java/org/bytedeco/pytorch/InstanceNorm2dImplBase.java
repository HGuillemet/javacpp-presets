// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::nn::InstanceNormImpl<2,torch::nn::InstanceNorm2dImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class InstanceNorm2dImplBase extends InstanceNorm2dImplBaseBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public InstanceNorm2dImplBase(Pointer p) { super(p); }


  public native @ByVal Tensor forward(@Const @ByRef Tensor input);

  /** Pretty prints the {@code InstanceNorm{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
