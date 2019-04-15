// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

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



@Name("caffe::LayerRegisterer<double>") @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class DoubleLayerRegisterer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleLayerRegisterer(Pointer p) { super(p); }

  public static class Creator_LayerParameter extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Creator_LayerParameter(Pointer p) { super(p); }
      protected Creator_LayerParameter() { allocate(); }
      private native void allocate();
      public native @Cast({"", "boost::shared_ptr<caffe::Layer<double> >"}) @SharedPtr @ByVal DoubleLayer call(@Const @ByRef LayerParameter arg0);
  }
  public DoubleLayerRegisterer(@StdString BytePointer type,
                    Creator_LayerParameter creator) { super((Pointer)null); allocate(type, creator); }
  private native void allocate(@StdString BytePointer type,
                    Creator_LayerParameter creator);
  public DoubleLayerRegisterer(@StdString String type,
                    Creator_LayerParameter creator) { super((Pointer)null); allocate(type, creator); }
  private native void allocate(@StdString String type,
                    Creator_LayerParameter creator);
}
