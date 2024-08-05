// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::variant<torch::enumtype::kZeros,torch::enumtype::kReflect,torch::enumtype::kReplicate,torch::enumtype::kCircular>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ConvPaddingMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvPaddingMode(Pointer p) { super(p); }
    public ConvPaddingMode(kZeros value) { this(); put(value); }
    public ConvPaddingMode(kReflect value) { this(); put(value); }
    public ConvPaddingMode(kReplicate value) { this(); put(value); }
    public ConvPaddingMode(kCircular value) { this(); put(value); }
    public ConvPaddingMode()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef ConvPaddingMode put(@ByRef ConvPaddingMode x);

    public @ByRef kZeros get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef kZeros get0(@ByRef ConvPaddingMode container);
    @ValueSetter public native ConvPaddingMode put(@ByRef kZeros value);
    public @ByRef kReflect get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef kReflect get1(@ByRef ConvPaddingMode container);
    @ValueSetter public native ConvPaddingMode put(@ByRef kReflect value);
    public @ByRef kReplicate get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef kReplicate get2(@ByRef ConvPaddingMode container);
    @ValueSetter public native ConvPaddingMode put(@ByRef kReplicate value);
    public @ByRef kCircular get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @ByRef kCircular get3(@ByRef ConvPaddingMode container);
    @ValueSetter public native ConvPaddingMode put(@ByRef kCircular value);
}

