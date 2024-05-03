// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Name("c10::intrusive_ptr<c10::BackendMeta>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BackendMetaRef extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BackendMetaRef(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public BackendMetaRef(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public BackendMetaRef position(long position) {
        return (BackendMetaRef)super.position(position);
    }
    @Override public BackendMetaRef getPointer(long i) {
        return new BackendMetaRef((Pointer)this).offsetAddress(i);
    }


  public BackendMetaRef() { super((Pointer)null); allocate(); }
  @NoException(true) private native void allocate();

  public BackendMetaRef(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0) { super((Pointer)null); allocate(arg0); }
  @NoException(true) private native void allocate(@ByVal @Cast("std::nullptr_t*") PointerPointer arg0);

  // This constructor will not increase the ref counter for you.
  // We use the tagged dispatch mechanism to explicitly mark this constructor
  // to not increase the refcount
  public BackendMetaRef(BackendMeta target, @ByVal DontIncreaseRefcount arg1) { super((Pointer)null); allocate(target, arg1); }
  @NoException(true) private native void allocate(BackendMeta target, @ByVal DontIncreaseRefcount arg1);

  

  public BackendMetaRef(@ByRef(true) BackendMetaRef rhs) { super((Pointer)null); allocate(rhs); }
  @NoException(true) private native void allocate(@ByRef(true) BackendMetaRef rhs);

  public native @ByRef @Name("operator =") @NoException(true) BackendMetaRef put(@ByRef(true) BackendMetaRef rhs);

  // Assignment is implemented using copy and swap. That's safe for self
  // assignment.
  // NOLINTNEXTLINE(bugprone-unhandled-self-assignment)

  public native @NoException(true) BackendMeta get();

  public native @ByRef @Name("operator *") @NoException(true) BackendMeta multiply();

  public native @Name("operator ->") @NoException(true) BackendMeta access();

  public native @Cast("bool") @Name("operator bool") @NoException(true) boolean asBoolean();

  public native @NoException(true) void reset();

  public native @NoException(true) void swap(@ByRef BackendMetaRef rhs);

  // We do a lot of null-pointer checks in our code, good to have this be cheap.
  public native @Cast("bool") @NoException(true) boolean defined();

  public native @Cast("uint32_t") @NoException(true) int use_count();

  public native @Cast("uint32_t") @NoException(true) int weak_use_count();

  public native @Cast("bool") @NoException(true) boolean unique();

  /**
   * Returns an owning (!) pointer to the underlying object and makes the
   * intrusive_ptr instance invalid. That means the refcount is not decreased.
   * You *must* put the returned pointer back into a intrusive_ptr using
   * intrusive_ptr::reclaim(ptr) to properly destruct it.
   * This is helpful for C APIs.
   */
  public native @NoException(true) BackendMeta release();

  /**
   * Takes an owning pointer to TTarget* and creates an intrusive_ptr that takes
   * over ownership. That means the refcount is not increased.
   * This is the counter-part to intrusive_ptr::release() and the pointer
   * passed in *must* have been created using intrusive_ptr::release().
   */
  public static native @ByVal BackendMetaRef reclaim(BackendMeta owning_ptr);

  /**
   * Takes an owning pointer to TTarget* and creates an intrusive_ptr
   * representing a new reference, i.e. the raw pointer retains
   * ownership.
   */
  public static native @ByVal BackendMetaRef reclaim_copy(BackendMeta owning_ptr);

  /**
   * Allocate a heap object with args and wrap it inside a intrusive_ptr and
   * incref. This is a helper function to let make_intrusive() access private
   * intrusive_ptr constructors.
   */

  /**
   * Turn a new instance of TTarget (e.g., literally allocated
   * using new TTarget(...) into an intrusive_ptr.  If possible,
   * use intrusive_ptr::make instead which statically guarantees
   * that the allocation was done properly.
   *
   * At the moment, the only reason this method exists is because
   * pybind11 holder types expect to be able to allocate in
   * this way (because pybind11 handles the new allocation itself).
   */
  public static native @ByVal BackendMetaRef unsafe_steal_from_new(BackendMeta raw_ptr);

  /**
   * Turn an instance of TTarget that should not be reference counted
   * (e.g., allocated into an arena with placement new) into an
   * intrusive_ptr. This is gratuitously unsafe and should only be
   * used if you can guarantee that the pointer will not escape and be
   * refcounted as normal.
   *
   * {@code expected_decrefs} is a debugging parameter: it indicates the
   * number of strong owners the intrusive_ptr_target in question is
   * expected to get. In most use cases, this will likely be 1.
   *
   * The reason this method exists is for manually sharing
   * StorageImpls across Tensors in the static runtime. It needs
   * access to private intrusive_ptr members so that the refcounts can
   * be initialized to custom values.
   */
  public static native @ByVal BackendMetaRef unsafe_adapt_non_heap_allocated(
        BackendMeta raw_ptr,
        @Cast("uint32_t") int expected_decrefs);

  /**
   * Turn a **non-owning raw pointer** to an intrusive_ptr.  It is
   * the moral equivalent of enable_shared_from_this on a shared pointer.
   *
   * This method is only valid for objects that are already live.  If
   * you are looking for the moral equivalent of unique_ptr<T>(T*)
   * constructor, see steal_from_new.
   *
   * TODO: https://github.com/pytorch/pytorch/issues/56482
   */
  public static native @ByVal BackendMetaRef unsafe_reclaim_from_nonowning(BackendMeta raw_ptr);
}
