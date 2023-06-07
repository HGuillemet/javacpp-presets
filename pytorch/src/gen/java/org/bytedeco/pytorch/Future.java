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
 // namespace ivalue

// Future
@Name("c10::ivalue::Future") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class Future extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public Future(Pointer p) { super(p); }

  
  
  
  

  @NoOffset public static class FutureError extends Pointer {
      static { Loader.load(); }
      /** Default native constructor. */
      public FutureError() { super((Pointer)null); allocate(); }
      /** Native array allocator. Access with {@link Pointer#position(long)}. */
      public FutureError(long size) { super((Pointer)null); allocateArray(size); }
      /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
      public FutureError(Pointer p) { super(p); }
      private native void allocate();
      private native void allocateArray(long size);
      @Override public FutureError position(long position) {
          return (FutureError)super.position(position);
      }
      @Override public FutureError getPointer(long i) {
          return new FutureError((Pointer)this).offsetAddress(i);
      }
  
    

    

    public native @NoException(true) @Cast("const char*") BytePointer what();

    public native @StdString BytePointer error_msg(); public native FutureError error_msg(BytePointer setter);
  }

  /**
   * Wait on the future until it completes.
   */
  public native @Name("wait") void _wait();

  /**
   * Wait on the future until it completes and throw an
   * exception if an error exists.
   */
  public native void waitAndThrow();

  /**
   * Explicitly mark the future as completed with the output value. Optionally,
   * the storages for all tensors in IValue can be passed as well. The DataPtrs
   * of these storages are used to synchronize CUDA streams. If storages isn't
   * given we will attempt to extract it from the value, if we need to (this
   * happens if a non-empty set of devices was given to the constructor). Thus
   * one only needs to provide storages when 1) they cannot be extracted through
   * IValue::getSubValues() or through pickling in case of Python object; or
   * when 2) customized storage extraction is more efficient.
   */
  public native void markCompleted(
        @ByVal IValue value,
        @ByVal(nullValue = "c10::optional<std::vector<c10::ivalue::Future::WeakStorage> >(c10::nullopt)") WeakStorageVectorOptional storages);
  public native void markCompleted(
        @ByVal IValue value);

  public native void markCompleted();

  public native void setError(@ByVal @Cast("std::exception_ptr*") Pointer eptr);

  public native void setErrorIfNeeded(@ByVal @Cast("std::exception_ptr*") Pointer eptr);

  // Get the result of the current future.
  public native @ByVal IValue value();

  // This accessor should only be used if we know that the future is
  // completed() with no error.
  public native @Const @ByRef IValue constValue();

  // This accessor should only be used if we know that the future is
  // completed() with no error.
  public native @Const @ByRef WeakStorageVector storages();

  /**
   * Add a callback to the future.
   * The callbacks will be executed once the future completes.
   * If the future has already completed,
   * this function will execute the callback immediately.
   */

  /**
   * Add a callback to the future, and return another Future to hold the return
   * value of the callback. This is necessary when the callback provider needs
   * to know for sure when the callback has finished.
   */

  // Tries to retrieve the error message from std::exception_ptr.
  public native @StdString BytePointer tryRetrieveErrorMessage();

  // Check if the current future has completed
  public native @Cast("bool") boolean completed();

  public native @Cast("bool") boolean hasValue();

  public native @Cast("bool") boolean hasError();

  public native @ByVal @Cast("std::exception_ptr*") Pointer exception_ptr();

  

  public native @ByVal Type.TypePtr elementType();

  public native @StdVector Device devices();

  // This method should be used when one intends to manually create a child
  // future, for example when implementing a customized version of then().
  public native @ByVal FuturePtr createInstance(@ByVal Type.TypePtr type);
}
