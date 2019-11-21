// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.flycapture.global.FlyCapture2.*;


    /**
     * \defgroup GigEStructures GigE specific structures
     *
     * These structures are specific to GigE camera operation only.
     */

    /*@{*/

    /** IPv4 address. */
    @Namespace("FlyCapture2") @NoOffset @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2.class)
public class IPAddress extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public IPAddress(Pointer p) { super(p); }
    
        public native @Cast("unsigned char") byte octets(int i); public native IPAddress octets(int i, byte setter);
        @MemberGetter public native @Cast("unsigned char*") BytePointer octets();

        public IPAddress() { super((Pointer)null); allocate(); }
        private native void allocate();

        public IPAddress( @Cast("unsigned int") int ipAddressVal ) { super((Pointer)null); allocate(ipAddressVal); }
        private native void allocate( @Cast("unsigned int") int ipAddressVal );

        /** Equality operator. */
        public native @Cast("bool") @Name("operator ==") boolean equals( @Const @ByRef IPAddress address );

        /** Inequality operator. */
        public native @Cast("bool") @Name("operator !=") boolean notEquals( @Const @ByRef IPAddress address );
    }
