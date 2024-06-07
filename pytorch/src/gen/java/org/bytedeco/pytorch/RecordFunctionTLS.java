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


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class RecordFunctionTLS extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public RecordFunctionTLS() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public RecordFunctionTLS(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RecordFunctionTLS(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public RecordFunctionTLS position(long position) {
        return (RecordFunctionTLS)super.position(position);
    }
    @Override public RecordFunctionTLS getPointer(long i) {
        return new RecordFunctionTLS((Pointer)this).offsetAddress(i);
    }

  // Thread local vector of callbacks, holds pairs (callbacks, unique_id);
  // must be sorted in increasing handles order
  public native @StdVector RecordFunctionCallbacksEntry sorted_tls_callbacks_(); public native RecordFunctionTLS sorted_tls_callbacks_(RecordFunctionCallbacksEntry setter);

  public native @Cast("bool") boolean tls_record_function_enabled_(); public native RecordFunctionTLS tls_record_function_enabled_(boolean setter);
}
