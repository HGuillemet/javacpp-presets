// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;


// Describes a single field of a message.  To get the descriptor for a given
// field, first get the Descriptor for the message in which it is defined,
// then call Descriptor::FindFieldByName().  To get a FieldDescriptor for
// an extension, do one of the following:
// - Get the Descriptor or FileDescriptor for its containing scope, then
//   call Descriptor::FindExtensionByName() or
//   FileDescriptor::FindExtensionByName().
// - Given a DescriptorPool, call DescriptorPool::FindExtensionByNumber() or
//   DescriptorPool::FindExtensionByPrintableName().
// Use DescriptorPool to construct your own descriptors.
@Namespace("google::protobuf") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class FieldDescriptor extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FieldDescriptor(Pointer p) { super(p); }


  // Identifies a field type.  0 is reserved for errors.  The order is weird
  // for historical reasons.  Types 12 and up are new in proto2.
  /** enum google::protobuf::FieldDescriptor::Type */
  public static final int
    TYPE_DOUBLE = 1,    // double, exactly eight bytes on the wire.
    TYPE_FLOAT = 2,     // float, exactly four bytes on the wire.
    TYPE_INT64 = 3,     // int64, varint on the wire.  Negative numbers
                        // take 10 bytes.  Use TYPE_SINT64 if negative
                        // values are likely.
    TYPE_UINT64 = 4,    // uint64, varint on the wire.
    TYPE_INT32 = 5,     // int32, varint on the wire.  Negative numbers
                        // take 10 bytes.  Use TYPE_SINT32 if negative
                        // values are likely.
    TYPE_FIXED64 = 6,   // uint64, exactly eight bytes on the wire.
    TYPE_FIXED32 = 7,   // uint32, exactly four bytes on the wire.
    TYPE_BOOL = 8,      // bool, varint on the wire.
    TYPE_STRING = 9,    // UTF-8 text.
    TYPE_GROUP = 10,    // Tag-delimited message.  Deprecated.
    TYPE_MESSAGE = 11,  // Length-delimited message.

    TYPE_BYTES = 12,     // Arbitrary byte array.
    TYPE_UINT32 = 13,    // uint32, varint on the wire
    TYPE_ENUM = 14,      // Enum, varint on the wire
    TYPE_SFIXED32 = 15,  // int32, exactly four bytes on the wire
    TYPE_SFIXED64 = 16,  // int64, exactly eight bytes on the wire
    TYPE_SINT32 = 17,    // int32, ZigZag-encoded varint on the wire
    TYPE_SINT64 = 18,    // int64, ZigZag-encoded varint on the wire

    MAX_TYPE = 18;  // Constant useful for defining lookup tables
                    // indexed by Type.

  // Specifies the C++ data type used to represent the field.  There is a
  // fixed mapping from Type to CppType where each Type maps to exactly one
  // CppType.  0 is reserved for errors.
  /** enum google::protobuf::FieldDescriptor::CppType */
  public static final int
    CPPTYPE_INT32 = 1,     // TYPE_INT32, TYPE_SINT32, TYPE_SFIXED32
    CPPTYPE_INT64 = 2,     // TYPE_INT64, TYPE_SINT64, TYPE_SFIXED64
    CPPTYPE_UINT32 = 3,    // TYPE_UINT32, TYPE_FIXED32
    CPPTYPE_UINT64 = 4,    // TYPE_UINT64, TYPE_FIXED64
    CPPTYPE_DOUBLE = 5,    // TYPE_DOUBLE
    CPPTYPE_FLOAT = 6,     // TYPE_FLOAT
    CPPTYPE_BOOL = 7,      // TYPE_BOOL
    CPPTYPE_ENUM = 8,      // TYPE_ENUM
    CPPTYPE_STRING = 9,    // TYPE_STRING, TYPE_BYTES
    CPPTYPE_MESSAGE = 10,  // TYPE_MESSAGE, TYPE_GROUP

    MAX_CPPTYPE = 10;  // Constant useful for defining lookup tables
                       // indexed by CppType.

  // Identifies whether the field is optional, required, or repeated.  0 is
  // reserved for errors.
  /** enum google::protobuf::FieldDescriptor::Label */
  public static final int
    LABEL_OPTIONAL = 1,  // optional
    LABEL_REQUIRED = 2,  // required
    LABEL_REPEATED = 3,  // repeated

    MAX_LABEL = 3;  // Constant useful for defining lookup tables
                    // indexed by Label.

  // Valid field numbers are positive integers up to kMaxNumber.
  @MemberGetter public static native int kMaxNumber();
  public static final int kMaxNumber = kMaxNumber();

  // First field number reserved for the protocol buffer library implementation.
  // Users may not declare fields that use reserved numbers.
  @MemberGetter public static native int kFirstReservedNumber();
  public static final int kFirstReservedNumber = kFirstReservedNumber();
  // Last field number reserved for the protocol buffer library implementation.
  // Users may not declare fields that use reserved numbers.
  @MemberGetter public static native int kLastReservedNumber();
  public static final int kLastReservedNumber = kLastReservedNumber();

  public native @StdString BytePointer name();  // Name of this field within the message.
  public native @StdString BytePointer full_name();  // Fully-qualified name of the field.
  public native @StdString BytePointer json_name();  // JSON name of this field.
  public native @Const FileDescriptor file();  // File in which this field was defined.
  public native @Cast("bool") boolean is_extension();           // Is this an extension field?
  public native int number();                  // Declared tag number.

  // Same as name() except converted to lower-case.  This (and especially the
  // FindFieldByLowercaseName() method) can be useful when parsing formats
  // which prefer to use lowercase naming style.  (Although, technically
  // field names should be lowercased anyway according to the protobuf style
  // guide, so this only makes a difference when dealing with old .proto files
  // which do not follow the guide.)
  public native @StdString BytePointer lowercase_name();

  // Same as name() except converted to camel-case.  In this conversion, any
  // time an underscore appears in the name, it is removed and the next
  // letter is capitalized.  Furthermore, the first letter of the name is
  // lower-cased.  Examples:
  //   FooBar -> fooBar
  //   foo_bar -> fooBar
  //   fooBar -> fooBar
  // This (and especially the FindFieldByCamelcaseName() method) can be useful
  // when parsing formats which prefer to use camel-case naming style.
  public native @StdString BytePointer camelcase_name();

  public native @Cast("google::protobuf::FieldDescriptor::Type") int type();                  // Declared type of this field.
  public native @Cast("const char*") BytePointer type_name();      // Name of the declared type.
  public native @Cast("google::protobuf::FieldDescriptor::CppType") int cpp_type();           // C++ type of this field.
  public native @Cast("const char*") BytePointer cpp_type_name();  // Name of the C++ type.
  public native @Cast("google::protobuf::FieldDescriptor::Label") int label();                // optional/required/repeated

  public native @Cast("bool") boolean is_required();  // shorthand for label() == LABEL_REQUIRED
  public native @Cast("bool") boolean is_optional();  // shorthand for label() == LABEL_OPTIONAL
  public native @Cast("bool") boolean is_repeated();  // shorthand for label() == LABEL_REPEATED
  public native @Cast("bool") boolean is_packable();  // shorthand for is_repeated() &&
                             //               IsTypePackable(type())
  public native @Cast("bool") boolean is_packed();    // shorthand for is_packable() &&
                             //               options().packed()
  public native @Cast("bool") boolean is_map();       // shorthand for type() == TYPE_MESSAGE &&
                             // message_type()->options().map_entry()

  // Returns true if this field was syntactically written with "optional" in the
  // .proto file. Excludes singular proto3 fields that do not have a label.
  public native @Cast("bool") boolean has_optional_keyword();

  // Returns true if this field tracks presence, ie. does the field
  // distinguish between "unset" and "present with default value."
  // This includes required, optional, and oneof fields. It excludes maps,
  // repeated fields, and singular proto3 fields without "optional".
  //
  // For fields where has_presence() == true, the return value of
  // Reflection::HasField() is semantically meaningful.
  public native @Cast("bool") boolean has_presence();

  // Index of this field within the message's field array, or the file or
  // extension scope's extensions array.
  public native int index();

  // Does this field have an explicitly-declared default value?
  public native @Cast("bool") boolean has_default_value();

  // Whether the user has specified the json_name field option in the .proto
  // file.
  public native @Cast("bool") boolean has_json_name();

  // Get the field default value if cpp_type() == CPPTYPE_INT32.  If no
  // explicit default was defined, the default is 0.
  public native int default_value_int32_t();
  public native int default_value_int32();
  // Get the field default value if cpp_type() == CPPTYPE_INT64.  If no
  // explicit default was defined, the default is 0.
  public native @Cast("int64_t") long default_value_int64_t();
  public native @Cast("int64_t") long default_value_int64();
  // Get the field default value if cpp_type() == CPPTYPE_UINT32.  If no
  // explicit default was defined, the default is 0.
  public native @Cast("uint32_t") int default_value_uint32_t();
  public native @Cast("uint32_t") int default_value_uint32();
  // Get the field default value if cpp_type() == CPPTYPE_UINT64.  If no
  // explicit default was defined, the default is 0.
  public native @Cast("uint64_t") long default_value_uint64_t();
  public native @Cast("uint64_t") long default_value_uint64();
  // Get the field default value if cpp_type() == CPPTYPE_FLOAT.  If no
  // explicit default was defined, the default is 0.0.
  public native float default_value_float();
  // Get the field default value if cpp_type() == CPPTYPE_DOUBLE.  If no
  // explicit default was defined, the default is 0.0.
  public native double default_value_double();
  // Get the field default value if cpp_type() == CPPTYPE_BOOL.  If no
  // explicit default was defined, the default is false.
  public native @Cast("bool") boolean default_value_bool();
  // Get the field default value if cpp_type() == CPPTYPE_ENUM.  If no
  // explicit default was defined, the default is the first value defined
  // in the enum type (all enum types are required to have at least one value).
  // This never returns nullptr.
  public native @Const EnumValueDescriptor default_value_enum();
  // Get the field default value if cpp_type() == CPPTYPE_STRING.  If no
  // explicit default was defined, the default is the empty string.
  public native @StdString BytePointer default_value_string();

  // The Descriptor for the message of which this is a field.  For extensions,
  // this is the extended type.  Never nullptr.
  public native @Cast("const google::protobuf::Descriptor*") Pointer containing_type();

  // If the field is a member of a oneof, this is the one, otherwise this is
  // nullptr.
  public native @Const OneofDescriptor containing_oneof();

  // If the field is a member of a non-synthetic oneof, returns the descriptor
  // for the oneof, otherwise returns nullptr.
  public native @Const OneofDescriptor real_containing_oneof();

  // If the field is a member of a oneof, returns the index in that oneof.
  public native int index_in_oneof();

  // An extension may be declared within the scope of another message.  If this
  // field is an extension (is_extension() is true), then extension_scope()
  // returns that message, or nullptr if the extension was declared at global
  // scope.  If this is not an extension, extension_scope() is undefined (may
  // assert-fail).
  public native @Cast("const google::protobuf::Descriptor*") Pointer extension_scope();

  // If type is TYPE_MESSAGE or TYPE_GROUP, returns a descriptor for the
  // message or the group type.  Otherwise, returns null.
  public native @Cast("const google::protobuf::Descriptor*") Pointer message_type();
  // If type is TYPE_ENUM, returns a descriptor for the enum.  Otherwise,
  // returns null.
  public native @Const EnumDescriptor enum_type();

  // Get the FieldOptions for this field.  This includes things listed in
  // square brackets after the field definition.  E.g., the field:
  //   optional string text = 1 [ctype=CORD];
  // has the "ctype" option set.  Allowed options are defined by FieldOptions in
  // descriptor.proto, and any available extensions of that message.
  public native @Const @ByRef FieldOptions options();

  // See Descriptor::CopyTo().
  public native void CopyTo(FieldDescriptorProto proto);

  // See Descriptor::DebugString().
  public native @StdString BytePointer DebugString();

  // See Descriptor::DebugStringWithOptions().
  public native @StdString BytePointer DebugStringWithOptions(@Const @ByRef DebugStringOptions options);

  // Helper method to get the CppType for a particular Type.
  public static native @Cast("google::protobuf::FieldDescriptor::CppType") int TypeToCppType(@Cast("google::protobuf::FieldDescriptor::Type") int type);

  // Helper method to get the name of a Type.
  public static native @Cast("const char*") BytePointer TypeName(@Cast("google::protobuf::FieldDescriptor::Type") int type);

  // Helper method to get the name of a CppType.
  public static native @Cast("const char*") BytePointer CppTypeName(@Cast("google::protobuf::FieldDescriptor::CppType") int cpp_type);

  // Return true iff [packed = true] is valid for fields of this type.
  public static native @Cast("bool") boolean IsTypePackable(@Cast("google::protobuf::FieldDescriptor::Type") int field_type);

  // Returns full_name() except if the field is a MessageSet extension,
  // in which case it returns the full_name() of the containing message type
  // for backwards compatibility with proto1.
  //
  // A MessageSet extension is defined as an optional message extension
  // whose containing type has the message_set_wire_format option set.
  // This should be true of extensions of google.protobuf.bridge.MessageSet;
  // by convention, such extensions are named "message_set_extension".
  //
  // The opposite operation (looking up an extension's FieldDescriptor given
  // its printable name) can be accomplished with
  //     message->file()->pool()->FindExtensionByPrintableName(message, name)
  // where the extension extends "message".
  public native @StdString BytePointer PrintableNameForExtension();

  // Source Location ---------------------------------------------------

  // Updates |*out_location| to the source location of the complete
  // extent of this field declaration.  Returns false and leaves
  // |*out_location| unchanged iff location information was not available.
  public native @Cast("bool") boolean GetSourceLocation(SourceLocation out_location);
}
