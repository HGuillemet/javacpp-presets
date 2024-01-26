// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.onnx;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.onnx.global.onnx.*;

// -------------------------------------------------------------------

@Namespace("onnx") @NoOffset @Properties(inherit = org.bytedeco.onnx.presets.onnx.class)
public class TensorAnnotation extends MessageLite {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorAnnotation(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorAnnotation(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorAnnotation position(long position) {
        return (TensorAnnotation)super.position(position);
    }
    @Override public TensorAnnotation getPointer(long i) {
        return new TensorAnnotation((Pointer)this).offsetAddress(i);
    }

  public TensorAnnotation() { super((Pointer)null); allocate(); }
  private native void allocate();

  public TensorAnnotation(@Const @ByRef TensorAnnotation from) { super((Pointer)null); allocate(from); }
  private native void allocate(@Const @ByRef TensorAnnotation from);

  public native @ByRef @Name("operator =") TensorAnnotation put(@Const @ByRef TensorAnnotation from);

  public native @StdString BytePointer unknown_fields();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_unknown_fields();

  public static native @Const @ByRef TensorAnnotation default_instance();
  public static native @Const TensorAnnotation internal_default_instance();
  @MemberGetter public static native int kIndexInFileMessages();
  public static final int kIndexInFileMessages = kIndexInFileMessages();

  
  public native void Swap(TensorAnnotation other);
  public native void UnsafeArenaSwap(TensorAnnotation other);

  // implements Message ----------------------------------------------

  public native TensorAnnotation New(Arena arena/*=nullptr*/);
  public native TensorAnnotation New();
  public native void CheckTypeAndMergeFrom(@Const @ByRef MessageLite from);
  public native void CopyFrom(@Const @ByRef TensorAnnotation from);
  public native void MergeFrom(@Const @ByRef TensorAnnotation from);
  public native void Clear();
  public native @Cast("bool") boolean IsInitialized();

  public native @Cast("size_t") long ByteSizeLong();
  public native @Cast("const char*") BytePointer _InternalParse(@Cast("const char*") BytePointer ptr, ParseContext ctx);
  public native String _InternalParse(String ptr, ParseContext ctx);
  public native int GetCachedSize();

  public native @StdString BytePointer GetTypeName();

  // nested types ----------------------------------------------------

  // accessors -------------------------------------------------------

  /** enum onnx::TensorAnnotation:: */
  public static final int
    kQuantParameterTensorNamesFieldNumber = 2,
    kTensorNameFieldNumber = 1;
  // repeated .onnx.StringStringEntryProto quant_parameter_tensor_names = 2;
  public native int quant_parameter_tensor_names_size();
  public native void clear_quant_parameter_tensor_names();
  public native StringStringEntryProto mutable_quant_parameter_tensor_names(int index);
  public native @Const @ByRef StringStringEntryProto quant_parameter_tensor_names(int index);
  public native StringStringEntryProto add_quant_parameter_tensor_names();

  // optional string tensor_name = 1;
  public native @Cast("bool") boolean has_tensor_name();
  public native void clear_tensor_name();
  public native @StdString BytePointer tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer mutable_tensor_name();
  public native @StdString @Cast({"char*", "std::string*"}) BytePointer release_tensor_name();
  public native void set_allocated_tensor_name(@StdString @Cast({"char*", "std::string*"}) BytePointer tensor_name);
}
