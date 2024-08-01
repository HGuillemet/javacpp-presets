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


@Namespace("c10d") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Timer extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Timer(Pointer p) { super(p); }

  public enum Event {
    kForwardStart((byte)(0)),
    kBackwardComputeStart((byte)(1)),
    kBackwardComputeEnd((byte)(2)),
    kBackwardCommStart((byte)(3)),
    kBackwardCommEnd((byte)(4));

      public final byte value;
      private Event(byte v) { this.value = v; }
      private Event(Event e) { this.value = e.value; }
      public Event intern() { for (Event e : values()) if (e.value == value) return e; return this; }
      @Override public String toString() { return intern().name(); }
  }

  // Record the current event, i.e., mark it as having occurred now. Default
  // CPU implementation.
  public native void record(Event event);
  public native void record(@Cast("c10d::Timer::Event") byte event);

  // Return the difference between when two events occurred, in nanoseconds.
  // Or nullopt if one of them hasn't been recorded.
  public native @ByVal LongOptional measureDifference(Event start, Event end);
  public native @ByVal LongOptional measureDifference(@Cast("c10d::Timer::Event") byte start, @Cast("c10d::Timer::Event") byte end);

  // Return host-side timestamp, or nullopt if it has not yet been recorded.
  public native @ByVal LongOptional getTimestamp(Event event);
  public native @ByVal LongOptional getTimestamp(@Cast("c10d::Timer::Event") byte event);

  // Return host-side time member variable corresponding to the given event.
  public native @Cast("int64_t*") @ByRef LongPointer getTimeRef(Event event);
  public native @Cast("int64_t*") @ByRef LongBuffer getTimeRef(@Cast("c10d::Timer::Event") byte event);
}
