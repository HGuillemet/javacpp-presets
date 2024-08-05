// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.javacpp.chrono.*;
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CPUGeneratorImpl extends GeneratorImpl {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CPUGeneratorImpl(Pointer p) { super(p); }

  // Constructors
  public CPUGeneratorImpl(@Cast("uint64_t") long seed_in/*=c10::default_rng_seed_val*/) { super((Pointer)null); allocate(seed_in); }
  @UniquePtr @Name("std::make_unique<at::CPUGeneratorImpl>") private native void allocate(@Cast("uint64_t") long seed_in/*=c10::default_rng_seed_val*/);
  public CPUGeneratorImpl() { super((Pointer)null); allocate(); }
  @UniquePtr @Name("std::make_unique<at::CPUGeneratorImpl>") private native void allocate();

  // CPUGeneratorImpl methods
  public native @SharedPtr CPUGeneratorImpl clone();
  public native void set_current_seed(@Cast("uint64_t") long seed);
  public native void set_offset(@Cast("uint64_t") long offset);
  public native @Cast("uint64_t") long get_offset();
  public native @Cast("uint64_t") long current_seed();
  public native @Cast("uint64_t") long seed();
  public native void set_state(@Const @ByRef TensorImpl new_state);
  public native @IntrusivePtr("c10::TensorImpl") @Cast({"", "c10::intrusive_ptr<c10::TensorImpl>&"}) TensorImpl get_state();
  public static native DeviceType device_type();
  public native @Cast("uint32_t") int random();
  public native @Cast("uint64_t") long random64();
  public native @ByVal FloatOptional next_float_normal_sample();
  public native @ByVal DoubleOptional next_double_normal_sample();
  public native void set_next_float_normal_sample(@ByVal FloatOptional randn);
  public native void set_next_double_normal_sample(@ByVal DoubleOptional randn);
  public native @ByVal @Cast("at::mt19937*") mt19937_engine engine();
  public native void set_engine(@ByVal @Cast("at::mt19937*") mt19937_engine engine);
}
