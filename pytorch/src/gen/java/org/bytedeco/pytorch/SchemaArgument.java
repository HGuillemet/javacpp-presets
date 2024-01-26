// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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


/**
 * struct SchemaArgument
 *
 * Structure used to represent arguments or returns for a schema.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class SchemaArgument extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public SchemaArgument(Pointer p) { super(p); }

  public native SchemaArgType type(); public native SchemaArgument type(SchemaArgType setter);
  public native @Cast("size_t") long index(); public native SchemaArgument index(long setter);
  public SchemaArgument(SchemaArgType tpe, @Cast("size_t") long idx) { super((Pointer)null); allocate(tpe, idx); }
  private native void allocate(SchemaArgType tpe, @Cast("size_t") long idx);
  public SchemaArgument(@Cast("c10::SchemaArgType") int tpe, @Cast("size_t") long idx) { super((Pointer)null); allocate(tpe, idx); }
  private native void allocate(@Cast("c10::SchemaArgType") int tpe, @Cast("size_t") long idx);
  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef SchemaArgument rhs);
}
