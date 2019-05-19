// Targeted by JavaCPP version 1.5.1-SNAPSHOT: DO NOT EDIT THIS FILE

package org.bytedeco.systems.windows;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.systems.global.windows.*;


//
//  An individual security attribute.
//


@Properties(inherit = org.bytedeco.systems.presets.windows.class)
public class CLAIM_SECURITY_ATTRIBUTE_V1 extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public CLAIM_SECURITY_ATTRIBUTE_V1() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public CLAIM_SECURITY_ATTRIBUTE_V1(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public CLAIM_SECURITY_ATTRIBUTE_V1(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public CLAIM_SECURITY_ATTRIBUTE_V1 position(long position) {
        return (CLAIM_SECURITY_ATTRIBUTE_V1)super.position(position);
    }


    //
    //  Name of the attribute.
    //  Case insensitive Unicode string.
    //

    public native @Cast("PWSTR") CharPointer Name(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Name(CharPointer setter); 

    //
    //  Data type of attribute.
    //

    public native @Cast("WORD") short ValueType(); public native CLAIM_SECURITY_ATTRIBUTE_V1 ValueType(short setter);

    //
    //  Pass 0 in a set operation and check for 0 in
    //  a get operation.
    //

    public native @Cast("WORD") short Reserved(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Reserved(short setter);

    //
    // Attribute Flags
    //

    public native @Cast("DWORD") int Flags(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Flags(int setter);

    //
    //  Number of values.
    //

    public native @Cast("DWORD") int ValueCount(); public native CLAIM_SECURITY_ATTRIBUTE_V1 ValueCount(int setter);

    //
    //  The actual value itself.
    //

        @Name("Values.pInt64") public native @Cast("PLONG64") LongPointer Values_pInt64(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Values_pInt64(LongPointer setter);
        @Name("Values.pUint64") public native @Cast("PDWORD64") LongPointer Values_pUint64(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Values_pUint64(LongPointer setter);
        @Name("Values.ppString") public native @Cast("PWSTR*") PointerPointer Values_ppString(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Values_ppString(PointerPointer setter);
        @Name("Values.pFqbn") public native @Cast("PCLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE") CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE Values_pFqbn(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Values_pFqbn(CLAIM_SECURITY_ATTRIBUTE_FQBN_VALUE setter);
        @Name("Values.pOctetString") public native @Cast("PCLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE") CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE Values_pOctetString(); public native CLAIM_SECURITY_ATTRIBUTE_V1 Values_pOctetString(CLAIM_SECURITY_ATTRIBUTE_OCTET_STRING_VALUE setter);
}
