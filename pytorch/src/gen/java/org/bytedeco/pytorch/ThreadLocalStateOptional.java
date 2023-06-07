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

@NoOffset @Name("c10::optional<at::ThreadLocalState>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ThreadLocalStateOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ThreadLocalStateOptional(Pointer p) { super(p); }
    public ThreadLocalStateOptional(ThreadLocalState value) { this(); put(value); }
    public ThreadLocalStateOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ThreadLocalStateOptional put(@ByRef ThreadLocalStateOptional x);

    public native boolean has_value();
    public native @Name("value") @ByRef ThreadLocalState get();
    @ValueSetter public native ThreadLocalStateOptional put(@ByRef ThreadLocalState value);
}

