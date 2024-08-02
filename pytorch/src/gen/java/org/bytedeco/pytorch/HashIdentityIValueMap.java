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

@Name("std::unordered_map<c10::IValue,c10::IValue,c10::IValue::HashIdentityIValue,c10::IValue::CompIdentityIValues>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HashIdentityIValueMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HashIdentityIValueMap(Pointer p) { super(p); }
    public HashIdentityIValueMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef HashIdentityIValueMap put(@ByRef HashIdentityIValueMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    @Index public native @ByRef IValue get(@ByRef IValue i);
    public native HashIdentityIValueMap put(@ByRef IValue i, IValue value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @ByRef @Const IValue first();
        public native @Name("operator *().second") @MemberGetter @ByRef @Const IValue second();
    }
}

