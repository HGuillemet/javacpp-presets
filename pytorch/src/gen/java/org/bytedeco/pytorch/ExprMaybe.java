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


@Name("torch::jit::Maybe<torch::jit::Expr>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExprMaybe extends TreeView {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExprMaybe(Pointer p) { super(p); }

  public ExprMaybe(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree);
  /* implicit */ public ExprMaybe(@Const @ByRef Expr tree) { super((Pointer)null); allocate(tree); }
private native void allocate(@Const @ByRef Expr tree);
  public native @Cast("bool") boolean present();
  public native @ByVal Expr get();
  
  public static native @ByVal ExprMaybe create(@Const @ByRef SourceRange range);
  public static native @ByVal ExprMaybe create(@Const @ByRef SourceRange range, @Const @ByRef Expr value);
}
