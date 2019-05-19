// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class ANON_OBJECT_HEADER_BIGOBJ extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public ANON_OBJECT_HEADER_BIGOBJ() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public ANON_OBJECT_HEADER_BIGOBJ(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public ANON_OBJECT_HEADER_BIGOBJ(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public ANON_OBJECT_HEADER_BIGOBJ position(long position) {
        return (ANON_OBJECT_HEADER_BIGOBJ)super.position(position);
    }

   /* same as ANON_OBJECT_HEADER_V2 */
    public native @Cast("WORD") short Sig1(); public native ANON_OBJECT_HEADER_BIGOBJ Sig1(short setter);            // Must be IMAGE_FILE_MACHINE_UNKNOWN
    public native @Cast("WORD") short Sig2(); public native ANON_OBJECT_HEADER_BIGOBJ Sig2(short setter);            // Must be 0xffff
    public native @Cast("WORD") short Version(); public native ANON_OBJECT_HEADER_BIGOBJ Version(short setter);         // >= 2 (implies the Flags field is present)
    public native @Cast("WORD") short Machine(); public native ANON_OBJECT_HEADER_BIGOBJ Machine(short setter);         // Actual machine - IMAGE_FILE_MACHINE_xxx
    public native @Cast("DWORD") int TimeDateStamp(); public native ANON_OBJECT_HEADER_BIGOBJ TimeDateStamp(int setter);
    public native @ByRef @Cast("CLSID*") GUID ClassID(); public native ANON_OBJECT_HEADER_BIGOBJ ClassID(GUID setter);         // {D1BAA1C7-BAEE-4ba9-AF20-FAF66AA4DCB8}
    public native @Cast("DWORD") int SizeOfData(); public native ANON_OBJECT_HEADER_BIGOBJ SizeOfData(int setter);      // Size of data that follows the header
    public native @Cast("DWORD") int Flags(); public native ANON_OBJECT_HEADER_BIGOBJ Flags(int setter);           // 0x1 -> contains metadata
    public native @Cast("DWORD") int MetaDataSize(); public native ANON_OBJECT_HEADER_BIGOBJ MetaDataSize(int setter);    // Size of CLR metadata
    public native @Cast("DWORD") int MetaDataOffset(); public native ANON_OBJECT_HEADER_BIGOBJ MetaDataOffset(int setter);  // Offset of CLR metadata

    /* bigobj specifics */
    public native @Cast("DWORD") int NumberOfSections(); public native ANON_OBJECT_HEADER_BIGOBJ NumberOfSections(int setter); // extended from WORD
    public native @Cast("DWORD") int PointerToSymbolTable(); public native ANON_OBJECT_HEADER_BIGOBJ PointerToSymbolTable(int setter);
    public native @Cast("DWORD") int NumberOfSymbols(); public native ANON_OBJECT_HEADER_BIGOBJ NumberOfSymbols(int setter);
}
