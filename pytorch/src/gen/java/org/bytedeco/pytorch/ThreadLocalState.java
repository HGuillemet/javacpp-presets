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


// Thread local state contains values that are preserved across
// thread boundaries (e.g. at::launch/JIT fork, autograd).
// Note at::parallel_for doesn't preserve TLS across thread boundaries.
@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ThreadLocalState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadLocalState(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ThreadLocalState(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ThreadLocalState position(long position) {
        return (ThreadLocalState)super.position(position);
    }
    @Override public ThreadLocalState getPointer(long i) {
        return new ThreadLocalState((Pointer)this).offsetAddress(i);
    }

  // Saves the thread local variables' values and
  // returns them as a ThreadLocalState
  public ThreadLocalState() { super((Pointer)null); allocate(); }
  private native void allocate();

  // set_grad_mode - force the value of the grad mode TLS in
  //  the current state object. This is used for example in the
  //  autograd engine.
  public native void set_grad_mode(@Cast("bool") boolean enabled);

  // set_multithreading_enabled - force the value of the multithreadinmaximum
  // threads TLS in
  //  the current state object. This is used for example in the
  //  autograd engine.
  public native void set_multithreading_enabled(@Cast("bool") boolean enabled);

  // Sets thread local variables in the current thread,
  // according to the thread boundary specified
  public static native void setThreadLocalState(@Const @ByRef ThreadLocalState state);
}
