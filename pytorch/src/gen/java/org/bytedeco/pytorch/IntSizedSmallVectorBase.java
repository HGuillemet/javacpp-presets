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


/** This is all the stuff common to all SmallVectors.
 * 
 *  The template parameter specifies the type which should be used to hold the
 *  Size and Capacity of the SmallVector, so it can be adjusted.
 *  Using 32 bit size is desirable to shrink the size of the SmallVector.
 *  Using 64 bit size is desirable for cases like SmallVector<char>, where a
 *  32 bit size would limit the vector to ~4GB. SmallVectors are used for
 *  buffering bitcode output - which can exceed 4GB. */
@Name("c10::SmallVectorBase<c10::SmallVectorSizeType<c10::SymInt> >") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IntSizedSmallVectorBase extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IntSizedSmallVectorBase(Pointer p) { super(p); }

  
  public native @Cast("size_t") long size();
  public native @Cast("size_t") @Name("capacity") long _capacity();

  
  ///
  ///
  public native @Cast("bool") boolean empty();

  /** Set the array size to \p N, which the current array must have enough
   *  capacity for.
   * 
   *  This does not construct or destroy any elements in the vector.
   * 
   *  Clients can use this in conjunction with capacity() to write past the end
   *  of the buffer when they know that more elements are available, and only
   *  update the size later. This avoids the cost of value initializing elements
   *  which will only be overwritten. */
  public native void set_size(@Cast("size_t") long N);
}
