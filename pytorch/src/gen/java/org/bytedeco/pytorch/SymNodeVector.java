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

@Name("std::vector<c10::intrusive_ptr<c10::SymNodeImpl> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymNodeVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymNodeVector(Pointer p) { super(p); }
    public SymNodeVector(@Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode value) { this(1); put(0, value); }
    public SymNodeVector(@Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode ... array) { this(array.length); put(array); }
    public SymNodeVector()       { allocate();  }
    public SymNodeVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef SymNodeVector put(@ByRef SymNodeVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public SymNode front() { return get(0); }
    public SymNode back() { return get(size() - 1); }
    @Index(function = "at") public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode get(@Cast("size_t") long i);
    public native SymNodeVector put(@Cast("size_t") long i, SymNode value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode get();
    }

    public SymNode[] get() {
        SymNode[] array = new SymNode[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public SymNode pop_back() {
        long size = size();
        SymNode value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public SymNodeVector push_back(SymNode value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public SymNodeVector put(SymNode value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public SymNodeVector put(SymNode ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

