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


/** A wrapper around a batch size value, which implements the
 *  {@code CustomBatchRequest} interface. */
@Namespace("torch::data::samplers") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class BatchSize extends CustomBatchRequest {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public BatchSize(Pointer p) { super(p); }

  public BatchSize(@Cast("size_t") long size) { super((Pointer)null); allocate(size); }
  private native void allocate(@Cast("size_t") long size);
  public native @Cast("size_t") @NoException(true) long size();
  public native @Cast("size_t") @Name("operator size_t") @NoException(true) long asLong();
  public native @Cast("size_t") long size_(); public native BatchSize size_(long setter);
}
