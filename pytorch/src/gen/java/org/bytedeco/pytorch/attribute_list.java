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

@Name("torch::jit::slot_list_impl<torch::jit::detail::AttributePolicy>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class attribute_list extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public attribute_list(Pointer p) { super(p); }

  public native @ByVal attribute_iterator begin();
  public native @ByVal attribute_iterator end();
  public native @Cast("size_t") long size();

  public attribute_list(@ByVal JitModule module, @Cast("bool") boolean recurse, @Cast("bool") boolean return_module) { super((Pointer)null); allocate(module, recurse, return_module); }
  private native void allocate(@ByVal JitModule module, @Cast("bool") boolean recurse, @Cast("bool") boolean return_module);
}
