// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.nvcodec.nvencodeapi;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;
import org.bytedeco.nvcodec.nvcuvid.*;
import static org.bytedeco.nvcodec.global.nvcuvid.*;

import static org.bytedeco.nvcodec.global.nvencodeapi.*;


/**
 * Structs needed for ME only mode.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_MVECTOR extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_MVECTOR() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_MVECTOR(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_MVECTOR(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_MVECTOR position(long position) {
        return (NV_ENC_MVECTOR)super.position(position);
    }
    @Override public NV_ENC_MVECTOR getPointer(long i) {
        return new NV_ENC_MVECTOR((Pointer)this).offsetAddress(i);
    }

    /** the x component of MV in quarter-pel units */
    public native @Cast("int16_t") short mvx(); public native NV_ENC_MVECTOR mvx(short setter);
    /** the y component of MV in quarter-pel units */
    public native @Cast("int16_t") short mvy(); public native NV_ENC_MVECTOR mvy(short setter);
}
