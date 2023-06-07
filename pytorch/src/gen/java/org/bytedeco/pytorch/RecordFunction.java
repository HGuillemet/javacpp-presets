// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

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


// Generated by the callback managers to determine which functions to run.

@Namespace("at") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RecordFunction extends Pointer {
    static { Loader.load(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecordFunction(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public RecordFunction position(long position) {
        return (RecordFunction)super.position(position);
    }
    @Override public RecordFunction getPointer(long i) {
        return new RecordFunction((Pointer)this).offsetAddress(i);
    }

  // Default constructor is used with before function called afterwards:
  //  scope - record scope that this function tracks
  //  pre_sampled - whether this RecordFunction was already pre-sampled with
  //    kLowProb probability
  public RecordFunction(RecordScope scope/*=at::RecordScope::FUNCTION*/) { super((Pointer)null); allocate(scope); }
  private native void allocate(RecordScope scope/*=at::RecordScope::FUNCTION*/);
  public RecordFunction() { super((Pointer)null); allocate(); }
  private native void allocate();
  public RecordFunction(@Cast("at::RecordScope") byte scope/*=at::RecordScope::FUNCTION*/) { super((Pointer)null); allocate(scope); }
  private native void allocate(@Cast("at::RecordScope") byte scope/*=at::RecordScope::FUNCTION*/);
  public RecordFunction(@Cast("at::StepCallbacks*") @ByRef(true) Pointer step_callbacks) { super((Pointer)null); allocate(step_callbacks); }
  private native void allocate(@Cast("at::StepCallbacks*") @ByRef(true) Pointer step_callbacks);

  // Destructor calls end callbacks

  
  

  public native @Cast("const char*") BytePointer name();

  public native @Cast("int64_t") long seqNr();

  public native @ByVal IValueArrayRef inputs();

  public native @Const @ByRef IValueVector outputs();

  public native void setOutputs(@ByRef(true) IValueVector outputs);

  public native void setOutputs(@ByVal IValueArrayRef outputs);

  public native @Cast("size_t") long num_inputs();
  public native @Cast("size_t") long num_outputs();

  // Retrieves the thread_id that this RecordFunction ran start callbacks with.
  // Useful for writing thread safe end callbacks that may be potentially
  // executed in a different thread (async ops)
  public native @Cast("uint64_t") long threadId();

  // For backward functions - thread id of the corresponding forward function,
  // or zero otherwise;
  // used alongside with sequence number to correlate backward functions with
  // the forward ones
  public native @Cast("uint64_t") long forwardThreadId();

  public native void setForwardThreadId(@Cast("uint64_t") long thread_id);

  public native RecordScope scope();

  // Returns logical thread_id for the current thread
  public static native @Cast("uint64_t") long currentThreadId();

  // Internal functions, do not use directly;
  // used in python's context manager

  // before functions initialize RecordFunction members and call
  // start callbacks
  public native void before(@Cast("const char*") BytePointer name, @Cast("int64_t") long sequence_nr/*=-1*/);
  public native void before(@Cast("const char*") BytePointer name);
  public native void before(String name, @Cast("int64_t") long sequence_nr/*=-1*/);
  public native void before(String name);
  public native void before(@ByVal @Cast("at::RecordFunction::schema_ref_t*") Pointer schema, @Cast("int64_t") long sequence_nr/*=-1*/);
  public native void before(@ByVal @Cast("at::RecordFunction::schema_ref_t*") Pointer schema);

  // Sets node ID for distributed profiling
  public static native void setDefaultNodeId(@Cast("int64_t") long defaultNodeId);
  // Gets node ID for distributed profiling
  public static native @Cast("int64_t") long getDefaultNodeId();

  // Calls end callbacks. After end(), accessors will no longer provide useful
  // results.
  public native void end();

  // Internal-only, used only force async event for distributed events
  // profiling.
  

  // Returns whether this RecordFunction corresponds to an async event orn ot.
  public native @Cast("bool") boolean isAsync();

  // Internal-only, used to denote out variant used for Static Runtime execution
  
  public native @Cast("bool") boolean isStaticRuntimeOutVariant();

  public native long handle();

  public native @ByVal OperatorNameOptional operator_name();

  // This method returns a copy of the FunctionSchema and can be expensive.
  public native @ByVal FunctionSchemaOptional operator_schema();

  public native void setHandle(long handle);

  // Whether this RecordFunction runs any callbacks.
  public native @Cast("bool") boolean isActive();

  public native @Cast("bool") boolean needsInputs();

  public native @Cast("bool") boolean needsOutputs();

  public native @Cast("int64_t") long debugHandle();

  public native void setDebugHandle(@Cast("int64_t") long debug_handle);

  public native void invalidateInputs();
}
