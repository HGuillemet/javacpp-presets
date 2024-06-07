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


// Structure used to pack all the thread local boolean
// flags used by autograd
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutogradState extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutogradState(Pointer p) { super(p); }

  public static native @ByRef AutogradState get_tls_state();
  public static native void set_tls_state(@ByVal AutogradState state);

  public AutogradState(
        @Cast("bool") boolean grad_mode,
        @Cast("bool") boolean inference_mode,
        @Cast("bool") boolean fw_grad_mode,
        @Cast("bool") boolean multithreading_enabled) { super((Pointer)null); allocate(grad_mode, inference_mode, fw_grad_mode, multithreading_enabled); }
  private native void allocate(
        @Cast("bool") boolean grad_mode,
        @Cast("bool") boolean inference_mode,
        @Cast("bool") boolean fw_grad_mode,
        @Cast("bool") boolean multithreading_enabled);

  public native void set_grad_mode(@Cast("bool") boolean enabled);

  public native void set_fw_grad_mode(@Cast("bool") boolean enabled);

  public native void set_inference_mode(@Cast("bool") boolean enabled);

  public native void set_multithreading_enabled(@Cast("bool") boolean multithreading_enabled);

  public native void set_view_replay_enabled(@Cast("bool") boolean view_replay_enabled);

  public native @Cast("bool") boolean get_grad_mode();

  public native @Cast("bool") boolean get_fw_grad_mode();

  public native @Cast("bool") boolean get_inference_mode();

  public native @Cast("bool") boolean get_multithreading_enabled();

  public native @Cast("bool") boolean get_view_replay_enabled();
}
