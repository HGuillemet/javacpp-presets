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


@Namespace("torch::profiler::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class ProfilerConfig extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ProfilerConfig(Pointer p) { super(p); }

  public ProfilerConfig(
        ProfilerState state,
        @Cast("bool") boolean report_input_shapes/*=false*/,
        @Cast("bool") boolean profile_memory/*=false*/,
        @Cast("bool") boolean with_stack/*=false*/,
        @Cast("bool") boolean with_flops/*=false*/,
        @Cast("bool") boolean with_modules/*=false*/,
        @ByVal(nullValue = "torch::profiler::impl::ExperimentalConfig()") ExperimentalConfig experimental_config) { super((Pointer)null); allocate(state, report_input_shapes, profile_memory, with_stack, with_flops, with_modules, experimental_config); }
  private native void allocate(
        ProfilerState state,
        @Cast("bool") boolean report_input_shapes/*=false*/,
        @Cast("bool") boolean profile_memory/*=false*/,
        @Cast("bool") boolean with_stack/*=false*/,
        @Cast("bool") boolean with_flops/*=false*/,
        @Cast("bool") boolean with_modules/*=false*/,
        @ByVal(nullValue = "torch::profiler::impl::ExperimentalConfig()") ExperimentalConfig experimental_config);
  public ProfilerConfig(
        ProfilerState state) { super((Pointer)null); allocate(state); }
  private native void allocate(
        ProfilerState state);
  public ProfilerConfig(
        @Cast("torch::profiler::impl::ProfilerState") int state,
        @Cast("bool") boolean report_input_shapes/*=false*/,
        @Cast("bool") boolean profile_memory/*=false*/,
        @Cast("bool") boolean with_stack/*=false*/,
        @Cast("bool") boolean with_flops/*=false*/,
        @Cast("bool") boolean with_modules/*=false*/,
        @ByVal(nullValue = "torch::profiler::impl::ExperimentalConfig()") ExperimentalConfig experimental_config) { super((Pointer)null); allocate(state, report_input_shapes, profile_memory, with_stack, with_flops, with_modules, experimental_config); }
  private native void allocate(
        @Cast("torch::profiler::impl::ProfilerState") int state,
        @Cast("bool") boolean report_input_shapes/*=false*/,
        @Cast("bool") boolean profile_memory/*=false*/,
        @Cast("bool") boolean with_stack/*=false*/,
        @Cast("bool") boolean with_flops/*=false*/,
        @Cast("bool") boolean with_modules/*=false*/,
        @ByVal(nullValue = "torch::profiler::impl::ExperimentalConfig()") ExperimentalConfig experimental_config);
  public ProfilerConfig(
        @Cast("torch::profiler::impl::ProfilerState") int state) { super((Pointer)null); allocate(state); }
  private native void allocate(
        @Cast("torch::profiler::impl::ProfilerState") int state);

  public native @Cast("bool") boolean disabled();
  public native @Cast("bool") boolean global();

  public native ProfilerState state(); public native ProfilerConfig state(ProfilerState setter);
  public native @ByRef ExperimentalConfig experimental_config(); public native ProfilerConfig experimental_config(ExperimentalConfig setter);
  public native @Cast("bool") boolean report_input_shapes(); public native ProfilerConfig report_input_shapes(boolean setter);
  public native @Cast("bool") boolean profile_memory(); public native ProfilerConfig profile_memory(boolean setter);
  public native @Cast("bool") boolean with_stack(); public native ProfilerConfig with_stack(boolean setter);
  public native @Cast("bool") boolean with_flops(); public native ProfilerConfig with_flops(boolean setter);
  public native @Cast("bool") boolean with_modules(); public native ProfilerConfig with_modules(boolean setter);

  // For serialization
  public native @ByVal IValue toIValue();
  public static native @ByVal ProfilerConfig fromIValue(@Const @ByRef IValue profilerConfigIValue);
}
