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

@Name("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class FutureList extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FutureList(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public FutureList(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public FutureList position(long position) {
        return (FutureList)super.position(position);
    }
    @Override public FutureList getPointer(long i) {
        return new FutureList((Pointer)this).offsetAddress(i);
    }


  /**
   * Constructs an empty list.
   */
  public FutureList() { super((Pointer)null); allocate(); }
  private native void allocate();

  /**
   * Constructs a list with some initial values.
   * Example:
   *   List<int> a({2, 3, 4});
   */
  public FutureList(@ByVal FutureArrayRef initial_values) { super((Pointer)null); allocate(initial_values); }
  private native void allocate(@ByVal FutureArrayRef initial_values);

  /**
   * Create a generic list with runtime type information.
   * This only works for c10::impl::GenericList and is not part of the public API
   * but only supposed to be used internally by PyTorch.
   */
  public FutureList(@ByVal Type.TypePtr elementType) { super((Pointer)null); allocate(elementType); }
  private native void allocate(@ByVal Type.TypePtr elementType);

  public FutureList(@Const @ByRef FutureList arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Const @ByRef FutureList arg0);
  public native @ByRef @Name("operator =") FutureList put(@Const @ByRef FutureList arg0);

  /**
   * Create a new List pointing to a deep copy of the same data.
   * The List returned is a new list with separate storage.
   * Changes in it are not reflected in the original list or vice versa.
   */
  public native @ByVal FutureList copy();

  /**
   * Returns the element at specified location pos, with bounds checking.
   * If pos is not within the range of the container, an exception of type std::out_of_range is thrown.
   */
  public native @IntrusivePtr("c10::ivalue::Future") Future get(long pos);

  /**
   * Moves out the element at the specified location pos and returns it, with bounds checking.
   * If pos is not within the range of the container, an exception of type std::out_of_range is thrown.
   * The list contains an invalid element at position pos afterwards. Any operations
   * on it before re-setting it are invalid.
   */
  public native @IntrusivePtr("c10::ivalue::Future") Future extract(long pos);

  /**
   * Returns a reference to the element at specified location pos, with bounds checking.
   * If pos is not within the range of the container, an exception of type std::out_of_range is thrown.
   *
   * You cannot store the reference, but you can read it and assign new values to it:
   *
   *   List<int64_t> list = ...;
   *   list[2] = 5;
   *   int64_t v = list[1];
   */
  

  

  /**
   * Assigns a new value to the element at location pos.
   */
  public native void set(long pos, @IntrusivePtr("c10::ivalue::Future") Future value);

  /**
   * Assigns a new value to the element at location pos.
   */

  /**
   * Returns an iterator to the first element of the container.
   * If the container is empty, the returned iterator will be equal to end().
   */
  public native @ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator begin();

  /**
   * Returns an iterator to the element following the last element of the container.
   * This element acts as a placeholder; attempting to access it results in undefined behavior.
   */
  public native @ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator end();

  /**
   * Checks if the container has no elements.
   */
  public native @Cast("bool") boolean empty();

  /**
   * Returns the number of elements in the container
   */
  public native long size();

  /**
   * Increase the capacity of the vector to a value that's greater or equal to new_cap.
   */
  public native void reserve(long new_cap);

  /**
   * Erases all elements from the container. After this call, size() returns zero.
   * Invalidates any references, pointers, or iterators referring to contained elements. Any past-the-end iterators are also invalidated.
   */
  public native void clear();

  /**
   * Inserts value before pos.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native @ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator insert(@ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator pos, @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future value);

  /**
   * Inserts value before pos.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */

  /**
   * Inserts a new element into the container directly before pos.
   * The new element is constructed with the given arguments.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */

  /**
   * Appends the given element value to the end of the container.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native void push_back(@IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future value);

  /**
   * Appends the given element value to the end of the container.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */

  /**
   * Appends the given list to the end of the container. Uses at most one memory allocation.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native void append(@ByVal FutureList lst);

  /**
   * Appends the given element value to the end of the container.
   * The new element is constructed with the given arguments.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */

  /**
   * Removes the element at pos.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native @ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator erase(@ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator pos);

  /**
   * Removes the elements in the range [first, last).
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native @ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator erase(@ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator first, @ByVal @Cast("c10::List<c10::intrusive_ptr<c10::ivalue::Future> >::iterator*") FutureListIterator last);

  /**
   * Removes the last element of the container.
   * Calling pop_back on an empty container is undefined.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native void pop_back();

  /**
   * Resizes the container to contain count elements.
   * If the current size is less than count, additional default-inserted elements are appended.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native void resize(long count);

  /**
   * Resizes the container to contain count elements.
   * If the current size is less than count, additional copies of value are appended.
   * May invalidate any references, pointers, or iterators referring to contained elements. Any past-the-end iterators may also be invalidated.
   */
  public native void resize(long count, @IntrusivePtr("c10::ivalue::Future") @Cast({"", "c10::intrusive_ptr<c10::ivalue::Future>&"}) Future value);

  /**
   * Value equality comparison. This function implements Python-like semantics for
   * equality: two lists with the same identity (e.g. same pointer) trivially
   * compare equal, otherwise each element is compared for equality.
   */
  

  

  /**
   * Identity comparison. Returns true if and only if {@code rhs} represents the same
   * List object as {@code this}.
   */
  public native @Cast("bool") boolean is(@Const @ByRef FutureList rhs);

  public native @ByVal FutureVector vec();

  /**
   * Returns the number of Lists currently pointing to this same list.
   * If this is the only instance pointing to this list, returns 1.
   */
  // TODO Test use_count
  public native @Cast("size_t") long use_count();

  public native @ByVal Type.TypePtr elementType();

  // See [unsafe set type] for why this exists.
  public native void unsafeSetElementType(@ByVal Type.TypePtr t);
}
