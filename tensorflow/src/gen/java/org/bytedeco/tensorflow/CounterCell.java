// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.tensorflow;

import org.bytedeco.tensorflow.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tensorflow.global.tensorflow.*;


// CounterCell stores each value of an Counter.
//
// A cell can be passed off to a module which may repeatedly update it without
// needing further map-indexing computations. This improves both encapsulation
// (separate modules can own a cell each, without needing to know about the map
// to which both cells belong) and performance (since map indexing and
// associated locking are both avoided).
//
// This class is thread-safe.
@Namespace("tensorflow::monitoring") @NoOffset @Properties(inherit = org.bytedeco.tensorflow.presets.tensorflow.class)
public class CounterCell extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CounterCell(Pointer p) { super(p); }

  public CounterCell(@Cast("tensorflow::int64") long value) { super((Pointer)null); allocate(value); }
  private native void allocate(@Cast("tensorflow::int64") long value);

  // Atomically increments the value by step.
  // REQUIRES: Step be non-negative.
  public native void IncrementBy(@Cast("tensorflow::int64") long step);

  // Retrieves the current value.
  public native @Cast("tensorflow::int64") long value();
}
