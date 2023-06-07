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


// A CppSignature object holds RTTI information about a C++ function signature at runtime
// and can compare them or get a debug-printable name.
@Namespace("c10::impl") @NoOffset @Properties(inherit = org.bytedeco.pytorch.presets.torch.class)
public class CppSignature extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CppSignature(Pointer p) { super(p); }

    public CppSignature(@Const @ByRef CppSignature arg0) { super((Pointer)null); allocate(arg0); }
    private native void allocate(@Const @ByRef CppSignature arg0);
    public native @ByRef @Name("operator =") CppSignature put(@Const @ByRef CppSignature arg0);

    public native @StdString BytePointer name();

    private static native @Namespace @Cast("bool") @Name("operator ==") boolean equals(@Const @ByRef CppSignature lhs, @Const @ByRef CppSignature rhs);
    public boolean equals(CppSignature rhs) { return equals(this, rhs); }
}
