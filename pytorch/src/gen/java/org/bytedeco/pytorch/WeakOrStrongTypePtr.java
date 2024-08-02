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


// An Object will hold a non-owning Compilation Unit reference if it is a
// Constant in the graph and a Owning reference otherwise
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WeakOrStrongTypePtr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WeakOrStrongTypePtr(Pointer p) { super(p); }

  public WeakOrStrongTypePtr(@ByVal WeakTypePtr weak) { super((Pointer)null); allocate(weak); }
  private native void allocate(@ByVal WeakTypePtr weak);
  public WeakOrStrongTypePtr(@ByVal StrongTypePtr strong) { super((Pointer)null); allocate(strong); }
  private native void allocate(@ByVal StrongTypePtr strong);
  public WeakOrStrongTypePtr(@ByVal WeakOrStrongCompilationUnit cu, @ByVal Type.TypePtr type) { super((Pointer)null); allocate(cu, type); }
  private native void allocate(@ByVal WeakOrStrongCompilationUnit cu, @ByVal Type.TypePtr type);
  public native @ByVal WeakTypePtr asWeakTypePtr();

  public native @ByRef WeakOrStrongCompilationUnit cu_(); public native WeakOrStrongTypePtr cu_(WeakOrStrongCompilationUnit setter);
  public native @ByRef Type.TypePtr type_(); public native WeakOrStrongTypePtr type_(Type.TypePtr setter);

  public native @Cast("bool") boolean holds_strong_ref();

  public native @Cast("bool") boolean holds_empty_strong_ref();
}
