// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvonnxparser;

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
import org.bytedeco.tensorrt.nvinfer.*;
import static org.bytedeco.tensorrt.global.nvinfer.*;
import org.bytedeco.tensorrt.nvinfer_plugin.*;
import static org.bytedeco.tensorrt.global.nvinfer_plugin.*;

import static org.bytedeco.tensorrt.global.nvonnxparser.*;


/**
 *  \class IParserRefitter
 * 
 *  \brief An interface designed to refit weights from an ONNX model.
 *  */
@Namespace("nvonnxparser") @Properties(inherit = org.bytedeco.tensorrt.presets.nvonnxparser.class)
public class IParserRefitter extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IParserRefitter(Pointer p) { super(p); }

    /**
     *  \brief Load a serialized ONNX model from memory and perform weight refit.
     * 
     *  @param serializedOnnxModel Pointer to the serialized ONNX model
     *  @param serializedOnnxModelSize Size of the serialized ONNX model
     *         in bytes
     *  @param modelPath Absolute path to the model file for loading external weights if required
     *  @return true if all the weights in the engine were refit successfully.
     * 
     *  The serialized ONNX model must be identical to the one used to generate the engine
     *  that will be refit.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean refitFromBytes(
            @Const Pointer serializedOnnxModel, @Cast("size_t") long serializedOnnxModelSize, String modelPath/*=nullptr*/);
    public native @Cast("bool") @NoException(true) boolean refitFromBytes(
            @Const Pointer serializedOnnxModel, @Cast("size_t") long serializedOnnxModelSize);
    public native @Cast("bool") @NoException(true) boolean refitFromBytes(
            @Const Pointer serializedOnnxModel, @Cast("size_t") long serializedOnnxModelSize, @Cast("const char*") BytePointer modelPath/*=nullptr*/);

    /**
     *  \brief Load and parse a ONNX model from disk and perform weight refit.
     * 
     *  @param onnxModelFile Path to the ONNX model to load from disk.
     * 
     *  @return true if the model was loaded successfully, and if all the weights in the engine were refit successfully.
     * 
     *  The provided ONNX model must be identical to the one used to generate the engine
     *  that will be refit.
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean refitFromFile(String onnxModelFile);
    public native @Cast("bool") @NoException(true) boolean refitFromFile(@Cast("const char*") BytePointer onnxModelFile);

    /**
     * \brief Get the number of errors that occurred during prior calls to \p refitFromBytes or \p refitFromFile
     * 
     *  @see getError() IParserError
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) int getNbErrors();

    /**
     * \brief Get an error that occurred during prior calls to \p refitFromBytes or \p refitFromFile
     * 
     *  @see getNbErrors() IParserError
     *  */
    
    
    //!
    //!
    //!
    public native @Const @NoException(true) IParserError getError(int index);

    /**
     * \brief Clear errors from prior calls to \p refitFromBytes or \p refitFromFile
     * 
     *  @see getNbErrors() getError() IParserError
     *  */
    public native void clearErrors();
}