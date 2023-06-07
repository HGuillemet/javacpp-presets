// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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
 // namespace detail

@Namespace("c10::util") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class crc64_t extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public crc64_t(Pointer p) { super(p); }

  public crc64_t(@Cast("uint64_t") long checksum) { super((Pointer)null); allocate(checksum); }
  private native void allocate(@Cast("uint64_t") long checksum);
  public native @Cast("const uint64_t") long checksum();
}
