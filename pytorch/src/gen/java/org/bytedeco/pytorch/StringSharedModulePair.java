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

@NoOffset @Name("std::pair<std::string,std::shared_ptr<torch::nn::Module> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringSharedModulePair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringSharedModulePair(Pointer p) { super(p); }
    public StringSharedModulePair(BytePointer firstValue, Module secondValue) { this(); put(firstValue, secondValue); }
    public StringSharedModulePair(String firstValue, Module secondValue) { this(); put(firstValue, secondValue); }
    public StringSharedModulePair()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef StringSharedModulePair put(@ByRef StringSharedModulePair x);


    @MemberGetter public native @StdString BytePointer first(); public native StringSharedModulePair first(BytePointer first);
    @MemberGetter public native @SharedPtr("torch::nn::Module") Module second();  public native StringSharedModulePair second(Module second);
    @MemberSetter @Index public native StringSharedModulePair first(@StdString String first);

    public StringSharedModulePair put(BytePointer firstValue, Module secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public StringSharedModulePair put(String firstValue, Module secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

