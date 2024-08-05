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


// builtins operators and functions that call a method if it exists
// on a class type, like 'len(x)' and 'x + y'
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MagicMethod extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MagicMethod(Pointer p) { super(p); }

  public MagicMethod(@StdString BytePointer desugared_name, @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue base) { super((Pointer)null); allocate(desugared_name, base); }
  private native void allocate(@StdString BytePointer desugared_name, @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue base);
  public MagicMethod(@StdString String desugared_name, @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue base) { super((Pointer)null); allocate(desugared_name, base); }
  private native void allocate(@StdString String desugared_name, @SharedPtr("torch::jit::SugaredValue") @ByVal SugaredValue base);

  public native @StdString BytePointer kind();

  
}
