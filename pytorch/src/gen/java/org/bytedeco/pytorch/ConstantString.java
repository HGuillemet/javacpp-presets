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


// string
@Namespace("c10::ivalue") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConstantString extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConstantString(Pointer p) { super(p); }

  public ConstantString(@StdString BytePointer str) { super((Pointer)null); allocate(str); }
  @IntrusivePtr @Name("c10::make_intrusive<c10::ivalue::ConstantString>") private native void allocate(@StdString BytePointer str);
  public ConstantString(@StdString String str) { super((Pointer)null); allocate(str); }
  @IntrusivePtr @Name("c10::make_intrusive<c10::ivalue::ConstantString>") private native void allocate(@StdString String str);
  public static native @IntrusivePtr("c10::ivalue::ConstantString") @Cast({"", "c10::intrusive_ptr<c10::ivalue::ConstantString>&"}) ConstantString create(@StdString BytePointer str_);
  public static native @IntrusivePtr("c10::ivalue::ConstantString") @Cast({"", "c10::intrusive_ptr<c10::ivalue::ConstantString>&"}) ConstantString create(@StdString String str_);

  public native @StdString BytePointer string();
  public native @StringView BytePointer string_view();

  public native @Const @ByRef @Name("operator const std::string&") @StdString @Override String toString();
  
}
