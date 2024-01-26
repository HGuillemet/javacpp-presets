// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.tvm;

import org.bytedeco.tvm.Module;
import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.opencl.*;
import static org.bytedeco.opencl.global.OpenCL.*;
import org.bytedeco.dnnl.*;
import static org.bytedeco.dnnl.global.dnnl.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;
import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;

import static org.bytedeco.tvm.global.tvm_runtime.*;


/** \brief ObjectRef equal functor */
@Namespace("tvm::runtime") @Properties(inherit = org.bytedeco.tvm.presets.tvm_runtime.class)
public class ObjectPtrEqual extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ObjectPtrEqual() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ObjectPtrEqual(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ObjectPtrEqual(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ObjectPtrEqual position(long position) {
        return (ObjectPtrEqual)super.position(position);
    }
    @Override public ObjectPtrEqual getPointer(long i) {
        return new ObjectPtrEqual((Pointer)this).offsetAddress(i);
    }

  public native @Cast("bool") @Name("operator ()") boolean apply(@Const @ByRef ObjectRef a, @Const @ByRef ObjectRef b);
}
