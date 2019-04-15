// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;

@Name("std::vector<cv::dnn::MatShape>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class MatShapeVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MatShapeVector(Pointer p) { super(p); }
    public MatShapeVector(IntPointer value) { this(1); put(0, value); }
    public MatShapeVector(IntPointer ... array) { this(array.length); put(array); }
    public MatShapeVector()       { allocate();  }
    public MatShapeVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef MatShapeVector put(@ByRef MatShapeVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @StdVector IntPointer get(@Cast("size_t") long i);
    public native MatShapeVector put(@Cast("size_t") long i, IntPointer value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @StdVector IntPointer value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator++") @ByRef Iterator increment();
        public native @Name("operator==") boolean equals(@ByRef Iterator it);
        public native @Name("operator*") @StdVector @Const IntPointer get();
    }

    public IntPointer[] get() {
        IntPointer[] array = new IntPointer[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public IntPointer pop_back() {
        long size = size();
        IntPointer value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public MatShapeVector push_back(IntPointer value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public MatShapeVector put(IntPointer value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public MatShapeVector put(IntPointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

