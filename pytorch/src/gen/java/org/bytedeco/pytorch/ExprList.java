// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("torch::jit::List<torch::jit::Expr>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExprList extends TreeView {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExprList(Pointer p) { super(p); }


  public ExprList(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  public native @ByVal @Cast("torch::jit::List<torch::jit::Expr>::iterator*") ExprListIterator begin();
  public native @ByVal @Cast("torch::jit::List<torch::jit::Expr>::iterator*") ExprListIterator end();
  public native @Cast("bool") boolean empty();
  public native @ByVal @Name("operator []") Expr get(@Cast("size_t") long i);
  
  public static native @ByVal ExprList create(@Const @ByRef SourceRange range, @StdVector Expr subtrees);
  public static native @ByVal ExprList unsafeCreate(@Const @ByRef SourceRange range, @Cast("torch::jit::TreeList*") @ByRef(true) SymDimVector subtrees);
  public native @Cast("size_t") long size();
}
