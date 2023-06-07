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


// A RAII guard that sets warn_always (not thread-local) on
// construction, and sets it back to the original value upon destruction.
@Namespace("c10::WarningUtils") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class WarnAlways extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public WarnAlways(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public WarnAlways(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public WarnAlways position(long position) {
        return (WarnAlways)super.position(position);
    }
    @Override public WarnAlways getPointer(long i) {
        return new WarnAlways((Pointer)this).offsetAddress(i);
    }

  public WarnAlways(@Cast("bool") boolean setting/*=true*/) { super((Pointer)null); allocate(setting); }
  private native void allocate(@Cast("bool") boolean setting/*=true*/);
  public WarnAlways() { super((Pointer)null); allocate(); }
  private native void allocate();
}
