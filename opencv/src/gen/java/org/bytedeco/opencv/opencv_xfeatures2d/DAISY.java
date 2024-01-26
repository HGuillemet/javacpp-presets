// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_xfeatures2d;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_ml.*;
import static org.bytedeco.opencv.global.opencv_ml.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;
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
import org.bytedeco.opencv.opencv_shape.*;
import static org.bytedeco.opencv.global.opencv_shape.*;

import static org.bytedeco.opencv.global.opencv_xfeatures2d.*;


/** \brief Class implementing DAISY descriptor, described in \cite Tola10
<p>
@param radius radius of the descriptor at the initial scale
@param q_radius amount of radial range division quantity
@param q_theta amount of angular range division quantity
@param q_hist amount of gradient orientations range division quantity
@param norm choose descriptors normalization type, where
DAISY::NRM_NONE will not do any normalization (default),
DAISY::NRM_PARTIAL mean that histograms are normalized independently for L2 norm equal to 1.0,
DAISY::NRM_FULL mean that descriptors are normalized for L2 norm equal to 1.0,
DAISY::NRM_SIFT mean that descriptors are normalized for L2 norm equal to 1.0 but no individual one is bigger than 0.154 as in SIFT
@param H optional 3x3 homography matrix used to warp the grid of daisy but sampling keypoints remains unwarped on image
@param interpolation switch to disable interpolation for speed improvement at minor quality loss
@param use_orientation sample patterns using keypoints orientation, disabled by default.
 <p>
 */
@Namespace("cv::xfeatures2d") @Properties(inherit = org.bytedeco.opencv.presets.opencv_xfeatures2d.class)
public class DAISY extends Feature2D {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DAISY(Pointer p) { super(p); }
    /** Downcast constructor. */
    public DAISY(Algorithm pointer) { super((Pointer)null); allocate(pointer); }
    @Namespace private native @Name("dynamic_cast<cv::xfeatures2d::DAISY*>") void allocate(Algorithm pointer);

    /** enum cv::xfeatures2d::DAISY::NormalizationType */
    public static final int
        NRM_NONE = 100, NRM_PARTIAL = 101, NRM_FULL = 102, NRM_SIFT = 103;
    public static native @Ptr DAISY create( float radius/*=15*/, int q_radius/*=3*/, int q_theta/*=8*/,
                    int q_hist/*=8*/, @Cast("cv::xfeatures2d::DAISY::NormalizationType") int norm/*=cv::xfeatures2d::DAISY::NRM_NONE*/, @ByVal(nullValue = "cv::InputArray(cv::noArray())") Mat H,
                    @Cast("bool") boolean interpolation/*=true*/, @Cast("bool") boolean use_orientation/*=false*/ );
    public static native @Ptr DAISY create( );
    public static native @Ptr DAISY create( float radius/*=15*/, int q_radius/*=3*/, int q_theta/*=8*/,
                    int q_hist/*=8*/, @Cast("cv::xfeatures2d::DAISY::NormalizationType") int norm/*=cv::xfeatures2d::DAISY::NRM_NONE*/, @ByVal(nullValue = "cv::InputArray(cv::noArray())") UMat H,
                    @Cast("bool") boolean interpolation/*=true*/, @Cast("bool") boolean use_orientation/*=false*/ );
    public static native @Ptr DAISY create( float radius/*=15*/, int q_radius/*=3*/, int q_theta/*=8*/,
                    int q_hist/*=8*/, @Cast("cv::xfeatures2d::DAISY::NormalizationType") int norm/*=cv::xfeatures2d::DAISY::NRM_NONE*/, @ByVal(nullValue = "cv::InputArray(cv::noArray())") GpuMat H,
                    @Cast("bool") boolean interpolation/*=true*/, @Cast("bool") boolean use_orientation/*=false*/ );

    public native void setRadius(float radius);
    public native float getRadius();

    public native void setQRadius(int q_radius);
    public native int getQRadius();

    public native void setQTheta(int q_theta);
    public native int getQTheta();

    public native void setQHist(int q_hist);
    public native int getQHist();

    public native void setNorm(int norm);
    public native int getNorm();

    public native void setH(@ByVal Mat H);
    public native void setH(@ByVal UMat H);
    public native void setH(@ByVal GpuMat H);
    public native @ByVal Mat getH();

