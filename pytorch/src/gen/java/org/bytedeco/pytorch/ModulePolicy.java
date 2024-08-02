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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// slot_iterator_impl always iterate over all the slots in a module,
// the Policy template argument determines slots should be returned and their
// types
@Namespace("torch::jit::detail") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ModulePolicy extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ModulePolicy() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ModulePolicy(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ModulePolicy(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ModulePolicy position(long position) {
        return (ModulePolicy)super.position(position);
    }
    @Override public ModulePolicy getPointer(long i) {
        return new ModulePolicy((Pointer)this).offsetAddress(i);
    }

  // the type of the value being returned

  // the logic for creating the type being returned, given the raw IValue
  // of that object.
  public static native @ByVal @Cast("torch::jit::detail::ModulePolicy::value_type*") JitModule create(
        @StdVector SlotCursor cursors,
        @ByVal IValue v);
  // is slot i in typ something that this iterator should return, otherwise,
  // we skip it.
  public static native @Cast("bool") boolean valid(@Const @SharedPtr("c10::ClassType") @ByRef ClassType typ, @Cast("size_t") long i, @Const @ByRef IValue v);
  // are we going to return everything? If so, we can optimize the calculate
  // of the size of the list.
  @MemberGetter public static native @Cast("const bool") boolean all_slots();
  public static final boolean all_slots = all_slots();
}
