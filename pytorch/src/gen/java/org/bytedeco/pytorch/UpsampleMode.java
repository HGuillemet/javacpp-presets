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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::variant<torch::enumtype::kNearest,torch::enumtype::kLinear,torch::enumtype::kBilinear,torch::enumtype::kBicubic,torch::enumtype::kTrilinear>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class UpsampleMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public UpsampleMode(Pointer p) { super(p); }
    public UpsampleMode(kNearest value) { this(); put(value); }
    public UpsampleMode(kLinear value) { this(); put(value); }
    public UpsampleMode(kBilinear value) { this(); put(value); }
    public UpsampleMode(kBicubic value) { this(); put(value); }
    public UpsampleMode(kTrilinear value) { this(); put(value); }
    public UpsampleMode()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef UpsampleMode put(@ByRef UpsampleMode x);

    public @ByRef kNearest get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef kNearest get0(@ByRef UpsampleMode container);
    @ValueSetter public native UpsampleMode put(@ByRef kNearest value);
    public @ByRef kLinear get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef kLinear get1(@ByRef UpsampleMode container);
    @ValueSetter public native UpsampleMode put(@ByRef kLinear value);
    public @ByRef kBilinear get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef kBilinear get2(@ByRef UpsampleMode container);
    @ValueSetter public native UpsampleMode put(@ByRef kBilinear value);
    public @ByRef kBicubic get3() { return get3(this); }
    @Namespace @Name("std::get<3>") public static native @ByRef kBicubic get3(@ByRef UpsampleMode container);
    @ValueSetter public native UpsampleMode put(@ByRef kBicubic value);
    public @ByRef kTrilinear get4() { return get4(this); }
    @Namespace @Name("std::get<4>") public static native @ByRef kTrilinear get4(@ByRef UpsampleMode container);
    @ValueSetter public native UpsampleMode put(@ByRef kTrilinear value);
}

