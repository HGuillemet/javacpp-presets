// Targeted by JavaCPP version 1.5.9-SNAPSHOT: DO NOT EDIT THIS FILE

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


// A representation of a set of DispatchKeys. A DispatchKeySet contains both
// "functionality" bits and "backend bits", and every tensor holds its own
// DispatchKeySet. The Dispatcher implements multiple dispatch by grabbing the
// keyset on every input tensor, or’ing them together, and dispatching to a
// specific piece of functionality. The functionality bits are *ordered*. When
// multiple functionality bits are set, we use the highest priority
// functionality. Similarly, multiple backend bits can theoretically be set if
// you call an operator with multiple tensors from difference devices (e.g. CPU
// and CUDA), although support for mixed device dispatch is limited (the only
// kernels that gracefully handle mixed device inputs for now are cuda kernels
// that take in a scalar cpu tensor).

// A representation of a set of DispatchKeys.  A tensor may have multiple
// tensor type ids, e.g., a Variable tensor can also be a CPU tensor; the
// DispatchKeySet specifies what type ids apply.  The internal representation is
// as a 64-bit bit set (this means only 64 tensor type ids are supported).
//
// As mentioned above, DispatchKeys are ordered; thus, we can ask questions like
// "what is the highest priority DispatchKey in the set"?  (The set itself is
// not ordered; two sets with the same ids will always have the ids ordered in
// the same way.)
//
// Note [DispatchKeySet Internal Representation]
// Internally, dispatch keys are packed into 64-bit DispatchKeySet objects
// that get passed around at runtime.
// However, there isn't necessarily a 1-to-1 mapping between bits in the keyset
// and individual dispatch keys.
//
// First: why do we have this distinction, and why not map every dispatch key
// directly to a bit? This is mostly because we have several types of
// functionalities that different backends would like to customize. For example,
// we have:
// - "Dense":     CPU, CUDA, XLA, ... (~12 keys)
// - "Sparse":    SparseCPU, SparseCUDA, ...
// - "Quantized": QuantizedCPU, QuantizedCUDA, QuantizedXLA, ...
// - "Autograd":  AutogradCPU, AutogradCUDA, Autograd XLA, ...
// The problem is that total number of keys grows quadratically with [#
// backends] x [# functionalities], making it very difficult to map each key
// directly to a bit in a bitset without dramatically increasing the size of the
// bitset over time.
//
// The two enums (BackendComponent and DispatchKey) can be divided roughly into
// 5 categories.
//
// (1) "Building block" keys
//    (a) backends: jEverything in the BackendComponent enum (e.g. CPUBit,
//    CUDABIt) (b) functionalities: (per-backend) functionality-bit DispatchKeys
//    (e.g. AutogradFunctionality, Sparse, Dense)
// (2) "Runtime" keys
//    (a) "non-customizable backends" (e.g. FPGA)
//    (b) "non-customizable functionalities" (e.g. Functionalize)
//    (c) "per-backend instances of customizable functionalities" (e.g. CPU,
//    SparseCPU, AutogradCPU)
// (3) "Alias" DispatchKeys (see Note [Alias Dispatch Keys])
//
// (1) Building block keys always correspond to individual bits in a
// DispatchKeySet. They can also be combined in a DispatchKeySet to form actual
// runtime keys. e.g.
//     auto dense_cpu_ks = DispatchKeySet({DispatchKey::CPUBit,
//     DispatchKey::Dense});
//     // The keyset has the runtime dense-cpu key.
//     dense_cpu_ks.has(DispatchKey::CPU);
//     // And it contains the building block keys too.
//     dense_cpu_ks.has(DispatchKey::CPUBit);
//     dense_cpu_ks.has(DispatchKey::Dense);
//
// Not every backend and not every functionality counts as a "building block
// key". This is mostly to give us more levers to pull in the design space.
// Backend keys and functionality keys that count as "building blocks" will
// contribute to a full cross product of functionality that can be overriden.
//
// For example, right now we have at least 12 "backend" building blocks (CPU,
// CUDA, XLA, ...) and at least 4 "functionality" building blocks (Dense,
// Sparse, Quantized, AutogradFunctionality, ...). These keys together allow
// every dispatcher operator to be customized in up to 12*4 different ways. Each
// of those requires a slot in the operator table of every dispatcher operator.
// Not every piece of functionality necessarily needs to be customizeable
// per-backend, and not every backend necessarily needs to be able to customize
// every type of functionality.
//
//
// (2) Every runtime key corresponds directly to a slot in an operator's runtime
// dispatch table, and you can directly register kernels to a runtime dispatch
// key.
//
// For per-backend functionalities like "Dense" or "AutogradFunctionality",
// you can think of the corresponding runtime dispatch keys as "instances" of
// that functionality, per backend. E.g. "CPU", "CUDA", "XLA", etc. are all
// runtime instances of the "Dense" building block key.

