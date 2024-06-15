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

@Name("c10::impl::ListIterator<double,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DoubleListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleListIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DoubleListIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DoubleListIterator position(long position) {
        return (DoubleListIterator)super.position(position);
    }
    @Override public DoubleListIterator getPointer(long i) {
        return new DoubleListIterator((Pointer)this).offsetAddress(i);
    }

   // C++17 friendly std::iterator implementation

  public DoubleListIterator() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DoubleListIterator(@Const @ByRef DoubleListIterator arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef DoubleListIterator arg0);
  public native @ByRef @Name("operator =") DoubleListIterator put(@Const @ByRef DoubleListIterator arg0);

  public native @ByRef @Name("operator ++") DoubleListIterator increment();

  public native @ByVal @Name("operator ++") DoubleListIterator increment(int arg0);

  public native @ByRef @Name("operator --") DoubleListIterator decrement();

  public native @ByVal @Name("operator --") DoubleListIterator decrement(int arg0);

  public native @ByRef @Name("operator +=") DoubleListIterator addPut(long offset);

  public native @ByRef @Name("operator -=") DoubleListIterator subtractPut(long offset);

  public native @ByVal @Name("operator +") DoubleListIterator add(long offset);

  public native @ByVal @Name("operator -") DoubleListIterator subtract(long offset);

  private static native @Namespace @Cast("c10::impl::ListIterator<double,c10::detail::ListImpl::list_type::iterator>::difference_type") @Name("operator -") long subtract(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public long subtract(DoubleListIterator rhs) { return subtract(this, rhs); }

  

  

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public boolean equals(DoubleListIterator rhs) { return equals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public boolean notEquals(DoubleListIterator rhs) { return notEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public boolean lessThan(DoubleListIterator rhs) { return lessThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public boolean lessThanEquals(DoubleListIterator rhs) { return lessThanEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public boolean greaterThan(DoubleListIterator rhs) { return greaterThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef DoubleListIterator lhs, @Const @ByRef DoubleListIterator rhs);
  public boolean greaterThanEquals(DoubleListIterator rhs) { return greaterThanEquals(this, rhs); }
}
