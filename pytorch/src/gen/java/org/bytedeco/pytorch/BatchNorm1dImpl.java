// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ BatchNorm1d
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** Applies the BatchNorm1d function.
 *  See https://pytorch.org/docs/master/nn.html#torch.nn.BatchNorm1d to learn
 *  about the exact behavior of this module.
 * 
 *  See the documentation for {@code torch::nn::BatchNorm1dOptions} class to learn
 *  what constructor arguments are supported for this module.
 * 
 *  Example:
 *  <pre>{@code
 *  BatchNorm1d
 *  model(BatchNorm1dOptions(4).eps(0.5).momentum(0.1).affine(false).track_running_stats(true));
 *  }</pre> */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchNorm1dImpl extends BatchNorm1dImplBase {
    static { Loader.load(); }

  
    
      public BatchNorm1dImpl(@Const @ByRef BatchNormOptions options_) { super((Pointer)null); allocate(options_); }
      private native void allocate(@Const @ByRef BatchNormOptions options_);
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchNorm1dImpl(Pointer p) { super(p); }

}
