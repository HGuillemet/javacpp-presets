// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch.cuda;

import org.bytedeco.pytorch.*;
import org.bytedeco.pytorch.helper.*;
import org.bytedeco.cuda.cudart.*;
import org.bytedeco.cuda.cusparse.*;
import org.bytedeco.cuda.cublas.*;
import org.bytedeco.cuda.cusolver.*;
import org.bytedeco.cuda.cudnn.*;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.cuda.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.global.torch.DeviceType;
import org.bytedeco.pytorch.global.torch.ScalarType;
import org.bytedeco.pytorch.global.torch.MemoryFormat;
import org.bytedeco.pytorch.Allocator;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.pytorch.*;
import static org.bytedeco.pytorch.global.torch.*;

import static org.bytedeco.pytorch.global.torch_cuda.*;


/** Holds information about any device-side assertions that fail.
 *  Held in managed memory and access by both the CPU and the GPU. */
@Namespace("c10::cuda") @Properties(inherit = org.bytedeco.pytorch.presets.torch_cuda.class)
public class DeviceAssertionData extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public DeviceAssertionData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public DeviceAssertionData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DeviceAssertionData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public DeviceAssertionData position(long position) {
        return (DeviceAssertionData)super.position(position);
    }
    @Override public DeviceAssertionData getPointer(long i) {
        return new DeviceAssertionData((Pointer)this).offsetAddress(i);
    }

  /** Stringification of the assertion */
  // NOLINTNEXTLINE(*-c-arrays)
  public native @Cast("char") byte assertion_msg(int i); public native DeviceAssertionData assertion_msg(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer assertion_msg();
  /** File the assertion was in */
  // NOLINTNEXTLINE(*-c-arrays)
  public native @Cast("char") byte filename(int i); public native DeviceAssertionData filename(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer filename();
  /** Name of the function the assertion was in */
  // NOLINTNEXTLINE(*-c-arrays)
  public native @Cast("char") byte function_name(int i); public native DeviceAssertionData function_name(int i, byte setter);
  @MemberGetter public native @Cast("char*") BytePointer function_name();
  /** Line number the assertion was at */
  public native int line_number(); public native DeviceAssertionData line_number(int setter);
  /** Number uniquely identifying the kernel launch that triggered the assertion */
  public native @Cast("uint32_t") int caller(); public native DeviceAssertionData caller(int setter);
  /** block_id of the thread that failed the assertion */
  // NOLINTNEXTLINE(*-c-arrays)
  public native int block_id(int i); public native DeviceAssertionData block_id(int i, int setter);
  @MemberGetter public native IntPointer block_id();
  /** third_id of the thread that failed the assertion */
  // NOLINTNEXTLINE(*-c-arrays)
  public native int thread_id(int i); public native DeviceAssertionData thread_id(int i, int setter);
  @MemberGetter public native IntPointer thread_id();
}