    public native void setInterpolation(@Cast("bool") boolean interpolation);
    public native @Cast("bool") boolean getInterpolation();

    public native void setUseOrientation(@Cast("bool") boolean use_orientation);
    public native @Cast("bool") boolean getUseOrientation();

    public native @Str @Override BytePointer getDefaultName();

    /** \overload
     * @param image image to extract descriptors
     * @param keypoints of interest within image
     * @param descriptors resulted descriptors array
     */
    public native @Override void compute( @ByVal Mat image, @ByRef KeyPointVector keypoints, @ByVal Mat descriptors );
    public native @Override void compute( @ByVal UMat image, @ByRef KeyPointVector keypoints, @ByVal UMat descriptors );
    public native @Override void compute( @ByVal GpuMat image, @ByRef KeyPointVector keypoints, @ByVal GpuMat descriptors );

    public native @Override void compute( @ByVal MatVector images,
                              @ByRef KeyPointVectorVector keypoints,
                              @ByVal MatVector descriptors );
    public native @Override void compute( @ByVal UMatVector images,
                              @ByRef KeyPointVectorVector keypoints,
                              @ByVal UMatVector descriptors );
    public native @Override void compute( @ByVal GpuMatVector images,
                              @ByRef KeyPointVectorVector keypoints,
                              @ByVal GpuMatVector descriptors );

    /** \overload
     * @param image image to extract descriptors
     * @param roi region of interest within image
     * @param descriptors resulted descriptors array for roi image pixels
     */
    public native void compute( @ByVal Mat image, @ByVal Rect roi, @ByVal Mat descriptors );
    public native void compute( @ByVal UMat image, @ByVal Rect roi, @ByVal UMat descriptors );
    public native void compute( @ByVal GpuMat image, @ByVal Rect roi, @ByVal GpuMat descriptors );

    /**\overload
     * @param image image to extract descriptors
     * @param descriptors resulted descriptors array for all image pixels
     */
    public native void compute( @ByVal Mat image, @ByVal Mat descriptors );
    public native void compute( @ByVal UMat image, @ByVal UMat descriptors );
    public native void compute( @ByVal GpuMat image, @ByVal GpuMat descriptors );

    /**
     * @param y position y on image
     * @param x position x on image
     * @param orientation orientation on image (0->360)
     * @param descriptor supplied array for descriptor storage
     */
    public native void GetDescriptor( double y, double x, int orientation, FloatPointer descriptor );
    public native void GetDescriptor( double y, double x, int orientation, FloatBuffer descriptor );
    public native void GetDescriptor( double y, double x, int orientation, float[] descriptor );

    /**
     * @param y position y on image
     * @param x position x on image
     * @param orientation orientation on image (0->360)
     * @param descriptor supplied array for descriptor storage
     * @param H homography matrix for warped grid
     */
    public native @Cast("bool") boolean GetDescriptor( double y, double x, int orientation, FloatPointer descriptor, DoublePointer H );
    public native @Cast("bool") boolean GetDescriptor( double y, double x, int orientation, FloatBuffer descriptor, DoubleBuffer H );
    public native @Cast("bool") boolean GetDescriptor( double y, double x, int orientation, float[] descriptor, double[] H );

    /**
     * @param y position y on image
     * @param x position x on image
     * @param orientation orientation on image (0->360)
     * @param descriptor supplied array for descriptor storage
     */
    public native void GetUnnormalizedDescriptor( double y, double x, int orientation, FloatPointer descriptor );
    public native void GetUnnormalizedDescriptor( double y, double x, int orientation, FloatBuffer descriptor );
    public native void GetUnnormalizedDescriptor( double y, double x, int orientation, float[] descriptor );

    /**
     * @param y position y on image
     * @param x position x on image
     * @param orientation orientation on image (0->360)
     * @param descriptor supplied array for descriptor storage
     * @param H homography matrix for warped grid
     */
    public native @Cast("bool") boolean GetUnnormalizedDescriptor( double y, double x, int orientation, FloatPointer descriptor, DoublePointer H );
    public native @Cast("bool") boolean GetUnnormalizedDescriptor( double y, double x, int orientation, FloatBuffer descriptor, DoubleBuffer H );
    public native @Cast("bool") boolean GetUnnormalizedDescriptor( double y, double x, int orientation, float[] descriptor, double[] H );

}
