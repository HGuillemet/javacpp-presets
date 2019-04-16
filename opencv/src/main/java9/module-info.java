module org.bytedeco.opencv {
  requires transitive org.bytedeco.javacpp;
  requires transitive org.bytedeco.openblas;

  exports org.bytedeco.opencv;
  exports org.bytedeco.opencv.global;
  exports org.bytedeco.opencv.opencv_aruco;
  exports org.bytedeco.opencv.opencv_bgsegm;
  exports org.bytedeco.opencv.opencv_bioinspired;
  exports org.bytedeco.opencv.opencv_calib3d;
  exports org.bytedeco.opencv.opencv_core;

  /* comment out cuda exports if building on a system without cuda installed */
  exports org.bytedeco.opencv.opencv_cudaarithm;
  exports org.bytedeco.opencv.opencv_cudafilters;
  exports org.bytedeco.opencv.opencv_cudaimgproc;
  exports org.bytedeco.opencv.opencv_cudaobjdetect;
  exports org.bytedeco.opencv.opencv_cudaoptflow;

  exports org.bytedeco.opencv.opencv_dnn;
  exports org.bytedeco.opencv.opencv_face;
  exports org.bytedeco.opencv.opencv_features2d;
  exports org.bytedeco.opencv.opencv_flann;
  exports org.bytedeco.opencv.opencv_highgui;
  exports org.bytedeco.opencv.opencv_img_hash;
  exports org.bytedeco.opencv.opencv_imgproc;
  exports org.bytedeco.opencv.opencv_ml;
  exports org.bytedeco.opencv.opencv_objdetect;
  exports org.bytedeco.opencv.opencv_optflow;
  exports org.bytedeco.opencv.opencv_phase_unwrapping;
  exports org.bytedeco.opencv.opencv_photo;
  exports org.bytedeco.opencv.opencv_plot;
  exports org.bytedeco.opencv.opencv_quality;
  exports org.bytedeco.opencv.opencv_saliency;
  exports org.bytedeco.opencv.opencv_shape;
  exports org.bytedeco.opencv.opencv_stitching;
  exports org.bytedeco.opencv.opencv_structured_light;
  exports org.bytedeco.opencv.opencv_superres;
  exports org.bytedeco.opencv.opencv_text;
  exports org.bytedeco.opencv.opencv_tracking;
  exports org.bytedeco.opencv.opencv_videoio;
  exports org.bytedeco.opencv.opencv_video;
  exports org.bytedeco.opencv.opencv_videostab;
  exports org.bytedeco.opencv.opencv_xfeatures2d;
  exports org.bytedeco.opencv.opencv_ximgproc;
  exports org.bytedeco.opencv.opencv_xphoto;

  exports org.opencv.android;
  exports org.opencv.aruco;
  exports org.opencv.bgsegm;
  exports org.opencv.bioinspired;
  exports org.opencv.calib3d;
  exports org.opencv.core;
  exports org.opencv.dnn;
  exports org.opencv.face;
  exports org.opencv.features2d;
  exports org.opencv.highgui;
  exports org.opencv.imgcodecs;
  exports org.opencv.img_hash;
  exports org.opencv.imgproc;
  exports org.opencv.ml;
  exports org.opencv.objdetect;
  exports org.opencv.osgi;
  exports org.opencv.phase_unwrapping;
  exports org.opencv.photo;
  exports org.opencv.plot;
  exports org.opencv.structured_light;
  exports org.opencv.text;
  exports org.opencv.tracking;
  exports org.opencv.utils;
  exports org.opencv.video;
  exports org.opencv.videoio;
  exports org.opencv.xfeatures2d;
  exports org.opencv.ximgproc;
  exports org.opencv.xphoto;
}
