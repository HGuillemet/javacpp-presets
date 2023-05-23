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


@Name("torch::jit::ListIterator<torch::jit::WithItem>") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WithItemListIterator extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WithItemListIterator(Pointer p) { super(p); }

  public WithItemListIterator(@ByVal @Cast("torch::jit::TreeList::const_iterator*") TreeRef it) { super((Pointer)null); allocate(it); }
  private native void allocate(@ByVal @Cast("torch::jit::TreeList::const_iterator*") TreeRef it);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef WithItemListIterator rhs);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef WithItemListIterator rhs);
  public native @ByVal @Name("operator *") WithItem multiply();
  public native @ByRef @Name("operator +=") WithItemListIterator addPut(@Cast("std::ptrdiff_t") long n);
  public native @ByRef @Name("operator ++") WithItemListIterator increment();
  public native @ByRef @Name("operator --") WithItemListIterator decrement();
}
