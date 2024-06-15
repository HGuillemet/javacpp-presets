// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


/** A container-like struct that acts as if it contains splits of a
 *  TensorIterator that can use 32-bit indexing. Taken together the splits cover
 *  the original TensorIterator. */
@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SplitUntil32Bit extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SplitUntil32Bit(Pointer p) { super(p); }

  public static class iterator extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public iterator(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public iterator(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public iterator position(long position) {
          return (iterator)super.position(position);
      }
      @Override public iterator getPointer(long i) {
          return new iterator((Pointer)this).offsetAddress(i);
      }
  
    public iterator() { super((Pointer)null); allocate(); }
    private native void allocate();
    public iterator(@Const @ByRef TensorIteratorBase iter) { super((Pointer)null); allocate(iter); }
    private native void allocate(@Const @ByRef TensorIteratorBase iter);
    public iterator(@ByRef(true) iterator arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@ByRef(true) iterator arg0);

    // Guaranteed to be a TensorIterator proper!
    public native @ByRef @Name("operator *") TensorIterator multiply();
    public native @ByRef @Name("operator ++") iterator increment();
    public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef iterator other);
    // needed for C++11 range-based for loop
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef iterator other);

    /** stack of TensorIterators to be split */
    
  }

  public SplitUntil32Bit(@Const @ByRef TensorIteratorBase iter) { super((Pointer)null); allocate(iter); }
  private native void allocate(@Const @ByRef TensorIteratorBase iter);

  public native @ByVal iterator begin();
  public native @ByVal iterator end();
}
