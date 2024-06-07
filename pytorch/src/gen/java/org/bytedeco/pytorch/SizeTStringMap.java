// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("std::unordered_map<size_t,std::string>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SizeTStringMap extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizeTStringMap(Pointer p) { super(p); }
    public SizeTStringMap()       { allocate();  }
    private native void allocate();
    public native @Name("operator =") @ByRef SizeTStringMap put(@ByRef SizeTStringMap x);

    public boolean empty() { return size() == 0; }
    public native long size();

    public BytePointer front() { return get(0); }
    public BytePointer back() { return get(size() - 1); }
    @Index public native @StdString BytePointer get(@Cast("size_t") long i);
    public native SizeTStringMap put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index public native SizeTStringMap put(@Cast("size_t") long i, @StdString String value);

    public native void erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *().first") @MemberGetter @Cast("size_t") long first();
        public native @Name("operator *().second") @MemberGetter @StdString BytePointer second();
    }
}

