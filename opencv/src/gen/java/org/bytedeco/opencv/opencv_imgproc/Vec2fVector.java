// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_imgproc;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;

import static org.bytedeco.opencv.global.opencv_imgproc.*;

@Name("std::vector<cv::Vec2f>") @Properties(inherit = org.bytedeco.opencv.presets.opencv_imgproc.class)
public class Vec2fVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Vec2fVector(Pointer p) { super(p); }
    public Vec2fVector(Point2f value) { this(1); put(0, value); }
    public Vec2fVector(Point2f ... array) { this(array.length); put(array); }
    public Vec2fVector()       { allocate();  }
    public Vec2fVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator =") @ByRef Vec2fVector put(@ByRef Vec2fVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Cast("cv::Vec2f*") @ByRef Point2f get(@Cast("size_t") long i);
    public native Vec2fVector put(@Cast("size_t") long i, Point2f value);

    public native @ByVal Iterator insert(@ByVal Iterator pos, @Cast("cv::Vec2f*") @ByRef Point2f value);
    public native @ByVal Iterator erase(@ByVal Iterator pos);
    public native @ByVal Iterator begin();
    public native @ByVal Iterator end();
    @NoOffset @Name("iterator") public static class Iterator extends Pointer {
        public Iterator(Pointer p) { super(p); }
        public Iterator() { }

        public native @Name("operator ++") @ByRef Iterator increment();
        public native @Name("operator ==") boolean equals(@ByRef Iterator it);
        public native @Name("operator *") @Cast("cv::Vec2f*") @ByRef @Const Point2f get();
    }

    public Point2f[] get() {
        Point2f[] array = new Point2f[size() < Integer.MAX_VALUE ? (int)size() : Integer.MAX_VALUE];
        for (int i = 0; i < array.length; i++) {
            array[i] = get(i);
        }
        return array;
    }
    @Override public String toString() {
        return java.util.Arrays.toString(get());
    }

    public Point2f pop_back() {
        long size = size();
        Point2f value = get(size - 1);
        resize(size - 1);
        return value;
    }
    public Vec2fVector push_back(Point2f value) {
        long size = size();
        resize(size + 1);
        return put(size, value);
    }
    public Vec2fVector put(Point2f value) {
        if (size() != 1) { resize(1); }
        return put(0, value);
    }
    public Vec2fVector put(Point2f ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

