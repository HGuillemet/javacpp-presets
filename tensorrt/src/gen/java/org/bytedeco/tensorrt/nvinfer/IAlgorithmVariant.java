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


/**
 *  \class IAlgorithmVariant
 * 
 *  \brief provides a unique 128-bit identifier, which along with the input and output information
 *         denotes the variation of algorithm and can be used to select or reproduce an algorithm,
 *         using IAlgorithmSelector::selectAlgorithms()
 *  @see IAlgorithmIOInfo, IAlgorithm, IAlgorithmSelector::selectAlgorithms()
 *  \note A single implementation can have multiple tactics.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IAlgorithmVariant extends INoCopy {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IAlgorithmVariant(Pointer p) { super(p); }

    /**
     *  \brief Return implementation of the algorithm.
     *  */
    
    
    //!
    //!
    public native @Cast("int64_t") @NoException(true) long getImplementation();

    /**
     *  \brief Return tactic of the algorithm.
     *  */
    public native @Cast("int64_t") @NoException(true) long getTactic();
}
