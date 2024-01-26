// Targeted by JavaCPP version 1.5.10: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.nvml;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;
import org.bytedeco.cuda.cudart.*;
import static org.bytedeco.cuda.global.cudart.*;

import static org.bytedeco.cuda.global.nvml.*;


/**
 * Information about running compute processes on the GPU, legacy version
 * for older versions of the API.
 */
@Properties(inherit = org.bytedeco.cuda.presets.nvml.class)
public class nvmlProcessInfo_v1_t extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public nvmlProcessInfo_v1_t() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public nvmlProcessInfo_v1_t(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public nvmlProcessInfo_v1_t(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public nvmlProcessInfo_v1_t position(long position) {
        return (nvmlProcessInfo_v1_t)super.position(position);
    }
    @Override public nvmlProcessInfo_v1_t getPointer(long i) {
        return new nvmlProcessInfo_v1_t((Pointer)this).offsetAddress(i);
    }

    /** Process ID */
    public native @Cast("unsigned int") int pid(); public native nvmlProcessInfo_v1_t pid(int setter);
    /** Amount of used GPU memory in bytes. */
    public native @Cast("unsigned long long") long usedGpuMemory(); public native nvmlProcessInfo_v1_t usedGpuMemory(long setter);
                                            /** Under WDDM, \ref NVML_VALUE_NOT_AVAILABLE is always reported
                                             *  because Windows KMD manages all the memory and not the NVIDIA driver */
}
