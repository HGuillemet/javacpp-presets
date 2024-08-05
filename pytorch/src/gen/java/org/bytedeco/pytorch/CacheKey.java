// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::dynamo::autograd") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CacheKey extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CacheKey(Pointer p) { super(p); }

  // Key to find the next node in the shadow graph.  We use C++ RTTI for the
  // type of the node (ntype), then a key generated with a visitor pattern.
  public CacheKey(@ByRef @Cast("std::type_index*") Pointer ntype, @Cast("const uint8_t*") BytePointer key, @Cast("uint16_t") short len) { super((Pointer)null); allocate(ntype, key, len); }
  private native void allocate(@ByRef @Cast("std::type_index*") Pointer ntype, @Cast("const uint8_t*") BytePointer key, @Cast("uint16_t") short len);
  public CacheKey(@ByRef @Cast("std::type_index*") Pointer ntype, @Cast("const uint8_t*") ByteBuffer key, @Cast("uint16_t") short len) { super((Pointer)null); allocate(ntype, key, len); }
  private native void allocate(@ByRef @Cast("std::type_index*") Pointer ntype, @Cast("const uint8_t*") ByteBuffer key, @Cast("uint16_t") short len);
  public CacheKey(@ByRef @Cast("std::type_index*") Pointer ntype, @Cast("const uint8_t*") byte[] key, @Cast("uint16_t") short len) { super((Pointer)null); allocate(ntype, key, len); }
  private native void allocate(@ByRef @Cast("std::type_index*") Pointer ntype, @Cast("const uint8_t*") byte[] key, @Cast("uint16_t") short len);

  public native @Cast("bool") @Name("operator <") boolean lessThan(@Const @ByRef CacheKey other);

  public native @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef CacheKey other);

  public native @Cast("size_t") long hash();

  public native @ByRef @Cast("std::type_index*") Pointer node_type(); public native CacheKey node_type(Pointer setter);
  public native @Cast("uint16_t") short key_size(); public native CacheKey key_size(short setter);
  public native @Cast("const uint8_t*") BytePointer key(); public native CacheKey key(BytePointer setter);
}
