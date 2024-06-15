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


@Name("torch::jit::List<torch::jit::Property>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PropertyList extends TreeView {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PropertyList(Pointer p) { super(p); }


  public PropertyList(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree);
  public native @ByVal @Cast("torch::jit::List<torch::jit::Property>::iterator*") PropertyListIterator begin();
  public native @ByVal @Cast("torch::jit::List<torch::jit::Property>::iterator*") PropertyListIterator end();
  public native @Cast("bool") boolean empty();
  public native @ByVal @Name("operator []") Property get(@Cast("size_t") long i);
  
  public static native @ByVal PropertyList create(@Const @ByRef SourceRange range, @Const @ByRef PropertyVector subtrees);
  public static native @ByVal PropertyList unsafeCreate(@Const @ByRef SourceRange range, @Cast("torch::jit::TreeList*") @ByRef(true) SymDimVector subtrees);
  public native @Cast("size_t") long size();
}
