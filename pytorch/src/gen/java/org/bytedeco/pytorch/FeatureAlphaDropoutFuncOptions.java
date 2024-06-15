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


/** Options for {@code torch::nn::functional::feature_alpha_dropout}.
 * 
 *  Example:
 *  <pre>{@code
 *  namespace F = torch::nn::functional;
 *  F::feature_alpha_dropout(input,
 *  F::FeatureAlphaDropoutFuncOptions().p(0.5).training(false));
 *  }</pre> */
@Namespace("torch::nn::functional") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FeatureAlphaDropoutFuncOptions extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public FeatureAlphaDropoutFuncOptions() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FeatureAlphaDropoutFuncOptions(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FeatureAlphaDropoutFuncOptions(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public FeatureAlphaDropoutFuncOptions position(long position) {
        return (FeatureAlphaDropoutFuncOptions)super.position(position);
    }
    @Override public FeatureAlphaDropoutFuncOptions getPointer(long i) {
        return new FeatureAlphaDropoutFuncOptions((Pointer)this).offsetAddress(i);
    }

  public native @ByRef @NoException(true) DoublePointer p();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer training();
  public native @Cast("bool*") @ByRef @NoException(true) BoolPointer inplace();
}
