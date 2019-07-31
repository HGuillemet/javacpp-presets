// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_core;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.opencv.global.opencv_core.*;


/** \brief Class providing a set of static methods to check what NVIDIA\* card architecture the CUDA module was
built for.
<p>
According to the CUDA C Programming Guide Version 3.2: "PTX code produced for some specific compute
capability can always be compiled to binary code of greater or equal compute capability".
 */
@Namespace("cv::cuda") @Properties(inherit = org.bytedeco.opencv.presets.opencv_core.class)
public class TargetArchs extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public TargetArchs() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TargetArchs(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TargetArchs(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public TargetArchs position(long position) {
        return (TargetArchs)super.position(position);
    }

    /** \brief The following method checks whether the module was built with the support of the given feature:
    <p>
    @param feature_set Features to be checked. See :ocvcuda::FeatureSet.
     */
    public static native @Cast("bool") boolean builtWith(@Cast("cv::cuda::FeatureSet") int feature_set);

    /** \brief There is a set of methods to check whether the module contains intermediate (PTX) or binary CUDA
    code for the given architecture(s):
    <p>
    @param major Major compute capability version.
    @param minor Minor compute capability version.
     */
    public static native @Cast("bool") boolean has(int major, int minor);
    public static native @Cast("bool") boolean hasPtx(int major, int minor);
    public static native @Cast("bool") boolean hasBin(int major, int minor);

    public static native @Cast("bool") boolean hasEqualOrLessPtx(int major, int minor);
    public static native @Cast("bool") boolean hasEqualOrGreater(int major, int minor);
    public static native @Cast("bool") boolean hasEqualOrGreaterPtx(int major, int minor);
    public static native @Cast("bool") boolean hasEqualOrGreaterBin(int major, int minor);
}
