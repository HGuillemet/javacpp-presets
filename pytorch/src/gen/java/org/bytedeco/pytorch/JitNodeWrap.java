// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("torch::jit::Wrap<torch::jit::Node>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitNodeWrap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JitNodeWrap(Pointer p) { super(p); }

  public JitNodeWrap(JitNode p) { super((Pointer)null); allocate(p); }
  private native void allocate(JitNode p);
  public native void clear();
  public native JitNode elem(); public native JitNodeWrap elem(JitNode setter);
  public native PointerConsumer clear_cb(); public native JitNodeWrap clear_cb(PointerConsumer setter);
}
