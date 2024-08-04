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


// A RAII, thread local (!) guard that will disable dispatch to variable
// handler.
//
// NOTE [ Treating Variables as non-Variables in type dispatch ]
//
// What exactly does AutoDispatchBelowAutograd do?  The short answer is, it causes
// dispatches on ATen functions to go to the non-variable implementation,
// bypassing autograd handling (and also profiling and tracing).
//
// To understand why this guard exists, it's helpful to understand the history
// behind how Variable was implemented.  Previously, Variables were implemented
// as a wrapper on Tensors; so the act of processing a Variable involved
// unwrapping the underlying Tensor, and then calling the underlying base
// operation on /that/ operation
//
// However, after the Variable/Tensor merge, there is no concept of unwrapping
// a tensor anymore.  If you just call the operation on the same variable
// again inside your VariableType handler, you'll dispatch back to
// VariableType, which is not what we want.
//
// The solution to the above problem is to add `at::AutoDispatchBelowAutograd`, which
// when enabled will cause `legacyTensorType()` and `getType()` to always return
// non-Variable type, even if the tensor being called on is a variable.

/* Note [AutoDispatchBelowAutograd]
 * AutoDispatchBelowAutograd is **INTERNAL ONLY** that it should be used
 * for kernel implementations and customized C++ kernels.
 * If you are looking for a guard to run workload in inference mode, please use
 * c10::InferenceMode RAII which is user facing API.
 * In the past AutoDispatchBelowAutograd(or its old version AutoNonVariableTypeMode)
 * was used in the user code for inference-only workload, this was under risk of
 * producing wrong results silently in some edge cases. For example:
 * ```
 *  torch::Tensor s = torch::ones({1, 2, 3}).set_requires_grad(true);
 *  torch::Tensor out = s * s;
 *  {
 *    at::AutoDispatchBelowAutograd guard;
 *    s.add_(1);  // Skips version bump on `s`.
 *  }
 *  // WRONG GRADIENT! s.grad() are now computed using `s` value after the
 *  // inplace update.
 *  out.backward(torch::ones_like(out));
 * ```
 * Users should use `c10::InferenceMode` here so that it'll properly throw an
 * error saying "one of the variables needed for gradient computation has be modified."
 */
@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutoDispatchBelowAutograd extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutoDispatchBelowAutograd(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutoDispatchBelowAutograd(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutoDispatchBelowAutograd position(long position) {
        return (AutoDispatchBelowAutograd)super.position(position);
    }
    @Override public AutoDispatchBelowAutograd getPointer(long i) {
        return new AutoDispatchBelowAutograd((Pointer)this).offsetAddress(i);
    }

  public AutoDispatchBelowAutograd() { super((Pointer)null); allocate(); }
  private native void allocate();

  // disable all autograd dispatch keys
}
