// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.dnnl;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.dnnl.global.dnnl.*;

@Name("std::vector<dnnl_primitive_desc_t>") @Properties(inherit = org.bytedeco.dnnl.presets.dnnl.class)
public class dnnl_primitive_desc_vector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public dnnl_primitive_desc_vector(Pointer p) { super(p); }
    public dnnl_primitive_desc_vector(dnnl_primitive_desc value) { this(1); put(0, value); }
    public dnnl_primitive_desc_vector(dnnl_primitive_desc ... array) { this(array.length); put(array); }
    public dnnl_primitive_desc_vector()       { allocate();  }
    public dnnl_primitive_desc_vector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef dnnl_primitive_desc_vector put(@ByRef dnnl_primitive_desc_vector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native dnnl_primitive_desc get(@Cast("size_t") long i);
    public native dnnl_primitive_desc_vector put(@Cast("size_t") long i, dnnl_primitive_desc value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, dnnl_primitive_desc value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") dnnl_primitive_desc get();
    }

    public dnnl_primitive_desc[] get() {
        dnnl_primitive_desc[] array = new dnnl_primitive_desc[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public dnnl_primitive_desc pop_back() {
        long size = size();
        dnnl_primitive_desc value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public dnnl_primitive_desc_vector push_back(dnnl_primitive_desc value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public dnnl_primitive_desc_vector put(dnnl_primitive_desc value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public dnnl_primitive_desc_vector put(dnnl_primitive_desc ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

