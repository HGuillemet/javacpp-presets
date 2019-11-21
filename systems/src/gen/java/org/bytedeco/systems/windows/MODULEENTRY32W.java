// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


/***** Module walking *************************************************/

@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class MODULEENTRY32W extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public MODULEENTRY32W() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public MODULEENTRY32W(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public MODULEENTRY32W(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public MODULEENTRY32W position(long position) {
        return (MODULEENTRY32W)super.position(position);
    }

    public native @Cast("DWORD") int dwSize(); public native MODULEENTRY32W dwSize(int setter);
    public native @Cast("DWORD") int th32ModuleID(); public native MODULEENTRY32W th32ModuleID(int setter);       // This module
    public native @Cast("DWORD") int th32ProcessID(); public native MODULEENTRY32W th32ProcessID(int setter);      // owning process
    public native @Cast("DWORD") int GlblcntUsage(); public native MODULEENTRY32W GlblcntUsage(int setter);       // Global usage count on the module
    public native @Cast("DWORD") int ProccntUsage(); public native MODULEENTRY32W ProccntUsage(int setter);       // Module usage count in th32ProcessID's context
    public native @Cast("BYTE*") BytePointer modBaseAddr(); public native MODULEENTRY32W modBaseAddr(BytePointer setter);        // Base address of module in th32ProcessID's context
    public native @Cast("DWORD") int modBaseSize(); public native MODULEENTRY32W modBaseSize(int setter);        // Size in bytes of module starting at modBaseAddr
    public native @Cast("HMODULE") Pointer hModule(); public native MODULEENTRY32W hModule(Pointer setter);            // The hModule of this module in th32ProcessID's context
    public native @Cast("WCHAR") char szModule(int i); public native MODULEENTRY32W szModule(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer szModule();
    public native @Cast("WCHAR") char szExePath(int i); public native MODULEENTRY32W szExePath(int i, char setter);
    @MemberGetter public native @Cast("WCHAR*") CharPointer szExePath();
}
