// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;

@Name("cv::Rect_<float>") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class Rect2f extends FloatPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Rect2f(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Rect2f(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Rect2f position(long position) {
        return (Rect2f)super.position(position);
    }
    @Override public Rect2f getPointer(long i) {
        return new Rect2f((Pointer)this).offsetAddress(i);
    }


    /** default constructor */
    public Rect2f() { super((Pointer)null); allocate(); }
    private native void allocate();
    public Rect2f(float _x, float _y, float _width, float _height) { super((Pointer)null); allocate(_x, _y, _width, _height); }
    private native void allocate(float _x, float _y, float _width, float _height);
// #if OPENCV_ABI_COMPATIBILITY < 500
    public Rect2f(@Const @ByRef Rect2f r) { super((Pointer)null); allocate(r); }
    private native void allocate(@Const @ByRef Rect2f r);
// #endif
    public Rect2f(@Const @ByRef Point2f org, @Const @ByRef Size2f sz) { super((Pointer)null); allocate(org, sz); }
    private native void allocate(@Const @ByRef Point2f org, @Const @ByRef Size2f sz);
    public Rect2f(@Const @ByRef Point2f pt1, @Const @ByRef Point2f pt2) { super((Pointer)null); allocate(pt1, pt2); }
    private native void allocate(@Const @ByRef Point2f pt1, @Const @ByRef Point2f pt2);

// #if OPENCV_ABI_COMPATIBILITY < 500
    public native @ByRef @Name("operator =") Rect2f put(@Const @ByRef Rect2f r);
// #endif
    /** the top-left corner */
    public native @ByVal Point2f tl();
    /** the bottom-right corner */
    public native @ByVal Point2f br();

    /** size (width, height) of the rectangle */
    public native @ByVal Size2f size();
    /** area (width*height) of the rectangle */
    public native float area();
    /** true if empty */
    public native @Cast("bool") boolean empty();

    /** conversion to another data type */

    /** checks whether the rectangle contains the point */
    public native @Cast("bool") boolean contains(@Const @ByRef Point2f pt);

    /** x coordinate of the top-left corner */
    public native float x(); public native Rect2f x(float setter);
    /** y coordinate of the top-left corner */
    public native float y(); public native Rect2f y(float setter);
    /** width of the rectangle */
    public native float width(); public native Rect2f width(float setter);
    /** height of the rectangle */
    public native float height(); public native Rect2f height(float setter);
}