// (2a) and (2b) are represented identically in the DispatchKeySet logic:
// - backend-agnostic functionalities (e.g. FuncTorchBatched) are NOT
// customizeable per backend.
//   In order to do so, we'd need to promote it to a per-backend functionality
//   "building block" key.
// - non-customizeable backends (e.g. FPGA) can NOT customize existing
// functionality like Sparse, Autograd, etc.
//   In order to do so, we'd need to promote it to a backend "building block"
//   key.
//
// In both cases, these keys directly correspond to runtime slots in the
// operator table.
//
//
// (3) "Alias" keys
// See Note [Alias Dispatch Keys]
//
// Final note: for anyone making future changes to the Dispatcher +
// DispatchKeySet internals, there's a closed PR with a basic
// python-implementation of the Dispatcher that might be useful in quickly
// testing out and validating changes. See it at
// https://github.com/pytorch/pytorch/pull/68743

// An undefined tensor is one with an empty tensor type set.
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DispatchKeySet extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DispatchKeySet(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DispatchKeySet(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public DispatchKeySet position(long position) {
        return (DispatchKeySet)super.position(position);
    }
    @Override public DispatchKeySet getPointer(long i) {
        return new DispatchKeySet((Pointer)this).offsetAddress(i);
    }

  public enum Full { FULL(0);

      public final int value;
      private Full(int v) { this.value = v; }
      private Full(Full e) { this.value = e.value; }
      public Full intern() { for (Full e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  public enum FullAfter { FULL_AFTER(0);

      public final int value;
      private FullAfter(int v) { this.value = v; }
      private FullAfter(FullAfter e) { this.value = e.value; }
      public FullAfter intern() { for (FullAfter e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }
  public enum Raw { RAW(0);

      public final int value;
      private Raw(int v) { this.value = v; }
      private Raw(Raw e) { this.value = e.value; }
      public Raw intern() { for (Raw e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  // NB: default constructor representation as zero is MANDATORY as
  // use of DispatchKeySet in TLS requires this.
  public DispatchKeySet() { super((Pointer)null); allocate(); }
  private native void allocate();

  public DispatchKeySet(Full arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(Full arg0);
  public DispatchKeySet(@Cast("c10::DispatchKeySet::Full") int arg0) { super((Pointer)null); allocate(arg0); }
  private native void allocate(@Cast("c10::DispatchKeySet::Full") int arg0);

  public DispatchKeySet(FullAfter arg0, DispatchKey t) { super((Pointer)null); allocate(arg0, t); }
  private native void allocate(FullAfter arg0, DispatchKey t);
  public DispatchKeySet(@Cast("c10::DispatchKeySet::FullAfter") int arg0, @Cast("c10::DispatchKey") short t) { super((Pointer)null); allocate(arg0, t); }
  private native void allocate(@Cast("c10::DispatchKeySet::FullAfter") int arg0, @Cast("c10::DispatchKey") short t);

  // Public version of DispatchKeySet(uint64_t) API; external users
  // must be explicit when they do this!
  public DispatchKeySet(Raw arg0, @Cast("uint64_t") long x) { super((Pointer)null); allocate(arg0, x); }
  private native void allocate(Raw arg0, @Cast("uint64_t") long x);
  public DispatchKeySet(@Cast("c10::DispatchKeySet::Raw") int arg0, @Cast("uint64_t") long x) { super((Pointer)null); allocate(arg0, x); }
  private native void allocate(@Cast("c10::DispatchKeySet::Raw") int arg0, @Cast("uint64_t") long x);

  public DispatchKeySet(BackendComponent k) { super((Pointer)null); allocate(k); }
  private native void allocate(BackendComponent k);
  public DispatchKeySet(@Cast("c10::BackendComponent") byte k) { super((Pointer)null); allocate(k); }
  private native void allocate(@Cast("c10::BackendComponent") byte k);

  public DispatchKeySet(DispatchKey k) { super((Pointer)null); allocate(k); }
  private native void allocate(DispatchKey k);
  public DispatchKeySet(@Cast("c10::DispatchKey") short k) { super((Pointer)null); allocate(k); }
  private native void allocate(@Cast("c10::DispatchKey") short k);

  // Test if a DispatchKey is in the set
  public native @Cast("bool") boolean has(DispatchKey t);
  public native @Cast("bool") boolean has(@Cast("c10::DispatchKey") short t);
  public native @Cast("const bool") boolean has_backend(BackendComponent t);
  public native @Cast("const bool") boolean has_backend(@Cast("c10::BackendComponent") byte t);

  // Test if a DispatchKey is in the set
  // Given a DispatchKeySet of functionality keys and (potentially) backend
  // keys, tests if all of them are in the current set.
  public native @Cast("const bool") boolean has_all(@ByVal DispatchKeySet ks);

  // Given a DispatchKeySet of functionality keys and (potentially) backend
  // keys, tests if any of them are in the current set. This could technically
  // be pretty easily implemented using has(). It is strictly a perf
  // optimization though. There are many places in the code base where we want
  // to test for multiple functionality keys together. HOWEVER, runtime
  // per-backend functionality keys aren't allowed to be used with this
  // function, because you can end up with weird results. e.g.
  // DispatchKeySet(DispatchKey::AutogradCPU).has_any(DispatchKeySet(DispatchKey::CPU))
  // would return true.
  public native @Cast("bool") boolean has_any(@ByVal DispatchKeySet ks);
  // Test if DispatchKeySet is a superset of ks.
  public native @Cast("bool") boolean isSupersetOf(@ByVal DispatchKeySet ks);
  // Perform set union
  public native @Const @ByVal @Name("operator |") DispatchKeySet or(@ByVal DispatchKeySet other);
  // Perform set intersection
  public native @Const @ByVal @Name("operator &") DispatchKeySet and(@ByVal DispatchKeySet other);
  // Compute the set difference self - other,
  // but ONLY for the functionality keys.
  // Any backend bits set on self will remain unchanged.
  // See Note [Removing keys from DispatchKeySet Only Affects Functionality
  // Keys]
  public native @Const @ByVal @Name("operator -") DispatchKeySet subtract(@ByVal DispatchKeySet other);

  // Compute self ^ other
  public native @Const @ByVal @Name("operator ^") DispatchKeySet xor(@ByVal DispatchKeySet other);
  public native @Cast("bool") @Name("operator ==") boolean equals(@ByVal DispatchKeySet other);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@ByVal DispatchKeySet other);
  // Add a DispatchKey to the DispatchKey set.  Does NOT mutate,
  // returns the extended DispatchKeySet!
  public native @Const @ByVal DispatchKeySet add(DispatchKey t);
  public native @Const @ByVal DispatchKeySet add(@Cast("c10::DispatchKey") short t);
  public native @Const @ByVal DispatchKeySet add(@ByVal DispatchKeySet ks);

  // Remove a DispatchKey from the DispatchKey set.
  // This is generally not an operation you should be doing
  // (it's used to implement the printing overload, operator<<)
  //
  // Note [Removing keys from DispatchKeySet Only Affects Functionality Keys]
  // Only functionality bits are allowed to be removed from a keyset.
  // For now, we're only allowing removal of "functionality bits" from the
  // keyset, which is specifically needed by the fallthrough key calculation
  // logic. Why is removing backend bits problematic? Consider this example:
  //
  // DispatchKeySet([DispatchKey.CPU, DispatchKey.AutogradCUDA,
  // DispatchKey.CUDA]).remove(DispatchKey.AutogradCUDA)
  // DispatchKeySet([DispatchKey.CPU,
  // DispatchKey.AutogradCUDA]).remove(DispatchKey.AutogradCUDA)
  //
  // What do we want to happen?
  // Technically, we'd like it to be true that after removal,
  // the first keyset still has the CUDA dispatch key while the second doesn't.
  // Unfortunately there's no way to represent that, because the two keysets are
  // represented the same way internally: functionality bits: Autograd, Dense
  // backend bits: CPU, CUDA
  //
  // Instead, remove(DispatchKey.AutogradCPU) will only remove the "Autograd"
  // bit from the bitset.
  public native @Const @ByVal DispatchKeySet remove(DispatchKey t);
  public native @Const @ByVal DispatchKeySet remove(@Cast("c10::DispatchKey") short t);
  // You're allowed to remove a backend bit from a DispatchKeySet,
  // but you have to be explicit about it (remove_backend() instead of
  // remove()).
  public native @Const @ByVal DispatchKeySet remove_backend(BackendComponent b);
  public native @Const @ByVal DispatchKeySet remove_backend(@Cast("c10::BackendComponent") byte b);
  // Is the set empty?  (AKA undefined tensor)
  public native @Cast("bool") boolean empty();
  public native @Cast("uint64_t") long raw_repr();

  public native DispatchKey highestFunctionalityKey();

  // This is similar like toBackendComponent(DispatchKey), but less restrictive.
  // toBackendComponent() errors out if the key that it was passed has no
  // backend bits, which is useful for error checking. We need a version of that
  // here that can also handle "fake" backends like FPGA, because they need to
  // map to the AutogradOther key. For those backends, we return
  // BackendComponent::InvalidBit.
  public native BackendComponent highestBackendKey();

  // returns the DispatchKey of highest priority in the set.
  public native DispatchKey highestPriorityTypeId();

  // Returns the index of the most-significant bit in the keyset.
  // This is used to as part of the calculation into the operator table to get:
  // - the highest "functionality" bit in the keyset.
  // - the highest "backend" bit in the keyset.
  public native @Cast("uint8_t") byte indexOfHighestBit();

// #if defined(C10_MOBILE_TRIM_DISPATCH_KEYS)
  // [Note: Trimmed Mobile Dispatch Keys]
  /**
   * The method below maps the dispatch key in the enum DispatchKey to an
   * integer index in the dispatchTable_ array in OperatorEntry. The array
   * is trimmed for mobile to reduce peak memory usage since it's
   * unnecessary to reserve additional space for dispatch keys that will
   * never be used on mobile.
   */
  public native int getDispatchTableIndexForDispatchKeySet();
// #else
  // returns the index in the operator table of highest priority key in the the
  // keyset Note that we could in theory implement this using
  // highestPriorityTypeId(), but this code is very hotpath and we can do it
  // faster without it.
// #endif

  // returns the "index" of the highest priority backend in the keyset.
  // This is pretty similar to getBackendKey(), but:
  // - It's hotpath code (part of the runtime bitset calculation)
  // - I's returns an integer index, not an enum value
  // - Everything is shifted to the right by 1.
  //   BackendComponent::InvalidBit is technically the lowest enum value,
  //   but it isn't included in the runtime table. So CPUBit = 1, CUDABit = 2,
  //   etc.
  public native @Cast("uint64_t") long getBackendIndex();
  // STL iterator for DispatchKeySet. Iterates through all runtime DispatchKeys
  // in the set. The iterator is only invalidated by the destruction of the
  // underlying DispatchKeySet as the iterator stores a pointer to the raw
  // representation of the DispatchKeySet. Note: When we encounter a per-backend
  // functionality (e.g. Dense or Sparse), we will iterate through EVERY backend
  // in the keyset, for that functionality. For example, if the next
  // functionality key to iterate over is Autograd, and the backend bits in the
  // keyset correspond to [BackendComponent::CPUBit, BackendComponent::CUDABit],
  // then the next two keys we return will be DispatchKey::AutogradCPU,
  // DispatchKey::AutogradCUDA (CPU first because it has lower precedence than
  // CUDA in DispatchKey.h).
  @NoOffset public static class iterator extends Pointer {
      static { Loader.load(); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public iterator(Pointer p) { super(p); }
  
    // final mask value should mask out the entire keyset
    @MemberGetter public static native @Cast("const uint8_t") byte end_iter_mask_val();
    public static final byte end_iter_mask_val = end_iter_mask_val();
    // final key value should be the last DispatchKey
    @MemberGetter public static native @Cast("const uint8_t") byte end_iter_key_val();
    public static final byte end_iter_key_val = end_iter_key_val();

    // current_dispatchkey_idx_ will iterate through all functionality bits.
    // current_backendcomponent_idx_ will iterate through all backend bits.
    public iterator(
            @Cast("const uint64_t*") LongPointer data_ptr,
            @Cast("uint8_t") byte next_functionality/*=c10::num_backends*/,
            @Cast("uint8_t") byte next_backend/*=0*/) { super((Pointer)null); allocate(data_ptr, next_functionality, next_backend); }
    private native void allocate(
            @Cast("const uint64_t*") LongPointer data_ptr,
            @Cast("uint8_t") byte next_functionality/*=c10::num_backends*/,
            @Cast("uint8_t") byte next_backend/*=0*/);
    public iterator(
            @Cast("const uint64_t*") LongPointer data_ptr) { super((Pointer)null); allocate(data_ptr); }
    private native void allocate(
            @Cast("const uint64_t*") LongPointer data_ptr);
    public iterator(
            @Cast("const uint64_t*") LongBuffer data_ptr,
            @Cast("uint8_t") byte next_functionality/*=c10::num_backends*/,
            @Cast("uint8_t") byte next_backend/*=0*/) { super((Pointer)null); allocate(data_ptr, next_functionality, next_backend); }
    private native void allocate(
            @Cast("const uint64_t*") LongBuffer data_ptr,
            @Cast("uint8_t") byte next_functionality/*=c10::num_backends*/,
            @Cast("uint8_t") byte next_backend/*=0*/);
    public iterator(
            @Cast("const uint64_t*") LongBuffer data_ptr) { super((Pointer)null); allocate(data_ptr); }
    private native void allocate(
            @Cast("const uint64_t*") LongBuffer data_ptr);
    public iterator(
            @Cast("const uint64_t*") long[] data_ptr,
            @Cast("uint8_t") byte next_functionality/*=c10::num_backends*/,
            @Cast("uint8_t") byte next_backend/*=0*/) { super((Pointer)null); allocate(data_ptr, next_functionality, next_backend); }
    private native void allocate(
            @Cast("const uint64_t*") long[] data_ptr,
            @Cast("uint8_t") byte next_functionality/*=c10::num_backends*/,
            @Cast("uint8_t") byte next_backend/*=0*/);
    public iterator(
            @Cast("const uint64_t*") long[] data_ptr) { super((Pointer)null); allocate(data_ptr); }
    private native void allocate(
            @Cast("const uint64_t*") long[] data_ptr);

    public native @Cast("c10::DispatchKeySet::iterator::self_type*") @ByRef @Name("operator ++") iterator increment();

    public native @ByVal @Cast("c10::DispatchKeySet::iterator::self_type*") @Name("operator ++") iterator increment(int arg0);

    public native @Cast("bool") @Name("operator ==") boolean equals(@Cast("const c10::DispatchKeySet::iterator::self_type*") @ByRef iterator rhs);
    public native @Cast("bool") @Name("operator !=") boolean notEquals(@Cast("const c10::DispatchKeySet::iterator::self_type*") @ByRef iterator rhs);
    public native @Name("operator *") DispatchKey multiply();
  }
  // Returns iterator to the first key in the set. If no keys are in the
  // set, then will return the end iterator.
  public native @ByVal iterator begin();

  // We do not need to iterate beyond EndOfFunctionalityKeys so we will treat
  // this as the end iterator.
  public native @ByVal iterator end();
}
