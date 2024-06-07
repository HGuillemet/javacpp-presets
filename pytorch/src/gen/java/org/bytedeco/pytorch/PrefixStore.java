// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PrefixStore extends Store {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PrefixStore(Pointer p) { super(p); }

  public PrefixStore(@StdString BytePointer prefix, @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store) { super((Pointer)null); allocate(prefix, store); }
  private native void allocate(@StdString BytePointer prefix, @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store);
  public PrefixStore(@StdString String prefix, @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store) { super((Pointer)null); allocate(prefix, store); }
  private native void allocate(@StdString String prefix, @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store store);
  public native void set(@StdString BytePointer key, @Cast("const std::vector<uint8_t>*") @ByRef ByteVector value);
  public native void set(@StdString String key, @Cast("const std::vector<uint8_t>*") @ByRef ByteVector value);
  public native @ByVal @Cast("std::vector<uint8_t>*") ByteVector compareSet(
        @StdString BytePointer key,
        @Cast("const std::vector<uint8_t>*") @ByRef ByteVector expectedValue,
        @Cast("const std::vector<uint8_t>*") @ByRef ByteVector desiredValue);
  public native @ByVal @Cast("std::vector<uint8_t>*") ByteVector compareSet(
        @StdString String key,
        @Cast("const std::vector<uint8_t>*") @ByRef ByteVector expectedValue,
        @Cast("const std::vector<uint8_t>*") @ByRef ByteVector desiredValue);

  public native @ByVal @Cast("std::vector<uint8_t>*") ByteVector get(@StdString BytePointer key);
  public native @ByVal @Cast("std::vector<uint8_t>*") ByteVector get(@StdString String key);

  public native @Cast("int64_t") long add(@StdString BytePointer key, @Cast("int64_t") long value);
  public native @Cast("int64_t") long add(@StdString String key, @Cast("int64_t") long value);

  public native @Cast("bool") boolean deleteKey(@StdString BytePointer key);
  public native @Cast("bool") boolean deleteKey(@StdString String key);

  public native @Cast("int64_t") long getNumKeys();

  public native @Cast("bool") boolean check(@Const @ByRef StringVector keys);

  public native @Name("wait") void _wait(@Const @ByRef StringVector keys);

  public native @Name("wait") void _wait(
        @Const @ByRef StringVector keys,
        @Const @ByRef Milliseconds timeout);

  public native @Const @ByRef @NoException(true) Milliseconds getTimeout();

  public native void setTimeout(@Const @ByRef Milliseconds timeout);

  public native void append(@StdString BytePointer key, @Cast("const std::vector<uint8_t>*") @ByRef ByteVector value);
  public native void append(@StdString String key, @Cast("const std::vector<uint8_t>*") @ByRef ByteVector value);

  public native @Cast("std::vector<uint8_t>*") @StdVector ByteVector multiGet(
        @Const @ByRef StringVector keys);

  public native void multiSet(
        @Const @ByRef StringVector keys,
        @Cast("std::vector<uint8_t>*") @StdVector ByteVector values);

  // Returns true if this store support append, multiGet and multiSet
  public native @Cast("bool") boolean hasExtendedApi();

  public native @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store getUnderlyingStore();

  // Recursively to fetch the store before layers of wrapping with PrefixStore.
  public native @IntrusivePtr("c10d::Store") @Cast({"", "c10::intrusive_ptr<c10d::Store>&"}) Store getUnderlyingNonPrefixStore();
}
