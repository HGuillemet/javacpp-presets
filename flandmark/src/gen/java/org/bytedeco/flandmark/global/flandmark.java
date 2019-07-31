// Targeted by JavaCPP version 1.5.2-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.flandmark.global;

import org.bytedeco.flandmark.*;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.opencv.opencv_core.*;
import static org.bytedeco.opencv.global.opencv_core.*;
import org.bytedeco.opencv.opencv_imgproc.*;
import static org.bytedeco.opencv.global.opencv_imgproc.*;

public class flandmark extends org.bytedeco.flandmark.presets.flandmark {
    static { Loader.load(); }

// Parsed from flandmark_detector.h

/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Written (W) 2012 Michal Uricar
 * Copyright (C) 2012 Michal Uricar
 */

// #ifndef __FLANDMARK_DETECTOR_H_
// #define __FLANDMARK_DETECTOR_H_

// #include "msvc-compat.h"
//#include <cv.h>
// #include "opencv2/core/core_c.h"
// #include "opencv2/imgproc/types_c.h"
//#include <cvaux.h>

// index row-order matrices
// #define INDEX(ROW, COL, NUM_ROWS) ((COL)*(NUM_ROWS)+(ROW))
// #define ROW(IDX, ROWS) (((IDX)-1) % (ROWS))
// #define COL(IDX, ROWS) (((IDX)-1) / (ROWS))
// Targeting ../FLANDMARK_PSIG.java


// Targeting ../FLANDMARK_Options.java


// Targeting ../FLANDMARK_LBP.java


// Targeting ../FLANDMARK_Data.java


// Targeting ../FLANDMARK_Model.java


// Targeting ../FLANDMARK_PSI.java


// Targeting ../FLANDMARK_PSI_SPARSE.java


// -------------------------------------------------------------------------

/** enum EError_T */
public static final int
    NO_ERR = 0,
    ERROR_M = 1,
    ERROR_BW = 2,
    ERROR_BW_MARGIN = 3,
    ERROR_W = 4,
    ERROR_DATA_IMAGES = 5,
    ERROR_DATA_MAPTABLE = 6,
    ERROR_DATA_LBP = 7,
    ERROR_DATA_OPTIONS_S = 8,
    ERROR_DATA_OPTIONS_PSIG = 9,
    UNKNOWN_ERROR = 100;

// read / write structure Model from / to file procedures

/**
 * Function flandmark_init
 *
 * Given the path to the file containing the model in binary form, this function will return a pointer to this model. It returns null pointer in the case of failure
 *
 * @param filename [in]
 * @return Pointer to the FLANDMARK_Model data structure
 */
public static native FLANDMARK_Model flandmark_init(@Cast("const char*") BytePointer filename);
public static native FLANDMARK_Model flandmark_init(String filename);

/**
 * Function flandmark_write model
 *
 * This function writes given FLANDMARK_model data structure to a file specified by its path.
 *
 * @param filename [in]
 * @param model [in]
 */
public static native void flandmark_write_model(@Cast("const char*") BytePointer filename, FLANDMARK_Model model);
public static native void flandmark_write_model(String filename, FLANDMARK_Model model);

/**
 * Function flandmark_checkModel
 *
 * This function checks if both given FLANDMARK_Model data structres are equal
 *
 * @param model [in]
 * @param tst [in]
 * @return
 */
public static native @Cast("EError_T") int flandmark_check_model(FLANDMARK_Model model, FLANDMARK_Model tst);

/**
 * Function flandmark_free
 *
 * This function dealocates the FLANDMARK_Model data structure
 *
 * @param model [in]
 */
public static native void flandmark_free(FLANDMARK_Model model);

// getPsiMat (calls LBP features computation - liblbpfeatures from LIBOCAS)
/**
 *
 * @param Psi [out]
 * @param model [in]
 * @param lbpidx [in]
 */
public static native void flandmark_get_psi_mat(FLANDMARK_PSI Psi, FLANDMARK_Model model, int lbpidx);

/**
 * Computes LBP features representing it as sparse matrix (i.e. only inices with ones are stored in connected list)
 *
 * @param Psi [out]
 * @param model [in]
 * @param lbpidx [in]
 */
public static native void flandmark_get_psi_mat_sparse(FLANDMARK_PSI_SPARSE Psi, FLANDMARK_Model model, int lbpidx);

// dot product maximization with max-index return
/**
 * Function maximizedotprod
 *
 * @param [in]
 * @param [in]
 * @param [out]
 */
public static native void flandmark_maximize_gdotprod(DoublePointer maximum, DoublePointer idx, @Const DoublePointer first, @Const DoublePointer second, @Const IntPointer third, int cols, int tsize);
public static native void flandmark_maximize_gdotprod(DoubleBuffer maximum, DoubleBuffer idx, @Const DoubleBuffer first, @Const DoubleBuffer second, @Const IntBuffer third, int cols, int tsize);
public static native void flandmark_maximize_gdotprod(double[] maximum, double[] idx, @Const double[] first, @Const double[] second, @Const int[] third, int cols, int tsize);

/**
 * Function getNormalizedImageFrame
 *
 *
 */
public static native int flandmark_get_normalized_image_frame(IplImage input, @Const IntPointer bbox, DoublePointer bb, @Cast("uint8_t*") BytePointer face_img, FLANDMARK_Model model);
public static native int flandmark_get_normalized_image_frame(IplImage input, @Const IntBuffer bbox, DoubleBuffer bb, @Cast("uint8_t*") ByteBuffer face_img, FLANDMARK_Model model);
public static native int flandmark_get_normalized_image_frame(IplImage input, @Const int[] bbox, double[] bb, @Cast("uint8_t*") byte[] face_img, FLANDMARK_Model model);

/**
 * Function imcrop
 *
 */
public static native int flandmark_imcrop(IplImage input, IplImage output, @Const @ByVal CvRect region);

/**
 * Function argmax
 *
 */
public static native void flandmark_argmax(DoublePointer smax, FLANDMARK_Options options, @Const IntPointer mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @Cast("double**") PointerPointer q, @Cast("double**") PointerPointer g);
public static native void flandmark_argmax(DoublePointer smax, FLANDMARK_Options options, @Const IntPointer mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @ByPtrPtr DoublePointer q, @ByPtrPtr DoublePointer g);
public static native void flandmark_argmax(DoubleBuffer smax, FLANDMARK_Options options, @Const IntBuffer mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @ByPtrPtr DoubleBuffer q, @ByPtrPtr DoubleBuffer g);
public static native void flandmark_argmax(double[] smax, FLANDMARK_Options options, @Const int[] mapTable, FLANDMARK_PSI_SPARSE Psi_sparse, @ByPtrPtr double[] q, @ByPtrPtr double[] g);

/**
 * Function flandmark_detect_base
 *
 * Estimates positions of facial landmarks in the normalized image frame.
 *
 * @param face_image [in] pointer to 1D uint8 array with normalized image frame of face
 * @param model [in] Data structure holding info about model
 * @param int [in, out] array representing 2D array of size [2 x options.M] with estimated positions of landmarks
 * @return int indicator of success or fail of the detection
 */
public static native int flandmark_detect_base(@Cast("uint8_t*") BytePointer face_image, FLANDMARK_Model model, DoublePointer landmarks);
public static native int flandmark_detect_base(@Cast("uint8_t*") ByteBuffer face_image, FLANDMARK_Model model, DoubleBuffer landmarks);
public static native int flandmark_detect_base(@Cast("uint8_t*") byte[] face_image, FLANDMARK_Model model, double[] landmarks);

/**
 * Function flandmark_detect
 *
 * Estimates positions of facial landmarks given the image and the bounding box of the detected face
 *
 */
public static native int flandmark_detect(IplImage img, IntPointer bbox, FLANDMARK_Model model, DoublePointer landmarks, IntPointer bw_margin/*=0*/);
public static native int flandmark_detect(IplImage img, IntPointer bbox, FLANDMARK_Model model, DoublePointer landmarks);
public static native int flandmark_detect(IplImage img, IntBuffer bbox, FLANDMARK_Model model, DoubleBuffer landmarks, IntBuffer bw_margin/*=0*/);
public static native int flandmark_detect(IplImage img, IntBuffer bbox, FLANDMARK_Model model, DoubleBuffer landmarks);
public static native int flandmark_detect(IplImage img, int[] bbox, FLANDMARK_Model model, double[] landmarks, int[] bw_margin/*=0*/);
public static native int flandmark_detect(IplImage img, int[] bbox, FLANDMARK_Model model, double[] landmarks);

// #endif // __LIBFLD_DETECTOR_H_


// Parsed from liblbp.h

/*
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 3 of the License, or
 * (at your option) any later version.
 *
 * Written (W) 2012 Vojtech Franc, Michal Uricar
 * Copyright (C) 2012 Vojtech Franc, Michal Uricar
 */

// #ifndef _liblbp_h
// #define _liblbp_h

// #include "msvc-compat.h"

// #define LIBLBP_INDEX(ROW,COL,NUM_ROWS) ((COL)*(NUM_ROWS)+(ROW))
// #define LIBLBP_MIN(A,B) ((A) > (B) ? (B) : (A))

//typedef long unsigned int t_index;

public static native void liblbp_pyr_features_sparse(@Cast("t_index*") IntPointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features_sparse(@Cast("t_index*") IntBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features_sparse(@Cast("t_index*") int[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features(@Cast("char*") BytePointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features(@Cast("char*") ByteBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native void liblbp_pyr_features(@Cast("char*") byte[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols );
public static native double liblbp_pyr_dotprod(DoublePointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native double liblbp_pyr_dotprod(DoubleBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native double liblbp_pyr_dotprod(double[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_addvec(@Cast("int64_t*") LongPointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_addvec(@Cast("int64_t*") LongBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_addvec(@Cast("int64_t*") long[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_subvec(@Cast("int64_t*") LongPointer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntPointer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_subvec(@Cast("int64_t*") LongBuffer vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") IntBuffer img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native void liblbp_pyr_subvec(@Cast("int64_t*") long[] vec, @Cast("uint32_t") int vec_nDim, @Cast("uint32_t*") int[] img, @Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols);
public static native @Cast("uint32_t") int liblbp_pyr_get_dim(@Cast("uint16_t") short img_nRows, @Cast("uint16_t") short img_nCols, @Cast("uint16_t") short nPyramids);

// #endif


}
