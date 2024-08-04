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


@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymBool extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymBool(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public SymBool(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public SymBool position(long position) {
        return (SymBool)super.position(position);
    }
    @Override public SymBool getPointer(long i) {
        return new SymBool((Pointer)this).offsetAddress(i);
    }

  /*implicit*/ public SymBool(@Cast("bool") boolean b) { super((Pointer)null); allocate(b); }
private native void allocate(@Cast("bool") boolean b);
  public SymBool(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode ptr) { super((Pointer)null); allocate(ptr); }
  private native void allocate(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode ptr);
  public SymBool() { super((Pointer)null); allocate(); }
  private native void allocate();

  public native SymNode toSymNodeImplUnowned();

  

  // Only valid if is_heap_allocated()
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode toSymNodeImpl();

  // Guaranteed to return a SymNode, wrapping using base if necessary
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode wrap_node(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode base);

  public native @Cast("bool") boolean expect_bool();

  public native @ByVal SymBool sym_and(@Const @ByRef SymBool arg0);
  public native @ByVal SymBool sym_or(@Const @ByRef SymBool arg0);
  public native @ByVal SymBool sym_not();

  public native @ByVal @Name("operator &") SymBool and(@Const @ByRef SymBool other);
  public native @ByVal @Name("operator |") SymBool or(@Const @ByRef SymBool other);
  public native @ByVal @Name("operator ~") SymBool not();

  // Insert a guard for the bool to be its concrete value, and then return
  // that value.  Note that C++ comparison operations default to returning
  // bool, so it's not so common to have to call this
  public native @Cast("bool") boolean guard_bool(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_bool(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean expect_true(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean expect_true(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_size_oblivious(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_size_oblivious(String file, @Cast("int64_t") long line);

  public native @Cast("bool") boolean has_hint();

  public native @Cast("bool") boolean as_bool_unchecked();

  public native @ByVal BoolOptional maybe_as_bool();

  public native @Cast("bool") boolean is_heap_allocated();
}
