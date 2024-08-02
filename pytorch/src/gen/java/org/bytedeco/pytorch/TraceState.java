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


@Namespace("torch::dynamo::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TraceState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TraceState(Pointer p) { super(p); }

  public TraceState(
        @StdVector SymIntOptional ss,
        @Cast("size_t") long num_outputs) { super((Pointer)null); allocate(ss, num_outputs); }
  private native void allocate(
        @StdVector SymIntOptional ss,
        @Cast("size_t") long num_outputs);

  public native void debug_asserts();
  public native @ByVal SymIntOptional next_sym_size();

  public native @Cast("size_t") long sym_sizes_index(); public native TraceState sym_sizes_index(long setter);
  public native @StdVector SymIntOptional sym_sizes(); public native TraceState sym_sizes(SymIntOptional setter);
  public native @ByRef TensorVector outputs(); public native TraceState outputs(TensorVector setter);
}
