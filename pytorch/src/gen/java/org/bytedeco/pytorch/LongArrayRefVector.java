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

@Name("std::vector<c10::ArrayRef<int64_t> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class LongArrayRefVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LongArrayRefVector(Pointer p) { super(p); }
    public LongArrayRefVector(LongArrayRef value) { this(1); put(0, value); }
    public LongArrayRefVector(LongArrayRef ... array) { this(array.length); put(array); }
    public LongArrayRefVector(@Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... value) { this(1); put(0, value); }
    public LongArrayRefVector(@Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long[] ... array) { this(array.length); put(array); }
    public LongArrayRefVector()       { allocate();  }
    public LongArrayRefVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef LongArrayRefVector put(@ByRef LongArrayRefVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public LongArrayRef front() { return get(0); }
    public LongArrayRef back() { return get(size() - 1); }
    @Index(function = "at") public native @ByRef LongArrayRef get(@Cast("size_t") long i);
    public native LongArrayRefVector put(@Cast("size_t") long i, LongArrayRef value);
    @ValueSetter @Index(function = "at") public native LongArrayRefVector put(@Cast("size_t") long i, @ByRef @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @ByRef LongArrayRef value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @ByRef @Const LongArrayRef get();
    }

    public LongArrayRef[] get() {
        LongArrayRef[] array = new LongArrayRef[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public LongArrayRef pop_back() {
        long size = size();
        LongArrayRef value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public LongArrayRefVector push_back(LongArrayRef value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public LongArrayRefVector put(LongArrayRef value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public LongArrayRefVector put(LongArrayRef ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public LongArrayRefVector push_back(long... value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public LongArrayRefVector put(long... value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public LongArrayRefVector put(long[] ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

