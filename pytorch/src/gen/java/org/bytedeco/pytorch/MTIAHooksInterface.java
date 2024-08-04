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
import static org.bytedeco.javacpp.global.chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class MTIAHooksInterface extends AcceleratorHooksInterface {
    static { Loader.load(); }
    /** Default native constructor. */
    public MTIAHooksInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MTIAHooksInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MTIAHooksInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MTIAHooksInterface position(long position) {
        return (MTIAHooksInterface)super.position(position);
    }
    @Override public MTIAHooksInterface getPointer(long i) {
        return new MTIAHooksInterface((Pointer)this).offsetAddress(i);
    }

// this fails the implementation if MTIAHooks functions are called, but
// MTIA backend is not present.
// #define FAIL_MTIAHOOKS_FUNC(func)
//   TORCH_CHECK(false, "Cannot execute ", func, "() without MTIA backend.");

  public native void initMTIA();

  public native @Cast("bool") boolean hasMTIA();

  public native @Cast("c10::DeviceIndex") byte deviceCount();

  public native void deviceSynchronize(@Cast("c10::DeviceIndex") byte device_index);

  public native @StdString BytePointer showConfig();

  public native @Cast("bool") boolean hasPrimaryContext(@Cast("c10::DeviceIndex") byte device_index);

  public native void setCurrentDevice(@Cast("c10::DeviceIndex") byte device);

  public native @Cast("c10::DeviceIndex") byte getCurrentDevice();

  public native @Cast("c10::DeviceIndex") byte exchangeDevice(@Cast("c10::DeviceIndex") byte device);

  public native @Cast("c10::DeviceIndex") byte maybeExchangeDevice(@Cast("c10::DeviceIndex") byte device);

  public native @ByVal Stream getCurrentStream(@Cast("c10::DeviceIndex") byte device);

  public native @ByVal Stream getDefaultStream(@Cast("c10::DeviceIndex") byte device);

  public native void setCurrentStream(@Const @ByRef Stream stream);
}
