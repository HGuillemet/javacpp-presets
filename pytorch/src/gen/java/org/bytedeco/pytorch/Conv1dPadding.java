// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@NoOffset @Name("std::variant<torch::ExpandingArray<1>,torch::enumtype::kValid,torch::enumtype::kSame>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Conv1dPadding extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Conv1dPadding(Pointer p) { super(p); }
    public @Cast("torch::ExpandingArray<1>*") @ByRef LongPointer get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @Cast("torch::ExpandingArray<1>*") @ByRef LongPointer get0(@ByRef Conv1dPadding container);
    @ValueSetter public native Conv1dPadding put(@Cast("torch::ExpandingArray<1>*") @ByRef LongPointer value);
    public @ByRef kValid get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native @ByRef kValid get1(@ByRef Conv1dPadding container);
    @ValueSetter public native Conv1dPadding put(@ByRef kValid value);
    public @ByRef kSame get2() { return get2(this); }
    @Namespace @Name("std::get<2>") public static native @ByRef kSame get2(@ByRef Conv1dPadding container);
    @ValueSetter public native Conv1dPadding put(@ByRef kSame value);
}

