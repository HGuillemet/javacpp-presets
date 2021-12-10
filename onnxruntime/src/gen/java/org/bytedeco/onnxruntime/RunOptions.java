// Targeted by JavaCPP version 1.5.7-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.onnxruntime;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;

import static org.bytedeco.onnxruntime.global.onnxruntime.*;


@Namespace("Ort") @Properties(inherit = org.bytedeco.onnxruntime.presets.onnxruntime.class)
public class RunOptions extends BaseRunOptions {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RunOptions(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RunOptions(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RunOptions position(long position) {
        return (RunOptions)super.position(position);
    }
    @Override public RunOptions getPointer(long i) {
        return new RunOptions((Pointer)this).offsetAddress(i);
    }

  /** Wraps OrtApi::CreateRunOptions */
  public RunOptions() { super((Pointer)null); allocate(); }
  private native void allocate();

  /** Wraps OrtApi::RunOptionsSetRunLogVerbosityLevel */
  public native @ByRef RunOptions SetRunLogVerbosityLevel(int arg0);
  /** Wraps OrtApi::RunOptionsGetRunLogVerbosityLevel */
  public native int GetRunLogVerbosityLevel();

  /** Wraps OrtApi::RunOptionsSetRunLogSeverityLevel */
  public native @ByRef RunOptions SetRunLogSeverityLevel(int arg0);
  

  /** wraps OrtApi::RunOptionsSetRunTag */
  public native @ByRef RunOptions SetRunTag(@Cast("const char*") BytePointer run_tag);
  public native @ByRef RunOptions SetRunTag(String run_tag);
  /** Wraps OrtApi::RunOptionsGetRunTag */
  public native @Cast("const char*") BytePointer GetRunTag();

  /** Wraps OrtApi::AddRunConfigEntry */
  public native @ByRef RunOptions AddConfigEntry(@Cast("const char*") BytePointer config_key, @Cast("const char*") BytePointer config_value);
  public native @ByRef RunOptions AddConfigEntry(String config_key, String config_value);

  /** \brief Terminates all currently executing Session::Run calls that were made using this RunOptions instance
  *
  * If a currently executing session needs to be force terminated, this can be called from another thread to force it to fail with an error
  * Wraps OrtApi::RunOptionsSetTerminate 
  */
  public native @ByRef RunOptions SetTerminate();

  /** \brief Clears the terminate flag so this RunOptions instance can be used in a new Session::Run call without it instantly terminating
  *
  * Wraps OrtApi::RunOptionsUnsetTerminate
  */
  public native @ByRef RunOptions UnsetTerminate();
}
