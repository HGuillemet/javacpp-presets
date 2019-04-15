// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("std::vector<cv::instr::NodeDataTls*>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class NodeDataTlsVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NodeDataTlsVector(Pointer p) { super(p); }
    public NodeDataTlsVector(NodeDataTls value) { this(1); put(0, value); }
    public NodeDataTlsVector(NodeDataTls ... array) { this(array.length); put(array); }
    public NodeDataTlsVector()       { allocate();  }
    public NodeDataTlsVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef NodeDataTlsVector put(@ByRef NodeDataTlsVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native NodeDataTls get(@Cast("size_t") long i);
    public native NodeDataTlsVector put(@Cast("size_t") long i, NodeDataTls value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, NodeDataTls value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @Const NodeDataTls get();
    }

    public NodeDataTls[] get() {
        NodeDataTls[] array = new NodeDataTls[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public NodeDataTls pop_back() {
        long size = size();
        NodeDataTls value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public NodeDataTlsVector push_back(NodeDataTls value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public NodeDataTlsVector put(NodeDataTls value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public NodeDataTlsVector put(NodeDataTls ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

