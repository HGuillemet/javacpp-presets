// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.caffe;

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
import org.bytedeco.hdf5.*;
import static org.bytedeco.hdf5.global.hdf5.*;

import static org.bytedeco.caffe.global.caffe.*;



@Name("caffe::RMSPropSolver<float>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class FloatRMSPropSolver extends FloatSGDSolver {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatRMSPropSolver(Pointer p) { super(p); }

  public FloatRMSPropSolver(@Const @ByRef SolverParameter param) { super((Pointer)null); allocate(param); }
  private native void allocate(@Const @ByRef SolverParameter param);
  public FloatRMSPropSolver(@Const @StdString @ByRef BytePointer param_file) { super((Pointer)null); allocate(param_file); }
  private native void allocate(@Const @StdString @ByRef BytePointer param_file);
  public FloatRMSPropSolver(@Const @StdString @ByRef String param_file) { super((Pointer)null); allocate(param_file); }
  private native void allocate(@Const @StdString @ByRef String param_file);
  @Virtual public native @Const({false, false, true}) @Cast("const char*") BytePointer type();
  @Virtual protected native void ComputeUpdateValue(int param_id, float rate);
}
