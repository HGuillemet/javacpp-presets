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
public class LocalDispatchKeySet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LocalDispatchKeySet(Pointer p) { super(p); }

  /* implicit */ public LocalDispatchKeySet(@ByVal PODLocalDispatchKeySet x) { super((Pointer)null); allocate(x); }
private native void allocate(@ByVal PODLocalDispatchKeySet x);
  public native @ByRef DispatchKeySet included_(); public native LocalDispatchKeySet included_(DispatchKeySet setter);
  public native @ByRef DispatchKeySet excluded_(); public native LocalDispatchKeySet excluded_(DispatchKeySet setter);
}
