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


@Namespace("torch::profiler::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ExperimentalConfig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ExperimentalConfig(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ExperimentalConfig(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public ExperimentalConfig position(long position) {
        return (ExperimentalConfig)super.position(position);
    }
    @Override public ExperimentalConfig getPointer(long i) {
        return new ExperimentalConfig((Pointer)this).offsetAddress(i);
    }

  public ExperimentalConfig(
        @ByVal(nullValue = "std::vector<std::string>{}") StringVector profiler_metrics,
        @Cast("bool") boolean profiler_measure_per_kernel/*=false*/,
        @Cast("bool") boolean verbose/*=false*/,
        @ByVal(nullValue = "std::vector<std::string>{}") StringVector performance_events,
        @Cast("bool") boolean adjust_timestamps/*=false*/) { super((Pointer)null); allocate(profiler_metrics, profiler_measure_per_kernel, verbose, performance_events, adjust_timestamps); }
  private native void allocate(
        @ByVal(nullValue = "std::vector<std::string>{}") StringVector profiler_metrics,
        @Cast("bool") boolean profiler_measure_per_kernel/*=false*/,
        @Cast("bool") boolean verbose/*=false*/,
        @ByVal(nullValue = "std::vector<std::string>{}") StringVector performance_events,
        @Cast("bool") boolean adjust_timestamps/*=false*/);
  public ExperimentalConfig() { super((Pointer)null); allocate(); }
  private native void allocate();
  public native @Cast("bool") @Name("operator bool") boolean asBoolean();

  public native @ByRef StringVector profiler_metrics(); public native ExperimentalConfig profiler_metrics(StringVector setter);
  public native @Cast("bool") boolean profiler_measure_per_kernel(); public native ExperimentalConfig profiler_measure_per_kernel(boolean setter);
  public native @Cast("bool") boolean verbose(); public native ExperimentalConfig verbose(boolean setter);
  /*
   * List of performance events to be profiled.
   * An empty list will disable performance event based profiling altogether.
   */
  public native @ByRef StringVector performance_events(); public native ExperimentalConfig performance_events(StringVector setter);
  /*
   * Controls whether or not timestamp adjustment occurs after profiling.
   * The purpose of this is to adjust Vulkan event timelines to align with those
   * of their parent CPU events.
   * This sometimes requires increasing CPU event durations (to fully contain
   * their child events) and delaying CPU event start times (to
   * prevent overlaps), so this should not be used unless Vulkan events are
   * being profiled and it is ok to use this modified timestamp/duration
   * information instead of the the original information.
   */
  public native @Cast("bool") boolean adjust_timestamps(); public native ExperimentalConfig adjust_timestamps(boolean setter);
}
