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


// used to hold traceback information in allocators
@Namespace("c10") @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class GatheredContext extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public GatheredContext() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public GatheredContext(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public GatheredContext(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public GatheredContext position(long position) {
        return (GatheredContext)super.position(position);
    }
    @Override public GatheredContext getPointer(long i) {
        return new GatheredContext((Pointer)this).offsetAddress(i);
    }

}
