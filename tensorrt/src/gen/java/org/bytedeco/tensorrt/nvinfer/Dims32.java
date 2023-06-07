// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;
 // namespace impl

/**
 *  \class Dims
 *  \brief Structure to define the dimensions of a tensor.
 * 
 *  TensorRT can also return an invalid dims structure. This structure is represented by nbDims == -1
 *  and d[i] == 0 for all d.
 * 
 *  TensorRT can also return an "unknown rank" dims structure. This structure is represented by nbDims == -1
 *  and d[i] == -1 for all d.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Dims32 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public Dims32() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dims32(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dims32(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public Dims32 position(long position) {
        return (Dims32)super.position(position);
    }
    @Override public Dims32 getPointer(long i) {
        return new Dims32((Pointer)this).offsetAddress(i);
    }

    /** The maximum rank (number of dimensions) supported for a tensor. */
    @MemberGetter public static native int MAX_DIMS();
    public static final int MAX_DIMS = MAX_DIMS();
    /** The rank (number of dimensions). */
    public native int nbDims(); public native Dims32 nbDims(int setter);
    /** The extent of each dimension. */
    public native int d(int i); public native Dims32 d(int i, int setter);
    @MemberGetter public native IntPointer d();
}
