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


// The HIPHooksInterface is an omnibus interface for any HIP functionality
// which we may want to call into from CPU code (and thus must be dynamically
// dispatched, to allow for separate compilation of HIP code).  See
// CUDAHooksInterface for more detailed motivation.
@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class HIPHooksInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public HIPHooksInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public HIPHooksInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public HIPHooksInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public HIPHooksInterface position(long position) {
        return (HIPHooksInterface)super.position(position);
    }
    @Override public HIPHooksInterface getPointer(long i) {
        return new HIPHooksInterface((Pointer)this).offsetAddress(i);
    }

  // This should never actually be implemented, but it is used to
  // squelch -Werror=non-virtual-dtor

  // Initialize the HIP library state
  public native void initHIP();

  public native @UniquePtr GeneratorImpl initHIPGenerator(Context arg0);

  public native @Cast("bool") boolean hasHIP();

  public native @Cast("c10::DeviceIndex") byte current_device();

  public native Allocator getPinnedMemoryAllocator();

  public native void registerHIPTypes(Context arg0);

  public native int getNumGPUs();
}
