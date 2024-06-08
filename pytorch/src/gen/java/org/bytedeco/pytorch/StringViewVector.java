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

@Name("std::vector<c10::string_view>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class StringViewVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringViewVector(Pointer p) { super(p); }
    public StringViewVector(BytePointer value) { this(1); put(0, value); }
    public StringViewVector(BytePointer ... array) { this(array.length); put(array); }
    public StringViewVector(String value) { this(1); put(0, value); }
    public StringViewVector(String ... array) { this(array.length); put(array); }
    public StringViewVector()       { allocate();  }
    public StringViewVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef StringViewVector put(@ByRef StringViewVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public BytePointer front() { return get(0); }
    public BytePointer back() { return get(size() - 1); }
    @Index(function = "at") public native @StringView BytePointer get(@Cast("size_t") long i);
    public native StringViewVector put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index(function = "at") public native StringViewVector put(@Cast("size_t") long i, @StringView String value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StringView BytePointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StringView BytePointer get();
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
    public StringViewVector push_back(BytePointer value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StringViewVector put(BytePointer value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StringViewVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public StringViewVector push_back(String value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public StringViewVector put(String value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public StringViewVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

