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


/* Note [AutoDispatchBelowADInplaceOrView]
 * AutoDispatchBelowADInplaceOrView is equivalent to AutoNonVariableTypeMode
 * before we split inplace & view ops out of VariableType kernel.
 * Note this guard is used in VariableType kernels for functional ops
 * as well as ADInplaceOrView kernels for inplace/view ops to enforce the
 * Invariant:
 *   Once you are in VariableType/ADInplaceOrView kernel for an op,
 *   you never go back to a kernel on same dispatch key until
 *   you finish the current op.
 */
@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutoDispatchBelowADInplaceOrView extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutoDispatchBelowADInplaceOrView(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutoDispatchBelowADInplaceOrView(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutoDispatchBelowADInplaceOrView position(long position) {
        return (AutoDispatchBelowADInplaceOrView)super.position(position);
    }
    @Override public AutoDispatchBelowADInplaceOrView getPointer(long i) {
        return new AutoDispatchBelowADInplaceOrView((Pointer)this).offsetAddress(i);
    }

  public AutoDispatchBelowADInplaceOrView() { super((Pointer)null); allocate(); }
  private native void allocate();
  // disable Autograd & ADInplaceOrView dispatch keys
}
