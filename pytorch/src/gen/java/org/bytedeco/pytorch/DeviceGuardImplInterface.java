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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


/**
 * DeviceGuardImplInterface represents the virtual interface which provides
 * functionality to provide an RAII class for device and stream switching,
 * via DeviceGuard.  Every distinct device type, e.g., CUDA and HIP, is
 * expected to implement and register an implementation of this interface.
 * All classes which inherit from DeviceGuardImplInterface should be declared
 * 'final'.
 *
 * This class exists because we provide a unified interface for performing
 * device guards via DeviceGuard, but we cannot assume that we have actually
 * compiled against the, e.g., CUDA library, which actually implements
 * this guard functionality.  In this case, a dynamic dispatch is required
 * to cross the library boundary.
 *
 * If possible, you should directly use implementations of this interface;
 * those uses will be devirtualized.
 */
@Namespace("c10::impl") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class DeviceGuardImplInterface extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceGuardImplInterface(Pointer p) { super(p); }

  public native @ByRef @Name("operator =") DeviceGuardImplInterface put(@Const @ByRef DeviceGuardImplInterface arg0);

  /**
   * Return the type of device managed by this guard implementation.
   */
  public native DeviceType type();

  /**
   * Set the current device to Device, and return the previous Device.
   */
  public native @ByVal Device exchangeDevice(@ByVal Device arg0);
  // NB: Implementations of exchangeDevice can be a bit boilerplatey.  You might
  // consider replacing exchangeDevice with a non-virtual function with a baked
  // in implementation; however, note that this will triple the number of
  // virtual calls (when you implement exchangeDevice in a final subclass,
  // the compiler gets to devirtualize everything; it won't do that if you don't
  // define it in the subclass!)  A common way to solve this problem is to use
  // some sort of CRTP; however, we can template DeviceGuardImplInterface since
  // we really *do* need it to be virtual.  A little boilerplate seems easiest
  // to explain.  (Another way around this problem is to provide inline
  // functions that provide the default implementations, but this seems a little
  // hard to explain.  In any case, we're only going to have on order of ten
  // implementations of this anyway.)

  /**
   * Get the current device.
   */
  public native @ByVal Device getDevice();

  /**
   * Set the current device to Device.
   */
  public native void setDevice(@ByVal Device arg0);

  /**
   * Set the current device to Device, without checking for errors
   * (so, e.g., this can be called from a destructor).
   */
  public native @NoException(true) void uncheckedSetDevice(@ByVal Device arg0);

  /**
   * Get the current stream for a given device.
   */
  public native @ByVal @NoException(true) Stream getStream(@ByVal Device arg0);

  /**
   * Get the default stream for a given device.
   */
  public native @ByVal Stream getDefaultStream(@ByVal Device arg0);

  /**
   * Get a stream from the global pool for a given device.
   */
  public native @ByVal Stream getStreamFromGlobalPool(@ByVal Device arg0, @Cast("bool") boolean isHighPriority/*=false*/);
  public native @ByVal Stream getStreamFromGlobalPool(@ByVal Device arg0);

  /**
   * Return a new stream for a given device and priority. The stream will be
   * copied and shared around, device backend should be able to correctly handle
   * the lifetime of the stream.
   */
  public native @ByVal Stream getNewStream(@ByVal Device arg0, int priority/*=0*/);
  public native @ByVal Stream getNewStream(@ByVal Device arg0);

  /**
   * Set a stream to be the thread local current stream for its device.
   * Return the previous stream for that device. You are NOT required
   * to set the current device to match the device of this stream.
   */
  public native @ByVal @NoException(true) Stream exchangeStream(@ByVal Stream arg0);

  /**
   * Destroys the given event.
   */
  public native @NoException(true) void destroyEvent(Pointer arg0, @Cast("const c10::DeviceIndex") byte arg1);

  /**
   * Increments the event's version and enqueues a job with this version
   * in the stream's work queue. When the stream process that job
   * it notifies all streams waiting on / blocked by that version of the
   * event to continue and marks that version as recorded.
   * */
  public native void record(
        @Cast("void**") PointerPointer arg0,
        @Const @ByRef Stream arg1,
        @Cast("const c10::DeviceIndex") byte arg2,
        EventFlag arg3);
  public native void record(
        @Cast("void**") @ByPtrPtr Pointer arg0,
        @Const @ByRef Stream arg1,
        @Cast("const c10::DeviceIndex") byte arg2,
        EventFlag arg3);
  public native void record(
        @Cast("void**") @ByPtrPtr Pointer arg0,
        @Const @ByRef Stream arg1,
        @Cast("const c10::DeviceIndex") byte arg2,
        @Cast("c10::EventFlag") int arg3);

  /**
   * Does nothing if the event has not been scheduled to be recorded.
   * If the event was previously enqueued to be recorded, a command
   * to wait for the version of the event that exists at the time of this call
   * is inserted in the stream's work queue.
   * When the stream reaches this command it will stop processing
   * additional commands until that version of the event is marked as recorded.
   */
  public native void block(Pointer arg0, @Const @ByRef Stream arg1);

  /**
   * Returns true if (and only if)
   *  (1) the event has never been scheduled to be recorded
   *  (2) the current version is marked as recorded.
   * Returns false otherwise.
   */
  public native @Cast("bool") boolean queryEvent(Pointer arg0);

  /**
   * Get the number of devices.  WARNING: This is REQUIRED to not raise
   * an exception.  If there is some sort of problem, e.g., driver error,
   * you should report that there are zero available devices.
   */
  public native @Cast("c10::DeviceIndex") @NoException(true) byte deviceCount();

  /**
   * Return true if all the work previously enqueued on the stream for
   * asynchronous execution has completed running on the device.
   */
  public native @Cast("bool") boolean queryStream(@Const @ByRef Stream arg0);

  /**
   * Wait (by blocking the calling thread) until all the work previously
   * enqueued on the stream has completed running on the device.
   */
  public native void synchronizeStream(@Const @ByRef Stream arg0);

  /**
   * Wait (by blocking the calling thread) until all the work previously
   * recorded on the event has completed running on the device.
   */
  public native void synchronizeEvent(Pointer arg0);

  /**
   * Ensure the caching allocator (if any) is aware that the given DataPtr is
   * being used on the given stream, and that it should thus avoid recycling the
   * DataPtr until all work on that stream is done.
   */
  public native void recordDataPtrOnStream(@StdMove DataPtr arg0, @Const @ByRef Stream arg1);

  /**
   * Fetch the elapsed time between two recorded events.
   */
  public native double elapsedTime(
        Pointer arg0,
        Pointer arg1,
        @Cast("const c10::DeviceIndex") byte arg2);

  /**
   * Intended use of this class is to leak the DeviceGuardImpl at program end.
   * So you better not call the destructor, buster!
   */
}
