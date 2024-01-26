// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

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
 * Encoded frame information parameters for every block.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_OUTPUT_STATS_BLOCK extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_OUTPUT_STATS_BLOCK() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_OUTPUT_STATS_BLOCK(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_OUTPUT_STATS_BLOCK(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_OUTPUT_STATS_BLOCK position(long position) {
        return (NV_ENC_OUTPUT_STATS_BLOCK)super.position(position);
    }
    @Override public NV_ENC_OUTPUT_STATS_BLOCK getPointer(long i) {
        return new NV_ENC_OUTPUT_STATS_BLOCK((Pointer)this).offsetAddress(i);
    }

   /** [in]: Struct version */
   public native @Cast("uint32_t") int version(); public native NV_ENC_OUTPUT_STATS_BLOCK version(int setter);
   /** [out]: QP of the block */
   public native @Cast("uint8_t") byte QP(); public native NV_ENC_OUTPUT_STATS_BLOCK QP(byte setter);
   /** [in]: Reserved and must be set to 0 */
   public native @Cast("uint8_t") byte reserved(int i); public native NV_ENC_OUTPUT_STATS_BLOCK reserved(int i, byte setter);
   @MemberGetter public native @Cast("uint8_t*") BytePointer reserved();
   /** [out]: Bitcount of the block */
   public native @Cast("uint32_t") int bitcount(); public native NV_ENC_OUTPUT_STATS_BLOCK bitcount(int setter);
   /** [in]: Reserved and must be set to 0 */
   public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_OUTPUT_STATS_BLOCK reserved1(int i, int setter);
   @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
}
