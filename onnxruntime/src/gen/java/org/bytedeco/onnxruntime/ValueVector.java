// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;

@Name("std::vector<Ort::Value>") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class ValueVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ValueVector(Pointer p) { super(p); }
    public ValueVector(@StdMove Value value) { this(1); put(0, value); }
    public ValueVector(@StdMove Value ... array) { this(array.length); put(array); }
    public ValueVector()       { allocate();  }
    public ValueVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef ValueVector put(@ByRef @StdMove ValueVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public Value front() { return get(0); }
    public Value back() { return get(size() - 1); }
    @Index(function = "at") public native @StdMove Value get(@Cast("size_t") long i);
    public native ValueVector put(@Cast("size_t") long i, Value value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StdMove Value value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @StdMove Value get();
    }

    public Value[] get() {
        Value[] array = new Value[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Value pop_back() {
        long size = size();
        Value value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public ValueVector push_back(Value value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public ValueVector put(Value value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public ValueVector put(Value ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

