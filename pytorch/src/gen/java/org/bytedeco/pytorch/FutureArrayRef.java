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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;

@Name("c10::ArrayRef<c10::intrusive_ptr<c10::ivalue::Future> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FutureArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FutureArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FutureArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FutureArrayRef position(long position) {
        return (FutureArrayRef)super.position(position);
    }
    @Override public FutureArrayRef getPointer(long i) {
        return new FutureArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public FutureArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  

  /** Construct an ArrayRef from a pointer and length. */
  public FutureArrayRef(@Const @IntrusivePtr("c10::ivalue::Future") Future data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const @IntrusivePtr("c10::ivalue::Future") Future data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public FutureArrayRef(@Const @IntrusivePtr("c10::ivalue::Future") Future begin, @Const @IntrusivePtr("c10::ivalue::Future") Future end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const @IntrusivePtr("c10::ivalue::Future") Future begin, @Const @IntrusivePtr("c10::ivalue::Future") Future end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.
  public FutureArrayRef(@ByRef FutureVector vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@ByRef FutureVector vec);

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @Const @ByPtr Future begin();
  public native @Const @ByPtr Future end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @Const @ByPtr Future cbegin();
  public native @Const @ByPtr Future cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const @IntrusivePtr("c10::ivalue::Future") Future data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future front();

  /** back - Get the last element. */
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal FutureArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal FutureArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal FutureArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @IntrusivePtr("c10::ivalue::Future") @Name("operator []") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future at(@Cast("size_t") long Index);

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
  public native @ByVal FutureVector vec();

  /** \} */
}
