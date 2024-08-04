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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("std::vector<c10::intrusive_ptr<c10::ivalue::Future> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FutureVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FutureVector(Pointer p) { super(p); }
    public FutureVector(@Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future value) { this(1); put(0, value); }
    public FutureVector(@Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future ... array) { this(array.length); put(array); }
    public FutureVector()       { allocate();  }
    public FutureVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef FutureVector put(@ByRef FutureVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    public Future front() { return get(0); }
    public Future back() { return get(size() - 1); }
    @Index(function = "at") public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future get(@Cast("size_t") long i);
    public native FutureVector put(@Cast("size_t") long i, Future value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future get();
    }

    public Future[] get() {
        Future[] array = new Future[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Future pop_back() {
        long size = size();
        Future value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public FutureVector push_back(Future value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public FutureVector put(Future value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public FutureVector put(Future ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

