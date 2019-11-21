// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class IMAGE_DELAYLOAD_DESCRIPTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public IMAGE_DELAYLOAD_DESCRIPTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public IMAGE_DELAYLOAD_DESCRIPTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public IMAGE_DELAYLOAD_DESCRIPTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public IMAGE_DELAYLOAD_DESCRIPTOR position(long position) {
        return (IMAGE_DELAYLOAD_DESCRIPTOR)super.position(position);
    }

        @Name("Attributes.AllAttributes") public native @Cast("DWORD") int Attributes_AllAttributes(); public native IMAGE_DELAYLOAD_DESCRIPTOR Attributes_AllAttributes(int setter);
            @Name("Attributes.RvaBased") public native @Cast("DWORD") @NoOffset int Attributes_RvaBased(); public native IMAGE_DELAYLOAD_DESCRIPTOR Attributes_RvaBased(int setter);             // Delay load version 2
            @Name("Attributes.ReservedAttributes") public native @Cast("DWORD") @NoOffset int Attributes_ReservedAttributes(); public native IMAGE_DELAYLOAD_DESCRIPTOR Attributes_ReservedAttributes(int setter);

    public native @Cast("DWORD") int DllNameRVA(); public native IMAGE_DELAYLOAD_DESCRIPTOR DllNameRVA(int setter);                       // RVA to the name of the target library (NULL-terminate ASCII string)
    public native @Cast("DWORD") int ModuleHandleRVA(); public native IMAGE_DELAYLOAD_DESCRIPTOR ModuleHandleRVA(int setter);                  // RVA to the HMODULE caching location (PHMODULE)
    public native @Cast("DWORD") int ImportAddressTableRVA(); public native IMAGE_DELAYLOAD_DESCRIPTOR ImportAddressTableRVA(int setter);            // RVA to the start of the IAT (PIMAGE_THUNK_DATA)
    public native @Cast("DWORD") int ImportNameTableRVA(); public native IMAGE_DELAYLOAD_DESCRIPTOR ImportNameTableRVA(int setter);               // RVA to the start of the name table (PIMAGE_THUNK_DATA::AddressOfData)
    public native @Cast("DWORD") int BoundImportAddressTableRVA(); public native IMAGE_DELAYLOAD_DESCRIPTOR BoundImportAddressTableRVA(int setter);       // RVA to an optional bound IAT
    public native @Cast("DWORD") int UnloadInformationTableRVA(); public native IMAGE_DELAYLOAD_DESCRIPTOR UnloadInformationTableRVA(int setter);        // RVA to an optional unload info table
    public native @Cast("DWORD") int TimeDateStamp(); public native IMAGE_DELAYLOAD_DESCRIPTOR TimeDateStamp(int setter);                    // 0 if not bound,
                                            // Otherwise, date/time of the target DLL

}
