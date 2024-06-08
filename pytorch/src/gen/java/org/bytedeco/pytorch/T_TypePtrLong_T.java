// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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

@NoOffset @Name("std::tuple<c10::TypePtr,int32_t>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_TypePtrLong_T extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_TypePtrLong_T(Pointer p) { super(p); }
    public T_TypePtrLong_T(@ByRef Type.TypePtr value0, int value1) { allocate(value0, value1); }
    private native void allocate(@ByRef Type.TypePtr value0, int value1);
    public T_TypePtrLong_T()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_TypePtrLong_T put(@ByRef T_TypePtrLong_T x);

    public @ByRef Type.TypePtr get0() { return get0(this); }
    @Namespace @Name("std::get<0>") public static native @ByRef Type.TypePtr get0(@ByRef T_TypePtrLong_T container);
    public int get1() { return get1(this); }
    @Namespace @Name("std::get<1>") public static native int get1(@ByRef T_TypePtrLong_T container);
}

