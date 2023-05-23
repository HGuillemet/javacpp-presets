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


// A RAII, thread local (!) guard that enables or disables forward grad mode
// upon construction, and sets it back to the original value upon destruction.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutoFwGradMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutoFwGradMode(Pointer p) { super(p); }

  public AutoFwGradMode(@Cast("bool") boolean enabled) { super((Pointer)null); allocate(enabled); }
  private native void allocate(@Cast("bool") boolean enabled);
  public native @Cast("bool") boolean prev_mode(); public native AutoFwGradMode prev_mode(boolean setter);
}
