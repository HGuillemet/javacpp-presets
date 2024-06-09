// Targeted by JavaCPP version 1.5.11-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.pytorch;

import org.bytedeco.pytorch.Allocator;
import org.bytedeco.pytorch.Function;
import org.bytedeco.pytorch.functions.*;
import org.bytedeco.pytorch.chrono.*;
import org.bytedeco.pytorch.Module;
import org.bytedeco.javacpp.annotation.Cast;
import org.bytedeco.pytorch.helper.*;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.pytorch.global.torch.*;


@Namespace("torch::distributed::rpc") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class JitRRefPickleGuard extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public JitRRefPickleGuard(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public JitRRefPickleGuard(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public JitRRefPickleGuard position(long position) {
        return (JitRRefPickleGuard)super.position(position);
    }
    @Override public JitRRefPickleGuard getPointer(long i) {
        return new JitRRefPickleGuard((Pointer)this).offsetAddress(i);
    }

  public JitRRefPickleGuard() { super((Pointer)null); allocate(); }
  private native void allocate();
}