// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


@Namespace("torch::jit") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BuiltinFunction extends SugaredValue {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BuiltinFunction(Pointer p) { super(p); }

  public BuiltinFunction(@ByVal Symbol symbol, @ByVal NamedValueOptional self) { super((Pointer)null); allocate(symbol, self); }
  private native void allocate(@ByVal Symbol symbol, @ByVal NamedValueOptional self);

  // The symbol of the function (e.g. `aten::relu`).
  public native @ByRef Symbol symbol(); public native BuiltinFunction symbol(Symbol setter);

  // if this is method, then this is the self argument.
  public native @ByRef NamedValueOptional self(); public native BuiltinFunction self(NamedValueOptional setter);
  public native @StdString BytePointer kind();
  

  // try to create this builtin but if it doesn't exist or the self argument
  // cannot possibly match, then return nullptr. Use in situations where it is
  // not clear if it is a valid builtin
  public static native @SharedPtr BuiltinFunction tryCreate(
        @ByVal Symbol symbol,
        @ByVal NamedValueOptional self);
}
