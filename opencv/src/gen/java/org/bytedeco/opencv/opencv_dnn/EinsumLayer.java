// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_dnn;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

import static org.bytedeco.opencv.global.opencv_dnn.*;


    /** \brief This function performs array summation based
    * on the Einstein summation convention. The function
    * allows for concise expressions of various mathematical
    * operations using subscripts.
    *
    * By default, the labels are placed in alphabetical
    * order at the end of the output.
    * For example:
    * if {@code c = einsum("i,j", a, b)}, then {@code c[i,j] == a[i]*b[j]}.
    * However, if {@code c = einsum("j,i", a, b)}, then {@code c[i,j] = a[j]*b[i]}.
    * Alternatively, you can control the output order or prevent
    * an axis from being summed/force an axis to be summed
    * by providing indices for the output.
    * For example:
    * {@code diag(a)}         -> {@code einsum("ii->i", a)}
    * {@code sum(a, axis=0)}  -> {@code einsum("i...->", a)}
    * Subscripts at the beginning and end may be specified
    * by putting an ellipsis "..." in the middle.
    * For instance, the function {@code einsum("i...i", a)} takes
    * the diagonal of the first and last dimensions of
    * the operand, and {@code einsum("ij...,jk...->ik...")} performs
    * the matrix product using the first two indices
    * of each operand instead of the last two.
    * When there is only one operand, no axes being summed,
    *  and no output parameter, this function returns
    * a view into the operand instead of creating a copy.
     */
    @Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class EinsumLayer extends Layer {
        static { Loader.load(); }
        /** Default native constructor. */
        public EinsumLayer() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public EinsumLayer(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public EinsumLayer(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public EinsumLayer position(long position) {
            return (EinsumLayer)super.position(position);
        }
        @Override public EinsumLayer getPointer(long i) {
            return new EinsumLayer((Pointer)this).offsetAddress(i);
        }
    
        public static native @Ptr EinsumLayer create(@Const @ByRef LayerParams params);
    }
