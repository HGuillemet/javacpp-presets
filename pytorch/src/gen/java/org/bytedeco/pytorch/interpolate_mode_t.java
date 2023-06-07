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

@NoOffset @Name("c10::variant<torch::enumtype::kNearest,torch::enumtype::kLinear,torch::enumtype::kBilinear,torch::enumtype::kBicubic,torch::enumtype::kTrilinear,torch::enumtype::kArea,torch::enumtype::kNearestExact>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class interpolate_mode_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public interpolate_mode_t(Pointer p) { super(p); }
    public interpolate_mode_t(kNearest value) { this(); put(value); }
    public interpolate_mode_t(kLinear value) { this(); put(value); }
    public interpolate_mode_t(kBilinear value) { this(); put(value); }
    public interpolate_mode_t(kBicubic value) { this(); put(value); }
    public interpolate_mode_t(kTrilinear value) { this(); put(value); }
    public interpolate_mode_t(kArea value) { this(); put(value); }
    public interpolate_mode_t(kNearestExact value) { this(); put(value); }
    public interpolate_mode_t()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef interpolate_mode_t put(@ByRef interpolate_mode_t x);

    public @ByRef kNearest get0() { return get0(this); }
    @Namespace @Name("c10::get<0>") public static native @ByRef kNearest get0(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kNearest value);
    public @ByRef kLinear get1() { return get1(this); }
    @Namespace @Name("c10::get<1>") public static native @ByRef kLinear get1(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kLinear value);
    public @ByRef kBilinear get2() { return get2(this); }
    @Namespace @Name("c10::get<2>") public static native @ByRef kBilinear get2(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kBilinear value);
    public @ByRef kBicubic get3() { return get3(this); }
    @Namespace @Name("c10::get<3>") public static native @ByRef kBicubic get3(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kBicubic value);
    public @ByRef kTrilinear get4() { return get4(this); }
    @Namespace @Name("c10::get<4>") public static native @ByRef kTrilinear get4(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kTrilinear value);
    public @ByRef kArea get5() { return get5(this); }
    @Namespace @Name("c10::get<5>") public static native @ByRef kArea get5(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kArea value);
    public @ByRef kNearestExact get6() { return get6(this); }
    @Namespace @Name("c10::get<6>") public static native @ByRef kNearestExact get6(@ByRef interpolate_mode_t container);
    @ValueSetter public native interpolate_mode_t put(@ByRef kNearestExact value);
}

