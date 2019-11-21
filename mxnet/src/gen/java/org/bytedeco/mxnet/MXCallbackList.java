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


@Properties(inherit = org.bytedeco.mxnet.presets.mxnet.class)
public class MXCallbackList extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MXCallbackList() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MXCallbackList(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MXCallbackList(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MXCallbackList position(long position) {
        return (MXCallbackList)super.position(position);
    }

  public native int num_callbacks(); public native MXCallbackList num_callbacks(int setter);
  public static class Int_Callbacks extends FunctionPointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public    Int_Callbacks(Pointer p) { super(p); }
      protected Int_Callbacks() { allocate(); }
      private native void allocate();
      public native int call();
  }
  public native Int_Callbacks callbacks(int i); public native MXCallbackList callbacks(int i, Int_Callbacks setter);
  public native @Cast("int (**)(void)") PointerPointer callbacks(); public native MXCallbackList callbacks(PointerPointer setter);
  public native Pointer contexts(int i); public native MXCallbackList contexts(int i, Pointer setter);
  public native @Cast("void**") PointerPointer contexts(); public native MXCallbackList contexts(PointerPointer setter);
}
