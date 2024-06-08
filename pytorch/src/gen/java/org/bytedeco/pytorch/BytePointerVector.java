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

@Name("std::vector<const char*>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BytePointerVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BytePointerVector(Pointer p) { super(p); }
    public BytePointerVector(@Cast("const char*") BytePointer value) { this(1); put(0, value); }
    public BytePointerVector(@Cast("const char*") BytePointer ... array) { this(array.length); put(array); }
    public BytePointerVector(String value) { this(1); put(0, value); }
    public BytePointerVector(String ... array) { this(array.length); put(array); }
    public BytePointerVector()       { allocate();  }
    public BytePointerVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef BytePointerVector put(@ByRef BytePointerVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public BytePointer front() { return get(0); }
    public BytePointer back() { return get(size() - 1); }
    @Index(function = "at") public native @Const @Cast("const char*") BytePointer get(@Cast("size_t") long i);
    public native BytePointerVector put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index(function = "at") public native BytePointerVector put(@Cast("size_t") long i, @Const String value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Const @Cast("const char*") BytePointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const @Cast("const char*") BytePointer get();
    }

    public BytePointer[] get() {
        BytePointer[] array = new BytePointer[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public BytePointer pop_back() {
        long size = size();
        BytePointer value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public BytePointerVector push_back(BytePointer value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public BytePointerVector put(BytePointer value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public BytePointerVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public BytePointerVector push_back(String value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public BytePointerVector put(String value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public BytePointerVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

