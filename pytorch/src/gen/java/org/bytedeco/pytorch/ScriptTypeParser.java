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


/**
 * class ScriptTypeParser
 *
 * Parses expressions in our typed AST format (TreeView) into types and
 * typenames.
 */
@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ScriptTypeParser extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ScriptTypeParser(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ScriptTypeParser(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ScriptTypeParser position(long position) {
        return (ScriptTypeParser)super.position(position);
    }
    @Override public ScriptTypeParser getPointer(long i) {
        return new ScriptTypeParser((Pointer)this).offsetAddress(i);
    }

  public ScriptTypeParser() { super((Pointer)null); allocate(); }
  private native void allocate();
  public ScriptTypeParser(@SharedPtr("torch::jit::Resolver") @ByVal Resolver resolver) { super((Pointer)null); allocate(resolver); }
  private native void allocate(@SharedPtr("torch::jit::Resolver") @ByVal Resolver resolver);

  public native @ByVal Type.TypePtr parseTypeFromExpr(@Const @ByRef Expr expr);

  public native @ByVal @Cast("c10::optional<std::pair<c10::TypePtr,int32_t> >*") T_TypePtrLong_TOptional parseBroadcastList(
        @Const @ByRef Expr expr);

  public native @ByVal Type.TypePtr parseType(@StdString BytePointer str);
  public native @ByVal Type.TypePtr parseType(@StdString String str);

  public native @ByVal FunctionSchema parseSchemaFromDef(@Const @ByRef Def def, @Cast("bool") boolean skip_self);

  public native @ByVal IValue parseClassConstant(@Const @ByRef Assign assign);
}
