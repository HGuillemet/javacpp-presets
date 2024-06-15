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

@Name("std::vector<c10::TensorImpl*>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorImplVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorImplVector(Pointer p) { super(p); }
    public TensorImplVector(TensorImpl value) { this(1); put(0, value); }
    public TensorImplVector(TensorImpl ... array) { this(array.length); put(array); }
    public TensorImplVector()       { allocate();  }
    public TensorImplVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef TensorImplVector put(@ByRef TensorImplVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public TensorImpl front() { return get(0); }
    public TensorImpl back() { return get(size() - 1); }
    @Index(function = "at") public native TensorImpl get(@Cast("size_t") long i);
    public native TensorImplVector put(@Cast("size_t") long i, TensorImpl value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, TensorImpl value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Const TensorImpl get();
    }

    public TensorImpl[] get() {
        TensorImpl[] array = new TensorImpl[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public TensorImpl pop_back() {
        long size = size();
        TensorImpl value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public TensorImplVector push_back(TensorImpl value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public TensorImplVector put(TensorImpl value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public TensorImplVector put(TensorImpl ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

