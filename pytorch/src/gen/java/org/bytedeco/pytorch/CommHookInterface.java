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


// Base class of both `PythonCommHook` and `CppCommHook`.
// Requires implementing 1) `runHook` method that communicates gradients
// asynchronously, and 2) `parseHookResult` method that converts the hook
// result into a tensor.
@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CommHookInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CommHookInterface(Pointer p) { super(p); }


  // Passes the input grad bucket to the registered communication hook.
  // Once the tensor in the bucket are ready, kicks off the hook asynchronously
  // and returns a future that holds the communication results.
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future runHook(
        @ByRef GradBucket bucket);

  // Returns the resulting tensor once the communication hook result is
  // ready. The resulting tensor will then be copied to the grads of
  // individual parameters.
  public native @ByVal Tensor parseHookResult(@Const @ByRef IValue result);
}
