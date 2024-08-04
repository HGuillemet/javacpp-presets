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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


/** Options for {@code torch::nn::functional::gumbel_softmax}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::gumbel_softmax(logits, F::GumbelSoftmaxFuncOptions().hard(true).dim(-1));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GumbelSoftmaxFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GumbelSoftmaxFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GumbelSoftmaxFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GumbelSoftmaxFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GumbelSoftmaxFuncOptions position(long position) {
        return (GumbelSoftmaxFuncOptions)super.position(position);
    }
    @Override public GumbelSoftmaxFuncOptions getPointer(long i) {
        return new GumbelSoftmaxFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer tau();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer hard();
  public native @ByRef @NoException(true) IntPointer dim();
}
