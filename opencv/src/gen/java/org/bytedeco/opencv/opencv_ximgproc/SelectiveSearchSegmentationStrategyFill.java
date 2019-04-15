// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.opencv.opencv_ximgproc;

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
import org.bytedeco.opencv.opencv_flann.*;
import static org.bytedeco.opencv.global.opencv_flann.*;
import org.bytedeco.opencv.opencv_features2d.*;
import static org.bytedeco.opencv.global.opencv_features2d.*;
import org.bytedeco.opencv.opencv_calib3d.*;
import static org.bytedeco.opencv.global.opencv_calib3d.*;

import static org.bytedeco.opencv.global.opencv_ximgproc.*;


                    /** \brief Fill-based strategy for the selective search segmentation algorithm
                        The class is implemented from the algorithm described in \cite uijlings2013selective.
                     */
                    @Namespace("cv::ximgproc::segmentation") @Opaque @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class SelectiveSearchSegmentationStrategyFill extends SelectiveSearchSegmentationStrategy {
                        /** Empty constructor. Calls {@code super((Pointer)null)}. */
                        public SelectiveSearchSegmentationStrategyFill() { super((Pointer)null); }
                        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                        public SelectiveSearchSegmentationStrategyFill(Pointer p) { super(p); }
                    }
