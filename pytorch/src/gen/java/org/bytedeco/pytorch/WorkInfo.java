// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.presets.torch.IntrusivePtr;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("c10d") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WorkInfo extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WorkInfo(Pointer p) { super(p); }

  public WorkInfo(
        OpType opType,
        @Cast("const uint64_t") long seq,
        @Const @ByRef TimePoint timeStarted,
        @Const @ByRef TimePoint timeFinished,
        @Const @ByRef FloatDuration activeDuration) { super((Pointer)null); allocate(opType, seq, timeStarted, timeFinished, activeDuration); }
  @SharedPtr @Name("std::make_shared<c10d::WorkInfo>") private native void allocate(
        OpType opType,
        @Cast("const uint64_t") long seq,
        @Const @ByRef TimePoint timeStarted,
        @Const @ByRef TimePoint timeFinished,
        @Const @ByRef FloatDuration activeDuration);
  public WorkInfo(
        @Cast("c10d::OpType") byte opType,
        @Cast("const uint64_t") long seq,
        @Const @ByRef TimePoint timeStarted,
        @Const @ByRef TimePoint timeFinished,
        @Const @ByRef FloatDuration activeDuration) { super((Pointer)null); allocate(opType, seq, timeStarted, timeFinished, activeDuration); }
  @SharedPtr @Name("std::make_shared<c10d::WorkInfo>") private native void allocate(
        @Cast("c10d::OpType") byte opType,
        @Cast("const uint64_t") long seq,
        @Const @ByRef TimePoint timeStarted,
        @Const @ByRef TimePoint timeFinished,
        @Const @ByRef FloatDuration activeDuration);

  public native OpType opType(); public native WorkInfo opType(OpType setter);
  public native @Cast("uint64_t") long seq(); public native WorkInfo seq(long setter);
  public native @ByRef TimePoint timeStarted(); public native WorkInfo timeStarted(TimePoint setter);
  public native @ByRef TimePoint timeFinished(); public native WorkInfo timeFinished(TimePoint setter);
  public native @ByRef FloatDuration activeDuration(); public native WorkInfo activeDuration(FloatDuration setter);
}
