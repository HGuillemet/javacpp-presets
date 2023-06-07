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

@NoOffset @Name("c10::optional<torch::jit::ModuleInstanceInfo>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ModuleInstanceInfoOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModuleInstanceInfoOptional(Pointer p) { super(p); }
    public ModuleInstanceInfoOptional(ModuleInstanceInfo value) { this(); put(value); }
    public ModuleInstanceInfoOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ModuleInstanceInfoOptional put(@ByRef ModuleInstanceInfoOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef ModuleInstanceInfo get();
    @ValueSetter public native ModuleInstanceInfoOptional put(@ByRef ModuleInstanceInfo value);
}

