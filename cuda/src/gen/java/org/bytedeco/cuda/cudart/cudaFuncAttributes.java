// Targeted by JavaCPP version 1.5.9: DO NOT EDIT THIS FILE

package org.bytedeco.cuda.cudart;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.bytedeco.javacpp.presets.javacpp.*;

import static org.bytedeco.cuda.global.cudart.*;


/**
 * CUDA function attributes
 */
@Properties(inherit = org.bytedeco.cuda.presets.cudart.class)
public class cudaFuncAttributes extends Pointer {
    static { Loader.load(); }
    /** Default native constructor. */
    public cudaFuncAttributes() { super((Pointer)null); allocate(); }
    /** Native array allocator. Access with {@link Pointer#position(long)}. */
    public cudaFuncAttributes(long size) { super((Pointer)null); allocateArray(size); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public cudaFuncAttributes(Pointer p) { super(p); }
    private native void allocate();
    private native void allocateArray(long size);
    @Override public cudaFuncAttributes position(long position) {
        return (cudaFuncAttributes)super.position(position);
    }
    @Override public cudaFuncAttributes getPointer(long i) {
        return new cudaFuncAttributes((Pointer)this).offsetAddress(i);
    }

   /**
    * The size in bytes of statically-allocated shared memory per block
    * required by this function. This does not include dynamically-allocated
    * shared memory requested by the user at runtime.
    */
   public native @Cast("size_t") long sharedSizeBytes(); public native cudaFuncAttributes sharedSizeBytes(long setter);

   /**
    * The size in bytes of user-allocated constant memory required by this
    * function.
    */
   public native @Cast("size_t") long constSizeBytes(); public native cudaFuncAttributes constSizeBytes(long setter);

   /**
    * The size in bytes of local memory used by each thread of this function.
    */
   public native @Cast("size_t") long localSizeBytes(); public native cudaFuncAttributes localSizeBytes(long setter);

   /**
    * The maximum number of threads per block, beyond which a launch of the
    * function would fail. This number depends on both the function and the
    * device on which the function is currently loaded.
    */
   public native int maxThreadsPerBlock(); public native cudaFuncAttributes maxThreadsPerBlock(int setter);

   /**
    * The number of registers used by each thread of this function.
    */
   public native int numRegs(); public native cudaFuncAttributes numRegs(int setter);

   /**
    * The PTX virtual architecture version for which the function was
    * compiled. This value is the major PTX version * 10 + the minor PTX
    * version, so a PTX version 1.3 function would return the value 13.
    */
   public native int ptxVersion(); public native cudaFuncAttributes ptxVersion(int setter);

   /**
    * The binary architecture version for which the function was compiled.
    * This value is the major binary version * 10 + the minor binary version,
    * so a binary version 1.3 function would return the value 13.
    */
   public native int binaryVersion(); public native cudaFuncAttributes binaryVersion(int setter);

   /**
    * The attribute to indicate whether the function has been compiled with 
    * user specified option "-Xptxas --dlcm=ca" set.
    */
   public native int cacheModeCA(); public native cudaFuncAttributes cacheModeCA(int setter);

   /**
    * The maximum size in bytes of dynamic shared memory per block for 
    * this function. Any launch must have a dynamic shared memory size
    * smaller than this value.
    */
   public native int maxDynamicSharedSizeBytes(); public native cudaFuncAttributes maxDynamicSharedSizeBytes(int setter);

   /**
    * On devices where the L1 cache and shared memory use the same hardware resources, 
    * this sets the shared memory carveout preference, in percent of the maximum shared memory. 
    * Refer to ::cudaDevAttrMaxSharedMemoryPerMultiprocessor.
    * This is only a hint, and the driver can choose a different ratio if required to execute the function.
    * See ::cudaFuncSetAttribute
    */
   public native int preferredShmemCarveout(); public native cudaFuncAttributes preferredShmemCarveout(int setter);

   /**
    * If this attribute is set, the kernel must launch with a valid cluster dimension
    * specified.
    */
   public native int clusterDimMustBeSet(); public native cudaFuncAttributes clusterDimMustBeSet(int setter);

   /**
    * The required cluster width/height/depth in blocks. The values must either
    * all be 0 or all be positive. The validity of the cluster dimensions is
    * otherwise checked at launch time.
    *
    * If the value is set during compile time, it cannot be set at runtime.
    * Setting it at runtime should return cudaErrorNotPermitted.
    * See ::cudaFuncSetAttribute
    */
   public native int requiredClusterWidth(); public native cudaFuncAttributes requiredClusterWidth(int setter);
   public native int requiredClusterHeight(); public native cudaFuncAttributes requiredClusterHeight(int setter);
   public native int requiredClusterDepth(); public native cudaFuncAttributes requiredClusterDepth(int setter);

   /**
    * The block scheduling policy of a function.
    * See ::cudaFuncSetAttribute
    */
   public native int clusterSchedulingPolicyPreference(); public native cudaFuncAttributes clusterSchedulingPolicyPreference(int setter);

   /**
    * Whether the function can be launched with non-portable cluster size. 1 is
    * allowed, 0 is disallowed. A non-portable cluster size may only function
    * on the specific SKUs the program is tested on. The launch might fail if
    * the program is run on a different hardware platform.
    *
    * CUDA API provides ::cudaOccupancyMaxActiveClusters to assist with checking
    * whether the desired size can be launched on the current device.
    *
    * Portable Cluster Size
    *
    * A portable cluster size is guaranteed to be functional on all compute
    * capabilities higher than the target compute capability. The portable
    * cluster size for sm_90 is 8 blocks per cluster. This value may increase
    * for future compute capabilities.
    *
    * The specific hardware unit may support higher cluster sizes that’s not
    * guaranteed to be portable.
    * See ::cudaFuncSetAttribute
    */
   public native int nonPortableClusterSizeAllowed(); public native cudaFuncAttributes nonPortableClusterSizeAllowed(int setter);

   /**
    * Reserved for future use.
    */
   public native int reserved(int i); public native cudaFuncAttributes reserved(int i, int setter);
   @MemberGetter public native IntPointer reserved();
}
