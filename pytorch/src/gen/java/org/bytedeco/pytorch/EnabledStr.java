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

@Name("torch::detail::SelectiveStr<true>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class EnabledStr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public EnabledStr(Pointer p) { super(p); }

  public EnabledStr(@Cast("const char*") BytePointer name) { super((Pointer)null); allocate(name); }
  private native void allocate(@Cast("const char*") BytePointer name);
  public EnabledStr(String name) { super((Pointer)null); allocate(name); }
  private native void allocate(String name);
  public native @Name("operator const char*") @Cast("const char*") BytePointer asBytePointer();
}
