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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// This is a wrapper to allow invalidating the Python object
// safely when the C++ object for a Node/Value/Block is deleted
// like much of graph, it isn't safe for different threads to
// access the same graph
@Name("torch::jit::Wrap<torch::jit::Block>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BlockWrap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BlockWrap(Pointer p) { super(p); }

  public BlockWrap(Block p) { super((Pointer)null); allocate(p); }
  private native void allocate(Block p);
  public native void clear();
  public native Block elem(); public native BlockWrap elem(Block setter);
  public native PointerConsumer clear_cb(); public native BlockWrap clear_cb(PointerConsumer setter);
}
