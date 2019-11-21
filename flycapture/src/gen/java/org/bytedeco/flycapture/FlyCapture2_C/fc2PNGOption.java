// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.flycapture.FlyCapture2_C;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import org.bytedeco.flycapture.FlyCapture2.*;
import static org.bytedeco.flycapture.global.FlyCapture2.*;

import static org.bytedeco.flycapture.global.FlyCapture2_C.*;


    /**
     * \defgroup CImageSaveStructures Image saving structures.
     *
     * These structures define various parameters used for saving images.
     */

    /*@{*/

    /** Options for saving PNG images. */
    @Properties(inherit = org.bytedeco.flycapture.presets.FlyCapture2_C.class)
public class fc2PNGOption extends Pointer {
        static { Loader.load(); }
        /** Default native constructor. */
        public fc2PNGOption() { super((Pointer)null); allocate(); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public fc2PNGOption(long size) { super((Pointer)null); allocateArray(size); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public fc2PNGOption(Pointer p) { super(p); }
        private native void allocate();
        private native void allocateArray(long size);
        @Override public fc2PNGOption position(long position) {
            return (fc2PNGOption)super.position(position);
        }
    
        /** Whether to save the PNG as interlaced. */
        public native @Cast("BOOL") int interlaced(); public native fc2PNGOption interlaced(int setter);
        /** Compression level (0-9). 0 is no compression, 9 is best compression. */
        public native @Cast("unsigned int") int compressionLevel(); public native fc2PNGOption compressionLevel(int setter);
        /** Reserved for future use. */
        public native @Cast("unsigned int") int reserved(int i); public native fc2PNGOption reserved(int i, int setter);
        @MemberGetter public native @Cast("unsigned int*") IntPointer reserved();

    }
