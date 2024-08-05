// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// this wraps vector::iterator to make sure user code can't rely
// on it being the type of the underlying vector.
@Name("c10::impl::ListIterator<c10::complex<double>,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleComplexListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleComplexListIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DoubleComplexListIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DoubleComplexListIterator position(long position) {
        return (DoubleComplexListIterator)super.position(position);
    }
    @Override public DoubleComplexListIterator getPointer(long i) {
        return new DoubleComplexListIterator((Pointer)this).offsetAddress(i);
    }

   // C++17 friendly std::iterator implementation

  public DoubleComplexListIterator() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DoubleComplexListIterator(@Const @ByRef DoubleComplexListIterator arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef DoubleComplexListIterator arg0);
  public native @ByRef @Name("operator =") DoubleComplexListIterator put(@Const @ByRef DoubleComplexListIterator arg0);

  public native @ByRef @Name("operator ++") DoubleComplexListIterator increment();

  public native @ByVal @Name("operator ++") DoubleComplexListIterator increment(int arg0);

  public native @ByRef @Name("operator --") DoubleComplexListIterator decrement();

  public native @ByVal @Name("operator --") DoubleComplexListIterator decrement(int arg0);

  public native @ByRef @Name("operator +=") DoubleComplexListIterator addPut(long offset);

  public native @ByRef @Name("operator -=") DoubleComplexListIterator subtractPut(long offset);

  public native @ByVal @Name("operator +") DoubleComplexListIterator add(long offset);

  public native @ByVal @Name("operator -") DoubleComplexListIterator subtract(long offset);

  private static native @Namespace @Cast("c10::impl::ListIterator<c10::complex<double>,c10::detail::ListImpl::list_type::iterator>::difference_type") @Name("operator -") long subtract(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public long subtract(DoubleComplexListIterator rhs) { return subtract(this, rhs); }

  

  

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public boolean equals(DoubleComplexListIterator rhs) { return equals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public boolean notEquals(DoubleComplexListIterator rhs) { return notEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public boolean lessThan(DoubleComplexListIterator rhs) { return lessThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public boolean lessThanEquals(DoubleComplexListIterator rhs) { return lessThanEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public boolean greaterThan(DoubleComplexListIterator rhs) { return greaterThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef DoubleComplexListIterator lhs, @Const @ByRef DoubleComplexListIterator rhs);
  public boolean greaterThanEquals(DoubleComplexListIterator rhs) { return greaterThanEquals(this, rhs); }
}
