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


/**
 * bits16 is an uninterpreted dtype of a tensor with 16 bits, without any
 * semantics defined.
 */
@Namespace("c10") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class bits16 extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public bits16(Pointer p) { super(p); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public bits16(long size) { super((Pointer)null); allocateArray(size); }
    private native void allocateArray(long size);
    @Override public bits16 position(long position) {
        return (bits16)super.position(position);
    }
    @Override public bits16 getPointer(long i) {
        return new bits16((Pointer)this).offsetAddress(i);
    }

  public native @Cast("uint16_t") short val_(); public native bits16 val_(short setter);
  public bits16() { super((Pointer)null); allocate(); }
  private native void allocate();
  public bits16(@Cast("uint16_t") short val) { super((Pointer)null); allocate(val); }
  private native void allocate(@Cast("uint16_t") short val);
}
