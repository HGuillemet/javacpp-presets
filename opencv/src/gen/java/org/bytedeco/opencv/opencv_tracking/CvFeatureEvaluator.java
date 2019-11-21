// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

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


@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class CvFeatureEvaluator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CvFeatureEvaluator(Pointer p) { super(p); }

  public native void init( @Const CvFeatureParams _featureParams, int _maxSampleCount, @ByVal Size _winSize );
  public native void setImage( @Const @ByRef Mat img, @Cast("uchar") byte clsLabel, int idx );
  public native void writeFeatures( @ByRef FileStorage fs, @Const @ByRef Mat featureMap );
  public native @Name("operator ()") float apply( int featureIdx, int sampleIdx );
  public static native @Ptr CvFeatureEvaluator create(@Cast("cv::CvFeatureParams::FeatureType") int type);

  public native int getNumFeatures();
  public native int getMaxCatCount();
  public native int getFeatureSize();
  public native @Const @ByRef Mat getCls();
  public native float getCls( int si );
}
