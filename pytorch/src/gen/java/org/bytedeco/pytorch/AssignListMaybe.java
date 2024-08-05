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


@Name("torch::jit::Maybe<torch::jit::List<torch::jit::Assign> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AssignListMaybe extends TreeView {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AssignListMaybe(Pointer p) { super(p); }

  public AssignListMaybe(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree);
  /* implicit */ public AssignListMaybe(@Const @ByRef AssignList tree) { super((Pointer)null); allocate(tree); }
private native void allocate(@Const @ByRef AssignList tree);
  public native @Cast("bool") boolean present();
  public native @ByVal AssignList get();
  
  public static native @ByVal AssignListMaybe create(@Const @ByRef SourceRange range);
  public static native @ByVal AssignListMaybe create(@Const @ByRef SourceRange range, @Const @ByRef AssignList value);
}
