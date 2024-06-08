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


/**
 * A OptionalDeviceGuard is an RAII class that sets a device to some value on
 * initialization, and resets the device to its original value on destruction.
 * Morally, a OptionalDeviceGuard is equivalent to optional<DeviceGuard>, but
 * with extra constructors and methods as appropriate.
 *
 * Besides its obvious use (optionally applying a DeviceGuard),
 * OptionalDeviceGuard is often also used for the following idiom:
 *
 *    OptionalDeviceGuard g;
 *    for (const auto& t : tensors) {
 *      g.set_device(t.device());
 *      do_something_with(t);
 *    }
 *
 * This usage is marginally more efficient than constructing a DeviceGuard every
 * iteration of the for loop, as it avoids an unnecessary device reset.
 *
 * Unlike DeviceGuard, a OptionalDeviceGuard may be uninitialized.  This occurs
 * when you use the nullary constructor, or pass a nullopt to the constructor.
 * Uninitialized OptionalDeviceGuards do *nothing*; they do not know what the
 * original device was and they do not reset on destruction.  This is why
 * original_device() and current_device() return optional<Device> rather than
 * Device (as they do in DeviceGuard), and also is why we didn't just
 * provide OptionalDeviceGuard by default and hide DeviceGuard from users.
 *
 * The semantics of an OptionalDeviceGuard are exactly explained by thinking
 * of it as an optional<DeviceGuard>.  In particular, an initialized
 * OptionalDeviceGuard doesn't restore device to its value at construction; it
 * restores device to its value *at initialization*.  So if you have the
 * program:
 *
 *     setDevice(1);
 *     OptionalDeviceGuard g;
 *     setDevice(2);
 *     g.reset_device(Device(DeviceType::CUDA, 3));  // initializes!
 *
 * On destruction, g will reset device to 2, rather than 1.
 *
 * An uninitialized OptionalDeviceGuard is distinct from a (initialized)
 * DeviceGuard whose original_device_ and current_device_ match, since the
 * DeviceGuard will still reset the device to original_device_.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class OptionalDeviceGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public OptionalDeviceGuard(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public OptionalDeviceGuard(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public OptionalDeviceGuard position(long position) {
        return (OptionalDeviceGuard)super.position(position);
    }
    @Override public OptionalDeviceGuard getPointer(long i) {
        return new OptionalDeviceGuard((Pointer)this).offsetAddress(i);
    }

  /** Create an uninitialized guard.  Set the guard later using reset_device. */
  public OptionalDeviceGuard() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Initialize the guard, setting the current device to the passed Device. */
  public OptionalDeviceGuard(@ByVal Device device) { super((Pointer)null); allocate(device); }
  private native void allocate(@ByVal Device device);

  /** Initialize the guard if a Device is passed; otherwise leave the
   *  guard uninitialized. */
  public OptionalDeviceGuard(@ByVal DeviceOptional device) { super((Pointer)null); allocate(device); }
  private native void allocate(@ByVal DeviceOptional device);

  /** Constructor for testing only. */
  public OptionalDeviceGuard(
        @ByVal Device device,
        @Const DeviceGuardImplInterface impl) { super((Pointer)null); allocate(device, impl); }
  private native void allocate(
        @ByVal Device device,
        @Const DeviceGuardImplInterface impl);

  /** Copy is disallowed */
  
  

  /** Move is disallowed
   *  See Note [Explicit initialization of optional fields]
   *  and // Note [Move construction for RAII guards is tricky]
   *  for rationale. */
  
  

  /** Sets the device to the given one.  The specified device must be consistent
   *  with the device type originally specified during guard construction. */
  public native void reset_device(@ByVal Device device);

  /** For testing only */
  public native void reset_device(
        @ByVal Device device,
        @Const DeviceGuardImplInterface impl);

  /** Returns the device that was set at the time the guard was constructed. */
  public native @ByVal DeviceOptional original_device();

  /** Returns the most recent device that was set using this device guard,
   *  either from construction, or via reset_device. */
  public native @ByVal DeviceOptional current_device();
}
