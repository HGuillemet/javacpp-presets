// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_ARM_RUNTIME_FUNCTION_ENTRY extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_ARM_RUNTIME_FUNCTION_ENTRY() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_ARM_RUNTIME_FUNCTION_ENTRY(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_ARM_RUNTIME_FUNCTION_ENTRY(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_ARM_RUNTIME_FUNCTION_ENTRY position(long position) {
        return (IMAGE_ARM_RUNTIME_FUNCTION_ENTRY)super.position(position);
    }
    @Override public IMAGE_ARM_RUNTIME_FUNCTION_ENTRY getPointer(long i) {
        return new IMAGE_ARM_RUNTIME_FUNCTION_ENTRY((Pointer)this).offsetAddress(i);
    }

    public native @Cast("DWORD") int BeginAddress(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY BeginAddress(int setter);
        public native @Cast("DWORD") int UnwindData(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY UnwindData(int setter);
            public native @Cast("DWORD") @NoOffset int Flag(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY Flag(int setter);
            public native @Cast("DWORD") @NoOffset int FunctionLength(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY FunctionLength(int setter);
            public native @Cast("DWORD") @NoOffset int Ret(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY Ret(int setter);
            public native @Cast("DWORD") @NoOffset int H(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY H(int setter);
            public native @Cast("DWORD") @NoOffset int Reg(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY Reg(int setter);
            public native @Cast("DWORD") @NoOffset int R(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY R(int setter);
            public native @Cast("DWORD") @NoOffset int L(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY L(int setter);
            public native @Cast("DWORD") @NoOffset int C(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY C(int setter);
            public native @Cast("DWORD") @NoOffset int StackAdjust(); public native IMAGE_ARM_RUNTIME_FUNCTION_ENTRY StackAdjust(int setter);  
}
