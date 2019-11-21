// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

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


                    /** \brief Selective search segmentation algorithm
                        The class implements the algorithm described in \cite uijlings2013selective.
                     */
                    @Namespace("cv::ximgproc::segmentation") @Properties(inherit = org.bytedeco.opencv.presets.opencv_ximgproc.class)
public class SelectiveSearchSegmentation extends Algorithm {
                        static { Loader.load(); }
                        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
                        public SelectiveSearchSegmentation(Pointer p) { super(p); }
                    

                            /** \brief Set a image used by switch* functions to initialize the class
                                @param img The image
                            */
                            public native void setBaseImage(@ByVal Mat img);
                            public native void setBaseImage(@ByVal UMat img);
                            public native void setBaseImage(@ByVal GpuMat img);

                            /** \brief Initialize the class with the 'Single stragegy' parameters describled in \cite uijlings2013selective.
                                @param k The k parameter for the graph segmentation
                                @param sigma The sigma parameter for the graph segmentation
                            */
                            public native void switchToSingleStrategy(int k/*=200*/, float sigma/*=0.8f*/);
                            public native void switchToSingleStrategy();

                            /** \brief Initialize the class with the 'Selective search fast' parameters describled in \cite uijlings2013selective.
                                @param base_k The k parameter for the first graph segmentation
                                @param inc_k The increment of the k parameter for all graph segmentations
                                @param sigma The sigma parameter for the graph segmentation
                            */
                            public native void switchToSelectiveSearchFast(int base_k/*=150*/, int inc_k/*=150*/, float sigma/*=0.8f*/);
                            public native void switchToSelectiveSearchFast();

                            /** \brief Initialize the class with the 'Selective search fast' parameters describled in \cite uijlings2013selective.
                                @param base_k The k parameter for the first graph segmentation
                                @param inc_k The increment of the k parameter for all graph segmentations
                                @param sigma The sigma parameter for the graph segmentation
                            */
                            public native void switchToSelectiveSearchQuality(int base_k/*=150*/, int inc_k/*=150*/, float sigma/*=0.8f*/);
                            public native void switchToSelectiveSearchQuality();

                            /** \brief Add a new image in the list of images to process.
                                @param img The image
                            */
                            public native void addImage(@ByVal Mat img);
                            public native void addImage(@ByVal UMat img);
                            public native void addImage(@ByVal GpuMat img);

                            /** \brief Clear the list of images to process
                            */
                            public native void clearImages();

                            /** \brief Add a new graph segmentation in the list of graph segementations to process.
                                @param g The graph segmentation
                            */
                            public native void addGraphSegmentation(@Ptr GraphSegmentation g);

                            /** \brief Clear the list of graph segmentations to process;
                            */
                            public native void clearGraphSegmentations();

                            /** \brief Add a new strategy in the list of strategy to process.
                                @param s The strategy
                            */
                            public native void addStrategy(@Ptr SelectiveSearchSegmentationStrategy s);

                            /** \brief Clear the list of strategy to process;
                            */
                            public native void clearStrategies();

                            /** \brief Based on all images, graph segmentations and stragies, computes all possible rects and return them
                                @param rects The list of rects. The first ones are more relevents than the lasts ones.
                            */
                            public native void process(@ByRef RectVector rects);
                    }
