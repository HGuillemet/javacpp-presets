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


// I can't conveniently use c10/util/Registry.h for the following reason:
// c10/util/Registry.h gives me a slow way of Create'ing a object of some
// interface from the registry, but no way of quickly accessing an already
// created object.  I'll be banging on getDeviceGuardImpl every time we do a
// DeviceGuard, so I really don't want to be doing an unordered_map lookup.
// Better if the registration mechanism directly drops its implementation
// into device_guard_impl_registry.

@Namespace("c10::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DeviceGuardImplRegistrar extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceGuardImplRegistrar(Pointer p) { super(p); }

  public DeviceGuardImplRegistrar(DeviceType arg0, @Const DeviceGuardImplInterface arg1) { super((Pointer)null); allocate(arg0, arg1); }
  private native void allocate(DeviceType arg0, @Const DeviceGuardImplInterface arg1);
  public DeviceGuardImplRegistrar(@Cast("c10::DeviceType") byte arg0, @Const DeviceGuardImplInterface arg1) { super((Pointer)null); allocate(arg0, arg1); }
  private native void allocate(@Cast("c10::DeviceType") byte arg0, @Const DeviceGuardImplInterface arg1);
}
