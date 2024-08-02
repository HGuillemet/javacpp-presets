// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// Packed container for TensorImpl sizes and strides.
// This design improves on the previous approach of using a pair of
// c10::SmallVector<int64_t, 5> by specializing for the operations we
// actually use and enforcing that the number of sizes is the same as
// the number of strides. The memory layout is as follows:
//
// 1 size_t for the size
// 5 eightbytes of inline sizes and 5 eightbytes of inline strides, OR pointer
// to out-of-line array
@Namespace("c10::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SizesAndStrides extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SizesAndStrides(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SizesAndStrides(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SizesAndStrides position(long position) {
        return (SizesAndStrides)super.position(position);
    }
    @Override public SizesAndStrides getPointer(long i) {
        return new SizesAndStrides((Pointer)this).offsetAddress(i);
    }

  // TODO: different iterator types for sizes & strides to prevent
  // mixing the two accidentally.

  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public SizesAndStrides() { super((Pointer)null); allocate(); }
  private native void allocate();

  // NOLINTNEXTLINE(cppcoreguidelines-pro-type-member-init)
  public SizesAndStrides(@Const @ByRef SizesAndStrides rhs) { super((Pointer)null); allocate(rhs); }
  private native void allocate(@Const @ByRef SizesAndStrides rhs);

  public native @ByRef @Name("operator =") SizesAndStrides put(@Const @ByRef SizesAndStrides rhs);

  // Move from rhs. rhs.size() == 0 afterwards.

  // Move from rhs. rhs.size() == 0 afterwards.

  public native @Cast("size_t") @NoException(true) long size();

  public native @Cast("int64_t*") @NoException(true) LongPointer sizes_data();

  public native @Cast("c10::impl::SizesAndStrides::sizes_iterator") @NoException(true) long sizes_begin();

  public native @Cast("c10::impl::SizesAndStrides::sizes_iterator") @NoException(true) long sizes_end();

  public native @ByVal @NoException(true) LongArrayRef sizes_arrayref();

  public native void set_sizes(@ByVal LongArrayRef newSizes);
  public native void set_sizes(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... newSizes);

  public native void set_strides(@ByVal LongArrayRef strides);
  public native void set_strides(@ByVal @Cast({"int64_t*", "c10::ArrayRef<int64_t>", "std::vector<int64_t>&"}) @StdVector("int64_t") long... strides);

  public native @Cast("int64_t*") @NoException(true) LongPointer strides_data();

  public native @Cast("c10::impl::SizesAndStrides::strides_iterator") @NoException(true) long strides_begin();

  public native @Cast("c10::impl::SizesAndStrides::strides_iterator") @NoException(true) long strides_end();

  public native @ByVal @NoException(true) LongArrayRef strides_arrayref();

  // Size accessors.

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer size_at(@Cast("size_t") long idx);

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer size_at_unchecked(@Cast("size_t") long idx);

  // Size accessors.

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer stride_at(@Cast("size_t") long idx);

  public native @Cast("int64_t*") @ByRef @NoException(true) LongPointer stride_at_unchecked(@Cast("size_t") long idx);

  public native void resize(@Cast("size_t") long newSize);

  public native void resizeSlowPath(@Cast("size_t") long newSize, @Cast("size_t") long oldSize);
}
