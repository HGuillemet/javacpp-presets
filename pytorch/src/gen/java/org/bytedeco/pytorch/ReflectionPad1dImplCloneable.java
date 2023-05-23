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

@Name("torch::nn::Cloneable<torch::nn::ReflectionPad1dImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ReflectionPad1dImplCloneable extends Module {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReflectionPad1dImplCloneable(Pointer p) { super(p); }
    @Override public Module asModule() { return asModule(this); }
    @Namespace public static native @SharedPtr @Name("SHARED_PTR_NAMESPACE::static_pointer_cast<torch::nn::Module, torch::nn::Cloneable<torch::nn::ReflectionPad1dImpl>>") Module asModule(@SharedPtr ReflectionPad1dImplCloneable pointer);


  /** {@code reset()} must perform initialization of all members with reference
   *  semantics, most importantly parameters, buffers and submodules. */
  public native void reset();

  /** Performs a recursive "deep copy" of the {@code Module}, such that all parameters
   *  and submodules in the cloned module are different from those in the
   *  original module. */
  public native @SharedPtr("torch::nn::Module") @ByVal Module clone(
        @Const @ByRef(nullValue = "c10::optional<torch::Device>(c10::nullopt)") DeviceOptional device);
  public native @SharedPtr("torch::nn::Module") @ByVal Module clone();
}
