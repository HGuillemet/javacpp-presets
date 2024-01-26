// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.clang;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.llvm.LLVM.*;
import static org.bytedeco.llvm.global.LLVM.*;

import static org.bytedeco.llvm.global.clang.*;


/**
 * An opaque type representing target information for a given translation
 * unit.
 */
@Name("CXTargetInfoImpl") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.clang.class)
public class CXTargetInfo extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public CXTargetInfo() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CXTargetInfo(Pointer p) { super(p); }
}
