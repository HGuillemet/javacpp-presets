// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
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


// An interface for reporting thread local memory usage
// per device
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MemoryReportingInfoBase extends DebugInfoBase {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MemoryReportingInfoBase(Pointer p) { super(p); }


  /**
   * alloc_size corresponds to the size of the ptr.
   *
   * total_allocated corresponds to total allocated memory.
   *
   * total_reserved corresponds to total size of memory pool, both used and
   * unused, if applicable.
   */
  public native void reportMemoryUsage(
        Pointer ptr,
        @Cast("int64_t") long alloc_size,
        @Cast("size_t") long total_allocated,
        @Cast("size_t") long total_reserved,
        @ByVal Device device);

  public native void reportOutOfMemory(
        @Cast("int64_t") long alloc_size,
        @Cast("size_t") long total_allocated,
        @Cast("size_t") long total_reserved,
        @ByVal Device device);

  public native @Cast("bool") boolean memoryProfilingEnabled();
}
