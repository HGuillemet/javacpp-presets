// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;

// -------------------------------------------------------------------

@Namespace("tensorflow") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class OpDef_AttrDef extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OpDef_AttrDef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OpDef_AttrDef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OpDef_AttrDef position(long position) {
        return (OpDef_AttrDef)super.position(position);
    }

  public OpDef_AttrDef() { super((Pointer)null); allocate(); }
  private native void allocate();

  public OpDef_AttrDef(@Const @ByRef OpDef_AttrDef from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef OpDef_AttrDef from);

  public native @ByRef @Name("operator =") OpDef_AttrDef put(@Const @ByRef OpDef_AttrDef from);
//   #if LANG_CXX11
//   #endif
  public native Arena GetArena();
  public native Pointer GetMaybeArenaPointer();
  public static native @Cast("const google::protobuf::Descriptor*") Pointer descriptor();
  public static native @Const @ByRef OpDef_AttrDef default_instance();

  public static native void InitAsDefaultInstance();  // FOR INTERNAL USE ONLY
  public static native @Const OpDef_AttrDef internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  public native void UnsafeArenaSwap(OpDef_AttrDef other);
  public native void Swap(OpDef_AttrDef other);
  

  // implements Message ----------------------------------------------

  public native OpDef_AttrDef New();

  public native OpDef_AttrDef New(Arena arena);
  public native void CopyFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void MergeFrom(@Cast("const google::protobuf::Message*") @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef OpDef_AttrDef from);
  public native void MergeFrom(@Const @ByRef OpDef_AttrDef from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("bool") boolean MergePartialFromCodedStream(
        CodedInputStream input);
  public native void SerializeWithCachedSizes(
        CodedOutputStream output);
  public native @Cast("google::protobuf::uint8*") BytePointer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") BytePointer target);
  public native @Cast("google::protobuf::uint8*") ByteBuffer InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") ByteBuffer target);
  public native @Cast("google::protobuf::uint8*") byte[] InternalSerializeWithCachedSizesToArray(
        @Cast("bool") boolean deterministic, @Cast("google::protobuf::uint8*") byte[] target);
  public native int GetCachedSize();

  public native @ByVal @Cast("google::protobuf::Metadata*") Pointer GetMetadata();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  // string name = 1;
  public native void clear_name();
  @MemberGetter public static native int kNameFieldNumber();
  public static final int kNameFieldNumber = kNameFieldNumber();
  public native @StdString BytePointer name();
  public native void set_name(@StdString BytePointer value);
  public native void set_name(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_name(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_name(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_name();
  public native void set_allocated_name(@StdString @Cast({"char*", "std::string*"}) BytePointer name);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_name();
  public native @Deprecated void unsafe_arena_set_allocated_name(
        @StdString @Cast({"char*", "std::string*"}) BytePointer name);

  // string type = 2;
  public native void clear_type();
  @MemberGetter public static native int kTypeFieldNumber();
  public static final int kTypeFieldNumber = kTypeFieldNumber();
  public native @StdString BytePointer type();
  public native void set_type(@StdString BytePointer value);
  public native void set_type(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_type(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_type(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_type();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_type();
  public native void set_allocated_type(@StdString @Cast({"char*", "std::string*"}) BytePointer type);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_type();
  public native @Deprecated void unsafe_arena_set_allocated_type(
        @StdString @Cast({"char*", "std::string*"}) BytePointer type);

  // string description = 4;
  public native void clear_description();
  @MemberGetter public static native int kDescriptionFieldNumber();
  public static final int kDescriptionFieldNumber = kDescriptionFieldNumber();
  public native @StdString BytePointer description();
  public native void set_description(@StdString BytePointer value);
  public native void set_description(@StdString String value);
//   #if LANG_CXX11
//   #endif
  public native void set_description(@Cast("const char*") BytePointer value, @Cast("size_t") long size);
  public native void set_description(String value, @Cast("size_t") long size);
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_description();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_description();
  public native void set_allocated_description(@StdString @Cast({"char*", "std::string*"}) BytePointer description);
  public native @Deprecated @StdString @Cast({"char*", "std::string*"}) BytePointer unsafe_arena_release_description();
  public native @Deprecated void unsafe_arena_set_allocated_description(
        @StdString @Cast({"char*", "std::string*"}) BytePointer description);

  // .tensorflow.AttrValue default_value = 3;
  public native @Cast("bool") boolean has_default_value();
  public native void clear_default_value();
  @MemberGetter public static native int kDefaultValueFieldNumber();
  public static final int kDefaultValueFieldNumber = kDefaultValueFieldNumber();
  public native @Const @ByRef AttrValue default_value();
  public native AttrValue release_default_value();
  public native AttrValue mutable_default_value();
  public native void set_allocated_default_value(AttrValue default_value);
  public native void unsafe_arena_set_allocated_default_value(
        AttrValue default_value);
  public native AttrValue unsafe_arena_release_default_value();

  // .tensorflow.AttrValue allowed_values = 7;
  public native @Cast("bool") boolean has_allowed_values();
  public native void clear_allowed_values();
  @MemberGetter public static native int kAllowedValuesFieldNumber();
  public static final int kAllowedValuesFieldNumber = kAllowedValuesFieldNumber();
  public native @Const @ByRef AttrValue allowed_values();
  public native AttrValue release_allowed_values();
  public native AttrValue mutable_allowed_values();
  public native void set_allocated_allowed_values(AttrValue allowed_values);
  public native void unsafe_arena_set_allocated_allowed_values(
        AttrValue allowed_values);
  public native AttrValue unsafe_arena_release_allowed_values();

  // int64 minimum = 6;
  public native void clear_minimum();
  @MemberGetter public static native int kMinimumFieldNumber();
  public static final int kMinimumFieldNumber = kMinimumFieldNumber();
  public native @Cast("google::protobuf::int64") long minimum();
  public native void set_minimum(@Cast("google::protobuf::int64") long value);

  // bool has_minimum = 5;
  public native void clear_has_minimum();
  @MemberGetter public static native int kHasMinimumFieldNumber();
  public static final int kHasMinimumFieldNumber = kHasMinimumFieldNumber();
  public native @Cast("bool") boolean has_minimum();
  public native void set_has_minimum(@Cast("bool") boolean value);
}
