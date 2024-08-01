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
 // namespace detail

@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Type extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Type(Pointer p) { super(p); }

  private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef Type lhs, @Const @ByRef Type rhs);
  public boolean equals(Type rhs) { return equals(this, rhs); }
  @Name("SingletonOrSharedTypePtr<c10::Type>") public static class TypePtr extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public TypePtr(Pointer p) { super(p); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public TypePtr(long size) { super((Pointer)null); allocateArray(size); }
      private native void allocateArray(long size);
      @Override public TypePtr position(long position) {
          return (TypePtr)super.position(position);
      }
      @Override public TypePtr getPointer(long i) {
          return new TypePtr((Pointer)this).offsetAddress(i);
      }
  

    public TypePtr() { super((Pointer)null); allocate(); }
    private native void allocate();

    /* implicit */ public TypePtr(@SharedPtr Type x) { super((Pointer)null); allocate(x); }
private native void allocate(@SharedPtr Type x);

    /* implicit */ public TypePtr(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0);

    /* implicit */ public TypePtr(@ByVal SingletonTypePtr p) { super((Pointer)null); allocate(p); }
private native void allocate(@ByVal SingletonTypePtr p);


    // We need to support construction from T* for pybind. The problem
    // is that it's not clear if we are supposed to be taking shared
    // ownership or not.
    //
    // Case 1: if T is known statically to derive from SharedType, we should use
    // shared_from_this() and take shared_ownership.
    //
    // Case 2: if T is exactly Type, we need to do a dynamic_cast to
    // check if it's a SharedType and do the right thing.
    //
    // Case 3: Otherwise, T is not a SharedType. (debug-check this
    // assumption!) Use a singleton pointer.

    public TypePtr(@Const @ByRef TypePtr arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef TypePtr arg0);
    public native @ByRef @Name("operator =") TypePtr put(@Const @ByRef TypePtr arg0);

    public native Type get();

    public native @Cast("bool") @Name("operator bool") boolean asBoolean();

    public native @Cast("bool") @Name("operator ==") boolean equals(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0);

    public native @Cast("bool") @Name("operator !=") boolean notEquals(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0);

    public native @Name("operator ->") Type access();
  }

  // subtyping relation. By default, we return true for the case
  // when the type is exactly equal or if this <: T where rhs = Optional[T]

  // if this returns false and the why_not stream is non-null, it contains
  // additional details that describe why this is not a subtype of 'rhs'.
  // This additional information should only contain details that are not
  // obvious from the annotation_str() that describes the type. For instance it
  // is clear that `int <: str` is false but not clear why `Foo <: InterfaceBar`
  // might be false.
  public native @Cast("bool") boolean isSubtypeOfExt(@Const @ByRef Type rhs, @Cast("std::ostream*") Pointer why_not);
  public native @Cast("bool") boolean is_module();
  public native @Cast("bool") boolean isSubtypeOf(@Const @ByRef Type rhs);
  // Compatibility shims to accommodate existing code that passes shared_ptrs
  // around. Ideally, we would just delete this, but it should be harmless.

  // How this type will appear in FunctionSchema declarations
  public native @StdString BytePointer str();

  // How this type will appear as if it were a type annotation in Python
  // which is sometimes different than how it appears in declarations (e.g.
  // int[] vs List[int])
  //
  // Takes a custom printer that users can pass in to customize the output of
  // this method.
  public native @StdString BytePointer annotation_str(@Const @ByRef TypePrinter printer);
  public native @StdString BytePointer annotation_str();

  // Returns a human readable string that includes additional information like
  // "type is inferred rather than explicitly defined" to help construct more
  // user-friendly messages.
  public native @StdString BytePointer repr_str();

  public native TypeKind kind();

  public native @Cast("bool") boolean isUnionType();

  public native @Cast("bool") boolean requires_grad();

  // Dynamically cast this object to the subclass indicated by the
  // template variable, returning nullptr if the cast is invalid.
  public native @Cast("bool") boolean hasFreeVariables();
  // list of types this type contains, e.g. for a List then element type of a
  // list for a tuple, the types of the tuple elements
  public native @ByVal TypeArrayRef containedTypes();
  public native @ByVal TypePtr containedType(@Cast("size_t") long i);
  public native @Cast("size_t") long containedTypeSize();
  // create a new version of this type, replacing its contained types with
  // contained_types
  public native @ByVal TypePtr withContained(@ByVal TypeVector contained_types);
  // per-type constructor, you only need to override this if the
  // containedTypes() is not empty
  public native @ByVal TypePtr createWithContained(
        @ByVal TypeVector arg0);

}
