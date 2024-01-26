// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


/**
 *  \class Dims3
 *  \brief Descriptor for three-dimensional data.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class Dims3 extends Dims2 {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Dims3(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public Dims3(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public Dims3 position(long position) {
        return (Dims3)super.position(position);
    }
    @Override public Dims3 getPointer(long i) {
        return new Dims3((Pointer)this).offsetAddress(i);
    }

    /**
     *  \brief Construct an empty Dims3 object.
     *  */
    
    
    //!
    //!
    //!
    public Dims3() { super((Pointer)null); allocate(); }
    private native void allocate();

    /**
     *  \brief Construct a Dims3 from 3 elements.
     * 
     *  @param d0 The first element.
     *  @param d1 The second element.
     *  @param d2 The third element.
     *  */
    public Dims3(int d0, int d1, int d2) { super((Pointer)null); allocate(d0, d1, d2); }
    private native void allocate(int d0, int d1, int d2);
}
