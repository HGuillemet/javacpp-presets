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


@Namespace("c10::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PyInterpreter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PyInterpreter(Pointer p) { super(p); }

  public native @Const PyInterpreterVTable vtable_(); public native PyInterpreter vtable_(PyInterpreterVTable setter);

  public PyInterpreter(@Const PyInterpreterVTable vtable) { super((Pointer)null); allocate(vtable); }
  private native void allocate(@Const PyInterpreterVTable vtable);

  public native @Const @ByRef @Name("operator *") @NoException(true) PyInterpreterVTable multiply();
  public native @Const @Name("operator ->") @NoException(true) PyInterpreterVTable access();

  // Disarm this PyInterpreter, making all of its methods noops.
  // The vtable pointer is not an atomic at the moment, which means
  // a disarm() invocation that is concurrent with active destructors
  // is not thread safe and will trigger TSAN.  My hope is that this
  // situations doesn't ever actually happen; tensor destruction should
  // quiesce when a dlclose happens, and any long lived tensors whose
  // destructors would be disarmed here only begin the destruction process
  // on process shutdown (long after the dlclose has occurred).
  public native @NoException(true) void disarm();
}
