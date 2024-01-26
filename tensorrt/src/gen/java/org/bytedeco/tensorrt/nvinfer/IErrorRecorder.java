// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tensorrt.nvinfer;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.cuda.cublas.*;
import static org.bytedeco.cuda.global.cublas.*;
import org.bytedeco.cuda.cudnn.*;
import static org.bytedeco.cuda.global.cudnn.*;
import org.bytedeco.cuda.nvrtc.*;
import static org.bytedeco.cuda.global.nvrtc.*;

import static org.bytedeco.tensorrt.global.nvinfer.*;
 // namespace impl

/**
 *  \class IErrorRecorder
 * 
 *  \brief Reference counted application-implemented error reporting interface for TensorRT objects.
 * 
 *  The error reporting mechanism is a user defined object that interacts with the internal state of the object
 *  that it is assigned to in order to determine information about abnormalities in execution. The error recorder
 *  gets both an error enum that is more descriptive than pass/fail and also a string description that gives more
 *  detail on the exact failure modes. In the safety context, the error strings are all limited to 1024 characters
 *  in length.
 * 
 *  The ErrorRecorder gets passed along to any class that is created from another class that has an ErrorRecorder
 *  assigned to it. For example, assigning an ErrorRecorder to an IBuilder allows all INetwork's, ILayer's, and
 *  ITensor's to use the same error recorder. For functions that have their own ErrorRecorder accessor functions.
 *  This allows registering a different error recorder or de-registering of the error recorder for that specific
 *  object.
 * 
 *  The ErrorRecorder object implementation must be thread safe. All locking and synchronization is pushed to the
 *  interface implementation and TensorRT does not hold any synchronization primitives when calling the interface
 *  functions.
 * 
 *  The lifetime of the ErrorRecorder object must exceed the lifetime of all TensorRT objects that use it.
 *  */
@Namespace("nvinfer1") @NoOffset @Properties(inherit = org.bytedeco.tensorrt.presets.nvinfer.class)
public class IErrorRecorder extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IErrorRecorder(Pointer p) { super(p); }

    /**
     *  A typedef of a C-style string for reporting error descriptions.
     *  */
    
    
    //!
    //!

    /**
     *  The length limit for an error description, excluding the '\0' string terminator.
     *  */
    
    
    //!
    //!
    @MemberGetter public static native @Cast("const size_t") long kMAX_DESC_LENGTH();
    public static final long kMAX_DESC_LENGTH = kMAX_DESC_LENGTH();

    /**
     *  A typedef of a 32bit integer for reference counting.
     *  */

    // Public API used to retrieve information from the error recorder.

    /**
     *  \brief Return the number of errors
     * 
     *  Determines the number of errors that occurred between the current point in execution
     *  and the last time that the clear() was executed. Due to the possibility of asynchronous
     *  errors occuring, a TensorRT API can return correct results, but still register errors
     *  with the Error Recorder. The value of getNbErrors must monotonically increases until clear()
     *  is called.
     * 
     *  @return Returns the number of errors detected, or 0 if there are no errors.
     * 
     *  @see clear
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) int getNbErrors();

    /**
     *  \brief Returns the ErrorCode enumeration.
     * 
     *  @param errorIdx A 32-bit integer that indexes into the error array.
     * 
     *  The errorIdx specifies what error code from 0 to getNbErrors()-1 that the application
     *  wants to analyze and return the error code enum.
     * 
     *  @return Returns the enum corresponding to errorIdx.
     * 
     *  @see getErrorDesc, ErrorCode
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) ErrorCode getErrorCode(int errorIdx);

    /**
     *  \brief Returns a null-terminated C-style string description of the error.
     * 
     *  @param errorIdx A 32-bit integer that indexes into the error array.
     * 
     *  For the error specified by the idx value, return the string description of the error. The
     *  error string is a null-terminated C-style string. In the safety context there is a
     *  constant length requirement to remove any dynamic memory allocations and the error message
     *  may be truncated. The format of the string is "<EnumAsStr> - <Description>".
     * 
     *  @return Returns a string representation of the error along with a description of the error.
     * 
     *  @see getErrorCode
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) String getErrorDesc(int errorIdx);

    /**
     *  \brief Determine if the error stack has overflowed.
     * 
     *  In the case when the number of errors is large, this function is used to query if one or more
     *  errors have been dropped due to lack of storage capacity. This is especially important in the
     *  automotive safety case where the internal error handling mechanisms cannot allocate memory.
     * 
     *  @return true if errors have been dropped due to overflowing the error stack.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean hasOverflowed();

    /**
     *  \brief Clear the error stack on the error recorder.
     * 
     *  Removes all the tracked errors by the error recorder.  This function must guarantee that after
     *  this function is called, and as long as no error occurs, the next call to getNbErrors will return
     *  zero.
     * 
     *  @see getNbErrors
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    //!
    public native @NoException(true) void clear();

    // API used by TensorRT to report Error information to the application.

    /**
     *  \brief Report an error to the error recorder with the corresponding enum and description.
     * 
     *  @param val The error code enum that is being reported.
     *  @param desc The string description of the error.
     * 
     *  Report an error to the user that has a given value and human readable description. The function returns false
     *  if processing can continue, which implies that the reported error is not fatal. This does not guarantee that
     *  processing continues, but provides a hint to TensorRT.
     *  The desc C-string data is only valid during the call to reportError and may be immediately deallocated by the
     *  caller when reportError returns. The implementation must not store the desc pointer in the ErrorRecorder object
     *  or otherwise access the data from desc after reportError returns.
     * 
     *  @return True if the error is determined to be fatal and processing of the current function must end.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("bool") @NoException(true) boolean reportError(ErrorCode val, String desc);
    public native @Cast("bool") @NoException(true) boolean reportError(@Cast("nvinfer1::ErrorCode") int val, @Cast("const char*") BytePointer desc);

    /**
     *  \brief Increments the refcount for the current ErrorRecorder.
     * 
     *  Increments the reference count for the object by one and returns the current value.  This reference count allows
     *  the application to know that an object inside of TensorRT has taken a reference to the ErrorRecorder.  TensorRT
     *  guarantees that every call to IErrorRecorder::incRefCount will be paired with a call to
     *  IErrorRecorder::decRefCount when the reference is released.  It is undefined behavior to destruct the
     *  ErrorRecorder when incRefCount has been called without a corresponding decRefCount.
     * 
     *  @return The reference counted value after the increment completes.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    
    
    //!
    //!
    //!
    //!
    //!
    public native @Cast("nvinfer1::IErrorRecorder::RefCount") @NoException(true) int incRefCount();

    /**
     *  \brief Decrements the refcount for the current ErrorRecorder.
     * 
     *  Decrements the reference count for the object by one and returns the current value.  This reference count allows
     *  the application to know that an object inside of TensorRT has taken a reference to the ErrorRecorder.  TensorRT
     *  guarantees that every call to IErrorRecorder::decRefCount will be preceded by a call to
     *  IErrorRecorder::incRefCount.  It is undefined behavior to destruct the ErrorRecorder when incRefCount has been
     *  called without a corresponding decRefCount.
     * 
     *  @return The reference counted value after the decrement completes.
     * 
     *  \u005Cusage
     *  - Allowed context for the API call
     *    - Thread-safe: Yes, this method is required to be thread-safe and may be called from multiple threads
     *                   when multiple execution contexts are used during runtime.
     *  */
    public native @Cast("nvinfer1::IErrorRecorder::RefCount") @NoException(true) int decRefCount();
}
