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


/** Options for {@code torch::nn::functional::normalize}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::normalize(input, F::NormalizeFuncOptions().p(1).dim(-1));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class NormalizeFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NormalizeFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NormalizeFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NormalizeFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NormalizeFuncOptions position(long position) {
        return (NormalizeFuncOptions)super.position(position);
    }
    @Override public NormalizeFuncOptions getPointer(long i) {
        return new NormalizeFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer p();
  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer dim();
  public native @ByRef @NoException(true) DoublePointer eps();
  public native @ByRef @NoException(true) TensorOptional out();
}
