// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_features2d;

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
import static org.bytedeco.opencv.global.opencv_imgcodecs.*;
import org.bytedeco.opencv.opencv_videoio.*;
import static org.bytedeco.opencv.global.opencv_videoio.*;
import org.bytedeco.opencv.opencv_highgui.*;
import static org.bytedeco.opencv.global.opencv_highgui.*;
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;

import static org.bytedeco.opencv.global.opencv_features2d.*;


/** \brief Class for extracting blobs from an image. :
<p>
The class implements a simple algorithm for extracting blobs from an image:
<p>
1.  Convert the source image to binary images by applying thresholding with several thresholds from
    minThreshold (inclusive) to maxThreshold (exclusive) with distance thresholdStep between
    neighboring thresholds.
2.  Extract connected components from every binary image by findContours and calculate their
    centers.
3.  Group centers from several binary images by their coordinates. Close centers form one group that
    corresponds to one blob, which is controlled by the minDistBetweenBlobs parameter.
4.  From the groups, estimate final centers of blobs and their radiuses and return as locations and
    sizes of keypoints.
<p>
This class performs several filtrations of returned blobs. You should set filterBy\* to true/false
to turn on/off corresponding filtration. Available filtrations:
<p>
-   **By color**. This filter compares the intensity of a binary image at the center of a blob to
blobColor. If they differ, the blob is filtered out. Use blobColor = 0 to extract dark blobs
and blobColor = 255 to extract light blobs.
-   **By area**. Extracted blobs have an area between minArea (inclusive) and maxArea (exclusive).
-   **By circularity**. Extracted blobs have circularity
({@code \frac{4*\pi*Area}{perimeter * perimeter}}) between minCircularity (inclusive) and
maxCircularity (exclusive).
-   **By ratio of the minimum inertia to maximum inertia**. Extracted blobs have this ratio
between minInertiaRatio (inclusive) and maxInertiaRatio (exclusive).
-   **By convexity**. Extracted blobs have convexity (area / area of blob convex hull) between
minConvexity (inclusive) and maxConvexity (exclusive).
<p>
Default values of parameters are tuned to extract dark circular blobs.
 */
@Namespace("cv") @Properties(inherit = org.bytedeco.opencv.presets.opencv_features2d.class)
public class SimpleBlobDetector extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SimpleBlobDetector(Pointer p) { super(p); }
    /** Downcast constructor. */
    public SimpleBlobDetector(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::SimpleBlobDetector*>") void allocate(Algorithm pointer);

  @NoOffset public static class Params extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public Params(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public Params(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public Params position(long position) {
          return (Params)super.position(position);
      }
      @Override public Params getPointer(long i) {
          return new Params((Pointer)this).offsetAddress(i);
      }
  
      public Params() { super((Pointer)null); allocate(); }
      private native void allocate();
      public native float thresholdStep(); public native Params thresholdStep(float setter);
      public native float minThreshold(); public native Params minThreshold(float setter);
      public native float maxThreshold(); public native Params maxThreshold(float setter);
      public native @Cast("size_t") long minRepeatability(); public native Params minRepeatability(long setter);
      public native float minDistBetweenBlobs(); public native Params minDistBetweenBlobs(float setter);

      public native @Cast("bool") boolean filterByColor(); public native Params filterByColor(boolean setter);
      public native @Cast("uchar") byte blobColor(); public native Params blobColor(byte setter);

      public native @Cast("bool") boolean filterByArea(); public native Params filterByArea(boolean setter);
      public native float minArea(); public native Params minArea(float setter);
      public native float maxArea(); public native Params maxArea(float setter);

      public native @Cast("bool") boolean filterByCircularity(); public native Params filterByCircularity(boolean setter);
      public native float minCircularity(); public native Params minCircularity(float setter);
      public native float maxCircularity(); public native Params maxCircularity(float setter);

      public native @Cast("bool") boolean filterByInertia(); public native Params filterByInertia(boolean setter);
      public native float minInertiaRatio(); public native Params minInertiaRatio(float setter);
      public native float maxInertiaRatio(); public native Params maxInertiaRatio(float setter);

      public native @Cast("bool") boolean filterByConvexity(); public native Params filterByConvexity(boolean setter);
      public native float minConvexity(); public native Params minConvexity(float setter);
      public native float maxConvexity(); public native Params maxConvexity(float setter);

      public native @Cast("bool") boolean collectContours(); public native Params collectContours(boolean setter);

      public native void read( @Const @ByRef FileNode fn );
      public native void write( @ByRef FileStorage fs );
  }

  public static native @Ptr SimpleBlobDetector create(@Const @ByRef(nullValue = "cv::SimpleBlobDetector::Params()") Params parameters);
  public static native @Ptr SimpleBlobDetector create();

  public native void setParams(@Const @ByRef Params params );
  public native @ByVal Params getParams();

  public native @Str @Override BytePointer getDefaultName();
  public native @Const @ByRef PointVectorVector getBlobContours();
}
