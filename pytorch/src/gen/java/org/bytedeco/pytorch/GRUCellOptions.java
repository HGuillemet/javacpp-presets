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


/** Options for the {@code GRUCell} module.
 * 
 *  Example:
 *  <pre>{@code
 *  GRUCell model(GRUCellOptions(20, 10).bias(false));
 *  }</pre> */
@Namespace("torch::nn") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GRUCellOptions extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GRUCellOptions(Pointer p) { super(p); }

  public GRUCellOptions(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size) { super((Pointer)null); allocate(input_size, hidden_size); }
  private native void allocate(@Cast("int64_t") long input_size, @Cast("int64_t") long hidden_size);
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer input_size();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer hidden_size();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer bias();
}
