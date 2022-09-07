// Targeted by JavaCPP version 1.5.8-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.llvm.LLVM;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.llvm.global.LLVM.*;


/**
 * An element type for a JITDylib search order.
 */
@Properties(inherit = org.bytedeco.llvm.presets.LLVM.class)
public class LLVMOrcCJITDylibSearchOrderElement extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public LLVMOrcCJITDylibSearchOrderElement() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public LLVMOrcCJITDylibSearchOrderElement(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public LLVMOrcCJITDylibSearchOrderElement(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public LLVMOrcCJITDylibSearchOrderElement position(long position) {
        return (LLVMOrcCJITDylibSearchOrderElement)super.position(position);
    }
    @Override public LLVMOrcCJITDylibSearchOrderElement getPointer(long i) {
        return new LLVMOrcCJITDylibSearchOrderElement((Pointer)this).offsetAddress(i);
    }

  public native LLVMOrcJITDylibRef JD(); public native LLVMOrcCJITDylibSearchOrderElement JD(LLVMOrcJITDylibRef setter);
  public native @Cast("LLVMOrcJITDylibLookupFlags") int JDLookupFlags(); public native LLVMOrcCJITDylibSearchOrderElement JDLookupFlags(int setter);
}
