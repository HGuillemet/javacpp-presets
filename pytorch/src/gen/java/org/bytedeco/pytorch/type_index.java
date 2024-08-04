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

// #endif

@Namespace("c10::util") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class type_index extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public type_index(Pointer p) { super(p); }

  public type_index(@Cast("uint64_t") long checksum) { super((Pointer)null); allocate(checksum); }
  private native void allocate(@Cast("uint64_t") long checksum);

  // Allow usage in std::map / std::set
  // TODO Disallow this and rather use std::unordered_map/set everywhere
  private static native @Namespace @Cast("const bool") @Name("operator <") @NoException(true) boolean lessThan(@ByVal type_index lhs, @ByVal type_index rhs);
  public boolean lessThan(type_index rhs) { return lessThan(this, rhs); }

  private static native @Namespace @Cast("std::ostream*") @ByRef @Name("operator <<") Pointer shiftLeft(@Cast("std::ostream*") @ByRef Pointer stream, @ByVal type_index typeId);
  public Pointer shiftLeft(Pointer stream) { return shiftLeft(stream, this); }
}
