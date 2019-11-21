// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

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
public class NetState extends Message {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NetState(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NetState(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public NetState position(long position) {
        return (NetState)super.position(position);
    }

  public NetState() { super((Pointer)null); allocate(); }
  private native void allocate();

  public NetState(@Const @ByRef NetState from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef NetState from);

  public native @ByRef @Name("operator =") NetState put(@Const @ByRef NetState from);
//   #if LANG_CXX11
//   #endif
  public native @Const @ByRef UnknownFieldSet unknown_fields();
  public native UnknownFieldSet mutable_unknown_fields();

  public static native @Const Descriptor descriptor();
  public static native @Const @ByRef NetState default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const NetState internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void Swap(NetState other);
  

  // implements Message ----------------------------------------------

  public native final NetState New();

  public native final NetState New(Arena arena);
  public native final void CopyFrom(@Const @ByRef Message from);
  public native final void MergeFrom(@Const @ByRef Message from);
  public native void CopyFrom(@Const @ByRef NetState from);
  public native void MergeFrom(@Const @ByRef NetState from);
  public native final void Clear();
  public native @Cast("bool") final boolean IsInitialized();

  public native @Cast("size_t") final long ByteSizeLong();
//   #if GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
//   #else
  public native @Cast("bool") final boolean MergePartialFromCodedStream(
        CodedInputStream input);
//   #endif  // GOOGLE_PROTOBUF_ENABLE_EXPERIMENTAL_PARSER
  public native final void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") final BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") final ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") final byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("google::protobuf::uint8*") byte[] target);
  public native final int GetCachedSize();

  public native @ByVal final Metadata GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // repeated string stage = 3;
  public native int stage_size();
  public native void clear_stage();
  @MemberGetter public static native int kStageFieldNumber();
  public static final int kStageFieldNumber = kStageFieldNumber();
  public native @StdString BytePointer stage(int index);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_stage(int index);
  public native void set_stage(int index, @StdString BytePointer value);
  public native void set_stage(int index, @StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_stage(int index, @Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_stage(int index, String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer add_stage();
  public native void add_stage(@StdString BytePointer value);
  public native void add_stage(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void add_stage(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void add_stage(String value, @Cast("size_t") long size);

  // optional int32 level = 2 [default = 0];
  public native @Cast("bool") boolean has_level();
  public native void clear_level();
  @MemberGetter public static native int kLevelFieldNumber();
  public static final int kLevelFieldNumber = kLevelFieldNumber();
  public native @Cast("google::protobuf::int32") int level();
  public native void set_level(@Cast("google::protobuf::int32") int value);

  // optional .caffe.Phase phase = 1 [default = TEST];
  public native @Cast("bool") boolean has_phase();
  public native void clear_phase();
  @MemberGetter public static native int kPhaseFieldNumber();
  public static final int kPhaseFieldNumber = kPhaseFieldNumber();
  public native @Cast("caffe::Phase") int phase();
  public native void set_phase(@Cast("caffe::Phase") int value);
}
