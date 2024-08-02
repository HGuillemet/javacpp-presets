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
import static org.bytedeco.javacpp.chrono.Chrono.*;

import static org.bytedeco.pytorch.global.torch.*;


// TODO: AutoNonVariableTypeMode should be removed in release 1.10.
@Namespace("at") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class AutoNonVariableTypeMode extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public AutoNonVariableTypeMode(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public AutoNonVariableTypeMode(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public AutoNonVariableTypeMode position(long position) {
        return (AutoNonVariableTypeMode)super.position(position);
    }
    @Override public AutoNonVariableTypeMode getPointer(long i) {
        return new AutoNonVariableTypeMode((Pointer)this).offsetAddress(i);
    }

  public AutoNonVariableTypeMode(@Cast("bool") boolean enabled/*=true*/) { super((Pointer)null); allocate(enabled); }
  private native void allocate(@Cast("bool") boolean enabled/*=true*/);
  public AutoNonVariableTypeMode() { super((Pointer)null); allocate(); }
  private native void allocate();

  // disable all autograd dispatch keys
}
