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

@NoOffset @Name("c10::optional<std::tuple<c10::TypePtr,int32_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class T_TypePtrLong_TOptional extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public T_TypePtrLong_TOptional(Pointer p) { super(p); }
    public T_TypePtrLong_TOptional(T_TypePtrLong_T value) { this(); put(value); }
    public T_TypePtrLong_TOptional()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef T_TypePtrLong_TOptional put(@ByRef T_TypePtrLong_TOptional x);

    public native boolean has_value();
    public native void reset();
    public native @Name("value") @ByRef T_TypePtrLong_T get();
    @ValueSetter public native T_TypePtrLong_TOptional put(@ByRef T_TypePtrLong_T value);
}

