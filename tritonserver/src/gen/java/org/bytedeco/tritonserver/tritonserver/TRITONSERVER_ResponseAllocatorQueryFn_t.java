// Targeted by JavaCPP version 1.5.8: DO NOT EDIT THIS FILE

package org.bytedeco.tritonserver.tritonserver;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.tritonserver.global.tritonserver.*;


/** Type for function that is called to query the allocator's preferred memory
 *  type and memory type ID. As much as possible, the allocator should attempt
 *  to return the same memory_type and memory_type_id values that will be
 *  returned by the subsequent call to TRITONSERVER_ResponseAllocatorAllocFn_t.
 *  But the allocator is not required to do so.
 * 
 *  @param allocator The allocator that is provided in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 *  @param userp The user data pointer that is provided as
 *  'response_allocator_userp' in the call to
 *  TRITONSERVER_InferenceRequestSetResponseCallback.
 *  @param tensor_name The name of the output tensor. This is optional
 *  and it should be set to nullptr to indicate that the tensor name has
 *  not determined.
 *  @param byte_size The expected size of the buffer. This is optional
 *  and it should be set to nullptr to indicate that the byte size has
 *  not determined.
 *  @param memory_type Acts as both input and output. On input gives
 *  the memory type preferred by the caller. Returns memory type preferred
 *  by the allocator, taken account of the caller preferred type.
 *  @param memory_type_id Acts as both input and output. On input gives
 *  the memory type ID preferred by the caller. Returns memory type ID preferred
 *  by the allocator, taken account of the caller preferred type ID.
 *  @return a TRITONSERVER_Error object if a failure occurs. */

///
@Properties(inherit = org.bytedeco.tritonserver.presets.tritonserver.class)
public class TRITONSERVER_ResponseAllocatorQueryFn_t extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    TRITONSERVER_ResponseAllocatorQueryFn_t(Pointer p) { super(p); }
    protected TRITONSERVER_ResponseAllocatorQueryFn_t() { allocate(); }
    private native void allocate();
    public native TRITONSERVER_Error call(
    TRITONSERVER_ResponseAllocator allocator, Pointer userp,
    String tensor_name, @Cast("size_t*") SizeTPointer byte_size,
    @Cast("TRITONSERVER_MemoryType*") IntPointer memory_type, @Cast("int64_t*") LongPointer memory_type_id);
}