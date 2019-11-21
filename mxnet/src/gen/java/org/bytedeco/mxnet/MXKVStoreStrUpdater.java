// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.mxnet;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;

import static org.bytedeco.mxnet.global.mxnet.*;

/**
 * \brief user-defined updater for the kvstore with string keys
 * It's this updater's responsibility to delete \a recv and \a local
 * @param the key
 * @param recv the pushed value on this key
 * @param local the value stored on local on this key
 * @param handle The additional handle to the updater
 */
@Properties(inherit = org.bytedeco.mxnet.presets.mxnet.class)
public class MXKVStoreStrUpdater extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    MXKVStoreStrUpdater(Pointer p) { super(p); }
    protected MXKVStoreStrUpdater() { allocate(); }
    private native void allocate();
    public native void call(@Cast("const char*") BytePointer key,
                                   NDArrayHandle recv,
                                   NDArrayHandle local,
                                   Pointer handle);
}
