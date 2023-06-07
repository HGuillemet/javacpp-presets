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


// [Constant Object Weak CompilationUnit Reference]
// A non owning pointer to a type. When a class get inserted as a constant
// into a graph, if we used a strong pointer we would have a circular reference
// from Object -> CompilationUnit and CompilationUnit -> Graph (which owns the
// Constant Object)
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WeakTypePtr extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WeakTypePtr(Pointer p) { super(p); }

  public native @ByRef Type.TypePtr type_(); public native WeakTypePtr type_(Type.TypePtr setter);
}
