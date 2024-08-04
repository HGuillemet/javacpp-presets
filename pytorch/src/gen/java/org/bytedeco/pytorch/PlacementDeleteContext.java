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


/*
 * A Context that will call extra placement deleter during
 * deconstruction.
 *
 * Accept a already constructed DataPtr and store it as member
 * during destruction, we'll call extra deleter on the underlying
 * data pointer before the DataPtr is destructed.
 * `data_ptr_` owns the memory.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class PlacementDeleteContext extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public PlacementDeleteContext(Pointer p) { super(p); }

  public native @StdMove DataPtr data_ptr_(); public native PlacementDeleteContext data_ptr_(DataPtr setter);
  public native PlacementConsumer placement_dtor_(); public native PlacementDeleteContext placement_dtor_(PlacementConsumer setter);
  public native @Cast("size_t") long size_(); public native PlacementDeleteContext size_(long setter);
  public PlacementDeleteContext(
        @StdMove DataPtr data_ptr,
        PlacementConsumer placement_dtor,
        @Cast("size_t") long size) { super((Pointer)null); allocate(data_ptr, placement_dtor, size); }
  private native void allocate(
        @StdMove DataPtr data_ptr,
        PlacementConsumer placement_dtor,
        @Cast("size_t") long size);
  public static native @StdMove DataPtr makeDataPtr(
        @StdMove DataPtr data_ptr,
        PlacementConsumer placement_dtor,
        @Cast("size_t") long size,
        @ByVal Device device);
}
