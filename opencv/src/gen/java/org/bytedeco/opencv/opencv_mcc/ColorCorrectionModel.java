// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_mcc;

import org.bytedeco.javacpp.annotation.Index;
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
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;
import org.bytedeco.opencv.opencv_dnn.*;
import static org.bytedeco.opencv.global.opencv_dnn.*;

import static org.bytedeco.opencv.global.opencv_mcc.*;


/** \brief Core class of ccm model
<p>
Produce a ColorCorrectionModel instance for inference
*/
@Namespace("cv::ccm") @NoOffset @Properties(inherit = org.bytedeco.opencv.presets.opencv_mcc.class)
public class ColorCorrectionModel extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ColorCorrectionModel(Pointer p) { super(p); }

    /** \brief Color Correction Model
    <p>
    Supported list of color cards:
    - \ref COLORCHECKER_Macbeth, the Macbeth ColorChecker
    - \ref COLORCHECKER_Vinyl, the DKK ColorChecker
    - \ref COLORCHECKER_DigitalSG, the DigitalSG ColorChecker with 140 squares
    <p>
    @param src detected colors of ColorChecker patches;\n
                the color type is RGB not BGR, and the color values are in [0, 1];
    @param constcolor the Built-in color card
    */
    public ColorCorrectionModel(@Const @ByRef Mat src, @Cast("cv::ccm::CONST_COLOR") int constcolor) { super((Pointer)null); allocate(src, constcolor); }
    private native void allocate(@Const @ByRef Mat src, @Cast("cv::ccm::CONST_COLOR") int constcolor);

    /** \brief Color Correction Model
    @param src detected colors of ColorChecker patches;\n
               the color type is RGB not BGR, and the color values are in [0, 1];
    @param colors the reference color values, the color values are in [0, 1].\n
    @param ref_cs the corresponding color space
                If the color type is some RGB, the format is RGB not BGR;\n
    */
    public ColorCorrectionModel(@Const @ByRef Mat src, @ByVal Mat colors, @Cast("cv::ccm::COLOR_SPACE") int ref_cs) { super((Pointer)null); allocate(src, colors, ref_cs); }
    private native void allocate(@Const @ByRef Mat src, @ByVal Mat colors, @Cast("cv::ccm::COLOR_SPACE") int ref_cs);

    /** \brief Color Correction Model
    @param src detected colors of ColorChecker patches;\n
                the color type is RGB not BGR, and the color values are in [0, 1];
    @param colors the reference color values, the color values are in [0, 1].
    @param ref_cs the corresponding color space
                If the color type is some RGB, the format is RGB not BGR;
    @param colored mask of colored color
    */
    public ColorCorrectionModel(@Const @ByRef Mat src, @ByVal Mat colors, @Cast("cv::ccm::COLOR_SPACE") int ref_cs, @ByVal Mat colored) { super((Pointer)null); allocate(src, colors, ref_cs, colored); }
    private native void allocate(@Const @ByRef Mat src, @ByVal Mat colors, @Cast("cv::ccm::COLOR_SPACE") int ref_cs, @ByVal Mat colored);

    /** \brief set ColorSpace
    \note It should be some RGB color space;
    Supported list of color cards:
    - \ref COLOR_SPACE_sRGB
    - \ref COLOR_SPACE_AdobeRGB
    - \ref COLOR_SPACE_WideGamutRGB
    - \ref COLOR_SPACE_ProPhotoRGB
    - \ref COLOR_SPACE_DCI_P3_RGB
    - \ref COLOR_SPACE_AppleRGB
    - \ref COLOR_SPACE_REC_709_RGB
    - \ref COLOR_SPACE_REC_2020_RGB
     @param cs the absolute color space that detected colors convert to;\n
              default: \ref COLOR_SPACE_sRGB
    */
    public native void setColorSpace(@Cast("cv::ccm::COLOR_SPACE") int cs);

    /** \brief set ccm_type
    @param ccm_type the shape of color correction matrix(CCM);\n
                    default: \ref CCM_3x3
    */
    public native void setCCM_TYPE(@Cast("cv::ccm::CCM_TYPE") int ccm_type);

    /** \brief set Distance
    @param distance the type of color distance;\n
                    default: \ref DISTANCE_CIE2000
    */
    public native void setDistance(@Cast("cv::ccm::DISTANCE_TYPE") int distance);

    /** \brief set Linear
    @param linear_type the method of linearization;\n
                       default: \ref LINEARIZATION_GAMMA
    */
    public native void setLinear(@Cast("cv::ccm::LINEAR_TYPE") int linear_type);

    /** \brief set Gamma
    <p>
    \note only valid when linear is set to "gamma";\n
    <p>
    @param gamma the gamma value of gamma correction;\n
                 default: 2.2;
    */
    public native void setLinearGamma(double gamma);

    /** \brief set degree
        \note only valid when linear is set to
       - \ref LINEARIZATION_COLORPOLYFIT
       - \ref LINEARIZATION_GRAYPOLYFIT
       - \ref LINEARIZATION_COLORLOGPOLYFIT
       - \ref LINEARIZATION_GRAYLOGPOLYFIT
    <p>
    @param deg the degree of linearization polynomial;\n
            default: 3
    <p>
    */
    public native void setLinearDegree(int deg);

    /** \brief set SaturatedThreshold.
                The colors in the closed interval [lower, upper] are reserved to participate
                in the calculation of the loss function and initialization parameters
    @param lower the lower threshold to determine saturation;\n
            default: 0;
    @param upper the upper threshold to determine saturation;\n
                 default: 0
    */
    public native void setSaturatedThreshold(double lower, double upper);

    /** \brief set WeightsList
    @param weights_list the list of weight of each color;\n
                        default: empty array
    */
    public native void setWeightsList(@Const @ByRef Mat weights_list);

    /** \brief set WeightCoeff
    @param weights_coeff the exponent number of L* component of the reference color in CIE Lab color space;\n
                         default: 0
    */
    public native void setWeightCoeff(double weights_coeff);

    /** \brief set InitialMethod
    @param initial_method_type the method of calculating CCM initial value;\n
            default: INITIAL_METHOD_LEAST_SQUARE
    */
    public native void setInitialMethod(@Cast("cv::ccm::INITIAL_METHOD_TYPE") int initial_method_type);

    /** \brief set MaxCount
    @param max_count used in MinProblemSolver-DownhillSolver;\n
        Terminal criteria to the algorithm;\n
                     default: 5000;
    */
    public native void setMaxCount(int max_count);

    /** \brief set Epsilon
    @param epsilon used in MinProblemSolver-DownhillSolver;\n
        Terminal criteria to the algorithm;\n
                   default: 1e-4;
    */
    public native void setEpsilon(double epsilon);

    /** \brief make color correction */
    public native void run();

    public native @ByVal Mat getCCM();
    public native double getLoss();
    public native @ByVal Mat get_src_rgbl();
    public native @ByVal Mat get_dst_rgbl();
    public native @ByVal Mat getMask();
    public native @ByVal Mat getWeights();

    /** \brief Infer using fitting ccm.
    @param img the input image.
    @param islinear default false.
    @return the output array.
    */
    public native @ByVal Mat infer(@Const @ByRef Mat img, @Cast("bool") boolean islinear/*=false*/);
    public native @ByVal Mat infer(@Const @ByRef Mat img);

    @Opaque public static class Impl extends Pointer {
        /** Empty constructor. Calls {@code super((Pointer)null)}. */
        public Impl() { super((Pointer)null); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public Impl(Pointer p) { super(p); }
    }
}
