// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.Error;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;

/** ArrayRef - Represent a constant reference to an array (0 or more elements
 *  consecutively in memory), i.e. a start pointer and a length.  It allows
 *  various APIs to take consecutive elements easily and conveniently.
 * 
 *  This class does not own the underlying data, it is expected to be used in
 *  situations where the data resides in some other buffer, whose lifetime
 *  extends past that of the ArrayRef. For this reason, it is not in general
 *  safe to store an ArrayRef.
 * 
 *  This is intended to be trivially copyable, so it should be passed by
 *  value. */
@Name("c10::ArrayRef<c10::cuda::CUDAStream>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class CUDAStreamArrayRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CUDAStreamArrayRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CUDAStreamArrayRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public CUDAStreamArrayRef position(long position) {
        return (CUDAStreamArrayRef)super.position(position);
    }
    @Override public CUDAStreamArrayRef getPointer(long i) {
        return new CUDAStreamArrayRef((Pointer)this).offsetAddress(i);
    }

  /** \name Constructors
   *  \{
   <p>
   *  Construct an empty ArrayRef. */
  /* implicit */ public CUDAStreamArrayRef() { super((Pointer)null); allocate(); }
private native void allocate();

  /** Construct an ArrayRef from a single element. */
  // TODO Make this explicit
  

  /** Construct an ArrayRef from a pointer and length. */
  public CUDAStreamArrayRef(@Const CUDAStream data, @Cast("size_t") long length) { super((Pointer)null); allocate(data, length); }
  private native void allocate(@Const CUDAStream data, @Cast("size_t") long length);

  /** Construct an ArrayRef from a range. */
  public CUDAStreamArrayRef(@Const CUDAStream begin, @Const CUDAStream end) { super((Pointer)null); allocate(begin, end); }
  private native void allocate(@Const CUDAStream begin, @Const CUDAStream end);

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

  public native @Const @ByPtr CUDAStream begin();
  public native @Const @ByPtr CUDAStream end();

  // These are actually the same as iterator, since ArrayRef only
  // gives you const iterators.
  public native @Const @ByPtr CUDAStream cbegin();
  public native @Const @ByPtr CUDAStream cend();

  /** empty - Check if the array is empty. */
  public native @Cast("const bool") boolean empty();

  public native @Const CUDAStream data();

  /** size - Get the array size. */
  public native @Cast("const size_t") long size();

  /** front - Get the first element. */
  public native @Const @ByRef CUDAStream front();

  /** back - Get the last element. */
  public native @Const @ByRef CUDAStream back();

  /** equals - Check for element-wise equality. */
  public native @Cast("const bool") boolean equals(@ByVal CUDAStreamArrayRef RHS);

  /** slice(n, m) - Take M elements of the array starting at element N */
  public native @ByVal CUDAStreamArrayRef slice(@Cast("size_t") long N, @Cast("size_t") long M);

  /** slice(n) - Chop off the first N elements of the array. */
  public native @Const @ByVal CUDAStreamArrayRef slice(@Cast("size_t") long N);

  /** \}
   *  \name Operator Overloads
   *  \{ */
  public native @Const @ByRef @Name("operator []") CUDAStream get(@Cast("size_t") long Index);

  /** Vector compatibility */
  
  ///
  public native @Const @ByRef CUDAStream at(@Cast("size_t") long Index);

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
  public native @StdVector CUDAStream vec();

  /** \} */
}
