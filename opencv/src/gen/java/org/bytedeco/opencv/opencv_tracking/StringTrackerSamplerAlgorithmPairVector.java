// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_tracking;

import org.bytedeco.javacpp.annotation.Index;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
import org.bytedeco.opencv.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_plot.*;
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_video.*;
import static org.bytedeco.opencv.global.opencv_video.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_tracking.*;

@Name("std::vector<std::pair<cv::String,cv::Ptr<cv::TrackerSamplerAlgorithm> > >") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class StringTrackerSamplerAlgorithmPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringTrackerSamplerAlgorithmPairVector(Pointer p) { super(p); }
    public StringTrackerSamplerAlgorithmPairVector(BytePointer[] firstValue, TrackerSamplerAlgorithm[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringTrackerSamplerAlgorithmPairVector(String[] firstValue, TrackerSamplerAlgorithm[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public StringTrackerSamplerAlgorithmPairVector()       { allocate();  }
    public StringTrackerSamplerAlgorithmPairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StringTrackerSamplerAlgorithmPairVector put(@ByRef StringTrackerSamplerAlgorithmPairVector x);

    public boolean empty() { return size() == 0; }
    public native long size();
    public void clear() { resize(0); }
    public native void resize(@Cast("size_t") long n);

    @Index(function = "at") public native @Str BytePointer first(@Cast("size_t") long i); public native StringTrackerSamplerAlgorithmPairVector first(@Cast("size_t") long i, BytePointer first);
    @Index(function = "at") public native @Ptr TrackerSamplerAlgorithm second(@Cast("size_t") long i);  public native StringTrackerSamplerAlgorithmPairVector second(@Cast("size_t") long i, TrackerSamplerAlgorithm second);
    @MemberSetter @Index(function = "at") public native StringTrackerSamplerAlgorithmPairVector first(@Cast("size_t") long i, @Str String first);

    public StringTrackerSamplerAlgorithmPairVector put(BytePointer[] firstValue, TrackerSamplerAlgorithm[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }

    public StringTrackerSamplerAlgorithmPairVector put(String[] firstValue, TrackerSamplerAlgorithm[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

