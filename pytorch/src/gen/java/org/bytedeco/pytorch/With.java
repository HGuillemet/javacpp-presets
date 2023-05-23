// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// With represents a with statement consisting of a list of with items and a
// body of statements.
@Namespace("torch::jit") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class With extends Stmt {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public With(Pointer p) { super(p); }

  public With(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);

  public native @ByVal WithItemList targets();

  public native @ByVal StmtList body();

  public static native @ByVal With create(
        @Const @ByRef SourceRange range,
        @Const @ByRef WithItemList targets,
        @Const @ByRef StmtList body);
}
