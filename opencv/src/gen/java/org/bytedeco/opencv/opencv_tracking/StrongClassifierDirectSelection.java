// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** \addtogroup tracking
 *  \{ */

//TODO based on the original implementation
//http://vision.ucsd.edu/~bbabenko/project_miltrack.shtml

@Namespace("cv") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_tracking.class)
public class StrongClassifierDirectSelection extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StrongClassifierDirectSelection(Pointer p) { super(p); }


  public StrongClassifierDirectSelection( int numBaseClf, int numWeakClf, @ByVal Size patchSz, @Const @ByRef Rect sampleROI, @Cast("bool") boolean useFeatureEx/*=false*/, int iterationInit/*=0*/ ) { super((Pointer)null); allocate(numBaseClf, numWeakClf, patchSz, sampleROI, useFeatureEx, iterationInit); }
  private native void allocate( int numBaseClf, int numWeakClf, @ByVal Size patchSz, @Const @ByRef Rect sampleROI, @Cast("bool") boolean useFeatureEx/*=false*/, int iterationInit/*=0*/ );
  public StrongClassifierDirectSelection( int numBaseClf, int numWeakClf, @ByVal Size patchSz, @Const @ByRef Rect sampleROI ) { super((Pointer)null); allocate(numBaseClf, numWeakClf, patchSz, sampleROI); }
  private native void allocate( int numBaseClf, int numWeakClf, @ByVal Size patchSz, @Const @ByRef Rect sampleROI );

  public native void initBaseClassifier();

  public native @Cast("bool") boolean update( @Const @ByRef Mat image, int target, float importance/*=1.0*/ );
  public native @Cast("bool") boolean update( @Const @ByRef Mat image, int target );
  public native float eval( @Const @ByRef Mat response );
  public native @StdVector IntPointer getSelectedWeakClassifier();
  public native float classifySmooth( @Const @ByRef MatVector images, @Const @ByRef Rect sampleROI, @ByRef IntPointer idx );
  public native float classifySmooth( @Const @ByRef MatVector images, @Const @ByRef Rect sampleROI, @ByRef IntBuffer idx );
  public native float classifySmooth( @Const @ByRef MatVector images, @Const @ByRef Rect sampleROI, @ByRef int[] idx );
  public native int getNumBaseClassifier();
  public native @ByVal Size getPatchSize();
  public native @ByVal Rect getROI();
  public native @Cast("bool") boolean getUseFeatureExchange();
  public native int getReplacedClassifier();

  public native void replaceWeakClassifier( int idx );
  public native int getSwappedClassifier();
}
