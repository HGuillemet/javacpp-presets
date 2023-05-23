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

@Name("c10::SmallVectorTemplateBase<c10::intrusive_ptr<torch::jit::Tree> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TreeRefSmallVectorBase extends TreeRefSmallVectorCommon {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TreeRefSmallVectorBase(Pointer p) { super(p); }

  public native void push_back(@Const @ByRef TreeRef Elt);

  public native void pop_back();
}
