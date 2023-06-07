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


@Name("torch::jit::Const") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstExpr extends Expr {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstExpr(Pointer p) { super(p); }

  public ConstExpr(@Const @ByRef TreeRef tree) { super((Pointer)null); allocate(tree); }
  private native void allocate(@Const @ByRef TreeRef tree);
  public native @Cast("bool") boolean isFloatingPoint();
  public native @Cast("bool") boolean isIntegral();
  public native @Cast("bool") boolean isComplex();
  public native @Cast("int64_t") long asIntegral();
  public native double asFloatingPoint();
  public native @ByVal DoubleComplex asComplex();
  public native @StdString BytePointer text();
  public static native @ByVal ConstExpr create(@Const @ByRef SourceRange range, @StdString BytePointer value);
  public static native @ByVal ConstExpr create(@Const @ByRef SourceRange range, @StdString String value);
}
