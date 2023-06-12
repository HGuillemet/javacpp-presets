// Targeted by JavaCPP version 1.5.10-SNAPSHOT: DO NOT EDIT THIS FILE

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


/** This class consists of common code factored out of the SmallVector class to
 *  reduce code duplication based on the SmallVector 'N' template parameter. */
@Name("c10::SmallVectorImpl<c10::SymInt>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymIntSmallVectorImpl extends SymIntSmallVectorBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymIntSmallVectorImpl(Pointer p) { super(p); }

  

  public native void clear();
  public native void resize(long N);

  /** Like resize, but \ref T is POD, the new values won't be initialized. */
  public native void resize_for_overwrite(long N);

  public native void resize(long N, @ByVal SymInt NV);

  public native void reserve(long N);

  public native void pop_back_n(long NumItems);

  public native @ByVal SymInt pop_back_val();

  public native void swap(@ByRef SymIntSmallVectorImpl RHS);

  /** Add the specified range to the end of the SmallVector. */

  /** Append \p NumInputs copies of \p Elt to the end. */
  public native void append(long NumInputs, @ByVal SymInt Elt);

  public native void append(@Const @ByRef SymIntSmallVectorImpl RHS);

  public native void assign(long NumElts, @ByVal SymInt Elt);

  // FIXME: Consider assigning over existing elements, rather than clearing &
  // re-initializing them - for all assign(...) variants.

  public native void assign(@Const @ByRef SymIntSmallVectorImpl RHS);

  public native @ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::iterator*") SymInt erase(@ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::const_iterator*") SymInt CI);

  public native @ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::iterator*") SymInt erase(@ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::const_iterator*") SymInt CS, @ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::const_iterator*") SymInt CE);
  public native @ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::iterator*") SymInt insert(@ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::iterator*") SymInt I, @ByRef(true) SymInt Elt);

  public native @ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::iterator*") SymInt insert(@ByVal @Cast("c10::SmallVectorImpl<c10::SymInt>::iterator*") SymInt I, long NumToInsert, @ByVal SymInt Elt);

  public native @ByRef @Name("operator =") SymIntSmallVectorImpl put(@Const @ByRef SymIntSmallVectorImpl RHS);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef SymIntSmallVectorImpl RHS);
  public native @Cast("bool") @Name("operator !=") boolean notEquals(@Const @ByRef SymIntSmallVectorImpl RHS);

  public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef SymIntSmallVectorImpl RHS);
}
