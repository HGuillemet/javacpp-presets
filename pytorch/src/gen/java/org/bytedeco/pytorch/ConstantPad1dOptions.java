// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// ============================================================================

/** Options for a {@code D}-dimensional ConstantPad module. */
@Name("torch::nn::ConstantPadOptions<1>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantPad1dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantPad1dOptions(Pointer p) { super(p); }

  public ConstantPad1dOptions(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding, double value) { super((Pointer)null); allocate(padding, value); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<1*2>*") LongPointer padding, double value);
  public native @Cast("torch::ExpandingArray<1*2>*") @ByRef @NoException(true) LongPointer padding();
  public native @ByRef @NoException(true) DoublePointer value();
}
