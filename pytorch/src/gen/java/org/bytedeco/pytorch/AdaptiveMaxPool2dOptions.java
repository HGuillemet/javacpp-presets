// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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

@Name("torch::nn::AdaptiveMaxPoolOptions<torch::ExpandingArrayWithOptionalElem<2> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AdaptiveMaxPool2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AdaptiveMaxPool2dOptions(Pointer p) { super(p); }

  public AdaptiveMaxPool2dOptions(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongOptional output_size) { super((Pointer)null); allocate(output_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArrayWithOptionalElem<2>*") LongOptional output_size);
  public native @Cast("torch::ExpandingArrayWithOptionalElem<2>*") @ByRef @NoException(true) LongOptional output_size();
}
