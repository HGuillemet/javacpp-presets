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

@Name("c10::impl::ListIterator<bool,c10::detail::ListImpl::list_type::iterator>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BooleanListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BooleanListIterator(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BooleanListIterator(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BooleanListIterator position(long position) {
        return (BooleanListIterator)super.position(position);
    }
    @Override public BooleanListIterator getPointer(long i) {
        return new BooleanListIterator((Pointer)this).offsetAddress(i);
    }

   // C++17 friendly std::iterator implementation

  public BooleanListIterator() { super((Pointer)null); allocate(); }
  private native void allocate();

  public BooleanListIterator(@Const @ByRef BooleanListIterator arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef BooleanListIterator arg0);
  public native @ByRef @Name("operator =") BooleanListIterator put(@Const @ByRef BooleanListIterator arg0);

  public native @ByRef @Name("operator ++") BooleanListIterator increment();

  public native @ByVal @Name("operator ++") BooleanListIterator increment(int arg0);

  public native @ByRef @Name("operator --") BooleanListIterator decrement();

  public native @ByVal @Name("operator --") BooleanListIterator decrement(int arg0);

  public native @ByRef @Name("operator +=") BooleanListIterator addPut(long offset);

  public native @ByRef @Name("operator -=") BooleanListIterator subtractPut(long offset);

  public native @ByVal @Name("operator +") BooleanListIterator add(long offset);

  public native @ByVal @Name("operator -") BooleanListIterator subtract(long offset);

  private static native @Namespace @Cast("c10::impl::ListIterator<bool,c10::detail::ListImpl::list_type::iterator>::difference_type") @Name("operator -") long subtract(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public long subtract(BooleanListIterator rhs) { return subtract(this, rhs); }

  

  

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public boolean equals(BooleanListIterator rhs) { return equals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public boolean notEquals(BooleanListIterator rhs) { return notEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public boolean lessThan(BooleanListIterator rhs) { return lessThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator <=") boolean lessThanEquals(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public boolean lessThanEquals(BooleanListIterator rhs) { return lessThanEquals(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >") boolean greaterThan(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public boolean greaterThan(BooleanListIterator rhs) { return greaterThan(this, rhs); }

  private static native @Namespace @Cast("bool") @Name("operator >=") boolean greaterThanEquals(@Const @ByRef BooleanListIterator lhs, @Const @ByRef BooleanListIterator rhs);
  public boolean greaterThanEquals(BooleanListIterator rhs) { return greaterThanEquals(this, rhs); }
}
