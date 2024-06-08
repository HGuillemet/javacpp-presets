// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
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


/** This is a 'vector' (really, a variable-sized array), optimized
 *  for the case when the array is small.  It contains some number of elements
 *  in-place, which allows it to avoid heap allocation when the actual number of
 *  elements is below that threshold.  This allows normal "small" cases to be
 *  fast without losing generality for large inputs.
 * 
 *  \note
 *  In the absence of a well-motivated choice for the number of inlined
 *  elements \p N, it is recommended to use \c SmallVector<T> (that is,
 *  omitting the \p N). This will choose a default number of inlined elements
 *  reasonable for allocation on the stack (for example, trying to keep \c
 *  sizeof(SmallVector<T>) around 64 bytes).
 * 
 *  \warning This does not attempt to be exception safe.
 * 
 *  @see https://llvm.org/docs/ProgrammersManual.html#llvm-adt-smallvector-h */
@Name("c10::SmallVector<c10::SymInt,at::kDimVectorStaticSize>") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SymDimVector extends SymIntSmallVectorImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SymDimVector(Pointer p) { super(p); }

  public SymDimVector() { super((Pointer)null); allocate(); }
  private native void allocate();

  public SymDimVector(@Cast("size_t") long Size, @Const @ByRef(nullValue = "c10::SymInt()") SymInt Value) { super((Pointer)null); allocate(Size, Value); }
  private native void allocate(@Cast("size_t") long Size, @Const @ByRef(nullValue = "c10::SymInt()") SymInt Value);
  public SymDimVector(@Cast("size_t") long Size) { super((Pointer)null); allocate(Size); }
  private native void allocate(@Cast("size_t") long Size);

  // note: The enable_if restricts Container to types that have a .begin() and
  // .end() that return valid input iterators.

  public SymDimVector(@Const @ByRef SymDimVector RHS) { super((Pointer)null); allocate(RHS); }
  private native void allocate(@Const @ByRef SymDimVector RHS);

  public native @ByRef @Name("operator =") SymDimVector put(@Const @ByRef SymDimVector RHS);

  // note: The enable_if restricts Container to types that have a .begin() and
  // .end() that return valid input iterators.

  

  

  // note: The enable_if restricts Container to types that have a .begin() and
  // .end() that return valid input iterators.
}
