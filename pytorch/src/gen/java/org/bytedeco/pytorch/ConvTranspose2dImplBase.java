// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::nn::ConvTransposeNdImpl<2,torch::nn::ConvTranspose2dImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvTranspose2dImplBase extends ConvTranspose2dImplBaseBase {
    static { Loader.load(); }

  
    public ConvTranspose2dImplBase(@ByVal DetailConv2dOptions options_) { super((Pointer)null); allocate(options_); }
    private native void allocate(@ByVal DetailConv2dOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvTranspose2dImplBase(Pointer p) { super(p); }


  /** Pretty prints the {@code ConvTranspose{1,2,3}d} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);
}
