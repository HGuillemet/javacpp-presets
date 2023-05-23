// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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

@NoOffset @Name("std::pair<size_t,torch::jit::MatchedSchema>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SizeTMatchedSchemaPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizeTMatchedSchemaPair(Pointer p) { super(p); }
    public SizeTMatchedSchemaPair(long firstValue, MatchedSchema secondValue) { this(); put(firstValue, secondValue); }
    public SizeTMatchedSchemaPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef SizeTMatchedSchemaPair put(@ByRef SizeTMatchedSchemaPair x);


    @MemberGetter public native @Cast("size_t") long first(); public native SizeTMatchedSchemaPair first(long first);
    @MemberGetter public native @ByRef MatchedSchema second();  public native SizeTMatchedSchemaPair second(MatchedSchema second);

    public SizeTMatchedSchemaPair put(long firstValue, MatchedSchema secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

