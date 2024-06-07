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

@Name("c10::ArrayRef<decltype(::c10::impl::ScalarTypeToCPPType<::c10::ScalarType::BFloat16>::t)>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BFloat16ArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BFloat16ArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BFloat16ArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BFloat16ArrayRef position(long position) {
        return (BFloat16ArrayRef)super.position(position);
    }
    @Override public BFloat16ArrayRef getPointer(long i) {
        return new BFloat16ArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public BFloat16ArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  

  /** Construct an ArrayRef from a pointer and length. */
  public BFloat16ArrayRef(@Const BFloat16 data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const BFloat16 data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public BFloat16ArrayRef(@Const BFloat16 begin, @Const BFloat16 end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const BFloat16 begin, @Const BFloat16 end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @Const @ByPtr BFloat16 begin();
  public native @Const @ByPtr BFloat16 end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @Const @ByPtr BFloat16 cbegin();
  public native @Const @ByPtr BFloat16 cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const BFloat16 data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Const @ByRef BFloat16 front();

  /** back - Get the last element. */
  public native @Const @ByRef BFloat16 back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal BFloat16ArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal BFloat16ArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal BFloat16ArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Const @ByRef @Name("operator []") BFloat16 get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Const @ByRef BFloat16 at(@Cast("size_t") long Index);

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** Disallow accidental assignment from a temporary.
   * 
   *  The declaration here is extra complicated so that "arrayRef = {}"
   *  continues to select the move assignment operator. */
  

  /** \}
   *  \name Expensive Operations
   *  \{ */
  public native @StdVector BFloat16 vec();

  /** \} */
}
