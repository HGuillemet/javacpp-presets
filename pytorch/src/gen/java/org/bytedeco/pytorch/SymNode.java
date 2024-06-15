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


// When you add a method, you also need to edit
// torch/csrc/jit/python/init.cpp
// torch/csrc/utils/python_symnode.h
// c10/core/ConstantSymNodeImpl.h
@Name("c10::SymNodeImpl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymNode extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public SymNode() { super((Pointer)null); allocate(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymNode(Pointer p) { super(p); }
    @IntrusivePtr @Name("c10::make_intrusive<c10::SymNodeImpl>") private native void allocate();


  // these could be pure virtual when we implement LTC versions
  public native @Cast("bool") boolean is_int();
  public native @Cast("bool") boolean is_bool();
  public native @Cast("bool") boolean is_float();
  public native @Cast("bool") boolean is_nested_int();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode add(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sub(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode mul(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode truediv(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode pow(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode floordiv(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode mod(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode eq(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode ne(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode gt(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode lt(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode le(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode ge(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode ceil();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode floor();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode neg();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_min(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_max(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_or(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_and(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode other);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_not();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_ite(@IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode then_val, @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode else_val);
  // NB: self is ignored here, only the arguments are used
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode is_contiguous(
        @ByVal SymNodeArrayRef sizes,
        @ByVal SymNodeArrayRef strides);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode is_channels_last_contiguous_2d(
        @ByVal SymNodeArrayRef sizes,
        @ByVal SymNodeArrayRef strides);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode is_channels_last_contiguous_3d(
        @ByVal SymNodeArrayRef sizes,
        @ByVal SymNodeArrayRef strides);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode is_channels_last_strides_2d(
        @ByVal SymNodeArrayRef sizes,
        @ByVal SymNodeArrayRef strides);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode is_channels_last_strides_3d(
        @ByVal SymNodeArrayRef sizes,
        @ByVal SymNodeArrayRef strides);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode is_non_overlapping_and_dense(
        @ByVal SymNodeArrayRef sizes,
        @ByVal SymNodeArrayRef strides);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode clone();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode sym_float();
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode wrap_int(@Cast("int64_t") long num);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode wrap_float(double num);
  public native @IntrusivePtr("c10::SymNodeImpl") @Cast({"", "c10::intrusive_ptr<c10::SymNodeImpl>&"}) SymNode wrap_bool(@Cast("bool") boolean num);
  public native @Cast("int64_t") long guard_int(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("int64_t") long guard_int(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_bool(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_bool(String file, @Cast("int64_t") long line);
  public native double guard_float(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native double guard_float(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_size_oblivious(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean guard_size_oblivious(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean expect_true(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean expect_true(String file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean expect_size(@Cast("const char*") BytePointer file, @Cast("int64_t") long line);
  public native @Cast("bool") boolean expect_size(String file, @Cast("int64_t") long line);
  public native @Cast("int64_t") long int_();
  public native @Cast("bool") boolean bool_();
  public native @Cast("bool") boolean has_hint();
  public native @StdString BytePointer str();
  public native @ByVal LongOptional nested_int();
  public native @ByVal LongOptional nested_int_coeff();
  public native @ByVal LongOptional constant_int();
  public native @ByVal BoolOptional constant_bool();
  public native @ByVal LongOptional maybe_as_int();
  public native @Cast("bool") boolean is_constant();
  public native @Cast("bool") boolean is_symbolic();
  public native @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer os);
}
