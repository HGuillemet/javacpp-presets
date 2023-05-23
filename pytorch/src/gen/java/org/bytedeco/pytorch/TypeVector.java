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

@Name("std::vector<c10::Type::SingletonOrSharedTypePtr<c10::Type> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TypeVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TypeVector(Pointer p) { super(p); }
    public TypeVector(Type.TypePtr value) { this(1); put(0, value); }
    public TypeVector(Type.TypePtr ... array) { this(array.length); put(array); }
    public TypeVector()       { allocate();  }
    public TypeVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef TypeVector put(@ByRef TypeVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @ByRef Type.TypePtr get(@Cast("size_t") long i);
    public native TypeVector put(@Cast("size_t") long i, Type.TypePtr value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef Type.TypePtr value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const Type.TypePtr get();
    }

    public Type.TypePtr[] get() {
        Type.TypePtr[] array = new Type.TypePtr[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Type.TypePtr pop_back() {
        long size = size();
        Type.TypePtr value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public TypeVector push_back(Type.TypePtr value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public TypeVector put(Type.TypePtr value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public TypeVector put(Type.TypePtr ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

