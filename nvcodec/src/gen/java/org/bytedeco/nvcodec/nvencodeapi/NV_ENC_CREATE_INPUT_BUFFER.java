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
 * Creation parameters for input buffer.
 */
@Properties(inherit = org.bytedeco.nvcodec.presets.nvencodeapi.class)
public class NV_ENC_CREATE_INPUT_BUFFER extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public NV_ENC_CREATE_INPUT_BUFFER() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public NV_ENC_CREATE_INPUT_BUFFER(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public NV_ENC_CREATE_INPUT_BUFFER(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public NV_ENC_CREATE_INPUT_BUFFER position(long position) {
        return (NV_ENC_CREATE_INPUT_BUFFER)super.position(position);
    }
    @Override public NV_ENC_CREATE_INPUT_BUFFER getPointer(long i) {
        return new NV_ENC_CREATE_INPUT_BUFFER((Pointer)this).offsetAddress(i);
    }

    /** [in]: Struct version. Must be set to ::NV_ENC_CREATE_INPUT_BUFFER_VER */
    public native @Cast("uint32_t") int version(); public native NV_ENC_CREATE_INPUT_BUFFER version(int setter);
    /** [in]: Input frame width */
    public native @Cast("uint32_t") int width(); public native NV_ENC_CREATE_INPUT_BUFFER width(int setter);
    /** [in]: Input frame height */
    public native @Cast("uint32_t") int height(); public native NV_ENC_CREATE_INPUT_BUFFER height(int setter);
    /** [in]: Deprecated. Do not use */
    public native @Cast("NV_ENC_MEMORY_HEAP") int memoryHeap(); public native NV_ENC_CREATE_INPUT_BUFFER memoryHeap(int setter);
    /** [in]: Input buffer format */
    public native @Cast("NV_ENC_BUFFER_FORMAT") int bufferFmt(); public native NV_ENC_CREATE_INPUT_BUFFER bufferFmt(int setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved(); public native NV_ENC_CREATE_INPUT_BUFFER reserved(int setter);
    /** [out]: Pointer to input buffer */
    public native NV_ENC_INPUT_PTR inputBuffer(); public native NV_ENC_CREATE_INPUT_BUFFER inputBuffer(NV_ENC_INPUT_PTR setter);
    /** [in]: Pointer to existing system memory buffer */
    public native Pointer pSysMemBuffer(); public native NV_ENC_CREATE_INPUT_BUFFER pSysMemBuffer(Pointer setter);
    /** [in]: Reserved and must be set to 0 */
    public native @Cast("uint32_t") int reserved1(int i); public native NV_ENC_CREATE_INPUT_BUFFER reserved1(int i, int setter);
    @MemberGetter public native @Cast("uint32_t*") IntPointer reserved1();
    /** [in]: Reserved and must be set to NULL */
    public native Pointer reserved2(int i); public native NV_ENC_CREATE_INPUT_BUFFER reserved2(int i, Pointer setter);
    @MemberGetter public native @Cast("void**") PointerPointer reserved2();
}
