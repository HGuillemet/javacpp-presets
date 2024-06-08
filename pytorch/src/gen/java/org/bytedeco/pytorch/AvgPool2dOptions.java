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

@Name("torch::nn::AvgPoolOptions<2>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AvgPool2dOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AvgPool2dOptions(Pointer p) { super(p); }

  public AvgPool2dOptions(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size) { super((Pointer)null); allocate(kernel_size); }
  private native void allocate(@ByVal @Cast("torch::ExpandingArray<2>*") LongPointer kernel_size);
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer kernel_size();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer stride();
  public native @Cast("torch::ExpandingArray<2>*") @ByRef @NoException(true) LongPointer padding();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer ceil_mode();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer count_include_pad();
  public native @ByRef @NoException(true) LongOptional divisor_override();
}
