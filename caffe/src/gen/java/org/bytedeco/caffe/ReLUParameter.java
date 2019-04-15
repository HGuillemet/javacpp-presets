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
public class ReLUParameter extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ReLUParameter(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ReLUParameter(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ReLUParameter position(long position) {
        return (ReLUParameter)super.position(position);
    }

  public ReLUParameter() { super((Pointer)null); allocate(); }
  private native void allocate();

  public ReLUParameter(@Const @ByRef ReLUParameter from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef ReLUParameter from);

  public native @ByRef @Name("operator =") ReLUParameter put(@Const @ByRef ReLUParameter from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef ReLUParameter default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const ReLUParameter internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(ReLUParameter other);
  

  // implements Message ----------------------------------------------

  public native final ReLUParameter New();

  public native final ReLUParameter New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef ReLUParameter from);
  public native void MergeFrom(@Const @ByRef ReLUParameter from);
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
  @MemberGetter public static native @Cast("const caffe::ReLUParameter::Engine") int DEFAULT();
  public static final int DEFAULT = DEFAULT();
  @MemberGetter public static native @Cast("const caffe::ReLUParameter::Engine") int CAFFE();
  public static final int CAFFE = CAFFE();
  @MemberGetter public static native @Cast("const caffe::ReLUParameter::Engine") int CUDNN();
  public static final int CUDNN = CUDNN();
  public static native @Cast("bool") boolean Engine_IsValid(int value);
  @MemberGetter public static native @Cast("const caffe::ReLUParameter::Engine") int Engine_MIN();
  public static final int Engine_MIN = Engine_MIN();
  @MemberGetter public static native @Cast("const caffe::ReLUParameter::Engine") int Engine_MAX();
  public static final int Engine_MAX = Engine_MAX();
  @MemberGetter public static native int Engine_ARRAYSIZE();
  public static final int Engine_ARRAYSIZE = Engine_ARRAYSIZE();
  public static native @Const EnumDescriptor Engine_descriptor();
  public static native @StdString BytePointer Engine_Name(@Cast("caffe::ReLUParameter::Engine") int value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::ReLUParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::ReLUParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::ReLUParameter::Engine*") int[] value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::ReLUParameter::Engine*") IntPointer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString BytePointer name,
        @Cast("caffe::ReLUParameter::Engine*") IntBuffer value);
  public static native @Cast("bool") boolean Engine_Parse(@StdString String name,
        @Cast("caffe::ReLUParameter::Engine*") int[] value);

  // accessors -------------------------------------------------------

  // optional float negative_slope = 1 [default = 0];
  public native @Cast("bool") boolean has_negative_slope();
  public native void clear_negative_slope();
  @MemberGetter public static native int kNegativeSlopeFieldNumber();
  public static final int kNegativeSlopeFieldNumber = kNegativeSlopeFieldNumber();
  public native float negative_slope();
  public native void set_negative_slope(float value);

  // optional .caffe.ReLUParameter.Engine engine = 2 [default = DEFAULT];
  public native @Cast("bool") boolean has_engine();
  public native void clear_engine();
  @MemberGetter public static native int kEngineFieldNumber();
  public static final int kEngineFieldNumber = kEngineFieldNumber();
  public native @Cast("caffe::ReLUParameter_Engine") int engine();
  public native void set_engine(@Cast("caffe::ReLUParameter_Engine") int value);
}
