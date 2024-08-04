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

@Name("c10::Dict<torch::Tensor,torch::Tensor>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class TensorTensorDict extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TensorTensorDict(Pointer p) { super(p); }


  /**
   * Creates an empty dict.
   */

  /**
   * Create a generic dict with runtime type information.
   * This only works for c10::impl::GenericDict and is not part of the public API
   * but only supposed to be used internally by PyTorch.
   */
  public native @ByRef @Name("operator =") TensorTensorDict put(@Const @ByRef TensorTensorDict arg0);

  /**
   * Create a new Dict pointing to a deep copy of the same data.
   * The Dict returned is a new dict with separate storage.
   * Changes in it are not reflected in the original dict or vice versa.
   */
  public native @ByVal TensorTensorDict copy();

  /**
   * Returns an iterator to the first element of the container.
   * If the container is empty, the returned iterator will be equal to end().
   */
  public native @ByVal TensorTensorDictIterator begin();

  /**
   * Returns an iterator to the element following the last element of the container.
   * This element acts as a placeholder; attempting to access it results in undefined behavior.
   */
  public native @ByVal TensorTensorDictIterator end();

  /**
   * Checks if the container has no elements.
   */
  public native @Cast("bool") boolean empty();

  /**
   * Returns the number of elements in the container.
   */
  public native @Cast("c10::Dict<torch::Tensor,torch::Tensor>::size_type") long size();

  /**
   * Erases all elements from the container. After this call, size() returns zero.
   * Invalidates any references, pointers, or iterators referring to contained elements. May also invalidate past-the-end iterators.
   */
  public native void clear();

  /**
   * Inserts element(s) into the container, if the container doesn't already contain an element with an equivalent key.
   * May invalidate any references, pointers, or iterators referring to contained elements.
   *
   * @return A pair consisting of an iterator to the inserted element (or to the element that prevented the insertion) and a bool denoting whether the insertion took place.
   */

  /**
   * If an element with the given key already exists, it is overwritten with the given value.
   * Otherwise, a new element with the given key and value are inserted.
   * May invalidate any references, pointers, or iterators referring to contained elements.
   *
   * @return The bool component is true if the insertion took place and false if the assignment took place. The iterator component is pointing at the element that was inserted or updated.
   */

  /**
   * Removes the element pointed to by iter.
   * May invalidate any references, pointers, or iterators referring to contained elements.
   * The iterator iter must be valid and dereferenceable. Thus the end() iterator (which is valid, but is not dereferenceable) cannot be used as a value for iter.
   */
  public native void erase(@ByVal TensorTensorDictIterator iter);

  /**
   * Removes the element with the given key, if it exists.
   * May invalidate any references, pointers, or iterators referring to contained elements.
   *
   * @return The number of elements removed. This is either '1' if an element with the key existed, or '0' if it didn't.
   */
  public native @Cast("size_t") long erase(@Const @ByRef Tensor key);

  /**
   * Returns the mapped value of the element with key equivalent to key.
   * If no such element exists, an exception of type std::out_of_range is thrown.
   */
  public native @ByVal Tensor at(@Const @ByRef Tensor key);

  /**
   * Finds an element with key equivalent to key.
   *
   * @return Iterator to an element with key equivalent to key.
   *         If no such element is found, past-the-end (see end()) iterator is returned.
   */
  public native @ByVal TensorTensorDictIterator find(@Const @ByRef Tensor key);

  /**
   * Checks if there is an element with key equivalent to key in the container.
   *
   * @return true if there is such an element, otherwise false.
   */
  public native @Cast("bool") boolean contains(@Const @ByRef Tensor key);

  /**
   * Increase the capacity so that at least count elements can be stored without
   * having to reallocate or rehash.
   */
  public native void reserve(@Cast("c10::Dict<torch::Tensor,torch::Tensor>::size_type") long count);

  /**
   * Value equality comparison. This function implements Python-like semantics for
   * equality: two dicts with the same identity (e.g. same pointer) trivially
   * compare equal, otherwise each element is compared for equality.
   */
  
  

  /**
   * Identity comparison. Returns true if and only if {@code rhs} represents the same
   * Dict object as {@code this}.
   */
  public native @Cast("bool") boolean is(@Const @ByRef TensorTensorDict rhs);

  // private API for now because the return type will change to TypePtr
  // instead of optional<TypePtr> once types are mandatory.
  public native @ByVal Type.TypePtr keyType();
  public native @ByVal Type.TypePtr valueType();

  // [unsafe set type]
  // These functions mutate the tagged type of this dictionary in place.
  // There is no checking that the members of the dictionary are instances
  // of the new types, nor is there a check that other IValues which
  // hold references to this dictionary have the right static type.
  // This functionality is used only in the unpickler, where at
  // creation type the real type of the dictionary is unknown, but
  // then later recovered from the static type information of the
  // unpickled object.
  public native void unsafeSetKeyType(@ByVal Type.TypePtr t);
  public native void unsafeSetValueType(@ByVal Type.TypePtr t);
}
