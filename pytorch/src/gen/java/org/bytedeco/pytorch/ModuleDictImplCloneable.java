// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

/** The {@code clone()} method in the base {@code Module} class does not have knowledge of
 *  the concrete runtime type of its subclasses. Therefore, {@code clone()} must
 *  either be called from within the subclass, or from a base class that has
 *  knowledge of the concrete type. {@code Cloneable} uses the CRTP to gain
 *  knowledge of the subclass' static type and provide an implementation of the
 *  {@code clone()} method. We do not want to use this pattern in the base class,
 *  because then storing a module would always require templatizing it. */
@Name("torch::nn::Cloneable<torch::nn::ModuleDictImpl>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ModuleDictImplCloneable extends Module {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModuleDictImplCloneable(Pointer p) { super(p); }


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
