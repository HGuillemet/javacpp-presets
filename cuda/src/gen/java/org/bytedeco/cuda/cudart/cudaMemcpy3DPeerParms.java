// Targeted by JavaCPP version 1.5.2: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA 3D cross-device memory copying parameters
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaMemcpy3DPeerParms extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaMemcpy3DPeerParms() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaMemcpy3DPeerParms(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaMemcpy3DPeerParms(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaMemcpy3DPeerParms position(long position) {
        return (cudaMemcpy3DPeerParms)super.position(position);
    }

    /** Source memory address */
    public native cudaArray srcArray(); public native cudaMemcpy3DPeerParms srcArray(cudaArray setter);
    /** Source position offset */
    public native @ByRef cudaPos srcPos(); public native cudaMemcpy3DPeerParms srcPos(cudaPos setter);
    /** Pitched source memory address */
    public native @ByRef cudaPitchedPtr srcPtr(); public native cudaMemcpy3DPeerParms srcPtr(cudaPitchedPtr setter);
    /** Source device */
    public native int srcDevice(); public native cudaMemcpy3DPeerParms srcDevice(int setter);
  
    /** Destination memory address */
    public native cudaArray dstArray(); public native cudaMemcpy3DPeerParms dstArray(cudaArray setter);
    /** Destination position offset */
    public native @ByRef cudaPos dstPos(); public native cudaMemcpy3DPeerParms dstPos(cudaPos setter);
    /** Pitched destination memory address */
    public native @ByRef cudaPitchedPtr dstPtr(); public native cudaMemcpy3DPeerParms dstPtr(cudaPitchedPtr setter);
    /** Destination device */
    public native int dstDevice(); public native cudaMemcpy3DPeerParms dstDevice(int setter);
  
    /** Requested memory copy size */
    public native @ByRef cudaExtent extent(); public native cudaMemcpy3DPeerParms extent(cudaExtent setter);
}
