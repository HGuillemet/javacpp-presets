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

@NoOffset @Name("c10::optional<c10::intrusive_ptr<c10d::Backend> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DistributedBackendOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DistributedBackendOptional(Pointer p) { super(p); }
    public DistributedBackendOptional(@Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend value) { this(); put(value); }
    public DistributedBackendOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef DistributedBackendOptional put(@ByRef DistributedBackendOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend get();
    @ValueSetter public native DistributedBackendOptional put(@IntrusivePtr("c10d::Backend") @Cast({"", "c10::intrusive_ptr<c10d::Backend>&"}) DistributedBackend value);
}

