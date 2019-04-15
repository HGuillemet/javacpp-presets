// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_highgui;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;

import static org.bytedeco.opencv.global.opencv_highgui.*;


/** \} highgui_opengl
 <p>
 *  \addtogroup highgui_qt
 *  \{
<p>
/** \brief QtFont available only for Qt. See cv::fontQt
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_highgui.class)
public class QtFont extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public QtFont() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public QtFont(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public QtFont(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public QtFont position(long position) {
        return (QtFont)super.position(position);
    }

    /** Name of the font */
    @MemberGetter public native @Cast("const char*") BytePointer nameFont();
    /** Color of the font. Scalar(blue_component, green_component, red_component[, alpha_component]) */
    public native @ByRef Scalar color(); public native QtFont color(Scalar setter);
    /** See cv::QtFontStyles */
    public native int font_face(); public native QtFont font_face(int setter);
    /** font data and metrics */
    @MemberGetter public native @Const IntPointer ascii();
    @MemberGetter public native @Const IntPointer greek();
    @MemberGetter public native @Const IntPointer cyrillic();
    public native float hscale(); public native QtFont hscale(float setter);
    public native float vscale(); public native QtFont vscale(float setter);
    /** slope coefficient: 0 - normal, >0 - italic */
    public native float shear(); public native QtFont shear(float setter);
    /** See cv::QtFontWeights */
    public native int thickness(); public native QtFont thickness(int setter);
    /** horizontal interval between letters */
    public native float dx(); public native QtFont dx(float setter);
    /** PointSize */
    public native int line_type(); public native QtFont line_type(int setter);
}
