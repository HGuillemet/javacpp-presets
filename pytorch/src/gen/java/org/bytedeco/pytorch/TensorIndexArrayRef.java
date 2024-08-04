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

@Name("c10::ArrayRef<at::indexing::TensorIndex>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorIndexArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorIndexArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public TensorIndexArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public TensorIndexArrayRef position(long position) {
        return (TensorIndexArrayRef)super.position(position);
    }
    @Override public TensorIndexArrayRef getPointer(long i) {
        return new TensorIndexArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public TensorIndexArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  

  /** Construct an ArrayRef from a pointer and length. */
  public TensorIndexArrayRef(@Const TensorIndex data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const TensorIndex data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public TensorIndexArrayRef(@Const TensorIndex begin, @Const TensorIndex end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const TensorIndex begin, @Const TensorIndex end);

  /** Construct an ArrayRef from a SmallVector. This is templated in order to
   *  avoid instantiating SmallVectorTemplateCommon<T> whenever we
   *  copy-construct an ArrayRef. */

  /** Construct an ArrayRef from a std::vector. */
  // The enable_if stuff here makes sure that this isn't used for
  // std::vector<bool>, because ArrayRef can't work on a std::vector<bool>
  // bitfield.

  /** Construct an ArrayRef from a std::array */

  /** Construct an ArrayRef from a C array. */
  public TensorIndexArrayRef(@ByRef TensorIndexVector vec) { super((Pointer)null); allocate(vec); }
  private native void allocate(@ByRef TensorIndexVector vec);

  /** Construct an ArrayRef from a std::initializer_list. */
  /* implicit */

  /** \}
   *  \name Simple Operations
   *  \{ */

  public native @Const @ByPtr TensorIndex begin();
  public native @Const @ByPtr TensorIndex end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @Const @ByPtr TensorIndex cbegin();
  public native @Const @ByPtr TensorIndex cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const TensorIndex data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Const @ByRef TensorIndex front();

  /** back - Get the last element. */
  public native @Const @ByRef TensorIndex back();

  /** equals - Check for element-wise equality. */
  

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @Const @ByVal TensorIndexArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal TensorIndexArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Const @ByRef @Name("operator []") TensorIndex get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Const @ByRef TensorIndex at(@Cast("size_t") long Index);

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
  public native @ByVal TensorIndexVector vec();

  /** \} */
}
