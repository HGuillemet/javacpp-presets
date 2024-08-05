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


@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IPUHooksInterface extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IPUHooksInterface() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IPUHooksInterface(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IPUHooksInterface(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IPUHooksInterface position(long position) {
        return (IPUHooksInterface)super.position(position);
    }
    @Override public IPUHooksInterface getPointer(long i) {
        return new IPUHooksInterface((Pointer)this).offsetAddress(i);
    }


  public native @Const @ByRef Generator getDefaultIPUGenerator(
        @Cast("c10::DeviceIndex") byte device_index/*=-1*/);
  public native @Const @ByRef Generator getDefaultIPUGenerator();

  public native @ByVal Generator newIPUGenerator(@Cast("c10::DeviceIndex") byte device_index/*=-1*/);
  public native @ByVal Generator newIPUGenerator();
}
