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

// -------------------------------------------------------------------

@Namespace("caffe") @NoOffset @Properties(inherit = org.bytedeco.caffe.presets.caffe.class)
public class ConvolutionParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ConvolutionParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ConvolutionParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ConvolutionParameter position(long position) {
        return (ConvolutionParameter)super.position(position);
    }

  public ConvolutionParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ConvolutionParameter(@Const @ByRef ConvolutionParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ConvolutionParameter from);

  public native @ByRef @Name("operator =") ConvolutionParameter put(@Const @ByRef ConvolutionParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ConvolutionParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ConvolutionParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ConvolutionParameter other);
  

  // implements Message ----------------------------------------------

  public native final ConvolutionParameter New();

  public native final ConvolutionParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ConvolutionParameter from);
  public native void MergeFrom(@Const @ByRef ConvolutionParameter from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------
  @MemberGetter public static native @Cast("const caffe::ConvolutionParameter::Engine") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const caffe::ConvolutionParameter::Engine") int CAFFE();
  public static final int CAFFE = CAFFE();
  @MemberGetter public static native @Cast("const caffe::ConvolutionParameter::Engine") int CUDNN();
  public static final int CUDNN = CUDNN();
  public static native @Cast("bool") boolean Engine_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::ConvolutionParameter::Engine") int Engine_MIN();
  public static final int Engine_MIN = Engine_MIN();
  @MemberGetter public static native @Cast("const caffe::ConvolutionParameter::Engine") int Engine_MAX();
  public static final int Engine_MAX = Engine_MAX();
  @MemberGetter public static native int Engine_ARRAYSIZE();
  public static final int Engine_ARRAYSIZE = Engine_ARRAYSIZE();
  public static native @Const EnumDescriptor Engine_descriptor();
  public static native @StdString BytePointer Engine_Name(@Cast("caffe::ConvolutionParameter::Engine") int value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::ConvolutionParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::ConvolutionParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::ConvolutionParameter::Engine*") int[] value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::ConvolutionParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::ConvolutionParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::ConvolutionParameter::Engine*") int[] value);

  // accessors -------------------------------------------------------

  // repeated uint32 pad = 3;
  public native int pad_size();
  public native void clear_pad();
  @MemberGetter public static native int kPadFieldNumber();
  public static final int kPadFieldNumber = kPadFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad(int index);
  public native void set_pad(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_pad(@Cast("google::protobuf::uint32") int value);

  // repeated uint32 kernel_size = 4;
  public native int kernel_size_size();
  public native void clear_kernel_size();
  @MemberGetter public static native int kKernelSizeFieldNumber();
  public static final int kKernelSizeFieldNumber = kKernelSizeFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernel_size(int index);
  public native void set_kernel_size(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_kernel_size(@Cast("google::protobuf::uint32") int value);

  // repeated uint32 stride = 6;
  public native int stride_size();
  public native void clear_stride();
  @MemberGetter public static native int kStrideFieldNumber();
  public static final int kStrideFieldNumber = kStrideFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride(int index);
  public native void set_stride(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_stride(@Cast("google::protobuf::uint32") int value);

  // repeated uint32 dilation = 18;
  public native int dilation_size();
  public native void clear_dilation();
  @MemberGetter public static native int kDilationFieldNumber();
  public static final int kDilationFieldNumber = kDilationFieldNumber();
  public native @Cast("google::protobuf::uint32") int dilation(int index);
  public native void set_dilation(int index, @Cast("google::protobuf::uint32") int value);
  public native void add_dilation(@Cast("google::protobuf::uint32") int value);

  // optional .caffe.FillerParameter weight_filler = 7;
  public native @Cast("bool") boolean has_weight_filler();
  public native void clear_weight_filler();
  @MemberGetter public static native int kWeightFillerFieldNumber();
  public static final int kWeightFillerFieldNumber = kWeightFillerFieldNumber();
  public native @Const @ByRef FillerParameter weight_filler();
  public native FillerParameter release_weight_filler();
  public native FillerParameter mutable_weight_filler();
  public native void set_allocated_weight_filler(FillerParameter weight_filler);

  // optional .caffe.FillerParameter bias_filler = 8;
  public native @Cast("bool") boolean has_bias_filler();
  public native void clear_bias_filler();
  @MemberGetter public static native int kBiasFillerFieldNumber();
  public static final int kBiasFillerFieldNumber = kBiasFillerFieldNumber();
  public native @Const @ByRef FillerParameter bias_filler();
  public native FillerParameter release_bias_filler();
  public native FillerParameter mutable_bias_filler();
  public native void set_allocated_bias_filler(FillerParameter bias_filler);

  // optional uint32 num_output = 1;
  public native @Cast("bool") boolean has_num_output();
  public native void clear_num_output();
  @MemberGetter public static native int kNumOutputFieldNumber();
  public static final int kNumOutputFieldNumber = kNumOutputFieldNumber();
  public native @Cast("google::protobuf::uint32") int num_output();
  public native void set_num_output(@Cast("google::protobuf::uint32") int value);

  // optional uint32 pad_h = 9 [default = 0];
  public native @Cast("bool") boolean has_pad_h();
  public native void clear_pad_h();
  @MemberGetter public static native int kPadHFieldNumber();
  public static final int kPadHFieldNumber = kPadHFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad_h();
  public native void set_pad_h(@Cast("google::protobuf::uint32") int value);

  // optional uint32 pad_w = 10 [default = 0];
  public native @Cast("bool") boolean has_pad_w();
  public native void clear_pad_w();
  @MemberGetter public static native int kPadWFieldNumber();
  public static final int kPadWFieldNumber = kPadWFieldNumber();
  public native @Cast("google::protobuf::uint32") int pad_w();
  public native void set_pad_w(@Cast("google::protobuf::uint32") int value);

  // optional uint32 kernel_h = 11;
  public native @Cast("bool") boolean has_kernel_h();
  public native void clear_kernel_h();
  @MemberGetter public static native int kKernelHFieldNumber();
  public static final int kKernelHFieldNumber = kKernelHFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernel_h();
  public native void set_kernel_h(@Cast("google::protobuf::uint32") int value);

  // optional uint32 kernel_w = 12;
  public native @Cast("bool") boolean has_kernel_w();
  public native void clear_kernel_w();
  @MemberGetter public static native int kKernelWFieldNumber();
  public static final int kKernelWFieldNumber = kKernelWFieldNumber();
  public native @Cast("google::protobuf::uint32") int kernel_w();
  public native void set_kernel_w(@Cast("google::protobuf::uint32") int value);

  // optional uint32 stride_h = 13;
  public native @Cast("bool") boolean has_stride_h();
  public native void clear_stride_h();
  @MemberGetter public static native int kStrideHFieldNumber();
  public static final int kStrideHFieldNumber = kStrideHFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride_h();
  public native void set_stride_h(@Cast("google::protobuf::uint32") int value);

  // optional uint32 stride_w = 14;
  public native @Cast("bool") boolean has_stride_w();
  public native void clear_stride_w();
  @MemberGetter public static native int kStrideWFieldNumber();
  public static final int kStrideWFieldNumber = kStrideWFieldNumber();
  public native @Cast("google::protobuf::uint32") int stride_w();
  public native void set_stride_w(@Cast("google::protobuf::uint32") int value);

  // optional .caffe.ConvolutionParameter.Engine engine = 15 [default = DEFAULT];
  public native @Cast("bool") boolean has_engine();
  public native void clear_engine();
  @MemberGetter public static native int kEngineFieldNumber();
  public static final int kEngineFieldNumber = kEngineFieldNumber();
  public native @Cast("caffe::ConvolutionParameter_Engine") int engine();
  public native void set_engine(@Cast("caffe::ConvolutionParameter_Engine") int value);

  // optional bool force_nd_im2col = 17 [default = false];
  public native @Cast("bool") boolean has_force_nd_im2col();
  public native void clear_force_nd_im2col();
  @MemberGetter public static native int kForceNdIm2ColFieldNumber();
  public static final int kForceNdIm2ColFieldNumber = kForceNdIm2ColFieldNumber();
  public native @Cast("bool") boolean force_nd_im2col();
  public native void set_force_nd_im2col(@Cast("bool") boolean value);

  // optional int32 axis = 16 [default = 1];
  public native @Cast("bool") boolean has_axis();
  public native void clear_axis();
  @MemberGetter public static native int kAxisFieldNumber();
  public static final int kAxisFieldNumber = kAxisFieldNumber();
  public native @Cast("google::protobuf::int32") int axis();
  public native void set_axis(@Cast("google::protobuf::int32") int value);

  // optional bool bias_term = 2 [default = true];
  public native @Cast("bool") boolean has_bias_term();
  public native void clear_bias_term();
  @MemberGetter public static native int kBiasTermFieldNumber();
  public static final int kBiasTermFieldNumber = kBiasTermFieldNumber();
  public native @Cast("bool") boolean bias_term();
  public native void set_bias_term(@Cast("bool") boolean value);

  // optional uint32 group = 5 [default = 1];
  public native @Cast("bool") boolean has_group();
  public native void clear_group();
  @MemberGetter public static native int kGroupFieldNumber();
  public static final int kGroupFieldNumber = kGroupFieldNumber();
  public native @Cast("google::protobuf::uint32") int group();
  public native void set_group(@Cast("google::protobuf::uint32") int value);
}
