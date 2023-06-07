// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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



/** \brief This class represents high-level API for text recognition networks.
 *
 * TextRecognitionModel allows to set params for preprocessing input image.
 * TextRecognitionModel creates net from file with trained weights and config,
 * sets preprocessing input, runs forward pass and return recognition result.
 * For TextRecognitionModel, CRNN-CTC is supported.
 */
@Namespace("cv::dnn") @Properties(inherit = org.bytedeco.opencv.presets.opencv_dnn.class)
public class TextRecognitionModel extends Model {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TextRecognitionModel(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TextRecognitionModel(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TextRecognitionModel position(long position) {
        return (TextRecognitionModel)super.position(position);
    }
    @Override public TextRecognitionModel getPointer(long i) {
        return new TextRecognitionModel((Pointer)this).offsetAddress(i);
    }

    public TextRecognitionModel() { super((Pointer)null); allocate(); }
    @Deprecated private native void allocate();

    /**
     * \brief Create Text Recognition model from deep learning network
     * Call setDecodeType() and setVocabulary() after constructor to initialize the decoding method
     * @param network [in] Net object
     */
    public TextRecognitionModel(@Const @ByRef Net network) { super((Pointer)null); allocate(network); }
    private native void allocate(@Const @ByRef Net network);

    /**
     * \brief Create text recognition model from network represented in one of the supported formats
     * Call setDecodeType() and setVocabulary() after constructor to initialize the decoding method
     * @param model [in] Binary file contains trained weights
     * @param config [in] Text file contains network configuration
     */
    public TextRecognitionModel(@StdString BytePointer model, @StdString BytePointer config/*=""*/) { super((Pointer)null); allocate(model, config); }
    private native void allocate(@StdString BytePointer model, @StdString BytePointer config/*=""*/);
    public TextRecognitionModel(@StdString BytePointer model) { super((Pointer)null); allocate(model); }
    private native void allocate(@StdString BytePointer model);
    public TextRecognitionModel(@StdString String model, @StdString String config/*=""*/) { super((Pointer)null); allocate(model, config); }
    private native void allocate(@StdString String model, @StdString String config/*=""*/);
    public TextRecognitionModel(@StdString String model) { super((Pointer)null); allocate(model); }
    private native void allocate(@StdString String model);

    /**
     * \brief Set the decoding method of translating the network output into string
     * @param decodeType [in] The decoding method of translating the network output into string, currently supported type:
     *    - {@code "CTC-greedy"} greedy decoding for the output of CTC-based methods
     *    - {@code "CTC-prefix-beam-search"} Prefix beam search decoding for the output of CTC-based methods
     */
    public native @ByRef TextRecognitionModel setDecodeType(@StdString BytePointer decodeType);
    public native @ByRef TextRecognitionModel setDecodeType(@StdString String decodeType);

    /**
     * \brief Get the decoding method
     * @return the decoding method
     */
    public native @StdString BytePointer getDecodeType();

    /**
     * \brief Set the decoding method options for {@code "CTC-prefix-beam-search"} decode usage
     * @param beamSize [in] Beam size for search
     * @param vocPruneSize [in] Parameter to optimize big vocabulary search,
     * only take top \p vocPruneSize tokens in each search step, \p vocPruneSize <= 0 stands for disable this prune.
     */
    public native @ByRef TextRecognitionModel setDecodeOptsCTCPrefixBeamSearch(int beamSize, int vocPruneSize/*=0*/);
    public native @ByRef TextRecognitionModel setDecodeOptsCTCPrefixBeamSearch(int beamSize);

    /**
     * \brief Set the vocabulary for recognition.
     * @param vocabulary [in] the associated vocabulary of the network.
     */
    public native @ByRef TextRecognitionModel setVocabulary(@Const @ByRef StringVector vocabulary);

    /**
     * \brief Get the vocabulary for recognition.
     * @return vocabulary the associated vocabulary
     */
    public native @Const @ByRef StringVector getVocabulary();

    /**
     * \brief Given the \p input frame, create input blob, run net and return recognition result
     * @param frame [in] The input image
     * @return The text recognition result
     */
    public native @StdString BytePointer recognize(@ByVal Mat frame);
    public native @StdString String recognize(@ByVal UMat frame);
    public native @StdString BytePointer recognize(@ByVal GpuMat frame);

    /**
     * \brief Given the \p input frame, create input blob, run net and return recognition result
     * @param frame [in] The input image
     * @param roiRects [in] List of text detection regions of interest (cv::Rect, CV_32SC4). ROIs is be cropped as the network inputs
     * @param results [out] A set of text recognition results.
     */
    public native void recognize(@ByVal Mat frame, @ByVal MatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal Mat frame, @ByVal UMatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal Mat frame, @ByVal GpuMatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal UMat frame, @ByVal MatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal UMat frame, @ByVal UMatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal UMat frame, @ByVal GpuMatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal GpuMat frame, @ByVal MatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal GpuMat frame, @ByVal UMatVector roiRects, @ByRef StringVector results);
    public native void recognize(@ByVal GpuMat frame, @ByVal GpuMatVector roiRects, @ByRef StringVector results);
}
