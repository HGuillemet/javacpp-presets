// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SimpleSelf extends Self {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleSelf(Pointer p) { super(p); }

  public SimpleSelf(@SharedPtr("c10::ClassType") @ByVal ClassType classType) { super((Pointer)null); allocate(classType); }
  private native void allocate(@SharedPtr("c10::ClassType") @ByVal ClassType classType);
  public native @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue makeSugared(Value v);
  public native @SharedPtr("c10::ClassType") @ByVal ClassType getClassType();
}
