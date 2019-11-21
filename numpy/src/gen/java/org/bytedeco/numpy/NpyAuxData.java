// Targeted by JavaCPP version 1.5.3-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.numpy;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.openblas.global.openblas_nolapack.*;
import static org.bytedeco.openblas.global.openblas.*;
import org.bytedeco.cpython.*;
import static org.bytedeco.cpython.global.python.*;

import static org.bytedeco.numpy.global.numpy.*;


@Name("NpyAuxData_tag") @Properties(inherit = org.bytedeco.numpy.presets.numpy.class)
public class NpyAuxData extends PyObject {
    static { Loader.load(); }
    /** Default native constructor. */
    public NpyAuxData() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NpyAuxData(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NpyAuxData(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NpyAuxData position(long position) {
        return (NpyAuxData)super.position(position);
    }

    public native @Name("free") NpyAuxData_FreeFunc _free(); public native NpyAuxData _free(NpyAuxData_FreeFunc setter);
    public native NpyAuxData_CloneFunc clone(); public native NpyAuxData clone(NpyAuxData_CloneFunc setter);
    /* To allow for a bit of expansion without breaking the ABI */
    public native Pointer reserved(int i); public native NpyAuxData reserved(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved();
}
