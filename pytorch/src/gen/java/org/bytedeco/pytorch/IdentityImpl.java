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


// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ Identity ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

/** A placeholder identity operator that is argument-insensitive.
 *  See https://pytorch.org/docs/master/generated/torch.nn.Identity.html to
 *  learn about the exact behavior of this module. */
@Namespace("torch::nn") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class IdentityImpl extends IdentityImplCloneable {
    static { Loader.load(); }
    /** Default native constructor. */
    public IdentityImpl() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IdentityImpl(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IdentityImpl(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IdentityImpl position(long position) {
        return (IdentityImpl)super.position(position);
    }
    @Override public IdentityImpl getPointer(long i) {
        return new IdentityImpl((Pointer)this).offsetAddress(i);
    }

  public native void reset();

  /** Pretty prints the {@code Identity} module into the given {@code stream}. */
  public native void pretty_print(@Cast("std::ostream*") @ByRef Pointer stream);

  public native @ByVal Tensor forward(@Const @ByRef Tensor input);
}
