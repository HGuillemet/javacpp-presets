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
 *  \class INMSLayer
 * 
 *  \brief A non-maximum suppression layer in a network definition.
 * 
 *  The NMS algorithm iterates through a set of bounding boxes and their confidence scores, in decreasing
 *  order of score. Boxes are selected if their score is above a given threshold, and their
 *  intersection-over-union (IoU) with previously selected boxes is less than or equal to a given threshold.
 *  This layer implements NMS per batch item and per class.
 * 
 *  For each batch item, the ordering of candidate bounding boxes with the same score is unspecified.
 * 
 *  The layer has the following inputs, in order of input index:
 * 
 *  * Boxes contains the input bounding boxes. It is a linear tensor of type kFLOAT or kHALF. It has
 *    shape [batchSize, numInputBoundingBoxes, numClasses, 4] if the boxes are per class, or
 *    [batchSize, numInputBoundingBoxes, 4] if the same boxes are to be used for each class.
 *  * Scores contains the per-box scores. It is a linear tensor of the same type as Boxes. It has shape
 *    [batchSize, numInputBoundingBoxes, numClasses].
 *  * MaxOutputBoxesPerClass is the maximum number of output boxes per batch item per class.
 *    It is a scalar (0D tensor) of type kINT32.
 *  * IoUThreshold is the maximum IoU for selected boxes. It is a scalar (0D tensor) of type kFLOAT in the range
 *    [0.0f, 1.0f]. It is an optional input with default 0.0f.
 *  * ScoreThreshold is the value that a box score must exceed in order to be selected. It is a scalar (0D tensor) of type kFLOAT. It is an optional
 *    input with default 0.0f.
 * 
 *  The layer has the following outputs, in order of output index:
 * 
 *  * SelectedIndices contains the indices of the selected boxes. It is a linear tensor of type kINT32. It has shape
 *    [NumOutputBoxes, 3]. Each row contains a (batchIndex, classIndex, boxIndex) tuple.
 *    The output boxes are sorted in order of increasing batchIndex and then in order of decreasing score within each batchIndex.
 *    For each batchIndex, the ordering of output boxes with the same score is unspecified.
 *    If MaxOutputBoxesPerClass is a constant input, the maximum number of output boxes is
 *    batchSize * numClasses * min(numInputBoundingBoxes, MaxOutputBoxesPerClass).
 *    Otherwise, the maximum number of output boxes is batchSize * numClasses * numInputBoundingBoxes.
 *    The maximum number of output boxes is used to determine the upper-bound on allocated memory for this output tensor.
 *  * NumOutputBoxes is the number of output boxes in SelectedIndices. It is a scalar (0D tensor) of type kINT32.
 * 
 *  \warning There is a hardware-dependent limit K such that only the K highest scoring boxes in each batch item
 *  will be considered for selection. The value of K is 2000 for SM 5.3 and 6.2 devices, and 5000 otherwise.
 * 
 *  \warning Do not inherit from this class, as doing so will break forward-compatibility of the API and ABI.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class INMSLayer extends ILayer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public INMSLayer(Pointer p) { super(p); }

    /**
     *  \brief Set the bounding box format parameter for the layer.
     * 
     *  The default value for the bounding box format parameter is kCORNER_PAIRS.
     * 
     *  @see BoundingBoxFormat
     * 
     *  @see getBoundingBoxFormat()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) void setBoundingBoxFormat(BoundingBoxFormat fmt);
    public native @NoException(true) void setBoundingBoxFormat(@Cast("nvinfer1::BoundingBoxFormat") int fmt);

    /**
     *  \brief Get the bounding box format parameter for the layer.
     * 
     *  @see BoundingBoxFormat
     * 
     *  @see setBoundingBoxFormat()
     *  */
    
    
    //!
    //!
    //!
    //!
    public native @NoException(true) BoundingBoxFormat getBoundingBoxFormat();

    /**
     *  \brief Set the TopK box limit parameter for the layer.
     * 
     *  The TopK box limit is the maximum number of filtered boxes considered for selection per batch item.
     *  The default value for the TopK box limit parameter is 2000 for SM 5.3 and 6.2 devices, and 5000 otherwise.
     *  The TopK box limit must be less than or equal to {2000 for SM 5.3 and 6.2 devices, 5000 otherwise}.
     * 
     *  @see getTopKBoxLimit()
     *  */
    
    
    //!
    //!
    //!
    public native @NoException(true) void setTopKBoxLimit(int _limit);

    /**
     *  \brief Get the TopK box limit parameter for the layer.
     * 
     *  @see setTopKBoxLimit()
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getTopKBoxLimit();

    /**
     *  \brief Append or replace an input of this layer with a specific tensor
     * 
     *  @param index the index of the input to modify.
     *  @param tensor the new input tensor
     * 
     *  The indices are as follows:
     * 
     *  - 0: The required Boxes tensor.
     *  - 1: The required Scores tensor.
     *  - 2: The required MaxOutputBoxesPerClass tensor.
     *  - 3: The optional IoUThreshold tensor.
     *  - 4: The optional ScoreThreshold tensor.
     * 
     *  If this function is called for an index greater or equal to getNbInputs(),
     *  then afterwards getNbInputs() returns index + 1, and any missing intervening
     *  inputs are set to null. Note that only optional inputs can be missing.
     *  */
}
