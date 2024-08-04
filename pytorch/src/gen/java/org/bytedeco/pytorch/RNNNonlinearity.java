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

@NoOffset @Name("std::variant<torch::enumtype::kTanh,torch::enumtype::kReLU>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RNNNonlinearity extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RNNNonlinearity(Pointer p) { super(p); }
    public RNNNonlinearity(kTanh value) { this(); put(value); }
    public RNNNonlinearity(kReLU value) { this(); put(value); }
    public RNNNonlinearity()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef RNNNonlinearity put(@ByRef RNNNonlinearity x);

    public @ByRef kTanh get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef kTanh get0(@ByRef RNNNonlinearity container);
    @ValueSetter public native RNNNonlinearity put(@ByRef kTanh value);
    public @ByRef kReLU get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef kReLU get1(@ByRef RNNNonlinearity container);
    @ValueSetter public native RNNNonlinearity put(@ByRef kReLU value);
}

