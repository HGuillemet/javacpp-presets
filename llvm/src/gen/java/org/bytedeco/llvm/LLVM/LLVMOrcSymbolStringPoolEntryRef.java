// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * A reference to an orc::SymbolStringPool table entry.
 */
@Name("LLVMOrcOpaqueSymbolStringPoolEntry") @Opaque @Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcSymbolStringPoolEntryRef extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public LLVMOrcSymbolStringPoolEntryRef() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOrcSymbolStringPoolEntryRef(Pointer p) { super(p); }
}
