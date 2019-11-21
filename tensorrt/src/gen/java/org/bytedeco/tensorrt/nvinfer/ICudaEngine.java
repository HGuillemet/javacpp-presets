// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;


/**
 *  \class ICudaEngine
 * 
 *  \brief An engine for executing inference on a built network, with functionally unsafe features.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class ICudaEngine extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ICudaEngine(Pointer p) { super(p); }

    /**
     *  \brief Get the number of binding indices.
     * 
     *  @see getBindingIndex();
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException int getNbBindings();

    /**
     *  \brief Retrieve the binding index for a named tensor.
     * 
     *  IExecutionContext::enqueue() and IExecutionContext::execute() require an array of buffers.
     * 
     *  Engine bindings map from tensor names to indices in this array.
     *  Binding indices are assigned at engine build time, and take values in the range [0 ... n-1] where n is the total number of inputs and outputs.
     * 
     *  @param name The tensor name.
     *  @return The binding index for the named tensor, or -1 if the name is not found.
     * 
     *  see getNbBindings() getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException int getBindingIndex(String name);
    public native @NoException int getBindingIndex(@Cast("const char*") BytePointer name);

    /**
     *  \brief Retrieve the name corresponding to a binding index.
     * 
     *  This is the reverse mapping to that provided by getBindingIndex().
     * 
     *  @param bindingIndex The binding index.
     *  @return The name corresponding to the index, or nullptr if the index is out of range.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException String getBindingName(int bindingIndex);

    /**
     *  \brief Determine whether a binding is an input binding.
     * 
     *  @param bindingIndex The binding index.
     *  @return True if the index corresponds to an input binding and the index is in range.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException boolean bindingIsInput(int bindingIndex);

    /**
     *  \brief Get the dimensions of a binding.
     * 
     *  @param bindingIndex The binding index.
     *  @return The dimensions of the binding if the index is in range, otherwise Dims()
     *          Has -1 for any dimension with a dynamic value.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @ByVal @NoException Dims getBindingDimensions(int bindingIndex);

    /**
     *  \brief Determine the required data type for a buffer from its binding index.
     * 
     *  @param bindingIndex The binding index.
     *  @return The type of the data in the buffer.
     * 
     *  @see getBindingIndex()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException DataType getBindingDataType(int bindingIndex);

    /**
     *  \brief Get the maximum batch size which can be used for inference.
     * 
     *  @return The maximum batch size for this engine.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException int getMaxBatchSize();

    /**
     *  \brief Get the number of layers in the network.
     * 
     *  The number of layers in the network is not necessarily the number in the original network definition, as layers may be combined or eliminated as the engine is
     *  optimized. This value can be useful when building per-layer tables, such as when aggregating profiling data over a number of executions.
     * 
     *  @return The number of layers in the network.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException int getNbLayers();

    /**
     *  \brief Get the amount of workspace the engine uses.
     * 
     *  The workspace size will be no greater than the value provided to the builder when the engine was built, and will typically be smaller.
     *  Workspace will be allocated for each execution context.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("std::size_t") @Deprecated @NoException long getWorkspaceSize();

    /**
     *  \brief Serialize the network to a stream.
     * 
     *  @return A IHostMemory object that contains the serialized engine.
     * 
     *  The network may be deserialized with IRuntime::deserializeCudaEngine() and also safe::IRuntime::deserializeCudaEngine() if only functional-safe features are used in the engine.
     * 
     *  @see IRuntime::deserializeCudaEngine() safe::IRuntime::deserializeCudaEngine()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException IHostMemory serialize();

    /**
     *  \brief Create an execution context.
     * 
     *  @see IExecutionContext.
     *  */
    
    
    //!
    //!
    public native @NoException IExecutionContext createExecutionContext();

    /**
     *  \brief Destroy this object;
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException void destroy();

    /**
     *  \brief Get location of binding
     * 
     *  This lets you know whether the binding should be a pointer to device or host memory.
     * 
     *  @see ITensor::setLocation() ITensor::getLocation()
     * 
     *  @param bindingIndex The binding index.
     *  @return The location of the bound tensor with given index.
     *  */
    public native @NoException TensorLocation getLocation(int bindingIndex);
    /** \brief create an execution context without any device memory allocated
     * 
     *  The memory for execution of this device context must be supplied by the application.
     * 
     *  @see getDeviceMemorySize() IExecutionContext::setDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException IExecutionContext createExecutionContextWithoutDeviceMemory();

    /**
     *  \brief Return the amount of device memory required by an execution context.
     * 
     *  @see IExecutionContext::setDeviceMemory()
     *  */
    
    
    //!
    //!
    //!
    public native @Cast("size_t") @NoException long getDeviceMemorySize();

    /**
     *  \brief Return true if engine can be refit.
     * 
     *  @see nvinfer1::createInferRefitter()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException boolean isRefittable();

    /**
     *  \brief Return the number of bytes per component of an element.
     * 
     *  The vector component size is returned if getBindingVectorizedDim() != -1.
     * 
     *  @param bindingIndex The binding Index.
     * 
     *  @see ICudaEngine::getBindingVectorizedDim()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException int getBindingBytesPerComponent(int bindingIndex);

    /**
     *  \brief Return the number of components included in one element.
     * 
     *  The number of elements in the vectors is returned if getBindingVectorizedDim() != -1.
     * 
     *  @param bindingIndex The binding Index.
     * 
     *  @see ICudaEngine::getBindingVectorizedDim()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException int getBindingComponentsPerElement(int bindingIndex);

    /**
     *  \brief Return the binding format.
     * 
     *  @param bindingIndex The binding Index.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException TensorFormat getBindingFormat(int bindingIndex);

    /**
     *  \brief Return the human readable description of the tensor format.
     * 
     *  The description includes the order, vectorization, data type, strides,
     *  and etc. Examples are shown as follows:
     *    Example 1: kCHW + FP32
     *      "Row major linear FP32 format"
     *    Example 2: kCHW2 + FP16
     *      "Two wide channel vectorized row major FP16 format"
     *    Example 3: kHWC8 + FP16 + Line Stride = 32
     *      "Channel major FP16 format where C % 8 == 0 and H Stride % 32 == 0"
     * 
     *  @param bindingIndex The binding Index.
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException String getBindingFormatDesc(int bindingIndex);

    /**
     *  \brief Return the dimension index that the buffer is vectorized.
     * 
     *  Specifically -1 is returned if scalars per vector is 1.
     * 
     *  @param bindingIndex The binding Index.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException int getBindingVectorizedDim(int bindingIndex);

    /**
     *  \brief Returns the name of the network associated with the engine.
     * 
     *  The name is set during network creation and is retrieved after
     *  building or deserialization.
     * 
     *  @see INetworkDefinition::setName(), INetworkDefinition::getName()
     * 
     *  @return A zero delimited C-style string representing the name of the network.
     *  */
    
    
    //!
    //!
    //!
    public native @NoException String getName();

    /**
     *  \brief Get the number of optimization profiles defined for this engine.
     * 
     *  @return Number of optimization profiles. It is always at least 1.
     * 
     *  @see IExecutionContext::setOptimizationProfile() */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException int getNbOptimizationProfiles();

    /**
     *  \brief Get the minimum / optimum / maximum dimensions for a particular binding under an optimization profile.
     * 
     *  @param bindingIndex The binding index (must be between 0 and getNbBindings() - 1)
     * 
     *  @param profileIndex The profile index (must be between 0 and getNbOptimizationProfiles()-1)
     * 
     *  @param select Whether to query the minimum, optimum, or maximum dimensions for this binding.
     * 
     *  @return The minimum / optimum / maximum dimensions for this binding in this profile. */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @ByVal @NoException Dims getProfileDimensions(int bindingIndex, int profileIndex, OptProfileSelector select);
    public native @ByVal @NoException Dims getProfileDimensions(int bindingIndex, int profileIndex, @Cast("nvinfer1::OptProfileSelector") int select);

    /**
     *  \brief Get minimum / optimum / maximum values for an input shape binding under an optimization profile.
     * 
     *  @param profileIndex The profile index (must be between 0 and getNbOptimizationProfiles()-1)
     * 
     *  @param inputIndex The input index (must be between 0 and getNbBindings() - 1)
     * 
     *  @param select Whether to query the minimum, optimum, or maximum shape values for this binding.
     * 
     *  @return If the binding is an input shape binding, return a pointer to an array that has
     *          the same number of elements as the corresponding tensor, i.e. 1 if dims.nbDims == 0, or dims.d[0]
     *          if dims.nbDims == 1, where dims = getBindingDimensions(inputIndex). The array contains
     *          the elementwise minimum / optimum / maximum values for this shape binding under the profile.
     *          If either of the indices is out of range, or if the binding is not an input shape binding, return
     *          nullptr. */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @Const @NoException IntPointer getProfileShapeValues(int profileIndex, int inputIndex, OptProfileSelector select);
    public native @Const @NoException IntBuffer getProfileShapeValues(int profileIndex, int inputIndex, @Cast("nvinfer1::OptProfileSelector") int select);

    /**
     *  \brief True if tensor is required as input for shape calculations or output from them.
     * 
     *  TensorRT evaluates a network in two phases:
     * 
     *  1. Compute shape information required to determine memory allocation requirements
     *     and validate that runtime sizes make sense.
     * 
     *  2. Process tensors on the device.
     * 
     *  Some tensors are required in phase 1.  These tensors are called "shape tensors", and always
     *  have type Int32 and no more than one dimension.  These tensors are not always shapes
     *  themselves, but might be used to calculate tensor shapes for phase 2.
     * 
     *  isShapeBinding(i) returns true if the tensor is a required input or an output computed in phase 1.
     *  isExecutionBinding(i) returns true if the tensor is a required input or an output computed in phase 2.
     * 
     *  For example, if a network uses an input tensor with binding i as an addend
     *  to an IElementWiseLayer that computes the "reshape dimensions" for IShuffleLayer,
     *  then isShapeBinding(i) == true.
     * 
     *  It's possible to have a tensor be required by both phases.  For instance, a tensor
     *  can be used for the "reshape dimensions" and as the indices for an IGatherLayer
     *  collecting floating-point data.
     * 
     *  It's also possible to have a tensor be required by neither phase, but nonetheless
     *  shows up in the engine's inputs.  For example, if an input tensor is used only
     *  as an input to IShapeLayer, only its shape matters and its values are irrelevant.
     * 
     *  @see isExecutionBinding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException boolean isShapeBinding(int bindingIndex);

    /**
     *  \brief True if pointer to tensor data is required for execution phase, false if nullptr can be supplied.
     * 
     *  For example, if a network uses an input tensor with binding i ONLY as the "reshape dimensions"
     *  input of IShuffleLayer, then isExecutionBinding(i) is false, and a nullptr can be
     *  supplied for it when calling IExecutionContext::execute or IExecutionContext::enqueue.
     * 
     *  @see isShapeBinding()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException boolean isExecutionBinding(int bindingIndex);

    /**
     *  \brief determine that execution capability this engine has.
     * 
     *  If the engine has EngineCapability::kDEFAULT, then all engine functionality is valid..
     *  If the engine has EngineCapability::kSAFE_GPU, then only the functionality in safe::ICudaEngine is valid.
     *  If the engine has EngineCapability::kSAFE_DLA, then only serialize, destroy, and const-accessor functions are valid.
     * 
     *  @return The EngineCapability flag that the engine was built for.
     *  */
    
    //!
    //!
    //!
    public native @NoException EngineCapability getEngineCapability();

    /** \brief Set the ErrorRecorder for this interface
     * 
     *  Assigns the ErrorRecorder to this interface. The ErrorRecorder will track all errors during execution.
     *  This function will call incRefCount of the registered ErrorRecorder at least once. Setting
     *  recorder to nullptr unregisters the recorder with the interface, resulting in a call to decRefCount if
     *  a recorder has been registered.
     * 
     *  @param recorder The error recorder to register with this interface. */
    //
    /** @see getErrorRecorder
    /** */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException void setErrorRecorder(IErrorRecorder recorder);

    /**
     *  \brief get the ErrorRecorder assigned to this interface.
     * 
     *  Retrieves the assigned error recorder object for the given class. A default error recorder does not exist,
     *  so a nullptr will be returned if setErrorRecorder has not been called.
     * 
     *  @return A pointer to the IErrorRecorder object that has been registered.
     * 
     *  @see setErrorRecorder
     *  */
    public native @NoException IErrorRecorder getErrorRecorder();
}
