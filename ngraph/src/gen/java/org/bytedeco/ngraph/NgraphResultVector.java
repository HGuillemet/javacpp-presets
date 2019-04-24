// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.ngraph;

import org.bytedeco.ngraph.Function;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.ngraph.global.ngraph.*;

@Name("std::vector<std::shared_ptr<ngraph::op::Result> >") @Properties(inherit = org.bytedeco.ngraph.presets.ngraph.class)
public class NgraphResultVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NgraphResultVector(Pointer p) { super(p); }
    public NgraphResultVector(Result value) { this(1); put(0, value); }
    public NgraphResultVector(Result ... array) { this(array.length); put(array); }
    public NgraphResultVector()       { allocate();  }
    public NgraphResultVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef NgraphResultVector put(@ByRef NgraphResultVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @SharedPtr Result get(@Cast("size_t") long i);
    public native NgraphResultVector put(@Cast("size_t") long i, Result value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @SharedPtr Result value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @SharedPtr @Const Result get();
    }

    public Result[] get() {
        Result[] array = new Result[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Result pop_back() {
        long size = size();
        Result value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public NgraphResultVector push_back(Result value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public NgraphResultVector put(Result value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public NgraphResultVector put(Result ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

