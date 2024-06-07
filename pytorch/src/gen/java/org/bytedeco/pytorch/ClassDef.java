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


@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ClassDef extends TreeView {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ClassDef(Pointer p) { super(p); }

  public ClassDef(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@IntrusivePtr("torch::jit::Tree") @Cast({"", "c10::intrusive_ptr<torch::jit::Tree>&"}) Tree tree);
  public native @ByVal ClassDef withName(@StdString BytePointer new_name);
  public native @ByVal ClassDef withName(@StdString String new_name);
  public native @ByVal Ident name();
  public native @ByVal ExprMaybe superclass();
  public native @ByVal StmtList body();
  public native @ByVal PropertyListMaybe properties();
  public native @ByVal AssignListMaybe assigns();
  
  
}
