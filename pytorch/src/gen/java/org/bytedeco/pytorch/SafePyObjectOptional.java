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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::optional<std::shared_ptr<c10::SafePyObject> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SafePyObjectOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SafePyObjectOptional(Pointer p) { super(p); }
    public SafePyObjectOptional(SafePyObject value) { this(); put(value); }
    public SafePyObjectOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef SafePyObjectOptional put(@ByRef SafePyObjectOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @SharedPtr("c10::SafePyObject") SafePyObject get();
    @ValueSetter public native SafePyObjectOptional put(@SharedPtr("c10::SafePyObject") SafePyObject value);
}

