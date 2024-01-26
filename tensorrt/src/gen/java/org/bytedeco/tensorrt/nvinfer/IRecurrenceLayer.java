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



@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IRecurrenceLayer extends ILoopBoundaryLayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IRecurrenceLayer(Pointer p) { super(p); }

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor */
    //
    /** Sets the input tensor for the given index.
    /**
    /** For a recurrence layer, the values 0 and 1 are valid.
    /** The indices are as follows:
    /**
    /** - 0: The initial value of the output tensor. The value must come from outside the loop.
    /** - 1: The next value of the output tensor. The value usually comes from inside the loop, and must have the same
    /** dimensions as input 0.
    /**
    /** If this function is called with the value 1, then the function getNbInputs() changes
    /** from returning 1 to 2.
    /** */
}
